package controller;

import model.Produto;
import service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProdutoController {
    private final ProdutoService service;

    @Autowired
    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    @ResponseBody
    @RequestMapping(value = "produto", method = RequestMethod.POST)
    public Produto create(@RequestBody Produto produto){
        return service.create(produto);
    }


    @ResponseBody
    @RequestMapping(value = "produto", method = RequestMethod.GET)
    public List<Produto> list(){
        return service.list();
    }

    @ResponseBody
    @RequestMapping(value = "produto/{id}", method = RequestMethod.GET)
    public Produto FindById(@PathVariable Integer id){
        return service.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "produto/categoria/{categoria}", method = RequestMethod.GET)
    public List<Produto> findByCategoria(@PathVariable String categoria){
        return service.findAllByCategoria(categoria);
    }

    @ResponseBody
    @RequestMapping(value = "produto/semestoque", method = RequestMethod.GET)
    public List<Produto> findAllByQuantidadeIs(){
        return service.findAllByQuantidadeEquals0();
    }

    @ResponseBody
    @RequestMapping(value = "produto/codigobarras/{codigobarras}", method = RequestMethod.GET)
    public Produto findBycodigobarras(@PathVariable Long codigobarras){
        return service.findByCodigobarras(codigobarras);
    }

    @ResponseBody
    @RequestMapping(value = "produto/{id}", method = RequestMethod.PUT)
    public Produto update(@PathVariable Integer id, @RequestBody Produto produto) {
            produto.setId(id);
            return service.update(id, produto);

    }

    @ResponseBody
    @RequestMapping("produto/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }


}
