class Curso(val nome: String, val idCurso: Int) : Cadastro(nome="",sobrenome="",id=0) {

    val mapaDeCurso = mutableMapOf<Int, String>()

    override fun adicionarListaNoMapa() {
        TODO("Not yet implemented")
    }
}