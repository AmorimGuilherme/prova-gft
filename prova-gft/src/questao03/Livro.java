package questao03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Livro {

	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;

	public Livro(String titulo, int qtdPaginas, int paginasLidas) {
		super();
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
		this.paginasLidas = paginasLidas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}

	public double verificarProgresso() {
		BigDecimal arredondado = new BigDecimal((getPaginasLidas() * 100) / getQtdPaginas()).setScale(3,
				RoundingMode.HALF_EVEN);
		return arredondado.doubleValue();
	}

	public int adicionarPaginasLidas(int paginasLidas) {
		setPaginasLidas(getPaginasLidas() + paginasLidas);
		return paginasLidas;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdPaginas=" + qtdPaginas + ", paginasLidas=" + paginasLidas + "]";
	}

}
