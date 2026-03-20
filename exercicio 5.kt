//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Quadrado - A = lado.lado = lado²

    println("Qual o valor do lado 1? ")
    var lado1 = readln().toInt()
    println("Qual o valor do lado 2? ")
    var lado2 = readln().toInt()

    var resultado = lado1 * lado2

    println("O valor da área do Quadrado é $resultado²")
}