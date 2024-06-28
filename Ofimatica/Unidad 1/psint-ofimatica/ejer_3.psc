Algoritmo ejer_3
	Definir cantBancosAulas, cantAlumInscriptos, bancosFaltantes Como Entero
	Escribir 'Ingresar cantidad de bancos en el aula: '
	Leer cantBancosAulas
	Escribir 'Ingresar cantidad de alumnos inscriptos: '
	Leer cantAlumInscriptos
	Si cantBancosAulas>=cantAlumInscriptos Entonces
		Escribir 'Los bancos del aula son suficiente'
	SiNo
		bancosFaltantes <- cantAlumInscriptos-cantBancosAulas
		Escribir 'las cantidad de bancos faltantes es: ', bancosFaltantes
	FinSi
FinAlgoritmo
