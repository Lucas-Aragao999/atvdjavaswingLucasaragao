package model;

public class User {
    private String nome;
    private String cpfCnpj;
    private String email;
    private String rg;
    private String orgaoExpedidor;
    private String cep;
    private String pais;
    private String uf;
    private String municipio;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String telefone;
    private boolean fornecedor;
    private boolean ativo;

    public User() {}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCpfCnpj; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public String getOrgaoExpedidor() { return orgaoExpedidor; }
    public void setOrgaoExpedidor(String orgaoExpedidor) { this.orgaoExpedidor = orgaoExpedidor; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getUf() { return uf; }
    public void setUf(String uf) { this.uf = uf; }

    public String getMunicipio() { return municipio; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public boolean isFornecedor() { return fornecedor; }
    public void setFornecedor(boolean fornecedor) { this.fornecedor = fornecedor; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}