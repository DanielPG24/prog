note = int(input ("Introduzca una nota: "))
match note:
    case 0 | 1 | 2 | 3 | 4 :
        print ("Insuficiente")
    case 5:
        print ("Suficiente")
    case 6:
        print ("Bien")
    case 7 | 8 :
        print ("Notable")
    case 9 | 10 :
        print("Sobresaliente")

