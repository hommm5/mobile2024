package org.example.web;

import org.example.model.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @ModelAttribute
    public Student addAttribute() {
        return new Student().setUni("Spice");
    }

    @CrossOrigin(origins = "www...")
    @GetMapping("/test")
    public String test(@ModelAttribute Student student) {

        return "test";
    }

    @PostMapping("test")
    public String testPost(@RequestParam("id") String id) {
        System.out.println(id);

        return "test";
    }
}

