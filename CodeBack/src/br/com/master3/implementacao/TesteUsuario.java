package br.com.master3.implementacao;

import br.com.master3.beans.Cidade;
import br.com.master3.beans.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		Usuario objeto = new Usuario();
		objeto.setEmail("gulliver@masters3.com");
		objeto.setFot("/img/gulliver.jpg");
		objeto.setGenero("MASCULINO");
		objeto.setId(1);
		objeto.setNivel("ADMIN");
		objeto.setSenha("xpto");
		objeto.setNome("Viajante Silva");
		
		Cidade cidade = new Cidade();
		cidade.setCidade("BELO HORIZONTE");
		cidade.setEstado("MINAS GERAIS");
		cidade.setId(1);
		cidade.setPais("BRASIL");
		cidade.setSiglaEstado("MG");
		cidade.setSiglaPais("BR");
		
		objeto.setCidade(cidade);
		
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getNome());
		System.out.println(objeto.getId());
		System.out.println(objeto.getCidade().getCidade());
		System.out.println(objeto.getCidade().getEstado());
	}

}
