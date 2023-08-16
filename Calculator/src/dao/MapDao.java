package dao;

import domain.*;

import java.util.*;

public class MapDao implements ClienteDao {

    public Map<Long, Cliente> clientData = new HashMap<>();

    @Override
    public Cliente cadastrar(Cliente cliente) {
        Long id = cliente.getCpf();
        Boolean exists = this.existysOnData(id);
        if (exists) {
            throw new RuntimeException("Usuario já existe na base de dados");
        }
        return clientData.put(id, cliente);
    }

    @Override
    public void excluir(Long cpf) {
        if (this.existysOnData(cpf)) {
            Cliente cliente = this.clientData.get(cpf);
            this.clientData.remove(cpf, cliente);
        }
        throw new RuntimeException("Usuario não encontrado");
    }

    @Override
    public void alterar(Long cliente) {
        Cliente clienteUpdate = this.clientData.get(cliente);
        Boolean exists = this.existysOnData(clienteUpdate.getCpf());
        if (exists) {
            Cliente clienteAfter = this.clientData.get(cliente);
            clienteUpdate.setCidade(clienteAfter.getCidade());
            clienteUpdate.setEstado(clienteAfter.getEstado());
            clienteUpdate.setEnd(clienteAfter.getEnd());
            clienteUpdate.setNome(clienteAfter.getNome());
            clienteUpdate.setNumero(clienteAfter.getNumero());
            clienteUpdate.setTel(clienteAfter.getTel());
        }

        throw new RuntimeException("Usuario não encontrado");

    }

    @Override
    public Cliente consultar(Long cpf) {
        Boolean cliente = this.existysOnData(cpf);
        if (cliente) {
            return this.clientData.get(cpf);
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.clientData.values();
    }

    @Override
    public Boolean existysOnData(Long id) {
        return clientData.containsKey(id);
    }

}
