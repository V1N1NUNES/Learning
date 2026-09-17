# Mapeamento de objetivos e pré-requisitos dos cursos
### DevDojo – Maratona Java: 
Curso gratuito completo de Java, ensina Java Básico e Orientação a Objetos do zero. É descrito como “um dos cursos mais completos de Java do mundo”. Serve de base para todo o restante (algoritmos, classes, herança, coleções etc.). Prerequisito: lógica básica de programação; idealmente, fazer junto com controle de versão (Git/GitHub).

### Curso em Vídeo (Guanabara) – SQL/MySQL: 
Ensina a modelar e consultar bancos relacionais (SQL) usando MySQL. É fundamental dominar SQL antes de persistir dados em aplicações Java. Não exige Java: pré-requisito é compreender lógica e conceitos de banco (tabelas, chaves, relacionamentos).

### Git e GitHub – do básico ao avançado: 
Ensina controle de versão distribuído (Git) e uso de GitHub. Embora não seja tópico de back-end puro, é ferramenta essencial no dia a dia: permite rastrear alterações, colaborar em equipe e manter um portfólio de código aberto. Deve ser aprendido logo no início, paralelamente ao Java básico, para versionar todo projeto.

### Spring Boot 2026 – REST APIs do zero à AWS/GCP com Java e Docker: 
Curso prático que guia o aluno a construir uma API REST completa desde o início, incluindo Docker, testes, autenticação (JWT), e deploy em nuvem (AWS, GCP). O objetivo é criar “uma API robusta, escalável e documentada” cobrindo do básico do REST até deploy em nuvem. Requer Java básico e noções de banco de dados.

### Spring Boot Expert: 
Curso avançado em Spring Boot que aprofunda Spring Data JPA, arquitetura do Spring, APIs REST, segurança (JWT, OAuth2, login social), Docker, AWS (RDS/EC2), Keycloak, testes e Swagger. Exige Java básico/OOP e conceitos de JPA/ORM. Serve para consolidar e elevar a nível profissional a criação de APIs em Java. (Não há fonte direta, mas cabe ressaltar que habilidades como autenticação OAuth/JWT são destacadas como cruciais.)

### JavaScript e TypeScript – do básico ao avançado: 
Curso full-stack JS. Ensina JavaScript moderno (ES6+), TypeScript, Node.js, Express, MongoDB/MySQL, React etc. Objetiva preparar tanto front-end quanto back-end em JS. Pré-requisitos: nenhum específico além de lógica básica; ideal fazê-lo após entender programação orientada a objetos (Java) ou em paralelo, para expandir habilidades. (Obs.: Node.js aparece como uma das principais linguagens backend, útil para microsserviços e aplicações em tempo real.)

### Formação Front-end – HTML, CSS, JavaScript, React: 
Curso de front-end completo. Ensina desde HTML/CSS até React avançado. Embora não seja foco de um cargo de backend, entender front-end ajuda a criar APIs que atendam bem às necessidades da interface do usuário. Ter esse conhecimento extra é considerado um diferencial: “para backend dev, um pouco de conhecimento de frontend também é um ponto positivo”.

## Dependências técnicas entre cursos e tópicos
Java → Spring Boot: todo curso de Spring Boot pressupõe Java e OOP sólidos. Por exemplo, um fórum sugere dominar OO, coleções, generics e injeção de dependência antes de aprender Spring. Assim, faça primeiro a Maratona Java (fundações) antes de Spring.
SQL → JPA/Spring Data: recomenda-se aprender SQL puro antes de usar ORM. Instrutores sugerem cursar SQL/MySQL antes de “integrar aplicações Java com bancos”. Isso garante que você saiba criar tabelas e consultas básicas antes de usar JPA/Spring Data no Spring.
Git/GitHub: não há precondição de linguagem, mas deve ser usado desde o início. Ele é transversal a todo o desenvolvimento; pratique Git enquanto faz os exercícios de Java e Spring.
Spring Boot 2026 vs. SpringBoot Expert: ambos partem do “do zero”, mas focos diferentes. Pode-se fazer qualquer um primeiro, mas o curso “2026” cobre gradualmente a construção de uma API completa (bom para iniciar em REST/Spring), enquanto o “Expert” aprofunda conceitos (segurança, OAuth2, Keycloak) e boas práticas. Em termos de pré-requisitos, ambos exigem Java/OOP.
JavaScript/TypeScript e Front-end: essas trilhas são independentes das anteriores. Ninguém exige JS para ser desenvolvedor Java, mas noções de JavaScript e React ajudam na comunicação com o front-end. Como citado, “um pouco de conhecimento de front-end é um plus” para devs back-end. Logo, podem ser feitos após consolidar o back-end (ou em paralelo, se quiser vislumbrar full-stack).
Priorização por impacto prático no cargo de Back-end Júnior
Para uma vaga de Dev Back-end Júnior, costumam ser esperados: linguagem de servidor sólida (Java ou outra), integração com banco de dados, construção de APIs, uso de frameworks populares e versionamento. As prioridades são:

## Java e Spring:
O mercado corporativo valoriza Java e frameworks como Spring. Dominar Java básico e Spring Boot permite criar a lógica de servidor e microserviços requisitados.
Bancos de dados (SQL): “dominar o SQL é obrigatório”. Saber modelar dados e escrever queries (MySQL, PostgreSQL etc.) é crucial.
APIs REST e HTTP: é preciso entender protocolo HTTP e design de APIs RESTful, já que a web se baseia nisso. Cursos de Spring treinam criação de APIs conforme essas práticas.
Segurança e boas práticas: conhecimento de autenticação/autorização (JWT, OAuth2) e de arquiteturas escaláveis é cada vez mais esperado. O artigo da Alura destaca aprender OAuth/JWT para “proteger APIs”. Assim, um curso que cubra segurança em Spring (como SpringBoot Expert) agrega muito valor.
Versionamento (Git) e DevOps iniciais: saber Git/GitHub é considerado essencial para qualquer desenvolvedor (permitindo colaboração e exibindo portfólio). Noções de Docker e nuvem (AWS/GCP) também são cada vez mais cobradas; “dominar serviços da nuvem” é citado como diferencial competitivo.
Proposta de ordem de estudo sugerida com justificativas
Git e GitHub (básico): inicie pelo controle de versão. Aprenda comandos básicos de Git e fluxo em GitHub. Assim você já versiona seus códigos (de Java, SQL etc.) e cria um portfólio no GitHub. Justificativa: permite manter histórico de código e praticar colaboração desde o começo.
Java Fundamental (DevDojo – Maratona Java): faça o curso de Java completo para assimilar sintaxe e OOP. Ao final, você deve escrever programas e entender classes, herança, coleções, exceções etc. Justificativa: é a base linguística; sem ela, não dá para avançar em Spring. Como diz o DevDojo, esse é “um dos cursos mais completos de Java do mundo”.
SQL/MySQL (Curso em Vídeo – Guanabara): aprenda a criar bancos relacionais, tabelas, chaves e fazer consultas (SELECT, JOIN etc.). Justificativa: você já sabe Java e está pronto para conectar a um banco. Segundo instrutores, ter esse conhecimento antes de integrar com Java é “vantajoso” e essencial. Ao concluir, pratique montando seu banco de dados e acessando-o (usando clientes ou via scripts).
Spring Boot 2026 (REST APIs do 0 à AWS/GCP): inicie o desenvolvimento de APIs REST. Esse curso prático leva você do zero até deploy em nuvem, passando por Swagger, testes (JUnit/Mockito), Docker e CI/CD. Justificativa: aqui você aplica Java e SQL na prática, construindo um serviço real. Quando terminar, terá uma API funcional com CRUD, versionamento, testes e segurança básica (JWT). É um grande marco prático, consolidando conceitos de HTTP/REST.
Spring Boot Expert: aprofunde aspectos avançados de Spring Boot. Estude Spring Data JPA (parte do Spring Eco), segurança (Spring Security, login social, OAuth2, Keycloak), além de aprofundar design de APIs (DTO, MapStruct) e deploy (AWS RDS, EC2). Justificativa: complementa o curso anterior com tópicos avançados exigidos no mercado (autenticação, autorizações e boas práticas). Ao concluir, sua API de exemplo deve estar segura e profissional, pronta para exigências corporativas como OAuth2 e autenticação social.
JavaScript e TypeScript (do básico ao avançado): estude JS moderno, Node.js e TypeScript. Justificativa: mesmo que você vá atuar principalmente em Java, conhecer Node/Express e TS amplia suas habilidades (por exemplo, para microsserviços alternativos ou front-end básico). Segundo a Alura, Node.js é uma das principais linguagens back-end e é “excelente para aplicações em tempo real”. Além disso, parte do curso aborda React e Git, reforçando dev skills. Esse módulo pode ser feito paralelamente aos Spring ou depois deles.
Formação Front-end (HTML, CSS, JS, React): por fim, faça o front-end. Justificativa: entenda como as interfaces são criadas, o que ajuda a projetar APIs REST adequadas. É um complemento opcional mas valorizado: “para backend dev, um pouco de conhecimento de frontend também é um plus”. Ao fim, você será capaz de criar páginas web básicas que consomem suas APIs (React ou puro), ampliando seu portfólio.
Marcos de conclusão: finalize cada bloco acima com um projeto simples. Por exemplo: após o Java & SQL, escreva um programa que leia/escreva dados em um banco local; após o Spring inicial, construa uma API CRUD completa; após o Spring Expert, adicione autenticação e deploy em nuvem ao projeto. Essas entregas servem como portfólio.

## Recursos complementares e plano de projetos práticos:
Documentação oficial: consulte guias oficiais (por exemplo, spring.io/guides para Spring Boot, docs Oracle/OpenJDK para Java, manuais MySQL). Ler a documentação oficial reforça o aprendizado.
Cursos e comunidades: além dos listados, use tutoriais e fóruns (Stack Overflow, DevDojo, Medium, etc.) para dúvidas. Ex: a Alura e outras plataformas oferecem trilhas de carreira que conectam esses temas.
Projetos práticos: desenvolva projetos completos passo a passo. Sugestões:
Projetos iniciais: após aprender Java e SQL, crie sistemas console simples que leem e gravam dados em um banco.
API em Spring Boot: depois do curso “2026”, implemente uma API REST (ex: cadastro de usuários/livros) com endpoints CRUD, usando MySQL e Docker conforme o curso.
Aplicação avançada: no final do “Spring Expert”, estenda a API com autenticação JWT/OAuth2, paginando respostas e versionando endpoints. Em seguida, faça o deploy em AWS ou GCP (EC2/ECS ou Cloud Run).
Front-end para a API: usando React (ou Node+Express, conforme o curso JS), construa uma interface web simples que consuma sua API. Isso reforça integração back-front.
Portfólio e GitHub: publique seu código no GitHub e, se possível, contribua para projetos open source. Conforme destaca a DIO, “contribuições open source enriquecem o portfólio” do desenvolvedor e recrutadores as veem como diferencial. Isso mostra experiência prática.
Aprendizado contínuo: complete exercícios de lógica e algoritmos (sites como HackerRank), faça pequenos desafios Spring ou participe de hackathons. Também considere certificações (p.ex. Oracle Java ou AWS) para reforçar conhecimentos; dominar nuvem é “um grande diferencial”.
Seguindo essa ordem e complementando com prática e estudos paralelos, você terá uma formação sólida em back-end, atendendo aos requisitos típicos de uma vaga Júnior e construindo um portfólio atrativo.

Fontes: Documentações oficiais e artigos de referência (Alura, DevDojo, DIO, GUJ, repositório de curso, comunidade DEV, fórum Alura). Estes embasam as recomendações acima.