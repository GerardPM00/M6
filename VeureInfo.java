
import java.io.*;

public class VeureInfo {
	public static void main(String [] args) {

		File f = new File("D:/");
		if(f.exists()){
			if(f.isDirectory()){
				System.out.println("Fitxers al directori actual: ");
				String[] arxius = f.list();
				for (int i = 0; i<arxius.length; i++){
					System.out.println(arxius[i]);
				} 
			}
			else if(f.isFile()){
				System.out.println("INFORMACIÓ SOBRE EL FITXER");
				System.out.println("Nom del fitxer : "+f.getName());
				System.out.println("Ruta           : "+f.getPath());
				System.out.println("Ruta absoluta  : "+f.getAbsolutePath());
				System.out.println("Es pot escriure: "+f.canWrite());
				System.out.println("Es pot llegir  : "+f.canRead());
				System.out.println("Grandaria      : "+f.length());


			}
		}
		else{
			System.out.println("L'arxiu o directori no existeix");
		}

	}

}

