//membuat objek Kendaraan
var Kendaraan = {
    //method untuk memasukkan dan menyimpan data atribut
    inputAtribut: function(noPlat, merk, pajakKendaraan){
      this.noPlat = prompt('Masukkan Nomor Kendaraan\t\t: ')
      this.merk = prompt('Masukkan Merk\t\t\t\t\t: ')
      this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t\t: ')
    },
  
    //method untuk menambahkan fasilitas tambahan
    fasTambahan: function(){},
  
    //method untuk mencetak data fasilitas tambahan
    printFasTambahan: function(){},
  
    //method untuk menghitung pajak
    hitungPajak: function(){},
  
    //method untuk mencetak data
    print: function(){
      console.log('----- INFO KENDARAAN -----')
      console.log('Nomor Kendaraan\t\t\t\t\t: ', this.noPlat)
      console.log('Merk Kendaraan\t\t\t\t\t: ', this.merk)
      this.printFasTambahan()
      console.log('Pajak Kendaraan\t\t\t\t\t: ', this.pajakKendaraan)
      console.log('Total Pembayaran Pajak \t\t\t: ', this.hitungPajak())
    }
  }
  
  //membuat objek Sedan sebagai objek turunan dari Kendaraan
  var Sedan = Object.create(Kendaraan)
  //menambah fasilitas tambahan untuk Sedan
  Sedan.fasTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
    this.fasKeamanan = prompt('Masukkan Fasilitas Keamanan\t\t: ')
    this.kapasitasCC = prompt('Masukkan Kapasitas (dalam CC)\t: ')
    this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan\t: ')
  }
  //mencetak fasilitas tambahan untuk Sedan
  Sedan.printFasTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
    console.log('Fasilitas Keamanan\t\t\t\t: ', this.fasKeamanan)
    console.log('Kapasitas (dalam CC)\t\t\t: ', this.kapasitasCC)
    console.log('Fasilitas Kenyamanan\t\t\t: ', this.fasKenyamanan)
  }
  //menghitung pajak kendaraan Sedan
  Sedan.hitungPajak = function(totalPajak){
    return (this.pajakKendaraan*1) + (this.pajakKendaraan * this.kapasitasCC * 0.00005)
  }
  
  //membuat objek Bus sebagai objek turunan dari Kendaraan
  var Bus = Object.create(Kendaraan)
  //menambah fasilitas tambahan untuk Bus
  Bus.fasTambahan = function(kapPenumpang, kapBagasi){
    this.kapPenumpang = prompt('Masukan Kapasitas Penumpang \t: ')
    this.kapBagasi    = prompt('Masukkan Kapasitas Bagasi(kg)\t: ')
  }
  //mencetak fasilitas tambahan untuk Bus
  Bus.printFasTambahan = function(kapPenumpang, kapBagasi){
    console.log('Kapasitas Penumpang \t\t\t: ', this.kapPenumpang)
    console.log('Kapasitas Bagasi    \t\t\t: ', this.kapBagasi)
  }
  //menghitung pajak kendaraan untuk Bus
  Bus.hitungPajak = function(totalPajak){
    return (this.pajakKendaraan*1) + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)
  
  }
  
  //Input data
  console.log('\n<===== INPUT DATA KENDARAAN=====>')
  console.log('\n1. Sedan')
  Sedan.inputAtribut()
  Sedan.fasTambahan()
  Sedan.hitungPajak()
  
  console.log('\n2. Bus')
  Bus.inputAtribut()
  Bus.fasTambahan()
  Bus.hitungPajak()
  
  //Output data
  console.log('\n<===== DATA SELURUH KENDARAAN =====>')
  console.log('\n1. Sedan')
  Sedan.print()
  console.log('\n2. Bus')
  Bus.print()