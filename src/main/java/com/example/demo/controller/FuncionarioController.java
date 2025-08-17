package com.example.demo.controller;

import com.example.demo.entity.Funcionario;
import com.example.demo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    List<Funcionario> create(@RequestBody Funcionario funcionario){
        return funcionarioService.create(funcionario);
    }

    @GetMapping
    List<Funcionario> list(){
        return funcionarioService.list();
    }

    @GetMapping("{id}")
    Optional<Funcionario> list(@PathVariable ("id") Long id){
        return funcionarioService.list(id);
    }

    @PutMapping("{id}")
    List<Funcionario> update(@PathVariable("id") Long id, @RequestBody Funcionario funcionario){
        return funcionarioService.update(id, funcionario);
    }

    @DeleteMapping("{id}")
    List<Funcionario> delete(@PathVariable("id") Long id){
        return funcionarioService.delete(id);
    }

}
