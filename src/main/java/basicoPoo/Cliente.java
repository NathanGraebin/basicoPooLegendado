
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
        // pode ser feito da seguinte maneira tambem
        
        // nome = Ler.next();
        //setNome(nome);
        
        
        
        // da mesma forma faremos para o id, passaremos nosso Scanner dentro do setIdCliente afim de atribuir um valor para a variavel idCliente
        // é como seu eu fizesse > setNome(Nathan Felipe)
        System.out.println("INFORME O ID ");
        setIdCliente(Ler.nextInt());
        
        // pode ser feito da seguinte maneira tambem
        
        // idCliente = Ler.next();
        //setNome(idCliente);
        
        
        System.out.println("CADASTRO REALIZADO");
        
        //apos isso o cadastro esta COMPLETO, finalizara o vetor e voltara para o menu

    }
        // aqui iniciaremos o metodo consultarCliente, no MENU ele pede para a gente colocar um idCliente para ser pesquisado, caso ele encontre o id do cliente
        // ele vai executar essa função que é basicamente TRAZER as informações do cliente com o metodo getNome e getIdCliente
    public void consultarCliente() {
        
        // usaremos um println para apresentar o esta dentro do getNome e getIdCliente
        System.out.println(getNome());
        System.out.println(getIdCliente());

        System.out.println("A CONSULTA TERMINOU");
        
         //apos apresentar os dados do cliente, finalizara o vetor e voltara para o menu
    }

    public void excluirCliente() {

        //PARA EXCLUIR UM CADASTRO, daremos aos dados valores NULOS sendo "" para String
        // ou ZERO > 0 < para Int
        
        // novamente iremos usar o metodo setNome, para atribuir valores nulos as variaveis,
        // fazendo que não seje mais possivel encontrar o nome e nem o IdCliente
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
