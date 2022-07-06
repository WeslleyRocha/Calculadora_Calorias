package com.example.calculadora_calorias.Repository;

import com.example.calculadora_calorias.Model.Cardapio;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.File;
import java.util.Arrays;


@Repository
public class ListaCardapio {

	//Linkando o arquivo Json criado
	private final String linkArquivo = "src/main/resources/dados.json";
	public Cardapio getCardapio(String pratos){
		Cardapio cardapio = null;

		ObjectMapper mapper = new ObjectMapper();

		try { //Retorna a exceção caso de erro
			cardapio = mapper.readValue(new File(linkArquivo), Cardapio.class); // Faz a leitura do aquivo "linkArquivo"
		} catch (Exception ex){

		}
		return cardapio;

	}

	//Listando todos os itens do cardapio
	public java.util.List<Cardapio> getAllCardapio(){

		ObjectMapper mapper = new ObjectMapper();
		List listaCardapio = null;

		try {
			listaCardapio = (List) Arrays.asList
					(mapper.readValue(new File(linkArquivo), Cardapio[].class));
		} catch (Exception ex){

		}
		return null;
	}

	//Adicionando Cardapio
	//public void saveCardapio(Cardapio novoCardapio){

	//}

	//Video 11:17:02
	// Link -> https://drive.google.com/file/d/17FhN21N5g2TDAHXUeLcisjBSJLxmqW6K/view
}
