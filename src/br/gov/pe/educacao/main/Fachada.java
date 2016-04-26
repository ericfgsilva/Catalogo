package br.gov.pe.educacao.main;

import br.gov.pe.educacao.entidades.Sistema;
import br.gov.pe.educacao.interfaces.RepositorioSistema;
import br.gov.pe.educacao.negocio.CadastroSistema;
import br.gov.pe.educacao.negocio.excecoes.*;
import br.gov.pe.educacao.repositorio.RepositorioSistemaHibernate;

import java.rmi.RemoteException;

public class Fachada {

	//1 - referência de si mesmo
	private static Fachada instancia;
	
	private CadastroSistema cadastroSistema;

	//2 - Construtor privado
	private Fachada() {
		initCadastros();
	}

	private void initCadastros() {

	}

	//3 - Método de acesso à referencia de si mesma
	public static Fachada obterInstancia() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	private void initCadastros(Sistema s) {
		RepositorioSistema rep =
				new RepositorioSistemaHibernate();
		cadastroSistema = new CadastroSistema(rep);
	}

	public void atualizar (Sistema s) throws SistemaNaoCadastradoException, CampoNumericoPreenchidoComLetrasException, CampoObrigatorioNaoPreenchidoException, SistemaInvalidoException, RemoteException {
		cadastroSistema.atualizar(s);
	}
	public Sistema procurar (String sigla) throws SistemaNaoCadastradoException, RemoteException, SistemaInvalidoException {
		return cadastroSistema.procurar(sigla);
	}
	public void cadastrar(Sistema s) throws SistemaJaCadastradoException, CampoNumericoPreenchidoComLetrasException, CampoObrigatorioNaoPreenchidoException, SistemaInvalidoException, SistemaNaoCadastradoException, RemoteException, SistemaInvalidoException, SistemaNaoCadastradoException {
		cadastroSistema.cadastrar(s);
	}
	public void descadastrarSistema(Long codigo) throws SistemaNaoCadastradoException, RemoteException, SistemaInvalidoException {
		cadastroSistema.descadastrar(codigo);
	}
}
