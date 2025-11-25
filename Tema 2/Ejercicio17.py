tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]
#informe_ordenado = sorted(tareas_dia, key=str.lower)
#print(informe_ordenado)
#print(tareas_dia)

tareas_dia.sort(key=len(tareas_dia))
print(tareas_dia)


