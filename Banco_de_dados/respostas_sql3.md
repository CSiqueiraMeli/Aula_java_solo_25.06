---

### Terceira Parte

** 1 - Explique o conceito de normalização e para que é usado.
Normalizacao sao regras para a modelagem de um banco de dados, nela sao definidas algumas normas praticas e sao utilizadas visando a diminuicao da redundancia, aumento do desempenho e da integridade do mesmo.

** 2 - Adicione um filme à tabela de filmes.
insert into movies (id, title, rating, awards, release_date, length, genre_id) values (22, 'Batman e Robin', 3.8, 0, '1997-06-12', '125', '11');

** 3 - Adicione um gênero à tabela de gêneros.
insert into genres (id, created_at, name, ranking, active) values (13, '2021-07-20', 'novo genero', '13', '1');


** 4 - ssocie o filme do Ex 2. ao gênero criado no Ex. 3.
update movies set genre_id = '13' where id = 22;


** 5 - Modifique a tabela de atores para que pelo menos um ator adicione como favorito o filme adicionado no Ex. 2.
update actors set favorite_movie_id = '22' where id = 4;


** 6 - Crie uma cópia temporária da tabela de filmes.
create temporary table tempmovies as select * from movies;


** 7 - Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.
delete from tempmovies where awards < 5;


** 8 - Obtenha a lista de todos os gêneros que possuem pelo menos um filme.
select * from genres where active >= 1;


** 9 - Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.
select a.first_name, a.last_name, m.title
from actors a, movies m
where CAST(a.favorite_movie_id as integer) = m.id
and m.awards >= 3;


** 10 - Use o plano de explicação para analisar as consultas nos Ex. 6 e 7.
delete from tempmovies where awards < 5;


** 11 - O que são os índices? Para que servem?
Indices é um tipo de ferramaneta utilizada para agilizar as buscas em sql, ela é utilizada para melhor os acessos a dados, fornecendo um caminho mais direto em uma pesquisa, assim evitando uma vareredura completa em uma tabela.

** 12 - Crie um índice sobre o nome na tabela de filmes.
create index moviesIdx on movies (title);


** 13 - Verifique se o índice foi criado corretamente.
SELECT * FROM pg_indexes WHERE tablename = 'movies';