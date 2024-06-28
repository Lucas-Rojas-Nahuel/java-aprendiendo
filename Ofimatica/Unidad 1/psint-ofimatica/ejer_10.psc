Algoritmo ejer_10
	Definir listasColoresAulas Como Caracter
	Definir listaCapacAulas, cantAlumIns, indiceAulaAux, capacidadAulaAux  Como Entero
	Definir colorAula Como Caracter
	Escribir "Ingrese la cantidad de alumnos inscriptos: "
	Leer cantAlumIns
	
	Dimension listasColoresAulas[3], listaCapacAulas[3]
	listasColoresAulas[1]="Azul"
	listasColoresAulas[2]="Verde"
	listasColoresAulas[3]="Amarillo"
	
	listaCapacAulas[1]=40
	listaCapacAulas[2]=35
	listaCapacAulas[3]=30
	
	Para x<-1 Hasta 3 Con Paso 1 Hacer
		si listaCapacAulas[x] >= cantAlumIns Entonces
			capacidadAulaAux= listaCapacAulas[x]
			indiceAulaAux= x
		FinSi
	Fin Para
	colorAula= listasColoresAulas[indiceAulaAux]
	Escribir "el aula indicada para la cantidad ingresada de alumnos es el aula ",colorAula, " con una capacidad de: ",capacidadAulaAux
FinAlgoritmo
