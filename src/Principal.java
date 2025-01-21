import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = leitura.nextLine();
                try{
                    Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                    System.out.println(novoEndereco);
                    GeradorDeArquivo gerador = new GeradorDeArquivo();
                    gerador.salvaJson(novoEndereco);
                } catch (RuntimeException | IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Finalizando a aplicação ");
                }
//        Scanner endereco = new Scanner(System.in);
//        System.out.println("Digite o cep que deseja consultar: ");
//        String digitarCep = "";
//        digitarCep = endereco.nextLine();
//
//        ConsultaCep consultaCep = new ConsultaCep();
//        Endereco novoEndereco = consultaCep.buscaEndereco(digitarCep);
//        System.out.println(novoEndereco);
    }
}