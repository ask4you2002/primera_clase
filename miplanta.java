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
		return hidratación;
	}

	public setTipoDePLanta(String tipoDePLanta){
		this.tipoDePLanta = tipoDePLanta;
	}

	public echarAbono(int cantidadDeAbono){
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
		estado = "La planta es,"+ tipoDePLanta + ",con" +numeroDeHojas+ ", hidratada" +hidratacion+;
		return estado;
	}
} 
