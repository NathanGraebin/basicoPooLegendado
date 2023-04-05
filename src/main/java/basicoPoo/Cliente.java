
package basicoPoo;

import java.util.Scanner;

public class Cliente {
    //iniciaremos contruindo um Scanner para podermos dar valores as variaveis
    Scanner Ler = new Scanner(System.in);
    
    //Criaremos 2 variaveis PRIVADAS( podendo ser publicas tambem )
    private String nome;
    private int idCliente;
    
    //Faremos um construtor para o cliente, que seria passar as variaveis BASICAS para dizer que aquele é um CLIENTE
    public Cliente(String nome, int idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
    }
    //aqui iniciaremos a contrução do metodo cadastrar cliente
    public void cadastrarCliente() {
        //apresentaremos uma linha pedindo para informar o nome do cliente
        System.out.println("INFORME O NOME ");
        
        // setNome é responsavel por atribuir o nome do cliente,
        // passaremos nosso scanner dentro dele, pois o metodo setNome precisa receber uma String, setNome(nome), então passaremos nosso Scanner para podermos
        //definir o nome do cliente.  
        // é como seu eu fizesse > setNome(Nathan Felipe)
        setNome(Ler.next());
        
        // da mesma forma faremos para o id, passaremos nosso Scanner dentro do setIdCliente afim de atribuir um valor para a variavel idCliente
        // é como seu eu fizesse > setNome(Nathan Felipe)
        System.out.println("INFORME O ID ");
        setIdCliente(Ler.nextInt());
        
        
        System.out.println("CADASTRO REALIZADO");
        
        //apos isso o cadastro esta COMPLETO, finalizando e voltando para o menu

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
