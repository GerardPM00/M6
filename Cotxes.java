

	import java.io.Serializable;

	public class Cotxes implements Serializable {
						//Implementa la interfície Serializable
		
		private String marca;
						private String model;
						private String any;
						private String matricula;
		
		//constructor amb paràmetres
		public Cotxes (String marca, String model,String any,String matricula){
			//per no confondre el paràmetre amb el camp de variable
			this.marca = marca;
			//per no confondre el paràmetre amb el camp de variable
			this.model = model;
			this.any = any;
			this.matricula = matricula;
		}
		public Cotxes (){//constructor per defecte
			this.marca = null;
			//per no confondre el paràmetre amb el camp de variable
			this.model = null;
			this.any = null;
			this.matricula = null;
		}
		//per donar el valor als camps de variable private
		public void setMarca(String marca1){marca = marca1;}
		public void setModel(String model1){ model = model1;}
		public void setAny(String any1){ any = any1;}
		public void setMatricula(String matricula1){ matricula = matricula1;}
		//per consultar el valor dels camps de variable private
		public String getMarca(){return marca;}
		public String getModel(){return model;}
		public String getAny(){return any;}
		public String getMatricula(){return matricula;}

	}
	


