function Person(paramName){
    var name = paramName
    var age = 20

    this.setName = function(newName){
        name = newName
    }

    this.getName = function(){
        return name
    }

    this.setAge = function(newAge){
        age = newAge
    }

    this.getAge = function(){
        return age
    }

    this.growOlder = function(){
        age++
    }
}

var person = new Person('Tinky Winky')

//Output
console.log('Nama Person\t: '+person.getName())
console.log('Umur Person\t: '+person.getAge())

//merubah umur
person.setAge(100)
console.log('Umur person yang diganti\t: '+person.getAge())

//menambah umur
person.growOlder()
console.log('Umur person yang ditambah\t: '+person.getAge())