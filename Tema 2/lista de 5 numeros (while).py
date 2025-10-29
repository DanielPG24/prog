lista = [1, 2, 3, 4, 5]
longitud = len(lista)
suma=0
i = 0
while i < longitud:
    elemento = lista[i]
    suma += elemento
    i += 1
    print(elemento)
print("La suma es: ",suma)
