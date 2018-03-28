/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softsquare.model;

import br.com.softsquare.jsonview.Views;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

public class AjaxResponseBody {

    @JsonView(value = Views.Public.class)
    private String code;

    @JsonView(value = Views.Public.class)
    private String msg;

    @JsonView(value = Views.Public.class)
    private List<User> result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }
}
