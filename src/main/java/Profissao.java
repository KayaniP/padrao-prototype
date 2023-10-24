package main.java;

public class Profissao implements Cloneable {
    private String cargo;
    private Integer salario;

    public Profissao(String cargo, Integer salario) {
        super();
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Profissão{" +
                "Cargo='" + cargo + '\'' +
                ", Salário Bruto =" + salario +
                '}';
    }
}