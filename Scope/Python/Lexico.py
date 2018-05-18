import re

class Lexico:

    simbolos = ["ID", "Integer"]
    modificadores = {"public", "private", "protect"}

    def verifica(self, str):
        if(re.match("[A-Za-z]+[A-Za-z0-9]*",str)):
            return self.simbolos[0]
        elif(re.match("0|[1-9][0-9]*",str)):
            return self.simbolos[1]


l = Lexico()
print(l.verifica("9"))
print(l.modificadores.__contains__("public"))