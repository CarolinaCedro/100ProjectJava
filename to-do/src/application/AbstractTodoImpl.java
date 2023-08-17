package application;

import java.util.*;

public abstract class AbstractTodoImpl implements Todo {

    protected abstract Collection<Tarefa> getList();

    @Override
    public void createTask(Tarefa tarefa) {
        getList().add(tarefa);
    }

    @Override
    public void removeTask(Tarefa tituloTarefa) {
        getList().remove(tituloTarefa);
    }

    @Override
    public List<Tarefa> getAll() {
        return getList().stream().toList();
    }

    @Override
    public Tarefa getTask(String title) {
        return getList().stream()
                .filter(task -> task.getTitulo().equals(title)) //se for igual traga
                .findFirst() // ache o primeiro pra gente
                .orElse(null); // se esse querido não existir pode lançar um null
    }


    @Override
    public Tarefa marcarConcluida(Tarefa tarefa) {
        tarefa.setConcluida(true);
        System.out.println(tarefa + " concluida");
        return tarefa;
    }
}
