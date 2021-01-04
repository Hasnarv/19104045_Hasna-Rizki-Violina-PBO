//Object yang menerapkan revealing module pattern
var person = (function(){
    var age = 25 //variable private

    function setAge(newAge){
      age = newAge 
    }

    function getAge(){
      return age
    }

    function growOlder(){
      age++
    }

    return{
        name : 'Tayo',
        setAge : setAge,
        getAge : getAge,
        growOlder : growOlder
    }
}())

//Output
console.log('Nama Person\t: '+person.name)
console.log('Umur Person\t: '+person.getAge())

//merubah umur
person.setAge(100)
console.log('Umur person yang diganti\t: '+person.getAge())

//menambah umur
person.growOlder()
console.log('Umur person yang ditambah\t: '+person.getAge())