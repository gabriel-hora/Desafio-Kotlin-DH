import java.lang.Exception

class DigitalHouseManager {
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculados: MutableList<Matricula> = mutableListOf()
    var contador = 0

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

    fun excluirCurso(idCurso: Int) {
        listaDeCursos.removeAt(idCurso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessorAdjunto: Int, quantiadeDeHoras: Int) {

        val professorAdjunto = ProfessorAdjunto(
            nome = nome,
            sobrenome = sobrenome,
            idProfessor = codigoProfessorAdjunto,
            horasDeMonitoria = quantiadeDeHoras
        )
        listaDeProfessores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, idProfessorTitular: Int, especialidade: String) {

        val professorTitular = ProfessorTitular(
            nome = nome,
            sobrenome = sobrenome,
            idProfessor = idProfessorTitular,
            especialidade = especialidade
        )
        listaDeProfessores.add(professorTitular)
    }

    fun excluirProfessor(idProfessor: Int) {
        listaDeProfessores.removeAt(idProfessor)
    }

    fun matricularAluno(nome: String, sobrenome: String, idDoAluno: Int) {

        val aluno = Aluno(
            nome = nome,
            sobrenome = sobrenome,
            idAluno = idDoAluno
        )
        listaDeAlunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        for (curso in listaDeCursos) {
            if (curso.idCurso == codigoCurso) {
                for (aluno in listaDeAlunos) {
                    if (aluno.idAluno == codigoAluno) {
                        if (curso.adicionarUmAluno(aluno)) {
                                listaDeMatriculados.add(Matricula(aluno, curso))
                                println("Aluno matriculado com sucesso")
                        } else {
                            println("Não tem mais vagas para esse curso")
                        }
                    }
                }
            }
        }
    }
}