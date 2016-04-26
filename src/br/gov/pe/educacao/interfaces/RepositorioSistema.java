package br.gov.pe.educacao.interfaces;

import br.gov.pe.educacao.entidades.Sistema;
import br.gov.pe.educacao.negocio.excecoes.SistemaNaoCadastradoException;

/**
 * Created by eric.silva on 18/04/2016.
 */
public interface RepositorioSistema {

    void inserir(Sistema s);
    Sistema procurar(String sigla) throws SistemaNaoCadastradoException;
    /**implementar a busca com bind por codigo/sigla*/
    void remover(Long codigo) throws SistemaNaoCadastradoException;
    boolean existe(Long codigo) throws SistemaNaoCadastradoException;
    void atualizar(Sistema s) throws SistemaNaoCadastradoException;
}
