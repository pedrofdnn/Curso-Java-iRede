package Projetos_Modulo_inicial.TaskManager;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager gerenciador = new Manager();
        int opcao = -1;
        
        while (opcao != 6) {
            System.out.print("\n1- Listar Todas as Tarefas.  \n2- Adicionar Tarefas Pessoais. "
                    + " \n3- Adcionar Tarefas do Trabalho.  \n4- Marcar uma Tarefa como Concluida."
                    + " \n5- Apagar uma Tarefa.  \n6- Sair \nOpção:  ");
            
            opcao = scanner.nextInt();
            
            scanner.nextLine();
            
            switch (opcao) {
                case 1: {
                    gerenciador.listarTarefas();
                    break;
                }
                case 2: {
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();                    
                    gerenciador.addPessoal(desc, "Pessoais. ");                    
                    break;
                }
                case 3: {
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();                    
                    gerenciador.addWork(desc, "do Trabalho.");                    
                    break;
                }
                case 4: {
                    System.out.print("Selecione qual tarefa foi concluida, ID: ");
                    int idConcluida = scanner.nextInt();
                    gerenciador.concluirTarefa(idConcluida);                    
                    break;
                }
                case 5: {
                    System.out.print("Digite o ID da tarefa que deseja apagar: ");
                    int idApagar = scanner.nextInt();
                    gerenciador.removerTarefa(idApagar);                    
                    break;
                }
                case 6: {
                    System.out.println("Saindo...");
                    break;
                }
                default:
                    System.out.println("Opção Invalidade Tente Novamente.");
            }
            
        }
        
    }
    
}
