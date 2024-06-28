Algoritmo ejer_9
	Definir butacas, butacaActual Como Lógico
	Definir butacasVacias Como Entero
	Dimensionar butacas(4)
	butacas[1] <- Falso
	butacas[2] <- Verdadero
	butacas[3] <- Verdadero
	butacas[4] <- Falso
	butacasVacias <- 0
	Para x<-1 Hasta 4 Con Paso 1 Hacer
		butacaActual <- butacas[x]
		Si butacaActual=Falso Entonces
			butacasVacias <- butacasVacias+1
		FinSi
	FinPara
	Escribir 'La cantidad de butacas vacias es de: ', butacasVacias
FinAlgoritmo
