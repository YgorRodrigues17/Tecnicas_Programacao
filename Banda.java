
public class Banda {
	protected String nome;
	protected String genero;
	protected int numIntegrantes;
	
	public Banda() {}
	
	public Banda(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}
	public Banda(String nome, String genero, int numIntegrantes) {
		this(nome, genero);						
		this.numIntegrantes = numIntegrantes;
	}
	public void visualizar() {
		System.out.println("Nome : "+nome);
		System.out.println("Genero : "+genero);
		System.out.println("Numero de integrantes : "+numIntegrantes);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumIntegrantes() {
		return numIntegrantes;
	}

	public void setNumIntegrantes(int numIntegrantes) {
		this.numIntegrantes = numIntegrantes;
	}
	

}
