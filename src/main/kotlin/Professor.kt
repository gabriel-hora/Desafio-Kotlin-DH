abstract class Professor(val nome: String, val sobrenome: String, val idProfessor: Int) {

    abstract fun adicionarListaNoMapaDeProfessores(lista: List<Professor>)
    abstract fun mostrarListaDeProfessores()

}