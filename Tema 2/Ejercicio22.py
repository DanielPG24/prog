matriz = [["A","B","C"],["D","E","F"],["G","H","I"]]

fila = 0
columna = 0
while columna < len(matriz[0]):
    while fila < len(matriz):
        print(matriz[fila][columna])
        fila += 1
    columna += 1
