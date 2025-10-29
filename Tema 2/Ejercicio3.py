a = [1,2,3,4]
#for i in range(5):
#Error por no estar en el dentro del array, son 4 elementos entonces al 5 se sale del array.
#Corrección
for i in range(len(a)):
    print(a[i])
