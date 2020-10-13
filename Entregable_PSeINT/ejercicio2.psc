//Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
//Ejemplo:
//Por favor, introduzca un número entero positivo: 123456
//El número resultante es 654321
//NOTA: No se pueden utilizar funciones de texto de PseInt.


Algoritmo sin_titulo
	Definir entero_positivo Como Entero
	Definir  l como entero
	Definir p como entero
	Definir l como entero
	
	Escribir "Por favor, introduzca un numero entero positivo: "
	Leer entero_positivo
	
	lo = 0
	Escribir "El numero al reves"
	Mientras  entero_positivo <> 0 hacer
		l - entero_positivo % 10
		Escribir sin saltar p
		entero_positivo - trunc (entero_positivo/ 10)
		
	FinMientras
	
	
FinAlgoritmo
