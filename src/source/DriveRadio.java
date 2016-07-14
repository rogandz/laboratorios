

public class DriveRadio implements Radio{
	
	public boolean encendido = false;
	public boolean tipoEmisora = false;
	public double vectorAM[] = new double[11];
	public double vectorFM[] = new double[11];
	public boolean guardarSeleccionar = false;
	public double emisora;
	
	@Override
	public void ON_OFF() {
		// TODO Auto-generated method stub
		encendido = !encendido;
	}

	@Override
	public void AM_FM() {
		// TODO Auto-generated method stub
		if(encendido == true){
			tipoEmisora = !tipoEmisora;
			if(tipoEmisora == true){ //FM
				emisora = 87.9;
			}
			if(tipoEmisora == false){ //AM
				emisora = 530;
			}
		}
		else{}
	}
	
	public boolean getEncendido(){
		return encendido;
	}
	
	public void setEncendido(boolean x){
		encendido = x;
	}

	@Override
	public void Cambio_de_Emisora(boolean a) {
		// TODO Auto-generated method stub
		if(encendido == true){
			if(a == true){
				if((tipoEmisora == false) && (emisora >= 530) && (emisora < 1610)){
					emisora = emisora + 10;
				}
				if((tipoEmisora == false)&&(emisora == 1610)){
					emisora = 530;
				}
				if((tipoEmisora == true) && (emisora >= 87.9) && (emisora < 107.9)){
					emisora = emisora + 0.2;
				}
				if((tipoEmisora == true)&&(emisora == 107.9)){
					emisora = 87.9;
				}
			}
			if(a == false){
				if((tipoEmisora == false) && (emisora > 530) && (emisora <= 1610.01)){
					emisora = emisora - 10;
				}
				if((tipoEmisora == false)&&(emisora == 530)){
					emisora = 1610;
				}
				if((tipoEmisora == true) && (emisora > 87.9) && (emisora <= 107.9)){
					emisora = emisora - 0.2;
				}
				if((tipoEmisora == true)&&(emisora == 87.9)){
					emisora = 107.9;
				}
			}
		}
		else{}
		
	}

	@Override
	public void Guardar_Emisora(int x) {
		// TODO Auto-generated method stub
		if(encendido == true){
			if(tipoEmisora == false){
				vectorAM[x] = emisora; 
			}
			else{
				vectorFM[x] = emisora;
			}
		}
		else{}
	}

	@Override
	public void Seleccionar_Emisora_Guardada(int x) {
		// TODO Auto-generated method stub
		if(encendido == true){
			if(tipoEmisora == false){
				emisora = vectorAM[x]; 
			}
			else{
				emisora = vectorFM[x];
			}
		}
		else{}
	}

	@Override
	public void Guardar_Seleccion() {
		// TODO Auto-generated method stub
		if(encendido == true){
			guardarSeleccionar = !guardarSeleccionar;
		}
		else{}
	}
	public boolean getGuardarSeleccionar(){
		return guardarSeleccionar;
	}
	public void setGuardarSeleccionar(boolean x){
		guardarSeleccionar = x;
	}

	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		return emisora;
	}

}
