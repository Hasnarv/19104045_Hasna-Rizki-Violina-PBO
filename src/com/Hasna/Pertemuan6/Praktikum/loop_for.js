//for loop
for(var i = 0; i < 5; i++){
    console.log(i + '. Berfikir')
}
console.log('\n')

//for/in
var nama = [{fName : 'Harry', IName : 'Potter', age : 20}, {fName : 'Hermione', IName : 'Gringer', age : 20}]

for(var x in nama){
    console.log('Student\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].IName)
    console.log(nama[x].age)
    console.log('\n')
}

//for/of
var buah = ['apel', 'anggur', 'jeruk']
for (var x of buah) {
    console.log('Ini buah ' + x)
}