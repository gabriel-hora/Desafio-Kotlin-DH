class DigitalHouseManager {
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculados: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {

        val curso = Curso(
            nome = nome,
            idCurso = codigoCurso,
            professorTitular = null,
            professorAdjunto = null,
            quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos
        )
        listaDeCursos.add(curso)
    }


    fun excluirCurso(idCurso: Int){
        listaDeCursos.removeAt(idCurso)
    }
}