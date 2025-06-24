package controller;

import model.User; 

public class UserControl {

    public void salvarPessoa(User user) { 
        System.out.println("Pessoa salva com sucesso:");
        System.out.println("Nome: " + user.getNome());
        System.out.println("CPF/CNPJ: " + user.getCpfCnpj());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Fornecedor: " + (user.isFornecedor() ? "Sim" : "Não"));
        System.out.println("Status: " + (user.isAtivo() ? "Ativo" : "Inativo"));
        System.out.println("-----------------------");
    }

    public void excluirPessoa(User user) { 
        System.out.println("Pessoa excluída: " + user.getNome());
        System.out.println("----------------------");
    }

    public void limparCampos(User user) { 
        user.setNome("");
        user.setCpfCnpj("");
        user.setEmail("");
        user.setRg("");
        user.setOrgaoExpedidor("");
        user.setCep("");
        user.setPais("");
        user.setUf("");
        user.setMunicipio("");
        user.setLogradouro("");
        user.setNumero("");
        user.setComplemento("");
        user.setBairro("");
        user.setTelefone("");
        user.setFornecedor(false);
        user.setAtivo(true);
        System.out.println("Campos da pessoa limpos.");
        System.out.println("----------------------");
    }
}   