var person = {
    fullName : function(birth, city){
        return this.firstName + " " + this.lastName +
        ", " + birth + ", " + city
    }
}

var person1 = {
    firstName: "Hasna ",
    lastName: "Violina"
}

//menggunakan apply
person.fullName.apply(person1, ["Juni", "Tegal"])