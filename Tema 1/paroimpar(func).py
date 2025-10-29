n = int(input("Escribe el número: "))
def paroimpar (n):
    if n %2 == 0:
        return (n, "es par")
    else:
        return (n, "es impar")
print (paroimpar (n))
