package tratando;
import java.util.Scanner;

public class tratamento {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome completo: ");
            String nome = terminal.nextLine();
            System.out.println("Digite o valor que voce quer sacar");
            Double valor = Double.parseDouble(terminal.nextLine());
            System.out.println("Qual o seu saldo: ");
            Double saldo = Double.parseDouble(terminal.nextLine());
            sacar(valor, saldo, nome);
            
         } catch (java.lang.NumberFormatException e) {
            System.out.println("O valor do saque e o saldo tem que ser numeros");
                        
        } catch (Exception e){
            System.out.println("ocorreu um erro " + e.getMessage());
        }  
        terminal.close();
        }
        static void sacar (Double valor, Double saldo, String nome) {
            if (valor < 0) {
                System.out.println("Digite apenas valor maiores do que 0 ");
            }else if (saldo < 0){
                System.out.println("Digite apenas valor maiores do que 0 ");
            }else if (valor > saldo) {
                System.out.println("valor do saque tem que ser menor que o valor do saldo.");
            }else {
                saldo -= valor;
                System.out.println(nome.toUpperCase() + " o valor que você quer sacar é " + valor + " e o seu saldo depois do saque será " + saldo);
            }
    }
}
