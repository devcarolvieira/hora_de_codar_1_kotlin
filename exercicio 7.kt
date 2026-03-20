//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Trapézio - A = (base maior + base menor) . h / 2

    println("Qual o valor da base maior? ")
    var baseMaior = readln().toInt()
    println("Qual o valor da base menor? ")
    var baseMenor = readln().toInt()
    println("Qual o valor da altura? ")
    var altura = readln().toInt()

    var resultado = (baseMaior+baseMenor)*altura/2

    println("O valor da área do Trapézio é $resultado.")
}