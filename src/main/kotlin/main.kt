fun main() {

    //Instâncias de Alunos
    val alunoGabriel = Aluno("Gabriel", "Hora", 1)
    val alunoPedro = Aluno("Pedro", "Almeida", 2)
    val alunoRodrigo = Aluno("Rodrigo", "Gonçalves", 3)
    val alunoMaria = Aluno("Maria", "Hernandez", 4)
    val alunoJose = Aluno("Jose", "Gaspar", 5)
    val aluno = Aluno("", "", 0)
    val listaDeAlunos = listOf(alunoGabriel, alunoPedro, alunoRodrigo,alunoMaria,alunoJose)

    //Instâncias de Professores
    val professorRonaldo = ProfessorTitular("Ronaldo", "de Lima", 1, "Matemático")
    val professorSamanta = ProfessorAdjunto("Samanta", "Araujo", 2, 24)
    val professorRodrigo = ProfessorTitular("Rodrigo", "Bossini", 3, "Português")
    val professorPatricia = ProfessorTitular("Patricia", "de Oliveira", 4,"Biologia")
    val listaDeProfessores = listOf(professorRonaldo, professorSamanta,professorRodrigo,professorPatricia)

    //Instâncias de Cursos
    val cursoMatematica = Curso("Matemática", 1,professorRonaldo,professorSamanta,40,listaDeAlunos)
    val cursoPortugues = Curso("Português", 2,professorRodrigo,professorSamanta,40,listaDeAlunos)
    val cursoBiologia = Curso("Biologia", 3,professorPatricia,professorSamanta,40, listaDeAlunos)
    val listaDeCurso = listOf(cursoMatematica, cursoBiologia, cursoPortugues)

    val matriculaAluno1 = Matricula()

    aluno.adicionarListaNoMapaDeAlunos(listaDeAlunos)
    aluno.mostrarListaDeAlunos()
    println("")
    professorRonaldo.adicionarListaNoMapaDeProfessores(listaDeProfessores)
    professorRonaldo.mostrarListaDeProfessores()
    println("")
    cursoMatematica.adicionarListaNoMapaDeCursos(listaDeCurso)
    cursoMatematica.mostrarListaDeCursos()
    println("")
    matriculaAluno1.matricular(cursoBiologia, listaDeAlunos)
    matriculaAluno1.MostrarMatriculados(cursoMatematica)
}