import java.util.Date

class Matricula() {

    var mapaDeMatriculados = mutableMapOf<Int, List<Aluno>>()
    var data = Date()
    var contador = 0

    fun matricular(curso: Curso, aluno: List<Aluno>) {
        mapaDeMatriculados[contador] = aluno
        contador++
        println("Matriculado com Sucesso")
    }

    fun MostrarMatriculados(curso: Curso) {
        for (i in 0..mapaDeMatriculados.keys.size) {
            var temp =  mapaDeMatriculados[i]
            println("Curso: ${curso.nome} | Matriculados: ")
            temp?.forEach {
                println(
                    "-----------ID do Aluno: ${it.idAluno} | Nome do Aluno: ${it.nome} ${it.sobrenome} "
                )
            }
        }
    }
}