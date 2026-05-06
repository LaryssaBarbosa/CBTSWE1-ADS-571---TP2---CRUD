<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar Produto</title>
</head>
<body>

<div style="text-align:center; font-family:Arial; margin-bottom:20px;">

    <h2 style="color:#2c3e50; margin-bottom:5px;">
        CBTSWE1 – ADS 571 – Professor: Wellington Tuler Moraes
    </h2>

    <h3 style="color:#2980b9; margin-top:0;">
        Laryssa Barbosa Soares
    </h3>

    <hr style="width:60%;">

    <h2 style="color:#e67e22;">
        Alterar Produto
    </h2>

</div>

<form action="AlteraProduto" method="post"
style="background-color:#f2f2f2; padding:15px; width:300px; border-radius:8px; margin:auto;">

<input type="hidden" name="id" value="${param.id}">

Nome:<br>
<input name="nome" style="margin-bottom:10px; width:100%;"><br>

Unidade Compra:<br>
<input name="unidadeCompra" style="margin-bottom:10px; width:100%;"><br>

Descrição:<br>
<input name="descricao" style="margin-bottom:10px; width:100%;"><br>

Quantidade Prevista (Mês):<br>
<input name="qtdPrevistoMes" style="margin-bottom:10px; width:100%;"><br>

Preço Máximo:<br>
<input name="precoMaxComprado" style="margin-bottom:15px; width:100%;"><br>

<button type="submit"
style="background-color:#e67e22; color:white; padding:8px 12px; border:none; border-radius:5px;">
Atualizar
</button>

</form>

<br>

<div style="text-align:center;">
<a href="ListaProduto">Voltar para lista</a>
</div>

</body>
</html>