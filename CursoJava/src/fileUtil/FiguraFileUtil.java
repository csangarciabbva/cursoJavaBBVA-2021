package fileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.Poligono;
import repaso.Rectangulo;
import repaso.Triangulo;

public class FiguraFileUtil{
	private ArrayList<Figura> figuras;
	private String nombreArchivo;
	private String Path;
	
	//constructores

	public FiguraFileUtil(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		super();
		this.figuras = figuras;
		this.nombreArchivo = nombreArchivo;
		this.Path = path;
	}
	
	//Métodos de negocio
	
	public static void generarArchivo(ArrayList figuras, String nombreArchivo, String Path) {
		
	}
	
	public void generarArchivo() {
		
	}
	
	public static ArrayList<Figura> leerArchivo(String nombreArchivo, String Path){
		ArrayList<Figura> array = new ArrayList<Figura>();
		File f;
		FileReader fr = null;
		BufferedReader br;
		try {
			f = new File(nombreArchivo + Path);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String linea = "";
			while((linea = br.readLine())!= null) {
				String[] datos = linea.split(",");
				String[] parametros = datos[2].split(":");
				String tipo = datos[0].split(":")[1];
				if(tipo.equals("1")) {
					String nombre = datos[1].split(":")[1];
					float lado = Float.parseFloat(datos[2].split(":")[1].substring(1, datos[2].split(":")[1].indexOf('}')-1).split("=")[1]);
					Cuadrado cu1 = new Cuadrado(nombre, lado);
					array.add(cu1);
				}else if(tipo.equals("2")){
					String nombre = datos[1].split(":")[1];
					float radio = Float.parseFloat(datos[2].split(":")[1].substring(1, datos[2].split(":")[1].indexOf('}')-1).split("=")[1]);
					Circulo ci1 = new Circulo(nombre, radio);
					array.add(ci1);
				}else if(tipo.equals("3")){
					String nombre = datos[1].split(":")[1];
					float base = Float.parseFloat(datos[2].split(":")[1].split("-")[0].substring(1, datos[2].split(":")[1].split("-")[0].length()).split("=")[1]);
					float altura = Float.parseFloat(datos[2].split(":")[1].split("-")[1].substring(0, datos[2].split(":")[1].split("-")[1].indexOf('}')-1).split("=")[1]);
					Triangulo tr1 = new Triangulo(nombre, base, altura);
					array.add(tr1);
				}else if(tipo.equals("4")){
					String nombre = datos[1].split(":")[1];
					float base = Float.parseFloat(datos[2].split(":")[1].split("-")[0].substring(1, datos[2].split(":")[1].split("-")[0].length()).split("=")[1]);
					float altura = Float.parseFloat(datos[2].split(":")[1].split("-")[1].substring(0, datos[2].split(":")[1].split("-")[1].indexOf('}')-1).split("=")[1]);
					Rectangulo re1 = new Rectangulo(nombre, base, altura);
					array.add(re1);
				}else if(tipo.equals("5")){
					String nombre = datos[1].split(":")[1];
					float lado = Float.parseFloat(datos[2].split(":")[1].split("-")[0].substring(1, datos[2].split(":")[1].split("-")[0].length()).split("=")[1]);
					int nlados = Integer.parseInt(datos[2].split(":")[1].split("-")[1].split("=")[1]);
					float apotema = Float.parseFloat(datos[2].split(":")[1].split("-")[2].substring(0, datos[2].split(":")[1].split("-")[2].indexOf('}')-1).split("=")[1]);
					Poligono po1 = new Poligono(nombre, lado, nlados, apotema);
					array.add(po1);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != fr) {
					fr.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return array;
	}
	
	public ArrayList<Figura> leerArchivo(){
		return null;
	}
	
	//Getters and setters

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String path) {
		Path = path;
	}
	
	public static void main(String[] args) {
		ArrayList<Figura> a = leerArchivo("C:/Users/admin/eclipse-workspace/bbvaRepo/cursojavabbva-2021/CursoJava/src/archivos/","figuras.json");
	}
}
