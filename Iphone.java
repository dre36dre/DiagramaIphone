import java.util.Scanner;

public class Iphone{
public static void main(String[] args){
  Scanner entrada= new Scannner(System.in);

System.out.println("Escolha uma opção:"
+"1- Reprodutor musical"+
+"2- Aparelho telefonico"+
+"3- Navegador de internet"
);
int opcao=entrada.nextInt();
switch(opcao){
case 1: 
System.out.println("Reprodutor musical");
  ReprodutorMusical rm= new ReprodutorMusical();
  rm.tocar();
  break;
case 2:
System.out.println("Aparelho telefonico");
  AparelhoTelefonico at=new AparelhoTelefonico();
  at.ligar();
case 3:
System.out.println("Navegador de internet");
  NavegadorInternet ni=new NavegadorInternet();
  ni.exibirPagina();
default:
System.out.println("Opção inexistente");
}
}

}
