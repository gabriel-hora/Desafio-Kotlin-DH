fun main() {

    //Instâncias de Alunos
    val alunoGabriel = Aluno("Gabriel", "Hora", 1)
    val alunoPedro = Aluno("Pedro", "Almeida", 2)
    val alunoRodrigo = Aluno("Rodrigo", "Gonçalves", 3)
    val aluno = Aluno("", "", 0)

    //Instâncias de Cursos
    val cursoMatematica = Curso("Matemática", 1)
    val cursoPortugues = Curso("Português", 2)
    val cursoBiologia = Curso("Biologia", 3)
    val curso = Curso("", 0)

    //Instâncias de Professores
    val professorRomario = Professor("Romário", "Indiano", 1)
    val professorJonatas = Professor("Jonatas", "Araujo", 2)
    val professor = Professor("", "", 0)

    //Listas
    val listaDeAlunos = listOf(alunoGabriel, alunoPedro, alunoRodrigo)
    val listaDeCurso = listOf(cursoMatematica, cursoBiologia, cursoPortugues)
    val listaDeProfessores = listOf(professorJonatas, professorRomario)


    aluno.adicionarListaNoMapaDeAlunos(listaDeAlunos)
    aluno.mostrarListaDeAlunos()
    println("")
    curso.adicionarListaNoMapaDeCursos(listaDeCurso)
    curso.mostrarListaDeCursos()
    println("")
    professor.adicionarListaNoMapaDeProfessores(listaDeProfessores)
    professor.mostrarListaDeProfessores()

}