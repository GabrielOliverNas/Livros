package main;

public class Livros {

    public int paginas, paginasAtual = 0;
    private String nome;
    private Pessoas leitor;

    public Livros(Pessoas p1, String nome, int numeroDePaginas) {
        this.setLeitor(p1);
        this.setPaginas(numeroDePaginas);
        this.setNome(nome);
    }

    public void status() {
        System.out.println("Leitor " + leitor.getNome());
        System.out.println("Numero de paginas " + this.getPaginas());
        System.out.println("Nome do livro " + this.getNome());
        System.out.println("Estamos na pagina " + paginasAtual);
        System.out.println("-----------------------------");
    }

    public void folear(int numeroDeFolhas) {
        System.out.println("------------ Foleando --------------");
        if (numeroDeFolhas >= getPaginas()) {
            System.out.println("Impossivel folear, quantidade de folhas " + getPaginas());
        } else {
            System.out.println("Foram passadas " + numeroDeFolhas + " para frente no livro "+this.getNome());
            paginasAtual += numeroDeFolhas;
            System.out.println("Estamos na folha " + (paginasAtual)+" do livro "+this.getNome());

        }
    }

    public void voltar(int n) {
        System.out.println("------------ Voltando --------------");
        if (n > paginasAtual) {
            System.out.println("Impossivel voltar, folhas disponiveis " + paginasAtual);
        } else {
            System.out.println("Voltamos " + n + " para trás");
            paginasAtual -= n;
            System.out.println("Estamos na folha " + (paginasAtual)+" do livro "+this.getNome());

        }
        System.out.println("-------------------------------------");

    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
