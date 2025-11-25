original = [1,2,3,4,5]

copia1 = original.copy()
print(f"Copia 1 : {copia1}")

copia2 = original[:]
print(f"Copia2 : {copia2}")

def copia (original):
    copia3 = []
    
    for elemento in original:
        copia3.append(elemento)
    original [0] = 2
    return copia3
print