package application;

import java.util.*;

public class TodoImpl extends AbstractTodoImpl {
    public Set<Tarefa> tasks = new HashSet<>();

    @Override
    protected Collection<Tarefa> getList() {
        return tasks;
    }
}
