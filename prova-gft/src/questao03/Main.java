package questao03;

public class Main {

	public static void main(String[] args) {

		Livro livro1 = new Livro("A Bela e a Fera", 500, 47);
		Livro livro2 = new Livro("Modern Family", 398, 0);

		Leitor leitor = new Leitor("Marcela", livro2);

		leitor.adicionarLivro(livro1);
		System.out.println(leitor.getEstanteLivros().toString());
		leitor.getLivroFavorito().adicionarPaginasLidas(376);
		System.out.println(leitor.getLivroFavorito().verificarProgresso());
		leitor.removerLivro(livro1);
		System.out.println(leitor);
	}
}
