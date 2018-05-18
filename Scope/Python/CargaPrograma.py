archivo = open("Programa.java", 'r')
print("abriendo",archivo.name,"...")

lineas = archivo.readlines()

archivo.close()

for l in lineas:
    if(l.__eq__("\n")): #Depura archivo de renglones vacios
        lineas.remove(l)
