package pratica.07;

import java.util.Date;

public class TestaPessoa {
    public static void main (String[] args) {
        Pessoa a = new Pessoa();
        a.setNome("Pietro");
        a.setNomeMae("Tathiana");
        a.setNomePai("Fabricio");
        a.setCpf("123.456.789-10");
        a.setIdt("11111111");
        a.setCorCabelo("Preto");
        a.setLocalNascimento("Goiânia");
    }

        Pessoa b = new Pessoa();
        b.setNome("Brenda");
        b.setCpf("987.654.321-00");
        b.setIdt("22222222");
        b.setCorOlhos("Castanho");
        b.setDataNascimento("2002");
        b.setLocalNascimento("São Luís");
}