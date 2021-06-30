import Model.PessoaFisica;
import Model.PessoaJuridica;

public class Main {
    public static void main(String[]args){
        PessoaJuridica client1 = new PessoaJuridica();
        PessoaFisica client2 = new PessoaFisica();

        client1.setCodigoDoCliente("C123");
        client1.setName("Agostinho Carrara");
        client1.setProfession("taxi driver");
        client1.setRazaoSocial("Carrara taxi Carrara");
        client1.setCNPJ("79.639.072./001-33");
        client1.setInscricaoEstadual("519/8223812");
        client1.setCapitalInicial(1750000);
        client2.setCodigoDoCliente("A321");
        client2.setName("Nolan Grayson");
        client2.setProfession("writer");
        client2.setEstadoCivil("casado");
        client2.setCPF("258.654.123-53");
        client2.setDataDeNascimento("11/06/1965");
        System.out.println(client1);
        System.out.println(client2);

        PessoaFisica client3 = new PessoaFisica(
                "D234",
                "joao",
                "picolezeiro",
                "viuvo",
                "353355",
                "14/08/1974");
        System.out.println(client3);
    }
}
