# Jogo de Adivinhação

Este é um jogo de adivinhação simples desenvolvido em Java. O objetivo do jogo é adivinhar o número sorteado pelo programa, acumulando pontos com base na precisão dos palpites.

## Funcionalidades

- Escolha entre três níveis de dificuldade:
  - **Fácil**: Números entre 1 e 10.
  - **Médio**: Números entre 1 e 50.
  - **Difícil**: Números entre 1 e 100.
- Pontuação:
  - **10 pontos** para acertos exatos.
  - **5 pontos** para palpites que estão a uma distância de 1 do número sorteado.
- Histórico de números acertados e errados.
- Opção de continuar ou encerrar o jogo a qualquer momento.

## Como Jogar

1. Execute o programa.
2. Escolha o nível de dificuldade:
   - Digite `1` para Fácil.
   - Digite `2` para Médio.
   - Digite `3` para Difícil.
3. Insira seu palpite dentro do intervalo correspondente ao nível escolhido.
4. O programa informará se você acertou, chegou perto ou errou.
5. Veja sua pontuação atual e decida se deseja continuar jogando.
6. Quando decidir encerrar, o programa exibirá sua pontuação final, números acertados e números errados.

## Exemplo de Execução

```plaintext
Escolha a dificuldade:
1 - Fácil (1-10)
2 - Médio (1-50)
3 - Difícil (1-100)
1
Digite seu palpite (1-10): 
5
Errou!
Sua pontuação atual é: 0
Deseja continuar jogando? (s/n): 
s
Escolha a dificuldade:
1 - Fácil (1-10)
2 - Médio (1-50)
3 - Difícil (1-100)
1
Digite seu palpite (1-10): 
7
Parabéns! Você acertou!
Sua pontuação atual é: 10
Deseja continuar jogando? (s/n): 
n

--- Fim do Jogo ---
Sua pontuação final: 10
Números acertados: [7]
Números errados: [5]
