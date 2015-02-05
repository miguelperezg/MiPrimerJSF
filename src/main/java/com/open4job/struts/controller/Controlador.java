package com.open4job.struts.controller;


	import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	 
import javax.servlet.http.HttpSession;

	import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
	 
	//import com.mkyong.common.form.HelloWorldForm;
	 
	public class Controlador extends Action{
	 
		public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
	 /*
			BienvenidaForm bienvenida = (BienvenidaForm) form;
			bienvenida.setMessage("Bienvenido a Struts");
	 */
			
			/*String texto = (String) request.getParameter("Texto");
			String nombre = (String) request.getParameter("Nombre");
			request.setAttribute("texto", texto);
			request.setAttribute("nombre", nombre);*/
			
			return mapping.findForward("Bienvenido");
		}
	 
	}

