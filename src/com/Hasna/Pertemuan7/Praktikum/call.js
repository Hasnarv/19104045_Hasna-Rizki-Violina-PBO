//membuat method person
var person = {
    fullName: function(){
        return this.firstName + " " + this.lastName
    }
}

var person1 = {
    firstName: "Hasna",
    lastName: "Rizkiv"
}

var person2 = {
    firstName: "Lala",
    lastName: "Yeyeye"
}

console.log("Menggunakan method call untuk menampilkan objek person 2: ")

//memanggil method menggunakan method call
person.fullName.call(person2)
