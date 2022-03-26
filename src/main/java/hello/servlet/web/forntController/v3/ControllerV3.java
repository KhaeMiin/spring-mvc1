package hello.servlet.web.forntController.v3;

import hello.servlet.web.forntController.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
