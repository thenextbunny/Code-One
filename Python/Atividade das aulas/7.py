# While
# Gerador de número aleatório que interage com o usuário
import random

drawnNumber = random.randint(1, 20)
chosenNumber = int(input("Escolha um número entre 1 e 20: "))
attempts = 0

while drawnNumber != chosenNumber :
    print("Você errou! Tente novamente...")
    chosenNumber = int(input("Escolha um número entre 1 e 20: "))

print("Parabéns! Você acertou...")

# While com contador
counter = 0

while counter < 5 :
    print(counter)
    counter += 1



