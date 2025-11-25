P = [[5.0,10.5],[8.2,15.0],[1.5,3.0]]
suma = 0
for i in range(len(P)):
    for j in range(len(P[0])):
        if j == 1:
            suma += P[i][j]
print(f"La suma es:{suma}")
        
        
