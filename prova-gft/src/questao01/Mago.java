package questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> magias = new ArrayList<>();

	public Mago(String nome) {
		super(nome);
		setVida(750);
		setInteligencia(50);
		setForca(20);
	}

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getMagias() {
		System.out.printf("(%s) Magias aprendidas: %s\n", getNome(), magias);
		return magias;
	}

	@Override
	public void lvlUp(int quantidadeLvlAumentou) {
		setMana(getMana() + (20 * quantidadeLvlAumentou));
		setInteligencia(getInteligencia() + (20 * quantidadeLvlAumentou));
		super.lvlUp(quantidadeLvlAumentou);
	}

	@Override
	public void lvlUp() {
		setMana(getMana() + 20);
		setInteligencia(getInteligencia() + 20);
		super.lvlUp();
	}

	public int attack() {
		int numeroRandomico = new Random().nextInt(181);
		return (getInteligencia() / 2 * (getLevel() * getLevel())) + numeroRandomico;
	}

	public void aprenderMagia(String magia) {
		this.magias.add(magia);
	}
}
