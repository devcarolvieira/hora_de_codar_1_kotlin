//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Círculo - A = 𝝅 * r²

    val 𝝅 = 3.14

    println("Qual o valor do raio? ")
    var raio = readln().toInt()

    var resultado = 𝝅 * (raio * raio)

    println("O valor da área do Círculo é $resultado.")
}