package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(Model model) {
        model.addAttribute("data","spring!!");
        return "hello";
    }


    @GetMapping(value = "hello-mvc")
    public String helloMvc(@RequestParam(name = "name",required = false) String name, Model model) {
        model.addAttribute("name",name);
        return "hello-template";
    }

    @GetMapping(value = "hello-string")
    @ResponseBody
    public String helloString(@RequestParam(name = "name") String name) {
        return "hello " + name;
    }

    @GetMapping(value = "hello-api")
    @ResponseBody Hello helloApi(@RequestParam(name = "name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;

//           [@ResponseBody 사용]
//        HTTP의 BODY에 문자 내용을 직접 반환
//        'vieResolver' 대신 'HttpMessageConverter'가 동작
//        기본 문자처리 : 'StringHttpMessageConverter'
//        기본 객체처리 : 'MappingJacson2HttpMessageConverter'
//        byte  처리 등등 기타 여러 HttpMessageConverter가 기본으로 등록
    }
    public

    static class Hello {
        private String name;

        // property 접근 방식

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
