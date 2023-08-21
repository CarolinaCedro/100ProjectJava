//Lista de Tarefas (To-Do List): Desenvolva um aplicativo que permita aos usuários adicionar, remover e marcar tarefas como concluídas.
//Isso ajudará você a entender conceitos de gerenciamento de listas e interação com o usuário.

import application.*;

import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    private static TodoImpl todo = new TodoImpl();

    public static void main(String[] args) {


        int op;

        do {
            System.out.println("Seja bem vindo ao Todo-List");
            System.out.println("Escolha uma opção");

            System.out.println("(1)Inserir Task");
            System.out.println("(2)remover Task");
            System.out.println("(3)concluir Task");
            System.out.println("(4)Listar Tasks");
            System.out.println("(0)sair");
            op = sc.nextInt();


            switch (op) {
                case 1 -> todo.createTask(createTask());
                case 2 -> todo.removeTask(removeTask());
                case 3 -> todo.marcarConcluida(concluirTask());
                case 4 -> print(todo.getAll());
                default -> System.out.println("Operção não permitida");
            }

        } while (op != 0);

    }


    public static Tarefa createTask() {
        sc.nextLine();
        System.out.println("Entre com o titulo da task: ");
        String title = sc.nextLine();
        System.out.println("Entre com a descricao da task: ");
        String description = sc.nextLine();
        return new Tarefa(title, description, false);
    }

    public static Tarefa concluirTask() {
        System.out.println("Entre com o titulo da task a ser removido: ");
        String task = sc.nextLine();
        Tarefa tarefa = todo.getTask(task);
        return tarefa;
    }


    public static Tarefa removeTask() {
        System.out.println("Entre com o titulo da task a ser removido: ");
        String task = sc.nextLine();
        return todo.getTask(task);
    }


    public static void print(List<Tarefa> list) {
        list.forEach(System.out::println);
    }


}
