//1° exercício

let n1 = 10, n2 = 4;
const Soma = soma(n1, n2)
const Sub = subtracao(n1, n2)
const Divisao = divisao(n1, n2)
const mult = multiplicacao(n1, n2)
const Elevado = elevado(n1, n2)
const Resto = resto(n1, n2)

function soma(n1, n2){
    return n1 + n2;
}
function subtracao(n1, n2){
    return n1 - n2;
}
function divisao(n1, n2){
    return n1 / n2;
}
function multiplicacao(n1, n2){
    return n1 * n2;
}
function elevado(n1, n2){
    return n1 ** n2;
}
function resto(n1, n2){
    return n1 % n2;
}

console.log(`Soma: ${Soma}\nSubtração: ${Sub}\nDivisão: ${Divisao}\nMultiplicação: ${mult}\nElevado: ${Elevado}\nResto de divisão: ${Resto}`)

//2°  exercício

let num;
num = prompt("Digite um número para verificação:");
num = Number(num)
const validacao = num % 2;

if(validacao == 0){
    console.log(`O número digitado ${num} é par.\nResto da divisão: ${validacao}`)
}else{
    console.log(`O número digitado ${num} não é par.\nResto da divisão: ${validacao}`)
}
