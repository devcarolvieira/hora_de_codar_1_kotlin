//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Triângulo - A = base*altura / 2

    println("Qual o valor da base? ")
    var base = readln().toInt()
    println("Qual o valor de altura? ")
    var altura = readln().toInt()

    var resultado = (base*altura)/2.toDouble()

    println("O valor da área do Triângulo é $resultado.")
}