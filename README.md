# PadraoSingleton

1.1 Problema que o padrão resolve

ele ajuda em varios tipos de cenarios  a garantir que uma classe tenha somente uma instancia no programa principalmente quando essa instancia apresenta um recurso compartilhado, por exemplo em uma conexão em bancos de dados , logger , gerenciador de confugurações pra ter um acesso global.

Exemplos reais : Sistemas de configuração : Desktop central que pode permiter a administração de apps , configurações do sistemas.

 SolarWinds AnaLyzer: que une dados de logs pra fornecer insights sobre a integridade e o desempenho dos ambientes de TI.

 DataDog:Permite a criação de uma fonte centralizada de dados pra analise de dados pra analise de servidores.

 1.2 Solução proposta pelo padrão Singleton

 Restringir a criação de instâncias; Atraves de uma implementação  de um construtor privado que pode evita a criação direta de uma instancia e um metodo estatico que retorna a instancia a uma unica classe

 Oferecer um ponto global e controlado de acesso; O ponto global oferecido permite que o codigo que depende do recurso compartilhe a  mesma instancia , pois melhora a eficiencia e a segurança do codigo .

O singleton é muito util em varios ambientes  como o ambiente multiTheread , que a instancia unica pode ser criada por varias threads ao mesmo tempo , apresentando varias instancias diferentes . desde já esse poblema é resolvido com a palavra chave lock que garanti que apenas uma thread possa criar a instancia inicial , evitando problemas de concorrencia , ainda mais a implementacão pode ser otimizada com a inicialização preguiçosa onde a instancia é criada apenas quando é realmente necessaria , minimizando o impacto no desempenho.

Diagrama UML :
<img width="519" height="408" alt="image" src="https://github.com/user-attachments/assets/b8e2b632-c8c3-428d-a57d-c3939801b803" />

