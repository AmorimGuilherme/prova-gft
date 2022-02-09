package questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> habilidades = new ArrayList<>();

	public Guerreiro(String nome) {
		super(nome);
		setVida(1000);
		setInteligencia(15);
		setForca(50);
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidades() {
		System.out.printf("(%s) Habilidades aprendidas: %s\n", getNome(), habilidades);
		return habilidades;
	}

	@Override
	public void lvlUp(int quantidadeLvlAumentou) {
		setVida(getVida() + (20 * quantidadeLvlAumentou));
		setForca(getForca() + (20 * quantidadeLvlAumentou));
		super.lvlUp(quantidadeLvlAumentou);
	}

	@Override
	public void lvlUp() {
		setVida(getVida() + 20);
		setForca(getForca() + 20);
		super.lvlUp();
	}

	public int attack() {
		int numeroRandomico = new Random().nextInt(181);
		return (getForca() / 2 * (getLevel() * getLevel())) + numeroRandomico;
	}

	public void aprenderHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}
}
