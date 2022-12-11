import java.util.Scanner;

public class atv11{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d, m, an;

    System.out.print("Digite o dia: ");
    d = sc.nextInt(); 
    System.out.print("");

    System.out.print("Digite o mês: ");
    m = sc.nextInt();
    System.out.print("");

    System.out.print("Digite o ano: ");
    an = sc.nextInt();
    System.out.print("");

    System.out.print("A data informada foi: " + d + " de " + NomeDoMes(m, an) + " de " + an);

  
  }



public static String NomeDoMes(int i, int tipo) {
  String mes[] = {"janeiro", "fevereiro", "março", "abril",
    "maio", "junho", "julho", "agosto", "setembro", "outubro",
    "novembro", "dezembro"};
    if (tipo == 0)
    return(mes[i-1]); 
 else return(mes[i-1]); 
}
}