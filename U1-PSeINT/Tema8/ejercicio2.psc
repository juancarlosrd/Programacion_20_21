//Crea un programa que pida dos n�meros
//enteros al usuario y diga si alguno de ellos es 
//m�ltiplo del otro. Crea una funci�n EsMultiplo 
//que te ayude a que el proceso principal sea legible.

Funcion EsMultiplo(num1, num2)
	Definir resultado Como real
	
	 resultado =  num1 / num2
	
	Si num1 MOD num2 <> 0 entonces
		Escribir "No es mnultiplo de " num1
		Escribir resultado
		Escribir "Por que El resto no es 0 " 
		
	Sino 
		Escribir "Es multiplo de " num1
		Escribir resultado
		Escribir "Porque El resto es 0 " 
	FinSi
	
Fin Funcion

Algoritmo ejercicio2
	Definir divisor como entero
	Definir dividendo como entero
	Leer divisor, dividendo
	EsMultiplo(divisor, dividendo);
	
	
	
	
	
	
	
	
FinAlgoritmo
