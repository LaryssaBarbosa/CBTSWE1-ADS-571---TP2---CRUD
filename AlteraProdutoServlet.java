package gerencia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/AlteraProduto")
public class AlteraProdutoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String nome = request.getParameter("nome");
        int unidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
        String descricao = request.getParameter("descricao");
        double qtd = Double.parseDouble(request.getParameter("qtdPrevistoMes"));
        double preco = Double.parseDouble(request.getParameter("precoMaxComprado"));

        BancoProduto banco = new BancoProduto();

        for (Produto p : banco.listar()) {
            if (p.getId() == id) {
                p.setNome(nome);
                p.setUnidadeCompra(unidadeCompra);
                p.setDescricao(descricao);
                p.setQtdPrevistoMes(qtd);
                p.setPrecoMaxComprado(preco);
                break;
            }
        }

        response.sendRedirect("ListaProduto");
    }
}