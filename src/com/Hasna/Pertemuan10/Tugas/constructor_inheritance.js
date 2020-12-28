//constructor kendaraan
function Kendaraan(noPlat, merk, pajakKendaraan){
    this.noPlat = noPlat
    this.merk = merk
    this.pajakKendaraan = pajakKendaraan
  }
  
  Kendaraan.prototype.inputAtribut = function(){
    this.noPlat = noPlat
    this.merk = merk
    this.pajakKendaraan = pajakKendaraan
  }
  
  Kendaraan.prototype.inputAtribut = function(){
    this.noPlat = prompt('Masukkan Nomor Kendaraan\t\t: ')
    this.merk = prompt('Masukkan Merk\t\t\t\t\t: ')
    this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t\t: ')
  }
  
  Kendaraan.prototype.fasTambahan = function(){},
  
  Kendaraan.prototype.printFasTambahan = function(){},
  
  Kendaraan.prototype.hitungPajak = function(){},
  
  Kendaraan.prototype.print = function(){
    console.log('----- INFO KENDARAAN -----')
    console.log('Nomor Kendaraan\t\t\t\t\t: ', this.noPlat)
    console.log('Merk Kendaraan\t\t\t\t\t: ', this.merk)
    this.printFasTambahan()
    console.log('Pajak Kendaraan\t\t\t\t\t: ', this.pajakKendaraan)
    console.log('Total Pembayaran Pajak \t\t\t: ', this.hitungPajak())
  }
  
  //Sedan mewarisi properti dari kendaraan
  function Sedan(fasKeamanan, kapasitasCC, fasKenyamanan){
    this.fasKeamanan = fasKeamanan
    this.kapasitasCC = kapasitasCC
    this.fasKenyamanan = fasKenyamanan
  }
  //constructor
  Sedan.prototype = new Kendaraan()
  Sedan.prototype.constructor = Kendaraan
  
  Sedan.prototype.fasTambahan = function(){
    this.fasKeamanan = prompt('Masukkan Fasilitas Keamanan\t\t: ')
    this.kapasitasCC = prompt('Masukkan Kapasitas (dalam CC)\t: ')
    this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan\t: ')
  }
  
  Sedan.prototype.printFasTambahan = function(){
    console.log('Fasilitas Keamanan\t\t\t\t: ', this.fasKeamanan)
    console.log('Kapasitas (dalam CC)\t\t\t: ', this.kapasitasCC)
    console.log('Fasilitas Kenyamanan\t\t\t: ', this.fasKenyamanan)
  }
  
  Sedan.prototype.hitungPajak = function(){
    return (this.pajakKendaraan*1) + (this.pajakKendaraan * this.kapasitasCC * 0.00005)
  }
  
  //Bus mewarisi properti dari Kendaraan
  function Bus(kapPenumpang, kapBagasi){
    this.kapPenumpang = kapPenumpang
    this.kapBagasi = kapBagasi
  }
  
  //constructor
  Bus.prototype = new Kendaraan()
  Bus.prototype.constructor = Kendaraan
  
  Bus.prototype.fasTambahan = function(){
    this.kapPenumpang = prompt('Masukan Kapasitas Penumpang \t: ')
    this.kapBagasi    = prompt('Masukkan Kapasitas Bagasi(kg)\t: ')
  }
  
  Bus.prototype.printFasTambahan = function(){
    console.log('Kapasitas Penumpang \t\t\t: ', this.kapPenumpang)
    console.log('Kapasitas Bagasi    \t\t\t: ', this.kapBagasi)
  }
  
  Bus.prototype.hitungPajak = function(){
    return (this.pajakKendaraan*1) + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)
  }
  
  //Input data
  console.log('\n<===== INPUT DATA KENDARAAN=====>')
  console.log('\n1. Sedan')
  var obSedan = new Sedan()
  obSedan.inputAtribut()
  obSedan.fasTambahan()
  obSedan.hitungPajak()
  
  console.log('\n2. Bus')
  var obBus = new Bus()
  obBus.inputAtribut()
  obBus.fasTambahan()
  obBus.hitungPajak()
  
  //Output data
  console.log('\n<===== DATA SELURUH KENDARAAN =====>')
  console.log('\n1. Sedan')
  obSedan.print()
  console.log('\n2. Bus')
  obBus.print()
  