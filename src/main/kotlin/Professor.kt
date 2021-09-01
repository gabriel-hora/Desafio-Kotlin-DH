open class Professor(val nome: String, val sobrenome: String, val idProfessor: Int) {

    val mapaDeProfessores = mutableMapOf<Int, List<Professor>>()
    private var contador = 0

    fun adicionarListaNoMapaDeProfessores(lista: List<Professor>) {
        mapaDeProfessores[contador] = lista
        contador++
    }

    fun mostrarListaDeProfessores(){
        for(i in 0..mapaDeProfessores.keys.size){
            var temporario = mapaDeProfessores[i]
            temporario?.forEach { print("Código do Professor: ${it.idProfessor} | " +
                    "Nome do Professor: ${it.nome} ${it.sobrenome}\n") }
        }
    }
}