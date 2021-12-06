package controller;

import model.Compra;
import service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class CompraController {

    private final CompraService service;

    @Autowired
    public CompraController(CompraService service){
        this.service = service;
    }

    @ResponseBody
    @RequestMapping(value = "compra", method = RequestMethod.POST)
    public Compra create(@RequestBody Compra compra) {
        return service.create(compra);
    }

    @ResponseBody
    @RequestMapping(value = "compra", method = RequestMethod.GET)
    public List<Compra> list() {
        return service.list();
    }

    @ResponseBody
    @RequestMapping(value = "compra/cpf/{cpf}", method = RequestMethod.GET)
    public List<Compra> findAllByCpfCliente(@PathVariable String cpf) {
        return service.findAllByCpfCliente(cpf);
    }

    @ResponseBody
    @RequestMapping(value = "compra/notafiscal/{notafiscal}", method = RequestMethod.GET)
    public Compra getCompraByNotafiscal(@PathVariable UUID notafiscal) {
        System.out.println(notafiscal);
        return service.findByNotaFiscal(notafiscal);
    }
}
