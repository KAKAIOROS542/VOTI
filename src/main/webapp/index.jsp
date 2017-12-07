
<%@page import="java.util.ArrayList"%>
<%! int a1; %>
<!DOCTYPE HTML>
</script>
    <style>
            body{
                    text-align: center;
                    margin:0px;
                    background: #F2F2BD;
                    }

                   
            table {
	background-color:rgba(102,255,51,.5);
	font-size: 0.8em;
	font-family: Georgia,"Gill Sans MT", "Gill sans", "Trebuchet ms", sans-serif;
	line-height: 1.4em;
	
	width: 80%;
	
	border-collapse:collapse
}


        </style>


<html>
    <head>
	<title>tabla a_b_estuterritorial</title>
        <link rel="shortcut icon" href="Imagenes/favicon.ico" />	
	<meta name="keywords" content="" />
    </head>

<body>
        <section>
            <center>
                
                <table width="200" border="1">
                    <tr>
                        <th>Codigo</th>
                        <th>estado</th>
                        <th>nivel de formacion</th>
                        <th>anio</th>
                        <th>genero</th>
                        <th>areaOCDE</th>
                        <th>Registro</th>
                        
                    </tr>
                  
                    
                                                 
                                            <tr>
                                                <td> 
                                                 

                                                </td>
                                                
                                                
                                                <td> 
                                                 
                                                 </td>
                                                
                                                
                                                <td>
                                                 
                                                 </td>
                                                
                                                
                                                <td>
                                                 
                                                
                                                </td>
                                                
                                                                                                <td>
                                                 
                                                
                                                </td>
               
                                                
                                                

                                                                                               <td>
                                                 
                                                  
                                                </td>
                                                
                                                                                               <td>
                                                 
                                                    
                                                </td>
                    
                                            </tr>
                                                     
                                                            
                                            <%}%>        
                                         

                                <%if(!(pag==0)){%>  
                                
                                    <div id="apDiv5">
                                        <a href="a_b_estuterritorial.jsp?pag=<%=pag-1%>">   
                                            <img src="Imagenes/atras.png" title="Anterior"alt="" width="98" height="98" />
                                        </a>
                                    </div> 
                                <%}%>  
                                
                                <%if (a1 <= TodosUsuarios.size()-1){%>   
                                    <div id="apDiv6">
                                        <a href="a_b_estuterritorial.jsp?pag=<%=1+pag%>">  
                                            <img src="Imagenes/adelante.png" title="siguiente" alt="" width="98" height="98" />
                                        </a>
                                    </div>
                                <%}%>       
                            <%}%> 
    
                </table>
            </center>
        </section>
             <center>
                    <footer>
                        <div>
                           COCREALAB<br>
                            OBSERVATORIO TI<br>
                            Integrantes DE BACKEND: Camilo Barragan, Wulfran Zarate, Camilo Esquivel.
                        </div>
                    </footer>
</center>
    </body>
</html>