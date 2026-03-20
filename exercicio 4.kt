//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Retângulo - A = base.altura

    println("Qual o valor da base? ")
    var base = readln().toInt()
    println("Qual o valor da altura? ")
    var altura = readln().toInt()

    var resultado = altura* base

    println("A área do Retângulo é $resultado.")
}