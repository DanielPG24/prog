#Llegada de Nueva Mercancía
inventario = ["manzana","plátanos","naranjas","peras"]
inventario.append("uvas")
inventario.append("kiwi")
caja_grande = ["melones"]
inventario.extend(caja_grande)
print(inventario)

#Reordenamiento
inventario.insert(1, "platanos frescos")
print(inventario)

#Venta y Descarte
producto_vendido = inventario.pop(-1)
inventario.remove("peras")
print(inventario)

#Reporte de Emergencia
reporte_urgenete = inventario[0:4]

#Recorrido Final
for e in inventario:
    print(e)

print(inventario)