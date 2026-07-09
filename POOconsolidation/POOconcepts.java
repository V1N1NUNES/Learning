public class JavaConcepts(){

    //=====================================================

    //PRINCIPIOS DE PROJETO:
    //- coesão: Uma classe deve possuir uma única responsabilidade bem definida.
    //- acoplamento: Mede o quanto uma classe depende de outra.
    //- responsabilidade única: Cada classe deve possuir apenas um motivo para mudar.
    //- "tell, don't aks": Um objeto deve executar suas próprias responsabilidades.

    //-----------------------------------------------------

    //CLASSES: É um molde (template) que define os atributos e comportamentos dos objetos que serão criados.
    //classes Abstratas: Serve como base para outras classes.
    // - não pode ser instânciada
    // - pode possuir métodos concretos e abstratos
    // - é utilizada quando faz sentido compartilhar implementação entre diversas classes filhas.
    //classes finais: Não permite herança

    //-----------------------------------------------------

    //CONSTRUTORES: Método de uma classe onde define atributos necessários para instancia de objetos dessa classe.
    //- podem ser sobrecarregados
    //- O construtor da Superclass sempre é executado antes do construtor da subclasse atraves de super().


    //-----------------------------------------------------

    //OBJETOS: Instâncias das classes criadas. Represetam entidades do mundo real no software
    //- todo objeto possui: Estado(atributos); comportamento(métodos); identidade(referência de memória)
    //- Uma boa prática para código limpo é criar objetos para executar uma tarefa rápida sem a variável de referência. Assim, o objeto é criado, executa o código e logo em seguida é descartado.

    //-----------------------------------------------------

    //MÉTODOS: Blocos de código para representar comportamentos da classe de acordo com sua coesão.
    //- métodos devem possuir apenas uma responsabilidade. Prefira nomes que definam essa responsabilidade
    //- Métodos getters and setters podem ser substituidos por records ou com o uso do lombok
    //- Para substituição dos getters, utilizar métodos de vizualização com "this." o código fica mais limpo
    //- Para substituição dos setters, utilizar métodos de modificação que retornam o objeto "atualizado"
    //- utilização de varArgs nas assinaturas dos métodos, ex: public void Test(double variable, "int... numbers"){}
    //- Sobrecarga de métodos e de construtores (serve para atualização e reaproveitamento de métodos de forma enxuta e oragnizada sem prejudicar o desenvolvimento de código de outros devs)
    //- Variáveis do tipo primitívo passam somente uma cópia do seu valor, variáveis references passam a o endereço de memória
    //- "this." e "super." funcionam como ponteiros para garantir que o Java aponte para as variáveis certas dentro das classes e métodos

    //-----------------------------------------------------

    //BLOCOS DE INICIALIZAÇÃO:
    //- blocos de inicialização servem para poder inicializar partes de código na criação ou até antes da criação de um objeto
    //- ordem de inicialização e criação de um objeto: 1- Blocos de incialização static são executados no carregamento da classe (são executados apenas 1 vez), 2- alocação de memória para o objeto que será criado, 3- cada atributo de classe é criado e inicializado com valores default, 4- Blocos de inicialização são executados, 5- Os construtores são executados

    //-----------------------------------------------------

    //MODIFICADORES DE ACESSO:
    // - public: torna a variável, classe ou método visivel a qualquer lugar do projeto
    // - private: torna a variável, classe ou método visivel somente dentro da classe em que foi criado
    // - protected: torna a variável, classe ou método visivel somente dentro do pacote em que esta a classe
    // - static: torna a variável ou método pertencente a classe em que foi criada, e não ao objeto instânciado da classe
    // - final: torna a variável, classe ou método imutável á alterações, modificações ou sobrescritas.
    // - abstract: torna torna a classe ou método como um rascunho, impossibilitando de ser instanciada (classes) ou sendo escritas em classes filhas (métodos)
    // - synschronized: faz com que o método ou bloco de código seja processado em cada thread por vez, para evitar que dois processos modifiquem algo sumultâneamente
    // - transient: faz com que a variável, seja serializada (transformada em bytes) avisando o Java que não deve ser salva
    // - volatile: faz com que o java avise que a qualquer momento a variável pode ser alterada por algum thread, fazendo com que todos os threads vejam a atualização na hora

    //-----------------------------------------------------

    //ENCAPSULAMENTO: Modificadores de acesso que determinam a vizibilidade da classe,método ou atributo em relação ao resto do projeto = private, public, default, protected

    //-----------------------------------------------------

    //HERANÇA:

    //-----------------------------------------------------

    //POLIMORFISMO:

    //-----------------------------------------------------

    //ABSTRAÇÃO:

    //-----------------------------------------------------

    //INTERFACES:

    //=====================================================
}