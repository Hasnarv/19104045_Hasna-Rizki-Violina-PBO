//deklarasi dan inisialisasi atribut
var loop = true
var arrHewan = [] //array hewan
var hwn = {} //objek hewan
var menu
let index

//deklarasi prompt
const prompt = require('prompt-sync')()

//constructor Hewan
function Hewan(nama, jenis, umur, makanan, riwayat_sakit){
  this.nama = nama
  this.jenis = jenis
  this.umur = umur
  this.makanan = makanan
  this.riwayat_sakit = riwayat_sakit

  //tampil data
  this.tampil = function(){
    console.log('Nama               : ', this.nama)
    console.log('Jenis              : ', this.jenis)
    console.log('Umur               : ', this.umur)
    console.log('Makanan            : ', this.makanan)
    console.log('Riwayat Penyakit   :', this.riwayat_sakit)
  }
}

//perulangan menu
while(loop == true){
  console.log("\n<============== MENU PET SHOP ==============>");
  console.log("1. Tambah Hewan");
  console.log("2. Edit Hewan");
  console.log("3. Tampil Hewan");
  console.log("4. Exit");
  menu = prompt("Masukan Pilihan\t: ");

  //pilihan menu
  switch(menu){
    case '1' :
    let jmlHewan = prompt('Jumlah Hewan yang Akan Diinput : ')

    for (let i = 1; i <= jmlHewan; i++) {
      console.log(`\nHewan ke ${i}`)

      // membuat objek hewan dengan constructor
      hwn = new Hewan(
        prompt('Masukkan Nama               : '),
        prompt('Masukkan Jenis              : '),
        prompt('Masukkan Umur               : '),
        prompt('Masukkan Makanan            : '),
        prompt('Masukkan Riwayat Penyakit   : ')
      )

      arrHewan.push(hwn)
    }
    break

    case '2' :
    var noHwn = prompt('Masukkan Nomor Urut Hewan : ')

    // menambah fungsi baru ke constructor
    Hewan.prototype.edit = function(){
        nama = prompt('Masukkan Nama               : '),
        jenis = prompt('Masukkan Jenis              : '),
        umur = prompt('Masukkan Umur               : '),
        makanan = prompt('Masukkan Makanan            : '),
        riwayat_sakit = prompt('Masukkan Riwayat Penyakit   : ')
        tampil = this.tampil
        return {nama, jenis, umur, makanan, riwayat_sakit, tampil}
    }

    index = noHwn - 1
    arrHewan[index] = arrHewan[index].edit()
    break

    case '3' :
    //menampilkan data hewan
    index = 1
    for(let i in arrHewan){
        console.log(`\nHewan ke ${index}`)
        index++
        arrHewan[i].tampil()
    }
    break

    case '4' :
    //keluar dari sistem
    loop = false
    console.log('KELUAR')
    break

    default :
    //jika pilihan tidak sesuai
    console.log('Mohon masukkan Pilihan yang Sesuai')
  }
}
