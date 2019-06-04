# Spring Boot

> sb: Spring Boot

https://start.spring.io/

## Spring 4

https://s3.amazonaws.com/baeldung.com/Building+a+REST+API+with+Spring.pdf


## Maven

https://maven.apache.org/guides/index.html

https://maven.apache.org/download.cgi

https://maven.apache.org/install.html

https://maven.apache.org/guides/getting-started/windows-prerequisites.html

> Binary zip archive | apache-maven-3.6.1-bin.zip

```sh
# JAVA_HOME
$ echo %JAVA_HOME% 

$ mvn -v

```


http://www.ityouknow.com/springboot/2016/01/06/spring-boot-quick-start.html

## Spring Boot 的基础结构共三个文件:

src/main/java 程序开发以及主程序入口
src/main/resources 配置文件
src/test/java 测试程序


1、Application.java 建议放到根目录下面,主要用于做一些框架配置
2、model 目录主要用于实体与数据访问层（Repository）
3、service 层主要是业务类代码
4、controller 负责页面访问控制


```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
```

```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

```

### Controller

```java
package com.xgqfrms.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}

```

@RestController 的意思就是 Controller 里面的方法都以 json 格式输出，不用再写什么 jackjson 配置的了！

3、启动主程序，打开浏览器访问 http://localhost:8080/hello，就可以看到效果了，有木有很简单！


```xml
    <defaultGoal>install</defaultGoal>
```

```xml
    <defaultGoal>package</defaultGoal>
```

## how to run java jar file

https://stackoverflow.com/questions/394616/running-jar-file-on-windows


> web jar ??? includes tomcat http server

```sh

$ java -jar app.jar
```

```sh
$ cd target
$ java -jar sb-0.0.1-SNAPSHOT.jar

```

## java return json from controller


```java

package com.xgqfrms.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbController {
    // @RequestMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        // String jsonString = {"name": "xgqfrms", "role": "admin", "id": 1234567890};
        // return "Hello World";
        return "{\"name\": \"xgqfrms\", \"role\": \"admin\", \"id\": \"1234567890\"}";
    }
}

```


## JSON

```java

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

```

https://github.com/xgqfrms/java/issues/7