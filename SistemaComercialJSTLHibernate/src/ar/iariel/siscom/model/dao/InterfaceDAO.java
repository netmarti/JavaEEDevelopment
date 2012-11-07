package ar.iariel.siscom.model.dao;

import java.io.Serializable;
import java.util.List;
/**
 * Date : 07/10/2012
 * @author Ariel Duarte
 *
 * @param <T>
 */

public interface InterfaceDAO<T> {
	void salvar(T bean);
	void actualizar(T bean);
	void eliminar(T bean);
	T getBean(Serializable codigo);
	List<T> getsBeans();
	List<T> getBeansByExample(T Bean);
}
