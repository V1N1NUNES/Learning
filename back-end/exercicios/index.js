//  Exercícios

console.log('Meu nome é "Vincíus". Estou aprendendo Js às' , 20 , 'da noite\n\n');


const Nome = "Vinícius"
const sobreNome = 'Costa Nunes'
var idade = 18;
let peso = 84;
const altura = 1.80;

function calculoIMC(peso, altura){
    var IMC = peso/(altura * altura);
    return IMC;
}

function mostrarExercicio(){
    const calculo = calculoIMC(peso, altura);
    
    return console.log(`${Nome} ${sobreNome} tem ${idade} de idade, pesa: ${peso}kg, tem ${altura}M de altura e seu IMC é de: ${calculo}.`);
}

mostrarExercicio();

