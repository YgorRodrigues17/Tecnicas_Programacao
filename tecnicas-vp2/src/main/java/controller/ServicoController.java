package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import repository.ServicoRepository;
import model.Servico;

import java.util.Date;
import java.util.List;

@Controller
public class ServicoController {

    private final ServicoRepository servicoRepository;

    @Autowired
    public ServicoController(ServicoRepository servicoRepository) {

        this.servicoRepository = servicoRepository;
    }

    @ResponseBody
    @RequestMapping(value = "servico/{id}", method = RequestMethod.GET)
    public Servico encontrarServico(@PathVariable Integer id) {
        return servicoRepository.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "servico", method = RequestMethod.GET)
    public List<Servico> listarServicos() {

        return servicoRepository.read();
    }

    @ResponseBody
    @RequestMapping(value = "servico", method = RequestMethod.POST)
    public Servico criarServico(@RequestBody Servico servico) {
        servicoRepository.create(servico);

        return servico;
    }

    @ResponseBody
    @RequestMapping(value = "materia/{id}", method = RequestMethod.DELETE)
    public void apagarServico(@PathVariable Integer id) {

        servicoRepository.delete(id);
    }

    @ResponseBody
    @RequestMapping(value = "materia/{id}", method = RequestMethod.PUT)
    public void atualizarServico(@PathVariable Integer id, @RequestBody Servico servico) {
        servicoRepository.update(id, servico);
    }

}