Algoritmo ejer_2
	Definir user, password, usuario, CONTRASENA Como Cadena
	user <- 'Lucas'
	password <- '12345'
	Escribir 'Ingresar un usuario: '
	Leer usuario
	Escribir 'Ingresar una contrase�a: '
	Leer CONTRASENA
	Si usuario=user Y CONTRASENA=password Entonces
		Escribir 'Usuario logeado con exito'
	SiNo
		Escribir 'Usuario o contrase�a incorrecta'
	FinSi
FinAlgoritmo
