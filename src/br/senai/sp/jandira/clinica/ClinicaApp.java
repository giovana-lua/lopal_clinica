package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Criar um objeto do tipo paciente
		Paciente p1 = new Paciente();
		p1.setNome("matheus"); 
		p1.cpf = "999.888.777-66";
		p1.setAltura(1.75);
		p1.setPeso(75.0); 
		p1.telefone = "(11)96523-8888";
		p1.dataNascimento = LocalDate.of(2008, 7, 03);

		Paciente p2 = new Paciente();
		p2.setNome("giovana");
		p2.cpf = "581.280.238.12";
		p2.setAltura(1.65);
		p2.setPeso(52.0);
		p2.telefone = "(11)962051962";
		p2.dataNascimento = LocalDate.of(2005, 3, 15);
		
		p1.mostrarDados();
		p2.mostrarDados();
		
		String teste = p1.getNome()
		System.out.println(teste.toLowerCase());
		System.out.println()

		
				
		
		
        
	}

}
