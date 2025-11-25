def Numeros (n, array):
    i=0
    while i < len(n):
        if n[i] == array:
            return i
        i = i + 1
    return -1
    
    
num = int(input("Introduce el numero del que se desee saber su posición: "))
lista = [1,2,3,4,5,6]
print(Numeros (lista, num))
