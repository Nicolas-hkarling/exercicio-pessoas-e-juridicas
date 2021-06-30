package Model;

public class  PessoaFisica extends Cliente {
    private String estadoCivil;
    private String CPF;
    private String dataDeNascimento;

    public PessoaFisica() {
    }

    public PessoaFisica(String codigoDoCliente, String name, String profession, String estadoCivil, String CPF, String dataDeNascimento) {
        super(codigoDoCliente, name, profession);
        this.estadoCivil = estadoCivil;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nestadoCivil = " + estadoCivil +
                "\nCPF = " + CPF +
                "\ndataDeNasimento = " + dataDeNascimento;
    }
}

