package br.com.master3.implementacao;

import br.com.master3.beans.Hotel;

public class TesteHotel {

	public static void main(String[] args) {
		Hotel objeto = new Hotel();
		objeto.setId(1);
		objeto.setClassificassao(5);
		objeto.setFone("xxxx-xxxx");
		objeto.setLocalizacao("R. nomeRua, numero123");
		objeto.setSite("www.hotel.com.br");
		objeto.setValor("100,00/dia");
		
		
		System.out.println(objeto.getCidade());
		System.out.println(objeto.getLocalizacao());
		System.out.println(objeto.getClassificassao());
		System.out.println(objeto.getValor());
		System.out.println(objeto.getSite());
		System.out.println(objeto.getFone());
		System.out.println(objeto.getSite());
	}

}
