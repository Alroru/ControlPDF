package com.alejandro.modelo;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

//Clase modelo donde guardaremos los métodos con funcionalidades para nuestro proyecto.
public class Modelo {
	
	//Método que añade páginas en blanco.Recoge un fichero, nos da un log con su nombre y lo modifica usando la libreria PDFBox
	public void anadirPaginaBlanca(File file) {
		System.out.println(file);
		PDDocument document;
		PDPage page = new PDPage();
		try 
		{
			document=PDDocument.load(file);
			document.addPage(page);
			document.save(file);
			document.close();
			System.out.println("Página en blanco añadida. ");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
