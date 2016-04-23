package br.gov.pe.educacao.interfaces;

import br.gov.pe.educacao.entidades.Sistema;
import br.gov.pe.educacao.negocio.excecoes.SistemaNaoCadastradoException;

/**
 * Created by eric.silva on 18/04/2016.
 */
public interface RepositorioSistema {

    void inserir(Sistema s);
    Sistema procurar(String sigla) throws SistemaNaoCadastradoException;
    void remover(String sigla) throws SistemaNaoCadastradoException;
    boolean existe(String sigla) throws SistemaNaoCadastradoException;
    void atualizar(Sistema s) throws SistemaNaoCadastradoException;
}
