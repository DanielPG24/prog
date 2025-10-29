num = int(input("Introduzca el número: "))
i = 1
while True:
    if num > i:
        print  (i,end = ',')
    elif i == num:
        print(i)
    else:
        break
    i += 1

