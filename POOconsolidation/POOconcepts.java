public class JavaConcepts(){

    //Classes: moldes para criar objetos de tipos definidos
    //Para ajudar na estruturação do projeto, uma boa prática é utilizar modeladores de sistema como UML para poder estruturar o sistema antes de codificar.
    //Uma boa prática para código limpo é criar objetos para executar uma tarefa rápida sem a variável de referência. Assim, o objeto é criado, executa o código e logo em seguida é descartado.
    //Blocos de inicialização servem para poder inicializar partes de código na criação ou até antes da criação de um objeto
    //ordem de inicialização e criação de um objeto: 1- Blocos de incialização static são executados no carregamento da classe (são executados apenas 1 vez), 2- alocação de memória para o objeto que será criado, 3- cada atributo de classe é criado e inicializado com valores default, 4- Blocos de inicialização são executados, 5- Os construtores são executados


    //Modificadores de acesso:
    // - public: torna a variável, classe ou método visivel a qualquer lugar do projeto
    // - private: torna a variável, classe ou método visivel somente dentro da classe em que foi criado
    // - protected: torna a variável, classe ou método visivel somente dentro do pacote em que esta a classe
    // - static: torna a variável ou método pertencente a classe em que foi criada, e não ao objeto instânciado da classe
    // - final: torna a variável, classe ou método imutável á alterações, modificações ou sobrescritas.
    // - abstract: torna torna a classe ou método como um rascunho, impossibilitando de ser instanciada (classes) ou sendo escritas em classes filhas (métodos)
    // - synschronized: faz com que o método ou bloco de código seja processado em cada thread por vez, para evitar que dois processos modifiquem algo sumultâneamente
    // - transient: faz com que a variável, seja serializada (transformada em bytes) avisando o Java que não deve ser salva
    // - volatile: faz com que o java avise que a qualquer momento a variável pode ser alterada por algum thread, fazendo com que todos os threads vejam a atualização na hora


    //Metodos: Blocos de código para processamento de dados ou saída com retorono ou não.
    //- Métodos getters and setters podem ser substituidos por records ou com o uso do lombok
    //- Para substituição dos getters, utilizar métodos de vizualização com "this." o código fica mais limpo
    //- Para substituição dos setters, utilizar métodos de modificação que retornam o objeto "atualizado"
    //- utilização de varArgs nas assinaturas dos métodos, ex: public void Test(double variable, "int... numbers"){}
    //- Sobrecarga de métodos e de construtores (serve para atualização e reaproveitamento de métodos de forma enxuta e oragnizada sem prejudicar o desenvolvimento de código de outros devs)
    //- Variáveis do tipo primitívo passam somente uma cópia do seu valor, variáveis references passam a o endereço de memória
    //- "this." e "super." funcionam como ponteiros para garantir que o Java aponte para as variáveis certas dentro das classes e métodos

    //Escapsulamento: Modificadores de acesso que determinam a vizibilidade da classe,método ou atributo em relação ao resto do projeto = private, public, default, protected




}