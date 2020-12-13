//Deklarasi input
const prompt = require('prompt-sync')()

let object = {}
object.name = prompt('Input Name\t: ')
object.age = prompt('Input Age\t: ')
object.nim = prompt('Input Nim\t: ')
object.prodi = prompt('Input Prodi\t: ')

console.log('')

console.log(object)

//object.name == object['name']
console.log('')

for(var property in object){
  console.log(property + `\t: ${object[property]}`)
}