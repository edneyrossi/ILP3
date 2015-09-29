## Exercício 3

Escreva um método que determine quanto tempo leva para um corpo cair de determinada altura a partir do repouso. 

Este método receberá como parâmetro um valor do tipo double contendo a altura em centímetros em que o corpo está. E deverá retornar um valor do tipo Double contendo o tempo da queda em segundos.

Considere que a força da gravidade é igual a 9,8m/s². 

Use o método Math.sqrt() para obter a raiz quadrada.

** Fórmulas para auxiliar a resolução **

`V = g * t`

`d = g * t² / 2`

** Desenvolvendo a 2ª fórmula: **

`t² = 2 * d / g`

** Onde: **

*V = velocidade;

* g = aceleração da gravidade;

* t = tempo de queda;

* d = distância percorrida pelo corpo em queda;

### Dicas:

Use a altura ao invés de centímetros, como pede o problema em metros. Assim facilita o cálculo e evita conversões.
