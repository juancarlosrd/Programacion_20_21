//Escribe un algoritmo que calcule el precio de un pedido de cierto producto la cantidad de producto que solicita el cliente. 
//Para aclararlo, el precio de cada unidad depende de la cantidad de
//-> Las 100 primera unidades del pedido van a precio fijo. Siempre costarán 5.23€ cada una
//-> Las unidades entre la 101 y la 1000 (ambas incluidas) costarán 4.16€ cada una
//-> A partir de esa cantidad el precio será el 50% del precio original.
//Por ejemplo:
//Introduzca la cantidad de unidades: 90
//El precio del pedido es: 470.70€
//Introduzca la cantidad de unidades: 150
//El precio del pedido es: 731€
Algoritmo sin_titulo
	Definir cantidad Como Entero
	Definir total Como Entero
	
	
	producto <- 5.23

	
	Escribir "Introduzca la cantidad de unidades: "
	Leer cantidad
	
	Si cantidad <= 100 Entonces
		Escribir " El total de los productos es " cantidad * 5.23
	FinSi
	Si cantidad >= 101 y cantidad < 1000 Entonces
		Escribir " El total de los productos es " cantidad * 4.16
	FinSi
	Si cantidad  >= 1000 entonces
		Escribir " El total con el 50% de descuento es" cantidad * 2.16
	FinSi
	
FinAlgoritmo
