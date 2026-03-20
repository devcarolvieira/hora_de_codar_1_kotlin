//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Losango - A = diagonal maior.diagonal menor / 2

    println("Qual o valor da diagonal maior? ")
    var diagonalMaior = readln().toInt()
    println("Qual o valor da diagonal menor? ")
    var diagonalMenor = readln().toInt()

    var resultado = (diagonalMaior*diagonalMenor)/2

    println("O valor da área do Losango é $resultado.")
}