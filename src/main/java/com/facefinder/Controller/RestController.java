package com.facefinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RestController {

    @RequestMapping("/get_user_info")
    @ResponseBody
    public Map getUserInfo() {
        Map<String, String> resolution = new HashMap<>();
        resolution.put("some key", "some value");

        return resolution;
    }

}
