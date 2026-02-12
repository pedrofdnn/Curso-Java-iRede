package Projetos_Modulo_inicial.TaskManager;

import java.util.ArrayList;

public class Manager {

    ArrayList<Task> taskLists = new ArrayList<>();

    public void listarTarefas() {

        if (taskLists.isEmpty()) {
            System.out.print("\nNenhuma Tarefa cadastrada no momento.\n");
        } else {

            for (Task item : taskLists) {
                if (item instanceof PersonalTask) {

                    PersonalTask p = (PersonalTask) item;
                    System.out.print("Lista de Tarefas pessoais: "
                            + "ID: " + p.getId() + " "
                            + "Tarefa: '" + p.getDescricao() + "' \n");

                } else if (item instanceof WorkTask) {

                    WorkTask w = (WorkTask) item;
                    System.out.print("Lista de Tarefas de Trabalho: "
                            + "ID:" + w.getId() + " "
                            + "Tarefa: '" + w.getDescricao() + "' \n");
                }
            }
        }
    }

    public void addPessoal(String Desc, String pTasks) {
        int novoId = taskLists.size() + 1;
        taskLists.add(new PersonalTask(novoId, Desc, pTasks));
        System.out.println("v Tarefa pessoal '" + Desc + "' adicionada com sucesso!");

    }

    public void addWork(String Desc, String worTasks) {
        int novoId = taskLists.size() + 1;
        taskLists.add(new WorkTask(novoId, Desc, worTasks));
        System.out.println("v Tarefa pessoal '" + Desc + "' adicionada com sucesso!");
    }

}
