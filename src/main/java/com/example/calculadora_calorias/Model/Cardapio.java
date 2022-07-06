package com.example.calculadora_calorias.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Arquivo lombok GET
@Setter //Arquivo lombok SET
@NoArgsConstructor //Contrutor vazio
@AllArgsConstructor //Contruor com atributos

public class Cardapio {

	private String name;
	private int calories;
}
