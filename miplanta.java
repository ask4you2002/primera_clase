public class miplanta{

	String tipoDePLanta;
	int numeroDeHojas;
	boolean estaHidratada;

	public void Planta(int numeroDeHojas, boolean hidratacion){
		numeroDeHojas = 0;
		hidratacion = false;
		tipoDePLanta = "Geranio";
	}

	public String gettipoDePlanta(){
		return tipoDePLanta;
	}

	public int getnumeroDeHojas(){
		return numeroDeHojas;
	}

	public boolean gethidratacion(){
		return hidratación;
	}

	public settipoDePLanta(String tipoDePLanta){
		this.tipoDePLanta = tipoDePLanta;
	}

	public echarAbono(int cantidadDeAbono){
		cantidadDeAbono;
		numeroDeHojas = numeroDeHojas + cantidadDeAbono;
	}

	public sethidratacion (){
		if(hidratación == true){
			hidratación = false;
		}
		else {
			hidratacion = true;
		}
	}

	public void estado(){
		System.out.println("La planta es,"+ tipoDePLanta + ",con" +numeroDeHojas+ ", hidratada" +hidratacion+)
	}

	public String estado(){
		estado = "La planta esta viva";
		return estado;
	}
} 
