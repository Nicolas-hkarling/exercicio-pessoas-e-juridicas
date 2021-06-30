package Model;

public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String CNPJ;
    private String inscricaoEstadual;
    private double capitalInicial;



    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nrazaoSocial = " + razaoSocial +
                "\nCNPJ = " + CNPJ +
                "\ninscricaoEstadual = " + inscricaoEstadual +
                "\ncapitalInicial = " + capitalInicial;
    }
}


