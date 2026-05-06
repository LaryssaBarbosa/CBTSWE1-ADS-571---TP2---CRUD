package gerencia;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ListaProduto")
public class ListaProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        BancoProduto banco = new BancoProduto();

        out.println("<html><body>");

        out.println("<h2 style='color:#2980b9; margin-top:0;'>Lista de Produtos</h2>");

        for (Produto p : banco.listar()) {

            out.println("<p>");
            out.println("ID: " + p.getId() + "<br>");
            out.println("Nome: " + p.getNome() + "<br>");
            out.println("Descrição: " + p.getDescricao() + "<br>");

            out.println("<a href='formAlteraProduto.jsp?id=" + p.getId() + "'>Alterar</a> | ");
            out.println("<a href='RemoveProduto?id=" + p.getId() + "'>Excluir</a>");

            out.println("</p><hr>");
        }

        out.println("</body></html>");
    }
}