//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   // Paralelogramo - A = base*altura

    println("Qual o valor da base? ")
    var base = readln().toInt()
    println("Qual o valor da altura? ")
    var altura = readln().toInt()

    var resultado = base*altura

    println("O resultado da área do Paralelogramo é $resultado.")
}