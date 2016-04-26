package br.gov.pe.educacao.negocio;

import br.gov.pe.educacao.entidades.Sistema;
import br.gov.pe.educacao.interfaces.RepositorioSistema;
import br.gov.pe.educacao.negocio.excecoes.*;

import java.rmi.RemoteException;

/**
 * Created by eric.silva on 18/04/2016.
 */
public class CadastroSistema {

    private RepositorioSistema respositorioSistema;

    public CadastroSistema(RepositorioSistema r) {
        this.respositorioSistema = r;
    }

    public void atualizar(Sistema s) throws SistemaNaoCadastradoException, CampoNumericoPreenchidoComLetrasException, CampoObrigatorioNaoPreenchidoException, SistemaInvalidoException, RemoteException {
        validar(s);
        respositorioSistema.atualizar(s);

    }
    public void cadastrar(Sistema s) throws SistemaJaCadastradoException, CampoNumericoPreenchidoComLetrasException, CampoObrigatorioNaoPreenchidoException, SistemaInvalidoException, SistemaNaoCadastradoException, RemoteException {
        if (!respositorioSistema.existe(s.getCodigo())) {
            validar(s);
            respositorioSistema.inserir(s);
        } else {
            throw new SistemaJaCadastradoException("Sistema já cadastrado !");
        }
    }

    public void descadastrar(Long c) throws SistemaNaoCadastradoException, SistemaInvalidoException, RemoteException {
        respositorioSistema.remover(c);
    }
    public Sistema procurar(String s) throws SistemaNaoCadastradoException, SistemaInvalidoException, RemoteException {
        return respositorioSistema.procurar(s);
    }

    public void validar(Sistema sistema)
            throws CampoNumericoPreenchidoComLetrasException,
            CampoObrigatorioNaoPreenchidoException,
            SistemaInvalidoException {
        if (sistema == null) {
            throw new CampoObrigatorioNaoPreenchidoException("Sistema não informado !");
        }
        sistema.setNome(sistema.getNome().toUpperCase());
        sistema.setSigla(sistema.getSigla().toUpperCase());

        if (sistema.getSigla() == null || sistema.getSigla().isEmpty()) {
            throw new CampoObrigatorioNaoPreenchidoException("Favor informar a Sigla do sistema !");
        }
        if (sistema.getSigla().length() != 6 ) {
            throw new SistemaInvalidoException("Favor informar Sigla com 6 caracteres !");
        }
        if (sistema.getNome() == null || sistema.getNome().isEmpty()) {
            throw new CampoObrigatorioNaoPreenchidoException("Favor informar o nome do sistema !");
        }
    }
}
