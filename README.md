## Requisitos

 - Intellij ou IDE java de sua preferência
 - Chrome 92 (se for de preferência utilizar outra versão do chrome é necessário baixar outra versão do chromedriver e substituir na pasta drivers.)

## Rodando os testes 

 1. É necessário baixar o repositório disponível no github
 2. Antes de rodar é necessário observar se a pasta test está marcada como test root. Se não estiver é necessário clicar com o botão direito, ir até a opção de "mark directory as" e selecionar "Test Root". **Atentar pois o processo pode variar de IDE para IDE**
 3. Para rodar pode ir ate a pasta src/test/com.keego/runners e rodar o runner que está dentro da pasta
 4. Deixei rodando em modo silencioso pois consome menos memória, se for necessário uma visualização do processo é apenas alterar a linha de


    options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--ignore-certificate-errors");

 para:   
  
     // options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--ignore-certificate-errors");

