Algoritmo sin_titulo
	Definir numero1 como real
	Definir numero2 como real
	Definir resultado como real
	
	Repetir
		Escribir "Introduce dos numeros"
		Leer numero1
		Leer numero2
		
		Si numero1 <> 0 y numero2 = 0 Entonces
			Escribir  "Error, el segundo numero no puede ser cero" 
			
		FinSi
	Hasta Que numero1 >= 0 y numero2  <> 0 
	Escribir  "El resultado de la division es " numero1 / numero2
FinAlgoritmo
