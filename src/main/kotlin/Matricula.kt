import java.util.Calendar

class Matricula() {

    var mapaDeMatriculados = mutableMapOf<Int, List<Aluno>>()
    var data = Calendar.getInstance()
    var contador = 0

    fun matricular(curso: Curso, aluno: List<Aluno>) {
        mapaDeMatriculados[contador] = aluno
        println("Aluno Matriulado com Sucesso em ${data.get(Calendar.DATE)}/${data.get(Calendar.MONTH)}/${data.get(Calendar.YEAR)}")
        contador++
    }

    fun MostrarMatriculados(curso: Curso) {
        for (i in 0..mapaDeMatriculados.keys.size) {
            var temp = mapaDeMatriculados[i]
            println("Curso: ${curso.nome} | Matriculados: ")
            temp?.forEach {
                println(
                    "-----------ID do Aluno: ${it.idAluno} | Nome do Aluno: ${it.nome} ${it.sobrenome} "
                )
            }
        }
    }
}