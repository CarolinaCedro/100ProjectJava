package dao;

import domain.Cliente;

import java.util.Collection;

public interface ClienteDao {

    Cliente cadastrar(Cliente cliente);

    Boolean existysOnData(Long id);

    void excluir(Long cpf);

    void alterar(Long cliente);

    Cliente consultar(Long cpf);

    Collection<Cliente> buscarTodos();

}
