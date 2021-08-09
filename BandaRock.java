
public class BandaRock extends Banda {
	private String subGenero;
	private int anosAtividade;
	
	public BandaRock(String nome, String genero, int numIntegrantes, String subGenero) {
		super(nome, genero, numIntegrantes);
		this.subGenero = subGenero;
	}
	public BandaRock(String nome, String genero, int numIntegrantes, String subGenero, int anosAtividade) {
		super(nome, genero, numIntegrantes);
		this.anosAtividade = anosAtividade;
	}
	public void exibir() {
		System.out.println("Sub Genero : "+subGenero);
		System.out.println("Anos de atividade : "+anosAtividade);
	}
	public String getSubGenero() {
		return subGenero;
	}
	public void setSubGenero(String subGenero) {
		this.subGenero = subGenero;
	}
	public int getAnosAtividade() {
		return anosAtividade;
	}
	public void setAnosAtividade(int anosAtividade) {
		this.anosAtividade = anosAtividade;
	}
	

}
