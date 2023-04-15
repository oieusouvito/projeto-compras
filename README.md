# Cartão de Crédito
Este é um programa simples em Java que simula o funcionamento de um cartão de crédito. A classe CartaoDeCredito representa o cartão em si, enquanto a classe Compras representa uma compra feita com o cartão.

# Classe CartaoDeCredito
A classe CartaoDeCredito tem os seguintes atributos:

* limiteDoCartao: o limite de crédito disponível no cartão;
* saldo: o saldo disponível no cartão, ou seja, a quantia que ainda pode ser gasta;
* compra: uma lista de objetos do tipo Compras que representa as compras feitas com o cartão.

A classe possui os seguintes métodos:

* CartaoDeCredito(double limiteDoCartao): um construtor que recebe o limite de crédito do cartão como parâmetro e inicializa os atributos limiteDoCartao, saldo e compra;
* lancaCompra(Compras compra): um método que recebe um objeto do tipo Compras como parâmetro e verifica se há saldo disponível para realizar a compra. Se houver, o método subtrai o valor da compra do saldo do cartão e adiciona a compra à lista de compras. Se não houver saldo disponível, a compra não é realizada e o método retorna false. Caso contrário, ele retorna true;
* getLimiteDoCartao(): um método que retorna o limite de crédito do cartão;
* getSaldo(): um método que retorna o saldo disponível no cartão;
* getCompra(): um método que retorna a lista de compras feitas com o cartão.

# Classe Compras
A classe Compras tem os seguintes atributos:

* descricao: a descrição da compra;
* valor: o valor da compra.

A classe implementa a interface Comparable<Compras> para permitir a ordenação das compras por valor.

A classe possui os seguintes métodos:

* Compras(String descricao, double valor): um construtor que recebe a descrição e o valor da compra como parâmetros e inicializa os atributos correspondentes;
* getDescricao(): um método que retorna a descrição da compra;
* getValor(): um método que retorna o valor da compra;
* toString(): um método que retorna uma representação em forma de string da compra, contendo a descrição e o valor;
* compareTo(Compras outraCompra): um método que compara o valor da compra atual com o valor de outra compra recebida como parâmetro e retorna um número negativo, zero ou positivo, indicando se a compra atual é menor, igual ou maior que a outra compra em termos de valor.

# Classe Principal
A classe Principal contém o método main que inicia a execução do programa. O programa solicita ao usuário o limite de crédito do cartão e, em seguida, entra em um loop que permite ao usuário fazer compras até que o saldo do cartão seja insuficiente. A cada compra realizada, o programa pergunta se o usuário deseja continuar ou sair.

Ao final do loop, o programa exibe a lista de compras realizadas em ordem crescente de valor e o saldo disponível no cartão. A lista de compras é ordenada usando o método sort da classe Collections, que utiliza o método compareTo da classe "Compras" para comparar os valores das compras. Isso garante que a lista de compras seja exibida em ordem crescente de valor.

Além disso, o programa também utiliza o método getCompra da classe CartaoDeCredito para obter a lista de compras realizadas e exibir a descrição e valor de cada compra por meio de um loop for-each. Por fim, é exibido o saldo disponível no cartão utilizando o método getSaldo da classe CartaoDeCredito.

Em resumo, o programa simula um cartão de crédito que permite realizar compras enquanto houver saldo disponível e exibe a lista de compras realizadas em ordem crescente de valor e o saldo disponível no final das compras. O código é composto por três classes: CartaoDeCredito, Compras e Principal. A classe CartaoDeCredito é responsável por armazenar o limite do cartão, o saldo e a lista de compras realizadas, além de permitir o lançamento de novas compras. A classe Compras representa uma compra realizada, com descrição e valor. A classe Principal é responsável por realizar a interação com o usuário por meio do console e exibir as informações de compras e saldo no final.
