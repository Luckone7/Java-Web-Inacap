
import cl.Negocio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Usuario u = new Usuario();
            HttpSession sesion = request.getSession();// crear una sesion en la aplicacion
            if (request.getParameter("accion").equals("ingresar")) {
                String us = request.getParameter("username");
                String pass = request.getParameter("password");
                u.setUsername(us);
                u.setPassword(pass);
                if (u.Validar() == true) {
                    sesion.setAttribute("Conectado", "true");
                    response.sendRedirect("inicio.jsp");
                } else {
                    sesion.setAttribute("Conectado", "false");
                    response.sendRedirect("index.jsp");
                }
            } else if (request.getParameter("accion").equals("registrar")) {
                String user = request.getParameter("username");
                String pass = request.getParameter("password");
                String nom = request.getParameter("nom");
                String apepat = request.getParameter("apepat");
                String apemat = request.getParameter("apemat");
                u.setName(nom);
                u.setApepat(apepat);
                u.setApemat(apemat);
                u.setUsername(user);
                u.setPassword(pass);
                u.Save();
                response.sendRedirect("index.jsp");
            } else if (request.getParameter("accion").equals("cerrar")) {
                //Eliminar Sesion
                sesion.invalidate();
                response.sendRedirect("index.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
