//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

    println("Qual é o seu nome?")
    var nome = readln()

    println("Qual é a sua idade?")
    var idade = readln()

    println("Olá, $nome, sua idade é $idade.")
}