package main;

public class Main {

    public static void main(String[] args) {
        
        //Se quiser instanciar um novo livro para a mesma pessoa é possivel
        //Sendo que pessoa pode ter varios livros, mas varios livros não podem ter varias pessoas
        //Desconsidere os nomes dos livros foi a primeira coisa que me veio na cabeça
        Pessoas Gabriel = new Pessoas("Gabriel");
        Livros l1 = new Livros(Gabriel, "Harry potter", 137);
        
        //Um exemplo para instanciamento de um novo livro, para a mesma pessoa modifique a variavel livros e dará tudo certo
        Livros l2 = new Livros(Gabriel, "Outro Livro", 0);
        
        // Para usar os metodos dos livros precisamos fazer algo semelhante a isto
        l1.folear(10);
        l1.voltar(5);
        l1.status();
        
        l2.folear(5);
        l2.voltar(1);
        l2.status();
    }

}
