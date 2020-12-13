var person = {
    firstName : 'Lala',
    lastName : 'Yeyeye',
    year : 2000,
    fullname : function(){
      return(this.firstName + " " + this.lastName)
    },
    age : function(){
      return 2020 - this.year
    }
}
  
  console.log('Object dari person\t: ')
  //memanggil method
  console.log(`Name\t: ${ person.fullname() }`)
  console.log(`Tahun\t: ${ person.year }`)
  console.log(`Name\t: ${ person.age() }`)