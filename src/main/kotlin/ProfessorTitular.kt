class ProfessorTitular(nome: String, sobrenome: String, idProfessor: Int, val especialidade: String) :
    Professor(
        nome,
        sobrenome,
        idProfessor
    ) {

    val mapaDeProfessores = mutableMapOf<Int, List<Professor>>()
    private var contador = 0

    override fun adicionarListaNoMapaDeProfessores(lista: List<Professor>) {
        mapaDeProfessores[contador] = lista
        contador++
    }

    override fun mostrarListaDeProfessores() {
        for (i in 0..mapaDeProfessores.keys.size) {
            var temporario = mapaDeProfessores[i]
            temporario?.forEach {
                print(
                    "Código do Professor: ${it.idProfessor} | " +
                            "Nome do Professor: ${it.nome} ${it.sobrenome}\n"
                )
            }
        }
    }
}