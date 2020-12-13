const prompt = require('prompt-sync')()

let total = prompt('Berapa mahasiswa\t: ')

var arrayMahas = [] // array
var mahasiswa = {} // object

for(let i = 0; i < total; i++){
    console.log(`\nMahasiswa ${i}`)
    let name = prompt('Masukkan Nama\t\t: ')
    let birth = prompt('Masukkan Tanggal\t: ')
    let nim = prompt('Masukkan NIM\t\t: ')

    mahasiswa = new Mahasiswa(name,birth,nim)

    // mahasiswa = new Mahasiswa(
    //     prompt('Masukkan Nama\t\t: '),
    //     prompt('Masukkan Tanggal\t: '),
    //     prompt('Masukkan NIM\t\t: ')
    // )

    arrayMahas.push(mahasiswa)
}

let index = 0

for(let x in arrayMahas){
    console.log(`\nMahasiswa ${index}`)
    index++
    // memanggil value object di array
    console.log(`Nama\t\t: ${arrayMahas[x].name}`)
    console.log(`Tanggal lahir\t: ${arrayMahas[x].birth}`)
    console.log(`NIM\t\t: ${arrayMahas[x].nim}`)
    console.log(`Umur\t\t: ${arrayMahas[x].age()}`)

}

function Mahasiswa(name, birth, nim){
    this.name = name
    this.birth = birth
    this.nim = nim
    this.age = function(){
        let year = this.birth.slice(this.birth.length - 4)
        return 2020 - year
    }
}