import math
operation = input ("Selecciona una operación(+, -, *, /,root, power): ")
n1 = int(input ("Escriba un número: "))
match operation:
    case "power":
        n2 = int(input ("Escriba a lo que lo quieres elevar: "))
        result = pow(n1, n2)
        print("El resultado es ", result)
    case "root":
        result = math.sqrt(n1)
        print ("El resultado es ", result)
    case "+":
        n2 = int(input ("Escriba otro número: "))
        print ("El resultado es ", n1 + n2)
    case "-":
        n2 = int(input ("Escriba otro número: "))
        print ("El resultado es ", n1 - n2)
    case "/":
        n2 = int(input ("Escriba otro número: "))
        print ("El resultado es ", n1 / n2)
    case "*":
        n2 = int(input ("Escriba otro número: "))
        print ("El resultado es ", n1 * n2)
    case _:
        print ("ERROR")
