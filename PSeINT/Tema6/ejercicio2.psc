Algoritmo sin_titulo
	Definir numero1 Como Entero
	Definir numero2 Como Entero
	
	
	Repetir
		Escribir "Introduce pares de numeros"
		Leer numero1
		Leer numero2
		
		Si numero1 <> 0 o numero2 <> 0 Entonces
			Escribir "Su suma es " numero1 + numero2 " Vuelve a introducir pares de numeros"
		FinSi
	Hasta Que numero1 = 0 y numero2 = 0
	Escribir "Has introducido dos cero, error"
FinAlgoritmo
