Algoritmo sin_titulo
	Repetir
		Escribir "Dime el codigo y la clave de acceso"
		Leer codigo
		Leer clave
		
		Si codigo <> 1 y clave <> 1234 Entonces
			Escribir "Clave incorrecta"
		FinSi
	Hasta Que codigo = 1 y clave = 1234
	Escribir "Has acertado"
FinAlgoritmo
