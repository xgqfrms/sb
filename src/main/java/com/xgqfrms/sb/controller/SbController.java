package com.xgqfrms.sb.controller;

// import org.apache.catalina.User;
import org.json.JSONObject;

// import com.fasterxml.jackson.databind.util.JSONWrappedObject;
// import com.xgqfrms.sb.model.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbController {
    // @RequestMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        // String jsonString = {"name": "xgqfrms", "role": "admin", "id": 1234567890};
        // return "Hello World";
        // return "{\"name\": \"xgqfrms\", \"role\": \"admin\", \"id\":
        // \"1234567890\"}";
        // return "{\"name\": \"xgqfrms\", \"role\": \"admin\", \"id\": \"1234567890\"}";
        return JSONObject.quote("Hello World");
    }
    // public User getUser() {
    //     User user = new User();
    //     user.setUserName("xgqfrms");
    //     user.setPassWord("123456789");
    //     return user;
    // }
}

// @RestController
// public class SbController {
//     @RequestMapping("/hello")
//     public String index() {
//         private String response;
//         public StringResponse(String s) { 
//             this.response = s;
//         }
//     }
// }