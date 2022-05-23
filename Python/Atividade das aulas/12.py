# Dicionários
# Vazio
dictionary = {}
dictionary = dict()

# Com conteúdo
dictionary = {'Nome': 'Pedro', 'Idade': 26, 'Altura': 1.73}

# Acessando dicionário
print(dictionary)

# Acessando elemento de forma intuitiva
print(dictionary['Idade'])

# Criando novo elemento
dictionary['Programador'] = True

# Mudando elemento existente
dictionary['Altura'] = 2 

# Iteração sobre um dicionário
for i in dictionary:
    print(i, dictionary[i])

# Verificando se existe uma chave
print('Peso' in dictionary) # FALSE
print('Altura' in dictionary) # TRUE

