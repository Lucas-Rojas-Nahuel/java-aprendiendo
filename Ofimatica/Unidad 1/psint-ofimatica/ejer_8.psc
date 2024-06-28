Algoritmo ejer_8
	Definir acumulador, promedio, numer Como Real
	Para x<-1 Hasta 4 Con Paso 1 Hacer
		Escribir 'Ingresar numero: ', x
		Leer numer
		acumulador <- acumulador+numer
	FinPara
	promedio <- acumulador/4
	Escribir 'El promedio de los numeros ingresados es: ', promedio
FinAlgoritmo
