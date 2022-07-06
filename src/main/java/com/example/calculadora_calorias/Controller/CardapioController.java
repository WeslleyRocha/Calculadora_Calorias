package com.example.calculadora_calorias.Controller;

import com.example.calculadora_calorias.Model.Cardapio;
import com.example.calculadora_calorias.Repository.ListaCardapio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class CardapioController {

	@Autowired //Cria o objeto "ListCardapio" automaticamente sem precisar colocar private ListCardapio repo = new ListCardapio(),desacoplando esta responsabilidade;
	private ListaCardapio repo ; // "REPO" referencia do objeto, injecao de dependencia por atributo

	@GetMapping("/{pratos}")
	public ResponseEntity<Cardapio> getCalorias (@PathVariable String pratos){
		Cardapio cardapioLista = repo.getCardapio(pratos);

		return ResponseEntity.ok(cardapioLista);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Cardapio>> getAllCardapio(){
		List<Cardapio> cardapioLista = repo.getAllCardapio();

		return ResponseEntity.ok(cardapioLista);
	}

}
