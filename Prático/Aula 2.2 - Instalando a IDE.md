# Aula 2.2 - Instalando a IDE

Nesta aula, aprendi sobre:

## Baixando e instalando a IDE

- O instrutor do curso sugere a instalação do Eclipse, <a href="https://www.eclipse.org/" target="_blank">(faça o download pelo site oficial do Eclipse)</a>, porém, eu já tive o contato e preferi seguir com o IntelliJ, <a href="https://www.jetbrains.com/pt-br/idea/" target="_blank">(faça o download pelo site oficial do IntelliJ)</a>.

- Siga os passos da instalação de sua IDE. No caso do Eclipse, haverá a necessidade de selecionar a pasta onde o JDK está arquivado e selecionar/criar a pasta de workspace (pasta destinada aos seus projetos criados na máquina).

### Se o seu Eclipse não abrir, este pode ser o problema

    - Erro na seleção do sistema 32bits/64bits:
        - Baixe novamente a versão do Eclipse compatível com o seu sistema.

    - Não localização do JDK no seu sistema:
        - Em "Propriedades do Sistema", abra as "Variáveis de Ambiente"
        - Em "Variáveis do sistema", crie uma nova entrada, clicando em "Novo..."
        - No campo "Nome da variável:" digite JAVA_HOME e em "Valor da variável:" digite o diretório onde está salvo o JDK
            - Se já existir uma variável JAVA_HOME em seu sistema, clique em "Editar..." e troque o diretório onde está salvo o JDK
        - Depois, selecione a variável Path, clique em "Editar...", crie uma nova entrada e cole o diretório do JDK e acrescente \bin ao final e dê o OK
        - Dê o OK novamente até fechar a jandela de "Propriedades do Sistema"