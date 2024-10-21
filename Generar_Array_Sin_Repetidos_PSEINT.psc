Proceso Generar_Array_Sin_Repetidos
    Definir i, c Como Entero
    Dimension array[5]  // Un array de 5 posiciones
	
    i = 1
    Mientras i < 6 Hacer
        c = 1
        array[i] = Azar(10)  // Generar n�mero aleatorio entre 1 y 10
		
        // Comprobar si el n�mero aleatorio ya est� en el array
        Mientras c < i Hacer
            Si array[i] = array[c] Entonces
                array[i] = Azar(10)  // Si es igual, generar otro n�mero
                c = 1  // Reiniciar contador
            SiNo
                c = c + 1  // Incrementar el contador si no es igual
            FinSi
        FinMientras
		
        i = i + 1  // Incrementar el �ndice del array
    FinMientras
	
    // Imprimir los valores del array
    Para i = 1 Hasta 5 Con Paso 1 Hacer
        Escribir "ARRAY [", i, "] = ", array[i]
    FinPara
FinProceso