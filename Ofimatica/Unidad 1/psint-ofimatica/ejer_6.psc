Algoritmo ejer_6
	Definir tablaNum, tablaHasta, contador, multiplicacion Como Entero
	contador <- 1
	Escribir 'ingresar el numero que desea conocer la multiplicacion: '
	Leer tablaNum
	Escribir 'Ingresar el numero hasta donde desea conocer la tabla: '
	Leer tablaHasta
	Mientras contador<=tablaHasta Hacer
		multiplicacion <- tablaNum*contador
		Escribir tablaNum, ' X ', contador, ' = ', multiplicacion
		contador <- contador+1
	FinMientras
FinAlgoritmo
