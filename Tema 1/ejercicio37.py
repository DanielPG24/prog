
a = int(input("Introduzca un número mayor que 0: "))
b = int(input("Introduzca otro número mayor que 0: "))
while b != 0:
    if a > b:
        a = a-b
    else:
        b = b-a
print(a)
