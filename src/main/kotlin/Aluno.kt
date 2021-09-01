class Aluno(val nome: String, val sobrenome: String, val idAluno: Int) {

    var mapaDeAlunos = mutableMapOf<Int, List<Aluno>>()
    private var contador = 0

    fun adicionarListaNoMapaDeAlunos(lista: List<Aluno>) {
        mapaDeAlunos[contador] = lista
        contador++
    }

    fun mostrarListaDeAlunos(){
        for(i in 0..mapaDeAlunos.keys.size){
            var temporario = mapaDeAlunos[i]
            temporario?.forEach { print("Código do Aluno: ${it.idAluno} | " +
                    "Nome do Aluno: ${it.nome} ${it.sobrenome}\n") }
        }
    }
}
