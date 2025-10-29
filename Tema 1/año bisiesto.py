anno = int(input ("Introduzca el año: "))
if (anno % 4==0 and anno % 100!=0) or (anno % 400==0):
    print ("El año", anno, "es bisiesto")
else: 
    print ("El año", anno, "no es bisiesto")
