# README de Pseudcódigos utilizados en la elaboración de los métodos de Busqueda

//Busqueda Binaria
Proceso BusquedaBinaria
	
	puntero <- 1
	final <- 5
	Dimension vec[5]
	vec[1] <- 3
	vec[2] <- 8
	vec[3] <- 11
	vec[4] <- 22
	vec[5] <- 13
	encontro <- Falso
	Escribir "Favor ingresar el número a buscar"
	Leer numero
	
	Mientras (encotro = Falso y puntero <- final) Hacer
		mitad <- trunc( (puntero + final) / 2 )
		
		Si numero = vec[mitad] Entonces
			encontro <- Verdadero
		Sino Si numero < vec[mitad] Entonces
				final <- mitad - 1	
			SiNo
				puntero <- mitad +1
			Fin si
		FinSi
	FinMientras
	
	Si (Encontro = Verdadero) Entonces
		Escribir "El dato se encuentra en la posición " , mitad
	Sino 
		Escribir "El dato no se encurntra"
	FinSi
	
FinProceso	

//Búsqueda Secuecial
Proceso BusquedaSecuencial 
	
	i <- 0
	Dimension vec[5]
	encontro <- Falso
	
	Para i <- i Hasta 5 Hacer
		vec[i] <- Azar(100)
	FinPara
	
	Escribir "Ingrese un número"
	Leer numero
	
	Mientras no encontro y i < 5 Hacer
		
		Si numero = vec[i] Entonces
			encontro <- Verdadero
			pos <- i
		FinSi
		i <- i + 1
	FinMientras
	
	Si encontro Entonces
		Escribir "El dato se encuentra en la posición " , pos
	FinSi
	
FinProceso	
