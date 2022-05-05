// Coloque, num algoritmo, um processo de chamada em sala de aula.

let listaDeAlunos = ['Pedro', 'Paulo', 'Ana', 'Julia', 'Marcos', 'Antônio', 'Carlos']
let alunosPresentes = ['Pedro', 'Paulo', 'Julia', 'Carlos']

for(let i = 0; i < listaDeAlunos.length; i++) {
    if(alunosPresentes.includes(listaDeAlunos[i])) {
        console.log('Presente')
    } else {
        console.log('Faltou')
    }
}
