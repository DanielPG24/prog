import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""

patron = r'\w+@\w+\.\w+'
patron2 = r'\d{2}.\d{2}.\d{4}'
patron3 = r'\w\w\w\d{6}'
patron4 = r'\w+\.py'


print(re.findall(patron, data))
print(re.findall(patron2, data))
print(re.findall(patron3, data))
print(re.findall(patron4, data))