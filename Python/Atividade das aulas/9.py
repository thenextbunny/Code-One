# Listas

# Antes 
note1 = 2
note2 = 4
note3 = 5

# Com lista 
grades = [7, 5, 6]

# Criando listas vazias
# list = []
# list = list()

# Listas permitem diferentes tipos de dados
list = [28, "Bob", 3.14, False]

# Lista de listas
listOfLists = [10, [1, 2, 3]]

# Indexação
print(list[0])

# Slices
print(list[0:3]) # Do 0 ao 3
print(list[0:4:2]) # Do 0 a0 4 pulando de 2 em 2

# Iterações com FOR
# Retornando elementos da lista
for elements in list :
    print(elements)

# Verificando tamanho da lista
print(len(list))

# Retornando lista com índices
for i in range(len(list)) :
    print(list[i])