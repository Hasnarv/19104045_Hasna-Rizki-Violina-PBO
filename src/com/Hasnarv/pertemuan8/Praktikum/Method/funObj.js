var person = new Biodata('Lala', 'Yeyeye', 2000)


console.log('Object dari person\t: ')
//memanggil method
console.log(`Name\t: ${ person.fullname() }`)
console.log(`Tahun\t: ${ person.year }`)
console.log(`Name\t: ${ person.age() }`)

function Biodata(firstName, lastName, year){
  this.firstName = firstName
  this.lastName = lastName
  this.year = year
  this.fullname = function(){
    return(this.firstName + " " + this.lastName)
  }
  this.age = function(){
    return 2020 - this.year
  }
}