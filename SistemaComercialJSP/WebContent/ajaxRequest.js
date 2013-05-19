var ajax_req;

function ajaxRequestBasica() {

        if (window.XMLHttpRequest) // Firefox, Safari, Opera, etc
		{ 
            ajax_req = new XMLHttpRequest();
        } else if (window.ActiveXObject) // Internet Explorer
		{ 
            try 
			{
                ajax_req = new ActiveXObject("Msxml2.XMLHTTP");//Vers�es mais novas
            } catch (e) 
			{
                try 
				{
                    ajax_req = new ActiveXObject("Microsoft.XMLHTTP");//Vers�o mais antiga
                } catch (e) 
				{
				}
            }
        }

        if (!ajax_req) {
            alert("Problemas com a requisi��o!");
            return false;
        }
        ajax_req.onreadystatechange = FUNCAO;//Quando  o atributo readyState for alterado invocar a funcao
        ajax_req.open('GET',ENDERECO, true);//Abre a conex�o tipo, url e boolean indicando se � ass�ncrona
        ajax_req.send(null);//Informa��o a ser enviada junto, utilizado no POST
}

function criarAjaxRequest()
{
        if (window.XMLHttpRequest) // Firefox, Safari, Opera, etc
		{ 
            ajax_req = new XMLHttpRequest();
        } else if (window.ActiveXObject) // Internet Explorer
		{ 
            try 
			{
                ajax_req = new ActiveXObject("Msxml2.XMLHTTP");//Vers�es mais novas
            } catch (e) 
			{
                try 
				{
                    ajax_req = new ActiveXObject("Microsoft.XMLHTTP");//Vers�o mais antiga
                } catch (e) 
				{
				}
            }
        }
}

function ajaxRequestPost(url, funcao, param) 
{
		criarAjaxRequest();
        if (!ajax_req) {
            alert("Problemas com a requisi��o!");
            return false;
        }
        ajax_req.onreadystatechange = eval(funcao);
        ajax_req.open('POST', url, true);
		ajax_req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        ajax_req.send(param);
}

function ajaxRequestGet(url, funcao, param) 
{
		criarAjaxRequest();
        if (!ajax_req) {
            alert("Problemas com a requisi��o!");
            return false;
        }
        ajax_req.onreadystatechange = eval(funcao);
        ajax_req.open('GET',url+"?"+param, true);
        ajax_req.send(null);
}