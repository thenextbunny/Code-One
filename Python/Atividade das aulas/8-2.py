# For
# Programa que recebe três notas e devolve a média
sum = 0

for i in range(1, 4) :
    note = float(input(f"Informe a sua nota {i}: "))
    sum += note

print(f"A sua média é {sum / 3}")