package br.com.master3.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.master3.beans.CadastroUsuario;

public class ListCadastrarUsuario {

	private static int id;
	

	public static void main(String[] args) {
		List<CadastroUsuario> newUser = new ArrayList<>();
		
		String answer = "";
		int i = 1;
		
		do {
			newUser.add(new CadastroUsuario(
					(id),
					JOptionPane.showInputDialog("Por favor, informe o seu nome"),
					JOptionPane.showInputDialog("Por favor, informe o seu email"),
					JOptionPane.showInputDialog("Por favor, informe uma senha")
				));
			answer = JOptionPane.showInputDialog("Digite <S> para cadastrar um novo usuario").toUpperCase();
			int contador = i++;
			id = contador;

		} while(answer.equals("S"));
		
		for (CadastroUsuario user : newUser) {
			String profile = ("Id: " + user.getId() + ", Nome: " + user.getNome() + ", Email: " + user.getEmail() + ", Senha: " + user.getSenha() + ";");
			System.out.println("Novo usuario cadastrado: " + profile);
				
			}
		}
	}



