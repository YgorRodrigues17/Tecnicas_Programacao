package br.edu.uni7.tecnicasapp1.controller;

import br.edu.uni7.tecnicasapp1.repository.MateriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XXXcontroller {
    public MateriaRepository materiaRepository;

    public XXXcontroller(MateriaRepository materiaRepository){
        this.materiaRepository = materiaRepository;
    }
}
