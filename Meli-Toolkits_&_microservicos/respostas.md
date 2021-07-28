Meli-toolkits & Microservicos 
Prática

1- Para a configuração de restclient para este novo endpoint, irei utilizar para os Retries a Exponential Backoff Strategy, inicialmente  irei mandar uma request com um timeout de 50ms, caso não obtenha um resultado irei lançar uma segunda retrie com um timeout de 150ms(P95) e por fim caso necessário irei lançar uma segunda retrie que tera um timeout máximo de 300ms(P99), pois assim ficaremos com uma média maxima de 500ms para após isso retornar um erro.

2 - O nosso microservico não é  restabelecido pois ele deve estar com o Exponential Backoff Strategy, então seus timeouts vai crescendo conforme os erros retornam, o problema é que quando o outro microservico retorna, podemos estar da primeira retrie ou na segunda, aumentando o tempo de resposta e ate tendo que restartar a requisição.
Um jeito de resolver é utilizando circuit breaker assim que o microservico solicitado alcance 100% de taxa de erro, pois assim o circuit break verifica se o outro microservico esta liberado para novas tentativas, não utilizando mais retries.