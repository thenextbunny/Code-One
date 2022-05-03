// De uma lista de dez números inteiros desordenados, encontre e mostre o maior e o menor.

let listaNumeros = [50, 10, 20, 5, 6, 7, 11, 102, 103, 50]

console.log('Maior: ' + Math.max.apply(null, listaNumeros))

console.log('Menor: ' + Math.min.apply(null, listaNumeros))