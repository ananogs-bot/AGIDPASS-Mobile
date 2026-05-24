# 📱 AGID PASS

Aplicativo mobile desenvolvido para conectar clientes e profissionais autônomos em uma única plataforma, facilitando a busca, contratação e agendamento de serviços de maneira rápida, segura e intuitiva.

---

## 📋 Sobre o Projeto

O AGID PASS surgiu com o objetivo de simplificar o processo de contratação de serviços, oferecendo uma plataforma onde clientes podem encontrar profissionais de diversas áreas, visualizar informações relevantes e realizar agendamentos diretamente pelo aplicativo.

Além disso, o sistema conta com um chatbot integrado para auxiliar usuários durante a navegação e esclarecer dúvidas frequentes.

---

## 🎯 Objetivos

- Facilitar a conexão entre clientes e profissionais.
- Centralizar o agendamento de serviços em uma única aplicação.
- Melhorar a experiência do usuário através de uma interface intuitiva.
- Automatizar o suporte inicial utilizando chatbot.
- Garantir segurança e privacidade dos dados dos usuários.

---

## ✨ Funcionalidades

### 👤 Cliente

- Cadastro de usuário
- Login e autenticação
- Recuperação de senha
- Visualização de categorias de serviços
- Busca de profissionais
- Visualização do perfil profissional
- Realização de agendamentos
- Gerenciamento dos próprios agendamentos
- Atualização de informações pessoais
- Atendimento via chatbot

### 🧑‍💼 Profissional

- Cadastro profissional
- Gerenciamento de perfil
- Atualização de informações profissionais
- Visualização de agendamentos recebidos
- Gerenciamento dos serviços ofertados

### 🤖 Chatbot

- Respostas para dúvidas frequentes
- Auxílio na navegação do aplicativo
- Orientação sobre agendamentos
- Direcionamento para funcionalidades específicas

---

## 🏗 Arquitetura da Aplicação

```text
Usuário
   ↓
Aplicativo Android
   ↓
Camada de Serviços
   ↓
Firebase Authentication
   ↓
Firebase Firestore
```

---

## 🛠 Tecnologias Utilizadas

| Tecnologia | Finalidade |
|------------|------------|
| Java | Desenvolvimento da aplicação |
| Android Studio | Ambiente de desenvolvimento |
| Firebase Firestore | Banco de dados NoSQL |
| Firebase Authentication | Autenticação de usuários |
| Botpress | Desenvolvimento do chatbot |
| Git | Controle de versão |
| GitHub | Hospedagem do código |
| Figma | Prototipação das telas |
| Draw.io | Diagramas e modelagens |
| Trello | Gerenciamento do projeto |

---

## 📂 Estrutura do Projeto

```text
app/
├── adapter/
├── model/
├── service/
├── ui/
├── MainActivity.java
```

---

## 🗄 Estrutura do Banco de Dados

O projeto utiliza o Firebase Firestore, organizado em coleções:

### Categorias

```json
{
  "nome": "Cabeleireiro"
}
```

### Clientes

```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "(15) 99999-9999"
}
```

### Profissionais

```json
{
  "nome": "Maria Oliveira",
  "categoria": "Manicure",
  "descricao": "Especialista em alongamento de unhas"
}
```

### Agendamentos

```json
{
  "clienteId": "abc123",
  "profissionalId": "xyz456",
  "data": "2026-05-20",
  "horario": "14:00",
  "status": "Agendado"
}
```

---

## 🔐 Segurança

O projeto segue princípios do SSDLC (Secure Software Development Life Cycle), contemplando:

- Controle de acesso por autenticação;
- Validação de entradas do usuário;
- Proteção de dados pessoais;
- Regras de segurança do Firebase;
- Revisão contínua das permissões de acesso;
- Planejamento para autenticação multifator (MFA).


## 🎨 Protótipos

As interfaces foram inicialmente projetadas no Figma para validação da experiência do usuário antes da implementação.

### Principais telas

- Login
- Cadastro
- Recuperação de senha
- Categorias
- Lista de profissionais
- Perfil profissional
- Agendamento
- Perfil do usuário
- Chatbot

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- Android Studio
- Java JDK 17 ou superior
- Conta Firebase
- Emulador Android ou dispositivo físico

### Instalação

1. Clone o repositório:

```bash
git clone https://github.com/ananogs-bot/AGIDPASS-Mobile.git
```

2. Abra o projeto no Android Studio.

3. Configure o Firebase:
    - Crie um projeto no Firebase Console;
    - Baixe o arquivo `google-services.json`;
    - Adicione o arquivo na pasta `app/`.

4. Sincronize as dependências Gradle.

5. Execute o projeto em um dispositivo Android ou emulador.

---

## 📈 Melhorias Futuras

- Sistema de avaliações de profissionais;
- Notificações push;
- Histórico completo de atendimentos;
- Integração com meios de pagamento;
- Área administrativa;
- Implementação de MFA;
- Backup automatizado;
- Monitoramento e auditoria de segurança.

---

## 📚 Documentação do Projeto

O projeto conta com os seguintes artefatos de documentação:

- Documento de requisitos
- Diagrama de casos de uso
- Diagrama de classes
- Diagrama de banco de dados
- Protótipos no Figma
- Modelagem de ameaças
- Relatórios SSDLC
- Documentação do chatbot
- Planejamento e gestão no Trello

---

## 👨‍💻 Equipe

- Ana Luiza Nogueira de Araujo
- Diogo Ribeiro dos Santos
- Giulia Camizão Rokicki
- Isabela de Oliveira Jacob

---

## 📄 Licença

Projeto acadêmico desenvolvido para o curso de Análise e Desenvolvimento de Sistemas da FACENS – Faculdade de Engenharia de Sorocaba.

Todos os direitos reservados aos autores para fins educacionais.