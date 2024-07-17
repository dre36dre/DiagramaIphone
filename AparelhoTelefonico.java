public class AparelhoTelefonico{
private String numero;
private String correioVoz;

public void setNumero(String numero){
this.numero=numero;
}
public String getNumero(){
return this.numero;
}

public String atender(){
System.out.println("Atendendo ligação");
}

public String iniciarCorreioVoz(){

System.out.println("Ouvindo correio de voz");
}



}
