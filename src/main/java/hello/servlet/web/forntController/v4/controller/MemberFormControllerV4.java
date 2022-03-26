package hello.servlet.web.forntController.v4.controller;

import hello.servlet.web.forntController.ModelView;
import hello.servlet.web.forntController.v3.ControllerV3;
import hello.servlet.web.forntController.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
