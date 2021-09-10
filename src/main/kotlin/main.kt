fun main() {

    val instancia = DigitalHouseManager()

    instancia.registrarProfessorTitular("Romário","Lima",1,"Developer Android")
    instancia.registrarProfessorTitular("Jonatas","Oliveira",2,"Developer C++")

    instancia.registrarProfessorAdjunto("Jorge","Alencar",3,0)
    instancia.registrarProfessorAdjunto("Roberto","da Silva",4,0)

    instancia.registrarCurso("Full Stack", 20001,3)
    instancia.registrarCurso("Android", 20002,2)

    instancia.matricularAluno("Gabriel","Hora",1)
    instancia.matricularAluno("Pedro","Alencar",2)
    instancia.matricularAluno("Henrique","Pereira",3)
    instancia.matricularAluno("Ricardo","Gomes",4)
    instancia.matricularAluno("Rogerio","Padavini", 5)

    instancia.matricularAluno(1,20001)
    instancia.matricularAluno(2,20001)
    instancia.matricularAluno(3,20001)
    println("")
    instancia.matricularAluno(3,20002)
    instancia.matricularAluno(4,20002)
    instancia.matricularAluno(5,20002)




}