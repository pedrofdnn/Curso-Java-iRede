package Projetos_Modulo_inicial.TaskManager;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager {

    ArrayList<Task> taskLists = new ArrayList<>();

    public void listarTarefas() {
        if (taskLists.isEmpty()) {
            System.out.print("\nNenhuma Tarefa cadastrada no momento.\n");
        } else {

            for (Task item : taskLists) {
                if (item instanceof PersonalTask) {
                    PersonalTask p = (PersonalTask) item;
                    String status = item.getConcluida() ? "[CONCLUÍDA]" : "[PENDENTE]";
                    System.out.print(status + "Lista de Tarefas pessoais: "
                            + "ID: " + p.getId() + " "
                            + "Tarefa: '" + p.getDescricao() + "' \n");

                } else if (item instanceof WorkTask) {
                    WorkTask w = (WorkTask) item;
                    String status = item.getConcluida() ? "[CONCLUÍDA]" : "[PENDENTE]";
                    System.out.print(status + "Lista de Tarefas de Trabalho: "
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

    public void concluirTarefa(long idTarefa) {
        for (Task t : taskLists) {
            if (t.getId() == idTarefa) {
                t.setConcluida(true);
                System.out.println("v Tarefa " + idTarefa + " marcada como concluída!");
                return;
            }
        }
        System.out.println("❌ Erro: Tarefa com ID " + idTarefa + " não encontrada.");
    }

    public void removerTarefa(int idParaRemover) {
        Iterator<Task> it = taskLists.iterator();

        while (it.hasNext()) {
            Task tarefaDaVez = it.next();

            if (tarefaDaVez.getId() == idParaRemover) {
                it.remove();
                System.out.println("x️ Tarefa removida com sucesso!");
                return;
            }
        }
        System.out.println("x ID não encontrado.");
    }

}
