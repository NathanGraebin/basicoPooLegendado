/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package basicoPoo;

import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class Menu {

    public static void main(String[] args) {
        int opcaoMenu = -1;
        int opcaoSecundaria = -1;

        // criação do Scanner de Leitura
        Scanner KEYBOARD = new Scanner(System.in);

        //Criação de um vetor para armazenar TODOS OS DADOS de CADA Cliente
        //EXEMPLOS DE CLASSES : Cliete,Funcionario,venda,relatorio,Produto,Juiz,Estadio
        //Na classe Cliete vamos criar um vetor chamado CLIENTES podendo cadastrar ate 3 Clientes, mas podendo ser aumentado para o numero que preferir
        Cliente CLIENTES[] = new Cliente[3];
        // EXEMPLO > CLIENTES[i] nessa posição vai conter todos os dados do Cliente
        // é como se fosse CLIENTE0 CLIENTE1 CLIENTE2...
        

        //Faremos um loop, cada iniciar cada cadastro, colocando valores NULOS, para depois alterar
        //para os dados de cadastros
        for (int i = 0; i < CLIENTES.length; i++) {

            // o CLIENTE na posição I vai receber os seguintes dados ( aqui são valores nulos, que serão preechidos depois)
            CLIENTES[i] = new Cliente("", 0);
        }

        do {

            System.out.println("[1] CADASTRAR CLIENTE");
            System.out.println("[2] VERIFICAR CADASTRO DO CLIENTE");
            System.out.println("[3] EXCLUIR JUIZ");
            System.out.println("[0] SAIR");
            opcaoSecundaria = KEYBOARD.nextInt();

            switch (opcaoSecundaria) {
                case 1:
                    System.out.println("CADASTRAR CLIENTE");
                    //vamos rodar um loop para poder interagir com cada posição do vetor
                    for (int i = 0; i < CLIENTES.length; i++) {
                        // se o vetor na posição I do CLIENTE pegar o ID e for = 0 ( nulo ) faremos
                        if (CLIENTES[i].getIdCliente() == 0) {
                            //faremos o metodo cadastrarCliente na posição I
                            CLIENTES[i].cadastrarCliente();

                            //e quando terminarmos de cadastrar o cliente, faremos o indice finalizar atribuindo
                            //o tamanho total para ele e voltar ao menu
                            i = CLIENTES.length;
                        }
                    }
                    break;
                case 2:
                    //primeiro informaremos o ID que queremos pesquisar caso não tenha cadastrado
                    //ele nao vai achar nada.
                    System.out.println("VERIFICAR CADASTRO DO CLIENTE");
                    System.out.println("INFORME O ID QUE QUER BUSCAR :");
                    int idProcurado = KEYBOARD.nextInt();

                    for (int i = 0; i < CLIENTES.length; i++) {
                        //rodaremos um loop
                        // se o vetor I da CLIENTE pegar o ID e for = ao numero que digitamos faremos
                        if (CLIENTES[i].getIdCliente() == idProcurado) {
                            //faremos a consulta do dados do Cliente cadastrado na posição I
                            CLIENTES[i].consultarCliente();

                            //apos sa consulta, o I vai receber o tamanho total dele
                            //para finalizar o loop e voltar ao menu
                            i = CLIENTES.length;
                        }
                    }
                    break;

                case 3:

                    //PARA EXCLUIR UM CADASTRO, daremos aos dados valores NULOS sendo "" para String
                    // ou ZERO > 0 < para Int
                    //primeiro informaremos o ID que queremos EXCLUIR caso não tenha cadastrado
                    //ele nao vai excluir nada.
                    System.out.println("INFORME O ID QUE QUER EXCLUIR");
                    idProcurado = KEYBOARD.nextInt();

                    for (int i = 0; i < CLIENTES.length; i++) {
                        //rodaremos um loop

                        // se o vetor na posição I do CLIENTE pegar o ID e for = ao numero que digitamos faremos
                        if (CLIENTES[i].getIdCliente() == idProcurado) {
                            //faremos o metodo excluir os dados do CLIENTE cadastrado na posição I

                            CLIENTES[i].excluirCliente();

                            //apos sa consulta, o I vai receber o tamanho total dele
                            //para finalizar o loop e voltar ao menu
                            i = CLIENTES.length;
                        }
                    }

                    break;

                case 0:
                    opcaoMenu = 0;
                    break;
            }
        } while (opcaoMenu != 0);
    }
}
