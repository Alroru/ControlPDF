package com.alejandro.principal;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;



//Clase que contiene el m�todo main para ejecutar la aplicaci�n
public class Principal 
{	
	//M�todo que a�ade p�ginas en blanco.Recoge un fichero, nos da un log con su nombre y lo modifica usando la libreria PDFBox
		public static void anadirPaginaBlanca(File file) throws IOException 
		{
			System.out.println(file);
			PDDocument document = new PDDocument();
			PDPage page = new PDPage();
			try 
			{
				document=PDDocument.load(file);
				document.addPage(page);
				document.save(file);
			} 
			catch (IOException e) 
			{
			// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("No se ha podido cargar el archivo pdf");
			}
			finally 
			{
				if(document!=null)
				{
				document.close();
				System.out.println("P�gina en blanco a�adida");
				}
			}	
		}
	//El argumento que recibe el m�todo main es la variable de entorno VIAFIRMA_PATH al que se le ha a�adido una ruta de nuestro PC
	public static void main(String[] args) throws IOException 
	{	
		File directorio=new File(args[0]);
		System.out.println(args[0]);
		System.out.println(directorio.isDirectory());
		//Si la ruta dentro de VIAFIRMA_PATH es un directorio empieza a funcionar
		if(directorio.isDirectory()) 
		{
		File[] listadoArchivos=directorio.listFiles();
		//Comprobamos si hay archivos
		if (listadoArchivos == null || listadoArchivos.length == 0) 
		{
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		}
		else 
		{	//Recorremos toda la lista de archivos
			for (int i=0; i< listadoArchivos.length; i++) 
			{	
				//Si el elemento contiene la extensi�n pdf usa la funci�n de a�adir una p�gina en blanco.
				if(listadoArchivos[i].getName().endsWith(".pdf"))
				{	
					anadirPaginaBlanca(listadoArchivos[i]);
				}
			}
		}
		}
		//Si no hubiera sido un directorio no se hubiera ejecutado.
		else 
		{
			System.out.println("No es un directorio o no lo hemos encontrado.");
		}
	}
}


