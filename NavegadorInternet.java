public class NavegadorInternet{
Scanner entrada= new Scanner(System.in);
private String url;
private String abaNova;
private String atualizar;

public void setUrl(String url){
this.url=url;

}
public String getUrl(){
return this.url;
}

public String exibirPagina(){
return getPagina();
}
try{
System.out.println("Digite a url da página");
String url= entrada.next();
return exibirPagina();

}catch(Exception e){
System.out.println("Pagina não encontrada");
 }


//Método nova Aba
public String abrirAba(String novaAba){
this.novaAba=novaAba;
System.out.println("Aba nova aberta");
}

//Método atualizar página
public boolean atualizarPagina(boolean atualizar){
System.out.println("Clique em F5 ou no botão atualizar");
 if(atualizar== F5 || atualizar== botaAtualizar)
    System.out.println("Página atualizada!");
}




}
}
