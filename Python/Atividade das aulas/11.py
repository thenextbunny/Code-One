# Funções

# função inicial

def welcome():
    print("Seja bem vindo(a)!")
    print("É um prazer ter você conosco")

#welcome()

# função com parâmetros

def welcomeWithName(name) :
    print(f"Seja bem vindo, {name}")

welcomeWithName(input("Qual é seu nome? "))

# função com parâmetros default

def default(course="C++"):
    print(f"O parâmetro default é: {course}")

default()

# função com retorno
def sum(num1, num2):
    return num1 + num2

result = sum(2, 3)
print(result)

def calculator(num3, num4, operation='+'):
    if operation == '+':
        return num3 + num4
    elif operation == '-':
        return num3 - num4
    elif operation == '*' or operation == 'x':
        return num3 * num4
    
result2 = calculator(10, 20)