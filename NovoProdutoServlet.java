package gerencia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/NovoProduto")
public class NovoProdutoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Produto p = new Produto();

        p.setNome(request.getParameter("nome"));
        p.setUnidadeCompra(Integer.parseInt(request.getParameter("unidadeCompra")));
        p.setDescricao(request.getParameter("descricao"));
        p.setQtdPrevistoMes(Double.parseDouble(request.getParameter("qtdPrevistoMes")));
        p.setPrecoMaxComprado(Double.parseDouble(request.getParameter("precoMaxComprado")));

        BancoProduto banco = new BancoProduto();
        banco.adicionar(p);

        response.sendRedirect("ListaProduto");
    }
}