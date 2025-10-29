lado1 = int(input("Escriba el primer lado: "))
lado2 = int(input("Escriba el otro lado: "))
lado3 = int(input("Escriba el último lado: "))
suma = lado1 + lado2
if suma > lado3:
    if lado1 == lado2 == lado3:
        print ("Es un triángulo equilátero")
    elif lado1 == lado3 or lado1 == lado2 or lado2 == lado3:
        print ("Es un triángulo isósceles")
    else:
        print ("Es un triángulo escaleno")
else:
    print ("Los lados no forman un triángulo")
