package questao01;

public class Personagem {

	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;

	public Personagem(String nome) {
		this.nome = nome;
		this.mana = 10;
		this.xp = 0;
		this.level = 1;
	}

	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void lvlUp(int quantidadeLvlAumentou) {
		setLevel(getLevel() + quantidadeLvlAumentou);
	}

	public void lvlUp() {
		setLevel(getLevel() + 1);
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nVida: " + getVida() + "\nMana: " + getMana() + "\nXp: " + getXp()
				+ "\nInteligencia: " + getInteligencia() + "\nForca: " + getForca() + "\nLevel: " + getLevel() + "\n";
	}
}
