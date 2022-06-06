# ControlPDF
Aplicación para añadir páginas en blanco a archivos PDF


2) ¿Cómo harías para poder ejecutar N veces el proceso sobre el mismo directorio y solo modificar cada pdf una sola vez?
Para poder ejecutar esta aplicación solo una vez por archivo buscaría la manera de diferenciar estos pdfs de otro aún no modificados.
Una buena práctica sería modificar el nombre del fichero de tal manera que archivo.pdf se transforma en archivo_modificado.pdf al pasar por la aplicación.
Añadimos un bucle más a nuestra aplicación que contenga ese filtro, o que al filtrar comprobar que !archivo.contains(".pdf")||archivo.contains("_modificado").
  
3) ¿Qué pasa si el directorio contiene un fichero que no es un pdf? 
Esta controlado mediante el filtro .contains(".pdf"), así no los tiene en cuenta a la hora de la modificación.

4) ¿Cómo probar / ejecutar la aplicación?
Para probar la aplicación he creado una carpeta en el escritorio con varios tipos de archivos. La ruta de ese directorio la he guardado como variable de entorno en mi PC y llamada como argumento en el programa. Lo he ejecutado desde el propio entorno Eclipse mediante el RUN AS , pero también podria ejecutarse por consola o con un runnable jar file.

5) ¿Cómo podemos ver los logs?
Para distintas comprobaciones he escrito diferentes sysos (System.out.println()) con comprobaciones de variables y feedback. También podemos ver logs de error en Eclipse mediante Windows - ShowView- Error Log.
