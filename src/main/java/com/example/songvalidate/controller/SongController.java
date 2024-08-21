package com.example.songvalidate.controller;

import com.example.songvalidate.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SongController {
    @GetMapping("/song")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("song", new Song());
        return modelAndView;
    }

    @PostMapping("/validateSong")
    public ModelAndView checkValidation(@Validated @ModelAttribute("song") Song song,
                                        BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("/index");
        }
        return new ModelAndView("/result");
    }
}
