def searchVocals ():
    cuenta = txt.count("a") + txt.count("A") + txt.count("e") + txt.count("E") + txt.count("i") + txt.count("I") + txt.count("o") + txt.count("O") + txt.count("u") + txt.count("U")
    return cuenta

def searchAndReplaceA ():
    cuenta = txt.count("a") + txt.count("A")
    newtxt = txt.replace("a","x")
    newtxt2 = newtxt.replace("A","X") 
    return newtxt2

def searchAndReplaceVocals ():
    cuenta = txt.count("a") + txt.count("A") + txt.count("e") + txt.count("E") + txt.count("i") + txt.count("I") + txt.count("o") + txt.count("O") + txt.count("u") + txt.count("U")
    newtxt = txt.replace("a","x")
    return newtxt



txt = input("Escribe el texto: ")
print (searchVocals ())
print (searchAndReplaceVocals ())
