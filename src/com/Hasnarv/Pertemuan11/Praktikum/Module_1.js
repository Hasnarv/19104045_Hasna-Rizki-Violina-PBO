//Object yang menerapkan module Pattern
var person = (function(){
    var age = 25 //variable private

    return{
        name : 'Tayo',

        getAge : function(){
            return age
        },

        growOlder : function(){
            age++
        }
    }
}())

//output
console.log('Nama Person\t: '+person.name)
console.log('Umur Person\t: '+person.getAge())

/*
saat di run, usia tidak berubah
karena variable age bersifat private sehingga tidak bisa dirubah langsung dari luar function
*/
person.age = 100
console.log('Umur person yang diganti\t: '+person.getAge())

//menambah umur
person.growOlder()
console.log('Umur person yang ditambah\t: '+person.getAge())