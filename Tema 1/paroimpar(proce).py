#Definición de función
def paroimpar (n):
    if n %2 == 0 and n != 0:
        print (n, "es par")
    elif n == 0:
        print ("0 no es par ni impar")
    else:
        print (n, "es impar")

#Programa principal
n = int(input("Escribe el número: "))
paroimpar (n)
