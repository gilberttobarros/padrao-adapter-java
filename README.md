# 🎵 Padrão de Projeto Adapter em Java

## 📌 Sobre o projeto

Este projeto foi desenvolvido como atividade acadêmica para demonstrar a aplicação do padrão de projeto **Adapter** utilizando a linguagem Java.

O sistema simula um reprodutor de músicas que suporta arquivos MP3 e precisa ser adaptado para trabalhar também com os formatos MP4 e VLC, sem modificar a interface original de reprodução.

## 🎯 Objetivo

Aplicar o padrão Adapter para permitir que diferentes formatos de arquivos sejam utilizados pelo mesmo sistema, mantendo o código organizado e facilitando sua manutenção.

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Interfaces
- Padrão de projeto Adapter

## 📂 Estrutura do projeto

```text
src/
├── ReprodutorMusical.java
├── ReprodutorMP3.java
├── ReprodutorAvancado.java
├── ReprodutorMP4.java
├── ReprodutorVLC.java
├── AdaptadorReprodutor.java
├── ReprodutorPrincipal.java
└── Principal.java
```

## 🧩 Como funciona o padrão Adapter?

O Adapter funciona como um intermediário entre classes que possuem interfaces diferentes, permitindo que elas trabalhem juntas sem precisar modificar o código original.

Neste projeto:

- **ReprodutorMusical:** define a interface original de reprodução.
- **ReprodutorMP3:** realiza a reprodução simulada de arquivos MP3.
- **ReprodutorAvancado:** define os métodos específicos para MP4 e VLC.
- **ReprodutorMP4:** realiza a reprodução simulada de arquivos MP4.
- **ReprodutorVLC:** realiza a reprodução simulada de arquivos VLC.
- **AdaptadorReprodutor:** adapta os métodos específicos de MP4 e VLC à interface original.
- **ReprodutorPrincipal:** direciona cada formato para o reprodutor adequado.
- **Principal:** executa o programa e demonstra o funcionamento da solução.

## 📊 Diagrama simplificado

```text
                 Principal
                     |
                     v
           ReprodutorPrincipal
                     |
          +----------+----------+
          |                     |
          v                     v
    ReprodutorMP3       AdaptadorReprodutor
                                |
                       +--------+--------+
                       |                 |
                       v                 v
                 ReprodutorMP4     ReprodutorVLC
```

## ▶️ Como executar o projeto

1. Clone este repositório:

   ```bash
   git clone URL_DO_SEU_REPOSITORIO
   ```

2. Abra o projeto em uma IDE, como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java.

3. Compile os arquivos Java.

4. Execute a classe `Principal`.

## 💻 Exemplo de saída

```text
Reproduzindo arquivo MP3: musica.mp3
Reproduzindo arquivo MP4: video.mp4
Reproduzindo arquivo VLC: filme.vlc
```

**Observação:** a reprodução é simulada por mensagens no terminal. O projeto não executa a reprodução real de arquivos de áudio ou vídeo.

## 📚 Conceitos aplicados

- Padrão de projeto Adapter.
- Programação Orientada a Objetos.
- Implementação de interfaces.
- Reutilização de código.
- Separação de responsabilidades.
- Princípio da Responsabilidade Única (SRP).

## 👨‍💻 Autor

Projeto desenvolvido por Gilberto Barros, mas para fins acadêmicos, com o objetivo de praticar padrões de projeto utilizando Java.