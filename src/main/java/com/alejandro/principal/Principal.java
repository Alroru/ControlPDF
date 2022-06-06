package com.alejandro.principal;


import java.io.File;

import com.alejandro.modelo.Modelo;

//Clase que contiene el método main para ejecutar la aplicación
public class Principal 
{	//El argumento que recibe el método main es la variable de entorno VIAFIRMA_PATH al que se le ha añadido una ruta de nuestro PC
	public static void main(String[] args) 
	{	//LLamamos al modelo para usar sus métodos
		Modelo modelo=new Modelo();
		File directorio=new File(args[0]);
		System.out.println(args[0]);
		System.out.println(directorio.isDirectory());
		//Si la ruta dentro de VIAFIRMA_PATH es un directorio empieza a funcionar
		if(directorio.isDirectory()) 
		{String[] listado = directorio.list();
		File[] listadoArchivos=directorio.listFiles();
		//Comprobamos si hay archivos
		if (listado == null || listado.length == 0) 
		{
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		}
		else 
		{	//Recorremos toda la lista de archivos para filtrar los archivos con extensión pdf.
			for (int i=0; i< listado.length; i++) 
			{	//Si el elemento contiene la extensión pdf usa el método del modelo de añadir una página en blanco.
				if(listado[i].contains(".pdf"))
				{	
					modelo.anadirPaginaBlanca(listadoArchivos[i]);
				}
			}
		}
		}
		//Si no hubiera sido un directorio no se hubiera ejecutado.
		else 
		{
			System.out.println("No es un directorio");
		}
	}
}


