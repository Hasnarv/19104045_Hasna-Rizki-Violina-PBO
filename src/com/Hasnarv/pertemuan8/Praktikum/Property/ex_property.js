//deklarasi objek tanpa value
var person0 = {}
//deklarasi objek dengan value
var person1 = { name : 'Lala' }
//membuat objek baru
var person2 = new Object()
person2.name = 'Yeyeye'

//menambahkan property
person1.age = 20
person2.age = 25

console.log()

console.log('Object person1\t: ')
console.log(`name\t: ${person1.name}`)
console.log(`age\t\t: ${person1.age}`)

console.log()

console.log('Object person2\t: ')
console.log(`name\t: ${person2.name}`)
console.log(`age\t\t: ${person2.age}`)