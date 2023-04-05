
package basicoPoo;

import java.util.Scanner;

public class Cliente {

    Scanner Ler = new Scanner(System.in);
    private String nome;
private int idCliente;
    

    public Cliente(String nome, int idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
    }

    public void cadastrarCliente() {
        System.out.println("INFORME O NOME ");
        setNome(Ler.next());

        System.out.println("INFORME O ID ");
        setIdCliente(Ler.nextInt());

        System.out.println("CADASTRO REALIZADO");

    }

    public void consultarCliente() {
        System.out.println(getNome());
        System.out.println(getIdCliente());

        System.out.println("A CONSULTA TERMINOU");
    }

    public void excluirCliente() {

        //PARA EXCLUIR UM CADASTRO, daremos aos dados valores NULOS sendo "" para String
        // ou ZERO > 0 < para Int
        
        
        setNome("");
        setIdCliente(0);
        System.out.println("CADASTRO EXCLUIDO");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idJuiz) {
        this.idCliente = idJuiz;
    }

}
