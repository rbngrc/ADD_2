Programa para hacer Login y registrarse versión 21/12/20
========================================================

NOTAS GENERALES
---------------

Se trata de un programa basado en línea de comandos que, leyendo documentos de texto, realiza varias operaciones.

El programa cubre los siguientes puntos:
- Diseñar las clases Alumno y Profesor. Para diseñarlas se tendrá en cuenta que tanto Alumno como Profesor son Personas.

- Los datos que se utilizarán en la aplicación se recuperarán, al comenzar la aplicación, de un archivo serializado de objetos en el que estarán almacenados tanto los alumnos como los profesores. 
Este fichero se llamará personas.dat y la primera vez que se ejecuta tu aplicación no existe .

- Dar de alta (método anadirPersona) alumnos y profesores. 

- Obtener un listado (método listarPersonas) de las personas de la academia con el formato.
(ALUMNO o PROFESOR nombre, día del mes, número de matrícula o asignatura, grupo)

- Hacer un listado, por pantalla, de las personas que deben ser felicitadas en una fecha dada (método felicitarPersonas) con un mensaje similar al siguiente.
(FELICIDADES alumno o profesor: nombre)

- Grabar los datos en el fichero personas.dat para que al ejecutar la próxima vez la aplicación se puedan cargar.

- Diseñar un menú para poder elegir las opciones para ejecutar la aplicación.

NOTAS ESPECIFICAS
-----------------

Los documentos en los que se apoya el programa para su funcionamiento, se encuentran situados en una carpeta llamada ficheros, 
alojada en la raíz del proyecto. A tener en consideración que en el primer inicio esta carpeta no contiene ningún archivo.

El usuario del programa accede a un menú donde tiene la posibilidad de elegir varias operaciones.

Tiene la posibilidad de dar de alta nuevas personas. Estas quedan almacenadas en memoria hasta que el usuario decide guardarlas de forma definitiva en un ficheros.

Este fichero se utiliza para poder acceder a los usuarios grabados en él en futuros usos del programa.

OTRAS CONSIDERACIONES
---------------------

El programa no es graba al salir, se incluirá en futuras versiones.