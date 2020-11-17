public class miplanta{

	String tipoDePLanta;
	int numeroDeHojas;
	boolean estaHidratada;

	public void Planta(int numeroDeHojas, boolean hidratacion){
		numeroDeHojas = 0;
		hidratacion = false;
		tipoDePLanta = "Geranio";
	}

	public String getTipoDePlanta(){
		return tipoDePLanta;
	}

	public int getNumeroDeHojas(){
		return numeroDeHojas;
	}

	public boolean getHidratacion(){
		return estaHidratada;
	}

	public void setTipoDePLanta(String tipoDePLanta){
		this.tipoDePLanta = "tipoDePlanta";
	}

	public void echarAbono(int cantidadDeAbono){
		numeroDeHojas = numeroDeHojas + cantidadDeAbono;
	}

	public void sethidratacion (){
		if(estaHidratada == true){
			estaHidratada = false;
		}
		else {
			estaHidratada = true;
		}
	}

	public void estado(){
		System.out.println("La planta es "+ tipoDePLanta + ",con" + numeroDeHojas + " con, hidratada: " + estaHidratada );
	}

	public String mensaje(){
		String mensaje = "La planta es "+ tipoDePLanta + " ,con " +numeroDeHojas+ " hojas, hidratada: " + estaHidratada ;
		return mensaje;
	}
} 
