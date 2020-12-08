package pratica.06;

import java.util.Date;

public class TestaEmprestimo {
    public static void main(String[] args) {

        Editora editora = new Editora("Edit", "Rua C-253");
        Pessoa autor = new Pessoa("Pietro", 2001);
        Livro l = new Livro("Fantasia",editora,autor,2004);

        Pessoa func = new Pessoa("Thales", 2000);
        Pessoa usr = new Pessoa("Brenda",2002);
        Emprestimo emp = new Emprestimo(l,func,usr, new Date());

        System.out.println(emp);
    }
}