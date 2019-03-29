package Model;
public class Comerciante{
//atributos
private String nombre;
//constantes
public final static int numeroDeCajas=3;
//relaciones
private Caja []caja;

//constructor
public Comerciante(String n){
nombre=n;
caja= new Caja[numeroDeCajas];
}
//metodos
public String getNombre(){
return nombre;	
}
public void setNombre(String newNombre){
	nombre = newNombre;
}
public Caja buscarCaja(String numero){
	Caja objCaja = null;
	for(int i=0; i<numeroDeCajas && objCaja==null; i++){
		if(numero.equals(caja[i].getNumero())){
			objCaja = caja[i];
		}
	}
	return objCaja;
}
public String calcularVolumen(String numero){
	Caja objCaja = buscarCaja(numero);
	String text="";
	if(objCaja == null){
		text="El contenedor no existe";
	}
	else{
		text = objCaja.Volumen();
	}
	return text;
}
public double calcularPromedio(){
	double total=0;
	double sumatoria=0;
	for(int i=0; i<numeroDeCajas ; i++){
		sumatoria+=caja[i].calcularVolumen();
		total=sumatoria/numeroDeCajas;
	}
	return total;
}
public String promedio(){
	String text="";
	text=" El promedio de volumen de los contenedores es "+calcularPromedio()+"\n";
	return text;
}
public void addCaja(String numero,double ancho,double largo,double alto){
	boolean agregarCaja=false;
	for(int i=0; i<=numeroDeCajas && agregarCaja==false; i++){
		if(caja[i]==null){
			caja[i] = new Caja(numero, ancho, largo, alto);
			agregarCaja=true;
		}
	}
}
}
