num = int(input("Introduzca el número: "))
i = 1
while True:
    if num < i:
        break
    elif i == num:
        print(i)
    else:
        print (i,end = ',')
    i += 1

    
