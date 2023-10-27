package com.itb.mif3an.academicologin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itb.mif3an.academicologin.model.Tarefa;
import com.itb.mif3an.academicologin.repository.TarefaRepository;

@Service
public class TarefaServiceImpl implements TarefaService {

	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@Override
	public Tarefa save(Tarefa tarefa) {
		// TODO Auto-generated method stub
		return tarefaRepository.save(tarefa);
	}

	@Override
	public List<Tarefa> findAll() {
		// TODO Auto-generated method stub
		return  tarefaRepository.findAll();
	}

}
