package repaso;

public class Circulo extends Figura{
	
	private float radio;
	
	//Constructores

	public Circulo() {
		super();
	}

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}
	
	public Circulo(String pNombre, float radio) {
		super(pNombre);
		this.radio = radio;
	}
	
	//Getters/setters

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	//Metodos de negocio

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (float) (radio*2*Math.PI);
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*radio*radio);
	}

	@Override
	public String getValores() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("radio=");
		return sb.toString();
	}

}
