package EjerObjetos;



public class TaxiApp {
		
		final int x = 2;
		
		private String Provincia = "Bizkaia";
		private String Matricula;
		private String Municipio;
		private int Motor;
		
		
		public TaxiApp(String Provincia , String Matricula, String Municipio, int Motor) {
			super();
			this.Provincia = Provincia;
			this.Matricula = Matricula;
			this.Municipio = Municipio;
			this.Motor = Motor;
			
			}
		
		
		public TaxiApp(String Provincia , String Matricula, String Municipio,int Motor,  int opcMotor) {
			
			this.Provincia = Provincia;
			this.Matricula = Matricula;
			this.Municipio = Municipio;
			switch (opcMotor) {
			case 1:
				this.Motor = 0;
				System.out.println("Desconcido");
			break;
			case 2:
				this.Motor = 1;
				System.out.println("Diesel");
				
			break;
			case 3:
				this.Motor = 2;
				System.out.println("Gasolina");
			break;
		
			}
			
			
		}
		
		public String getProvincia(){
			return Provincia;
		}
		public void setProvincia(String provincia) {
			this.Provincia = "Bizkaia";
		}
		
		public String getMatricula() {
			return Matricula;
		}

		public void setMatricula(String matricula) {
			this.Matricula = matricula;
		}

		public String getMunicipio() {
			return Municipio;
		}

		public void setMunicipio(String municipio) {
			this.Municipio = municipio;
		}

		public int getMotor() {
			return Motor;
		}

		public void setMotor(int motor) {
			this.Motor = motor;
			if (motor == 1) {
				System.out.println("El motor es diesel");
			}else if (motor == 2) {
				System.out.println("El motor es gasolina");
			}else if (motor == 0) {
				System.out.println("El motor es desconocido");
			}

			}
		}




