package br.gov.pe.educacao.repositorio;

import br.gov.pe.educacao.entidades.Sistema;
import br.gov.pe.educacao.interfaces.RepositorioSistema;
import br.gov.pe.educacao.negocio.excecoes.SistemaNaoCadastradoException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by eric.silva on 18/04/2016.
 */
public class RepositorioSistemaHibernate implements RepositorioSistema {

    private EntityManager manager;

    public RepositorioSistemaHibernate() {
        manager = Persistence.createEntityManagerFactory("CATALOGO")
                .createEntityManager();
    }

    @Override
    public void inserir(Sistema s) {
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
    }

    @Override
    public Sistema procurar(Long codigo) throws SistemaNaoCadastradoException {
        return manager.find(Sistema.class, codigo);
    }

    @Override
    public void remover(Long codigo) throws SistemaNaoCadastradoException {
        manager.getTransaction().begin();
        manager.remove(manager.find(Sistema.class, codigo));
        manager.getTransaction().commit();
    }

    @Override
    public boolean existe(Long codigo) throws SistemaNaoCadastradoException {
        return procurar(codigo) != null;
    }

    @Override
    public void atualizar(Sistema s) throws SistemaNaoCadastradoException {
        manager.getTransaction().begin();
        Sistema sistema = manager.find(Sistema.class, s.getCodigo());
        sistema.setNome(s.getNome());
        sistema.setSigla(s.getSigla());
        manager.persist(sistema);
        manager.getTransaction().commit();
    }
}
