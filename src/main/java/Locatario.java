package main.java;

public class Locatario implements Cloneable{
    private int cpf;
    private String nome;
    private Profissao profissao;
    private String localNascimento; 

    public Locatario(int cpf, String nome, Profissao profissao, String localNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
        this.localNascimento = localNascimento;
    }

    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }


    public Profissao getProfissao(){
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override 
    public Locatario clone() throws CloneNotSupportedException{
        Locatario locatarioClone = (Locatario) super.clone();
        locatarioClone.profissao = (Profissao) locatarioClone.profissao.clone();
        return locatarioClone;
    }

    @Override
    public String toString() {
        return "Locatario{" +
                "cpf=" + cpf + 
                ", nome='" + nome + '\'' +
                ", profissao =" + profissao +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }

    
}