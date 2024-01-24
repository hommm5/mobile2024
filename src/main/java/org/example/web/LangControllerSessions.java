package org.example.web;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LangControllerSessions {
    @GetMapping("/sessions")
    public String langCookies(HttpSession httpSession, Model model) {

        var lang = httpSession.getAttribute("lang");

        if (lang == null){
            lang = "bg";
        }

        model.addAttribute("lang", lang);

        return "session";
    }

    @PostMapping("/sessions")
    public String langCookies(@RequestParam("lang") String lang,
                              HttpSession httpSession) {

        httpSession.setAttribute("lang", lang);

        return "redirect:/sessions";
    }
}
