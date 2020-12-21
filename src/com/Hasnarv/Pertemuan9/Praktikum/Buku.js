function Buku(judul, pengarang, penerbit,th_terbit){
    this.judul = judul
    this.pengarang = pengarang
    this.penerbit = penerbit
    this.th_terbit = th_terbit
  
    this.tampil = function(){
      console.log('Judul Buku     : ', this.judul)
      console.log('Nama Pengarang : ', this.pengarang)
      console.log('Penerbit       : ', this.penerbit)
      console.log('Tahun Terbit   : ', this.th_terbit)
    }
  }
  
  //deklarasi prompt
  const prompt = require('prompt-sync')()
  
  let jmlBuku = prompt('Jumlah Buku yang Akan Diinput : ')
  
  //deklarasi array buku
  var arrayBuku = []
  
  //deklarasi objek
  var buku = {}
  
  //perulangan untuk membuat objek
  for(let i = 1; i <= jmlBuku; i++){
    console.log('\n')
  
    //membuat objek dengan constructor
    buku = new Buku(
      prompt(`Masukkan Judul Buku ke ${i} : `),
      prompt('Masukkan Nama pengarang  : '),
      prompt('Masukkan Nama Penerbit   : '),
      prompt('Masukkan Tahun Terbit    : ')
    )
  
    arrayBuku.push(buku)
  }
  
  console.log('\n')
  var editData = prompt('\nIngin Mengubah Data? [Ya/Tidak] : ')
  
  if(editData == 'Ya'){
    var noBuku = prompt('Masukkan Urutan Buku yang Ingin Diubah : ')
    var namaData = prompt('Masukkan Data yang Ingin Diubah [Judul/Pengarang/Penerbit/Tahun Terbit] : ')
  
    let index = noBuku-1
    if(namaData == 'Judul'){
      arrayBuku[index].judul = prompt('Masukkan Judul Buku Baru : ')
    } else if(namaData == 'Pengarang'){
      arrayBuku[index].pengarang = prompt('Masukkan Nama Pengarang Baru : ')
    }else if(namaData == 'Penerbit'){
      arrayBuku[index].penerbit = prompt('Masukkan Nama Penerbit Baru : ')
    }else if(namaData == 'Tahun Terbit'){
      arrayBuku[index].th_terbit = prompt('Masukkan Tahun Terbit : ')
    } else {
      console.log('Pilihan Tidak Sesuai !')
    }
  
    console.log('\nData Buku yang Berhasil Disimpan')
    index = 1
  
    //perulangan
    for(let i in arrayBuku){
      console.log(`\nBuku ke ${index}`)
      index++;
      arrayBuku[i].tampil()
    }
  } else if(editData == 'Tidak') {
    console.log('\nData Buku yang Berhasil Disimpan')
    index = 1
  
    //perulangan
    for(let i in arrayBuku){
      console.log(`\nBuku ke ${index}`)
      index++;
      arrayBuku[i].tampil()
    }
  } else {
    console.log('Pilihan Tidak Sesuai')
  }