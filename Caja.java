package Model;
public class Caja{
//atributos
private String numero;
private double ancho;
private double largo;
private double alto;
//constructor
public Caja(String n, double a, double l, double al){
	numero=n;
	ancho=a;
	largo=l;
	alto=al;
}
//metodos
public String getNumero(){
	return numero;
}
public void setNumero(String newNumero){
	numero = newNumero;
}
public double getAncho(){
	return ancho;
}
public void setAncho(double newAncho){
	ancho = newAncho;
}
public double getLargo(){
	return largo;
}
public void setLargo(double newLargo){
	largo = newLargo;
}
public double getAlto(){
	return alto;
}
public void setAlto(double newAlto){
	alto = newAlto;
}
public double calcularVolumen(){
	return ancho*largo*alto;
}
public String Volumen(){
	String text="";
	text="El volumen del contenedor es "+calcularVolumen()+"\n";
	return text;
}
}