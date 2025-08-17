package com.example.demo.service;

import com.example.demo.entity.Funcionario;
import com.example.demo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> list(){
        Sort s = Sort.by(Sort.Direction.ASC, "id");
        return funcionarioRepository.findAll(s);
    }

    public List<Funcionario> create(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return list();
    }

    public Optional<Funcionario> list(Long id){
        return funcionarioRepository.findById(id);
    }

    public List<Funcionario> update(Long id, Funcionario funcionario){
        Funcionario funcionarioUpdated = funcionarioRepository.findById(id).orElseThrow();
        funcionarioUpdated.setNome(funcionario.getNome());
        funcionarioUpdated.setDataNascimento(funcionario.getDataNascimento());
        funcionarioUpdated.setSalario(funcionario.getSalario());
        funcionarioUpdated.setFuncao(funcionario.getFuncao());
        funcionarioRepository.save(funcionarioUpdated);
        return list();
    }

    public List<Funcionario> delete(Long id){
        funcionarioRepository.deleteById(id);
        return list();
    }

}
