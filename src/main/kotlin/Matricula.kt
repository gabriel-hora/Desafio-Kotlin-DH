import java.util.Calendar

class Matricula(aluno: Aluno, curso: Curso) {

    var mapaDeMatriculados = mutableMapOf<Curso, List<Aluno>>()
    var data: Calendar = Calendar.getInstance()


    fun matricular(curso: Curso, aluno: List<Aluno>) {
        mapaDeMatriculados.put(curso, aluno)
        println(
            "Aluno Matriulado com Sucesso em " +
                    "${data.get(Calendar.DATE)}/" +
                    "${data.get(Calendar.MONTH)}/" +
                    "${data.get(Calendar.YEAR)}"
        )
    }

    fun MostrarMatriculados(curso: Curso) {
        if (mapaDeMatriculados.containsKey(curso)) {
            print("Curso: ${curso.nome}: ")
            for (valor in mapaDeMatriculados[curso]!!.toList()) {
                print(" ${valor.nome} |")
            }
        }
    }
}
