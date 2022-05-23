"""
Faça um programa que peça ao usuário um número e imprima todos os números de um até o
número que o usuário informar.
"""

chosenNumber = int(input("Escolha um número inteiro: "))
i = 0

for i in range(chosenNumber):
    print(i + 1, end= ' ')