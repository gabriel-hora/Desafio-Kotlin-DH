class Curso(
    val nome: String,
    val idCurso: Int,
    val professorTitular: ProfessorTitular?,
    val professorAdjunto: ProfessorAdjunto?,
    val quantidadeMaximaDeAlunos: Int,
    var listaDeAlunosMatriculados: MutableList<Aluno> = mutableListOf()
) {

    var mapaDeCursos = mutableMapOf<Int, List<Curso>>()
    private var contador = 0

    fun adicionarListaNoMapaDeCursos(lista: List<Curso>) {
        mapaDeCursos[contador] = lista
        contador++
    }

    fun mostrarListaDeCursos() {
        for (i in 0..mapaDeCursos.keys.size) {

            var temporario = mapaDeCursos[i]
            temporario?.forEach {
                print(
                    "Código do Curso: ${it.idCurso} | " +
                            "Nome do Curso: ${it.nome} | " +
                            "Professor: ${it.professorTitular!!.nome} ${it.professorTitular.sobrenome}\n"
                )
            }
        }
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if(listaDeAlunosMatriculados.size > quantidadeMaximaDeAlunos){
            println("Não exite mais vagas para esse curso")
            false
        }else{
            listaDeAlunosMatriculados.add(umAluno)
            true
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaDeAlunosMatriculados.remove(umAluno)
    }
}