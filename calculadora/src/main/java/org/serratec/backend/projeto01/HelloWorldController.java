package org.serratec.backend.projeto01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

	@RequestMapping("/ola")
	public String olaMundo() {
		return "Olá Mundo!";
	}

	@RequestMapping("/maiuscula")
	public String maiuscula(@RequestParam String valor) {
		return valor.toUpperCase();
	}
	@RequestMapping("/soma")
	public String somar(int n1, int n2) {
		int result;
		result = n1 + n2;
		return "A soma é igual " + result + ".";
	}

	@RequestMapping("/subtracao")
	public String subtrair(int n1, int n2) {
		int result;
		result = n1 - n2;
		return "A subtração é igual " + result + ".";
	}
	@RequestMapping("/divisao")
	public String dividir(double n1, double n2) {
		double result;
		result = n1 / n2;
		if(n2 > n1) {
			return "Operação inválida";
		}
		return String.format("A divisão é igual  %.3f ", result);
	}
	@RequestMapping("/multiplicacao")
	public String multiplicar(int n1, int n2) {
		int result;
		result = n1 * n2;
		return "A multiplicação é igual " + result + ".";
	}

}
