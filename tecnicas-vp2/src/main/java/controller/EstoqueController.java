package controller;

import model.Estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.EstoqueRepository;


import java.util.List;

@Controller
public class EstoqueController {

    private final EstoqueRepository repository;

    @Autowired
    public EstoqueController(EstoqueRepository repository) {

        this.repository = repository;
    }

    @ResponseBody
    @RequestMapping(value = "estoque", method = RequestMethod.GET)
    public List<Estoque> list() {

        return repository.list();
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.GET)
    public Estoque findById(@PathVariable Integer id) {

        return repository.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.PUT)
    public Estoque update(Integer id, Estoque estoque) {

        return repository.update(id, estoque);
    }

    @ResponseBody
    @RequestMapping(value = "estoque", method = RequestMethod.POST)
    public Estoque create(Estoque estoque) {

        return repository.create(estoque);
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {

        repository.delete(id);
    }

}