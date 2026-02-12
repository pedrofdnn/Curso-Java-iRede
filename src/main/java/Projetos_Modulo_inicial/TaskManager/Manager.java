package Projetos_Modulo_inicial.TaskManager;

import java.util.ArrayList;

public class Manager {

    ArrayList<Task> taskLists = new ArrayList<>();

    public void listarTarefas() {

        for (Task item : taskLists) {

            if (item instanceof PersonalTask) {

                PersonalTask p = (PersonalTask) item;
                System.out.print(p.getLocal());

            } else if (item instanceof WorkTask) {

                WorkTask w = (WorkTask) item;
                System.out.println(w.getPrioridade());
            }
        }

    }

    public void addPessoal(int Id, String Desc, String Local) {
        taskLists.add(new PersonalTask(Id, Desc, Local));

    }

    public void addWork(int Id, String Desc, String Prioridade) {
        taskLists.add(new WorkTask(Id, Desc, Prioridade));
    }

}
