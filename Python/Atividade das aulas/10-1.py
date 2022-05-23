# Métodos de lista

list = [1, 3, 12, 8, 2]

# append - adicionar ao final

list.append(10)
print(list)

# insert - adicina elemento em posição escolhida
        
list.insert(2, 10) # índice, valor
print(list)

# extend - junta duas listas no final da lista
list2 = [3, 2, 4]
list.extend(list2)
print(list)

# pop - remove último elemento ou elemento em posição escolhida
list.pop() # elimina o último elemento
list.pop(0) # elimina o elemento do índice 0

# remove - remove o primeiro elemento especificado
list.remove(3)

# count - conta a quantidade de um elemento
list.count(2)

# index - diz o índice de um determinado elemento
list.index(12)

# sort - ordena a list de forma crescente
list.sort()