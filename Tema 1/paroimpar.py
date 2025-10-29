#Definición de función
def paroimpar (n):
    if n %2 == 0 and n != 0:
        return (n, "es par")
    elif n == 0:
        return ("0 no es par ni impar")
    else:
        return (n, "es impar")

#Programa principal
n = int(input("Escribe el número: "))
print (paroimpar (n))
