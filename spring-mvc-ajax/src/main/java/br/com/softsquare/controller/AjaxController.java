/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softsquare.controller;

import br.com.softsquare.jsonview.Views;
import br.com.softsquare.model.AjaxResponseBody;
import br.com.softsquare.model.SearchCriteria;
import br.com.softsquare.model.User;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    private List<User> users;

    @PostConstruct
    public void initDataForTesting() {

        this.users = Stream.generate(() -> {
            return new User() {
                {
                    setUsername("thiagojfg");
                    setPassword("pass123");
                    setEmail("thiagojfg@gmail.com");
                    setAddress("Rua Graúna, 146, Vila Nova de Colares");
                }
            };
        }).limit(50).collect(Collectors.toList());
    }

    @JsonView(Views.Public.class)
    @RequestMapping(value = "/search/api/getResult")
    public AjaxResponseBody getSearchResultViaAjax(@RequestBody SearchCriteria search) {

        AjaxResponseBody result = new AjaxResponseBody();

        if (isValidSearchCriteria(search)) {

            List<User> users = findByUserNameEmail(search.getUsername(), search.getEmail());

            if (users.size() > 0) {
                result.setCode("200");
                result.setMsg("");
                result.setResult(users);
            } else {
                result.setCode("204");
                result.setMsg("Sem usuários");
            }
        } else {
            result.setCode("400");
            result.setMsg("Busca vazia");
        }

        return result;
    }

    private boolean isValidSearchCriteria(SearchCriteria search) {

        boolean valid = true;

        if (search == null) {

            valid = false;

        } else if (StringUtils.isEmpty(search.getUsername()) && StringUtils.isEmpty(search.getEmail())) {

            valid = false;

        }

        return valid;
    }

    private List<User> findByUserNameEmail(String username, String email) {
        return users
                .stream().filter(u -> u.getUsername().equalsIgnoreCase(username) && u.getEmail().equals(email))
                .collect(Collectors.toList());
    }
}
