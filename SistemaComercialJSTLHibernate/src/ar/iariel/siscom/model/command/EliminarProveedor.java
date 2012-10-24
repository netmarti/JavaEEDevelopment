package ar.iariel.siscom.model.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.iariel.siscom.model.bean.Proveedor;
import ar.iariel.siscom.model.dao.HibernateDAO;
import ar.iariel.siscom.model.dao.InterfaceDAO;
/**
 * 
 * @author Ariel Duarte
 *
 */
public class EliminarProveedor implements InterfaceCommand {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
		InterfaceDAO<Proveedor> proveedorDAO = new HibernateDAO<Proveedor>(Proveedor.class);
		Integer codigo = Integer.valueOf(request.getParameter("codigo"));
		Proveedor provedorBean = new Proveedor();
		provedorBean.setCodigo(codigo);
		proveedorDAO.eliminar(provedorBean);
		request.setAttribute("mensagem", "Proveedor eliminado con exito");
		return "SiscomServletController?cmd=consultaProveedor";
	}

}
