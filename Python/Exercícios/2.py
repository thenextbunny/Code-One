""""
Crie um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual
dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Caso o valor não
esteja em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. Veja
alguns exemplo abaixo
"""

chosenNumber = float(input("Escolha um número: "))

if chosenNumber < 0 or chosenNumber > 100:
    print('Fora de intervalo')
elif chosenNumber <= 25:
    print('[0, 25]')
elif chosenNumber <= 50:
    print('[25, 50]')
elif chosenNumber <= 75:
    print('[50,75]')
else:
    print('[75,100]')


