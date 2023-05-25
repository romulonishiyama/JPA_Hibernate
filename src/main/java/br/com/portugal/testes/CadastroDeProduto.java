package br.com.portugal.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.portugal.loja.dao.CategoriaDao;
import br.com.portugal.loja.dao.ProdutoDao;
import br.com.portugal.loja.modelo.Categoria;
import br.com.portugal.loja.modelo.Produto;
import br.com.portugal.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		
		Categoria celulares = new Categoria("Celulares");
		Produto celular = new Produto("Xiaomi Readmi", "Muito legal", new BigDecimal("800"), celulares );

		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();

	}

}
