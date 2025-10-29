usuario = input ("Escriba el usuario: ")
clave = input ("Escriba su contraseña: ")
longitud = len(clave)
while (len(clave) < 8):
    clave = input ("Escriba su contraseña: ")
print("Bienvenido!")
