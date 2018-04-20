
public class Prueba1 {
	
	public static void main (String [] tuhmuertoheclipse) {
		System.out.println("Hola mundo"); //Derias haber puesto "helloWorld,again"
	}

}

class Negro {
	private int cmDePolla;
	private String name;
	public static int numeroDeCalvos;
	public boolean tieneHambre=true;
	
	public Negro(){
		numeroDeCalvos++;
	}
	public Negro(String name, int cmDePolla){
		if(name.length!=0||name!=null){
			this.name=new String(name);
			if(cmDePolla>=30){
				this.cmDePolla=cmDePolla;
				numeroDeCalvos++;
			} else System.out.println("No me engañas, este tio no es negro, no tiene la polla grande");
		} else System.out.println("Este negro no tiene nombre, es como los demas,"
					  +" sera ignorado de la base de datos");
	}
	public String getState(){
		return tieneHambre?"tengo hambre":"no tengo hambre"; //ternary operator
	}
	public String getStateForJuan(){
		return tieneHambre?"El negro SI tiene hambre":"El negro NO tiene hambre"; //ternary operator
	}
	public String hacer(){
		return "Lo unico que hace el negro es follarte con su pollon de: "+cmDePolla"cm.";
	}
	public void doSomething(){
		System.out.println("El negro no puede hacer nada, esta muerto de hambre. y final");
	}
	public String getName(){
		return new String(name);
	}
	public void setName(String nombre){
		if(nombre.length>4||nombre!=null){
			name=new String(nombre);
		}else{
			System.out.printl("Nombre in-valido (como er negrooo)");
		}
	}
	public void setCmDePolla(int cent){
		if(cent>=30){
			cmDePolla=cent;
			numeroDeCalvos++;
		} else System.out.println("No me engañas, este tio no es negro, no tiene la polla grande");
	}
	public int getPollas(){
		return cmDePolla;
	}
	@override
	public String toString(){
		return 
			"Hola, soy "+name+", de apellidos Me Cago En, tengo una polla de "+cmDePolla+"cm,"+
			" y soy el calvo nº"+numeroDeCalvos+", y segun mi dueño "+getState+"."
			;
	}
}
