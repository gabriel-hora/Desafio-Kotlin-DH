class Curso(val nome: String, val idCurso: Int) {

    val mapaDeCursos = mutableMapOf<Int, List<Curso>>()
    private var contador = 0

    fun adicionarListaNoMapaDeCursos(lista: List<Curso>) {
        mapaDeCursos[contador] = lista
        contador++
    }

    fun mostrarListaDeCursos(){
        for(i in 0..mapaDeCursos.keys.size){
            var temporario = mapaDeCursos[i]
            temporario?.forEach { print("Código do Curso: ${it.idCurso} | " +
                    "Nome do Curso: ${it.nome} \n") }
        }
    }
}