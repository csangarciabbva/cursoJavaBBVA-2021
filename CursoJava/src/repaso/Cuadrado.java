package repaso;

public class Cuadrado extends Figura{
	private float lado;

	public Cuadrado() {super();}

	public Cuadrado(String pNombre) {super(pNombre);}
	
	public Cuadrado(String pNombre, float pLado) {
		super(pNombre);
		this.lado = pLado;
	}

	//Getters y Setters
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	//Metodos de negocio

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("lado=");
		sb.append(lado);
		return sb.toString();
	}
	
	
	
	
}
