package br.edu.ifsp.heranca.scripts;

import java.util.Calendar;

public class Terrestres extends Veiculos {
	
	Integer num_rodas;
	Integer placa;
	Integer renavam;
	Integer num_motor;
	Integer num_portas;
	Integer num_eixos;
	Integer altura;
	Integer largura;
	Double distancia_eixos;
	

	
	
	
	public Terrestres(marca, modelo, num_passageiro, combustivel, data_documentacao,
			num_chassi, proprietario, cor,  peso, potencia, valor,
			ano_fabricacao, finalidade, tipo_motor, capacidade_carga,
			comprimento,Integer num_rodas, Integer placa, Integer renavam, Integer num_motor, Integer num_portas,
			Integer num_eixos, Integer altura, Integer largura, Double distancia_eixos) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.num_passageiro = num_passageiro;
		this.combustivel = combustivel;
		this.data_documentacao = data_documentacao;
		this.num_chassi = num_chassi;
		this.proprietario = proprietario;
		this.cor = cor;
		this.peso = peso;
		this.potencia = potencia;
		this.valor = valor;
		this.ano_fabricacao = ano_fabricacao;
		this.finalidade = finalidade;
		this.tipo_motor = tipo_motor;
		this.capacidade_carga = capacidade_carga;
		this.comprimento = comprimento;
		this.num_rodas = num_rodas;
		this.placa = placa;
		this.renavam = renavam;
		this.num_motor = num_motor;
		this.num_portas = num_portas;
		this.num_eixos = num_eixos;
		this.altura = altura;
		this.largura = largura;
		this.distancia_eixos = distancia_eixos;
	}

}
