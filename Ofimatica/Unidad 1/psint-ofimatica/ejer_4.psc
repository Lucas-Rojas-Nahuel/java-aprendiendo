Algoritmo ejer_4
	Definir montoTotal, montoConDesc Como Real
	Definir formaDePago Como Cadena
	Escribir 'Ingresar monto total de la compra'
	Leer montoTotal
	Escribir 'Ingresar forma de pago'
	Leer formaDePago
	Si formaDePago='contado' Entonces
		montoConDesc <- montoTotal*0.9
		Escribir 'el monto total con descuento es de: ', montoConDesc
	SiNo
		Escribir 'la forma de pago ingresado no tiene descuento'
	FinSi
FinAlgoritmo
