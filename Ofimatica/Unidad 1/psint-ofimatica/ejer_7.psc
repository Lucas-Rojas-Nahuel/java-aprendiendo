Algoritmo ejer_7
	Definir tablaNum, tablaHasta, contador, multiplicacion Como Entero
	contador <- 1
	Escribir 'ingresar el numero que desea conocer la multiplicacion: '
	Leer tablaNum
	Escribir 'Ingresar el numero hasta donde desea conocer la tabla: '
	Leer tablaHasta
	Repetir
		multiplicacion <- tablaNum*contador
		Escribir tablaNum, ' X ', contador, ' = ', multiplicacion
		contador <- contador+1
	Hasta Que contador>tablaHasta
FinAlgoritmo
