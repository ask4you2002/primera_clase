public class MiPlanta{

	String tipoDePlanta;
	int numeroDeHojas;
	boolean estaHidratada;

	public MiPlanta(int numeroDeHojas, boolean hidratacion){
		numeroDeHojas = 0;
		hidratacion = false;
		tipoDePlanta = "Geranio";
	}

	public String getTipoDePlanta(){
		return tipoDePlanta;
	}

	public int getNumeroDeHojas(){
		return numeroDeHojas;
	}

	public boolean getHidratacion(){
		return estaHidratada;
	}

	public void setTipoDePLanta(String tipoDePlanta){
		tipoDePlanta = tipoDePlanta;
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
		System.out.println("La planta es "+ tipoDePlanta + ",con " + numeroDeHojas + " hojas, hidratada: " + estaHidratada );
	}

	public String mensaje(){
		String mensaje = "La planta es "+ tipoDePlanta + " ,con " +numeroDeHojas+ " hojas, hidratada: " + estaHidratada ;
		return mensaje;
	}
} 
