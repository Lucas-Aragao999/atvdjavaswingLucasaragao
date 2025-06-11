package controller;

import model.Pessoa;

public class usercontrol {

    public void salvarPessoa(Pessoa pessoa) {
        System.out.println("Pessoa salva com sucesso:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF/CNPJ: " + pessoa.getCpfCnpj());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Fornecedor: " + (pessoa.isFornecedor() ? "Sim" : "Não"));
        System.out.println("Status: " + (pessoa.isAtivo() ? "Ativo" : "Inativo"));
    }

    public void excluirPessoa(Pessoa pessoa) {
        System.out.println("Pessoa excluída: " + pessoa.getNome());
    }

    public void limparCampos(Pessoa pessoa) {
        pessoa.setNome("");
        pessoa.setCpfCnpj("");
        pessoa.setEmail("");
        pessoa.setRg("");
        pessoa.setOrgaoExpedidor("");
        pessoa.setCep("");
        pessoa.setPais("");
        pessoa.setUf("");
        pessoa.setMunicipio("");
        pessoa.setLogradouro("");
        pessoa.setNumero("");
        pessoa.setComplemento("");
        pessoa.setBairro("");
        pessoa.setTelefone("");
        pessoa.setFornecedor(false);
        pessoa.setAtivo(true);
        System.out.println("Campos da pessoa limpos.");
    }
}