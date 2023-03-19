package com.progweb.exercicoPreProva.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.progweb.exercicoPreProva.Model.MyModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyModelController {
	
	
	@GetMapping("/lista")
	public List<MyModel> RetornaLista(){
		
		List<MyModel> lista = new ArrayList()<MyModel>();
		
		return lista;
	}
	
	@PostMapping("/pegaEDevolveObjeto")
	public MyModel PegaEDevolveObjeto(MyModel objetoRecebido){
		
		return objetoRecebido;
	}
	
	@PostMapping("/recebeNoCorpoDaRequesicao")
	public MyModel RecebeNoCorpoDaRequesicao(@RequestBody MyModel objetorecebido) {
		
		return objetorecebido;
	}
	
	@GetMapping("/recebeNome")
	public String mudaNome(String nome) {
		
		return "Seja bem vindo"+nome;
	}
	
	
}
