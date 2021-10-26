fun main(args: Array<String>) {
    
    /*
    Exercício 1

    1 - Abra o IntelliJ e crie um projeto chamado MediaDoAluno
    2 - Crie um programa onde o usuário digite as notas referente a 4 bimestres e calcule a média. No final, verifique a situação do aluno com base nesses dados:

    - Reprovado se a média for 4 ou menos
    - Regular se a média for maior que 4 e menor ou igual a 5
    - Boa se a média for maior do que 5 e menor ou igual a 8
    - Excelente se a média for maior do que 8 e menor ou igual a 10
    - Se a média der um número negativo ou     uma nota fora da escala de 0 a 10, deverá ser printado média inválida

     */

    var nota1 = 0.0
    var nota2 = 0.0
    var nota3 = 0.0
    var nota4 = 0.0



    print("Digite a sua 1° nota: ")
    nota1 = readLine()!!.toDouble()
    print("Digite a sua 2° nota: ")
    nota2 = readLine()!!.toDouble()
    print("Digite a sua 3° nota: ")
    nota3 = readLine()!!.toDouble()
    print("Digite a sua 4° nota: ")
    nota4 = readLine()!!.toDouble()

    nota1 + nota2 + nota3 + nota4 / 4

    if(nota1 < 4.0){
        println("Reprovado")
    }else if(nota1 >= 4.0 && nota2 <= 5.0) {
        println("Está na média")
    }else if(nota2 >= 5.0 && nota3 <= 8.0) {
        println("Está acima da média")
    }else if(nota3 >= 8.0 && nota4 <= 10.0){
        println("Está excelente!!")
}












}











