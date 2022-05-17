package laboratorio.mistura;

public class Mistura {
	private String nome; 
	private String tempo;
	
	public static void exibirMistura(String nome, String tempo ) {
		System.out.println("Mistura: " + nome );
		System.out.println("Tempo: " + tempo);
		
	}
	public static void main(String[] args) {
		Mistura butano = new Mistura();
		butano.setNome("Butano");
		butano.setTempo("03/02/2022");
		exibirMistura(butano.getNome() , butano.getTempo() );	
	}
	public  String getNome() {
		return nome;
	}
	public  void setNome(String nome) {
		this.nome = nome;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}	

}
