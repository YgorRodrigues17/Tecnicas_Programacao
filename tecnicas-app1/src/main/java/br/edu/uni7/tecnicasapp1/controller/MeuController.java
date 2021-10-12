package br.edu.uni7.tecnicasapp1.controller;

import br.edu.uni7.tecnicasapp1.Model.Materia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MeuController {

    @RequestMapping("/materia")
    public ModelAndView materia() {
        ModelAndView modelAndView = new ModelAndView("materia");

        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Porsche anuncia carro", "porsche 991"));
        materias.add(new Materia("ferrari anuncia novo carro", "ferrari 488"));
        materias.add(new Materia("lamborghini auncia novo carro", "lamborghini aventador"));
        materias.add(new Materia("audi anuncia novo carro", "audi rs6"));

        modelAndView.addObject("materias", materias);
        return modelAndView;
    }

}