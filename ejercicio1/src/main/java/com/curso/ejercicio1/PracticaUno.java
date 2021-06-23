package com.curso.ejercicio1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PracticaUno {
	
	public static void main(String[] args) {

		try(InputStream in = new URL("https://upload.wikimedia.org/wikipedia/commons/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg").openStream()){

			Files.copy(in, Paths.get("C:/Users/rortizn/Pictures/BAYERN.svg"));
	

			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
