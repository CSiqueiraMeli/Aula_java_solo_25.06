Consumo de APIs - Uso de Serviços


Dia 01

1 - Ao receber a requisição, nossa API deve primeiramente obter os valores do produto passado, ao saber o valor passado pelo anunciante, ele deve verificar com a API de localização qual a moeda local e após isso dar um get para gerar o valor em dólar, após isso o valor sera devolvido para o front.

2 - Primeiramente temos que ver quantas APIs fazem requests para a nossa API e para a API de localização, pois com 100 mil RPM a API pode ter um atraso na resposta e começar a retornar o erro 429, Nesse caso teríamos que ver a necessidade de realizar o mesmo request toda hora para a API, ou a possibilidade de implementar circuit breakers para acesso a API de localização e um possível servidor.

3 - Para melhorar, podemos dar um get no horário especifico que o sistema gera os valores de cotação diária e deixar os valores em relação ao dólar em cach, assim ao necessitar realizar a conversão, não sera necessário for ate a outra API para buscar o valor em dólar, iremos dar um get nela apenas para pegar a localização do produto.




---------

