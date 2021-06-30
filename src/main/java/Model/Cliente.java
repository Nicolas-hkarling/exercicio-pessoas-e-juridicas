package Model;

public abstract class Cliente {
    protected String codigoDoCliente;
    protected  String name;
    protected String profession;

    public Cliente() {
    }

    public Cliente(String codigoDoCliente, String name, String profession) {
        this.codigoDoCliente = codigoDoCliente;
        this.name = name;
        this.profession = profession;
    }


    public String getcodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;

    }

    @Override
    public String toString() {
        return
                "\ncodigo Do Cliente = " + codigoDoCliente +
                "\nname = " + name +
                "\nprofession = " + profession;
    }
}

