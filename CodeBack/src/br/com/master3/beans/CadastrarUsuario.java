package br.com.master3.beans;

public class CadastrarUsuario {

	public static void main(String[] args) {
		CadastroUsuario usuario = new CadastroUsuario();		
		
		usuario.setId(1);
		usuario.setNome("Gabriel Dovnorovzki");
		usuario.setEmail("gabrieldovnorovzki@email.com");
		usuario.setSenha("@mudar123");
		
		PerfilUsuario perfil = new PerfilUsuario();		
		perfil.setNivelAcesso("ADMIN");
		perfil.setStatus("Ativo");
		
		
		System.out.println(usuario.getId());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getSenha());

	}

}
