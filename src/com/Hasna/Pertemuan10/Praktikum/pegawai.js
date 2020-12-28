//objek kendaraan
var Pegawai = {
    inputData: function(nip, nama, alamat, gajiPokok) {
      this.nip = prompt('Masukkan NIP\t\t:'),
      this.nama = prompt('Masukkan Nama\t\t: '),
      this.alamat = prompt('Masukkan Alamat\t\t: '),
      this.gajiPokok = prompt('Masukkan Gaji Pokok\t: ')
    },
  
    inputTunjangan: function(tunjangan){
      this.tunjangan = prompt('Masukkan Tunjangan\t: ')
    },
  
    print: function(){
      console.log('NIP\t\t\t: ', this.nip)
      console.log('Nama\t\t: ', this.nama)
      console.log('Alamat\t\t: ', this.alamat)
      console.log('Gaji Pokok\t: ', this.gajiPokok)
      console.log('Tunjangan\t: ', this.tunjangan)
      console.log('Total Gaji\t: ',((this.gajiPokok * 1) + (this.tunjangan)))
    }
  }
  
  //objek satpam dibuat berdasarkan objek pegawai
  var Satpam = Object.create(Pegawai)
  //meredefinisi method inputTunjangan yang ada di objek Pegawai
  Satpam.inputTunjangan = function(){
    jam = prompt('Masukkan Jumlah Jam Lembur\t: ')
    this.tunjangan = jam * 10000
  }
  
  //objek sales dibuat berdasarkan objek pegawai
  var Sales = Object.create(Pegawai)
  Sales.inputTunjangan = function(tunjangan){
    jmlPelanggan = prompt('Masukkan jumlah pelanggan yang direkrut\t: ')
    this.tunjangan = jmlPelanggan * 50000
  }
  
  //objek manajer dibuat berdasarkan objek pegawai
  var Manager = Object.create(Pegawai)
  Manager.inputTunjangan = function(tunjangan) {
    thMasuk = prompt('Masukkan Tahun Masuk\t: ')
    lamaKerja = 2020 - thMasuk
  
    if(lamaKerja <= 3){
      this.tunjangan = 5/100 * this.gajiPokok
    }else{
      this.tunjangan = 10/100 * this.gajiPokok
    }
  }
  
  //Input data
  console.log('Data Pegawai PT ABC \n1.Satpam')
  Satpam.inputData()
  Satpam.inputTunjangan()
  
  console.log('\n2. Sales')
  Sales.inputData()
  Sales.inputTunjangan()
  
  console.log('\n3. Manager')
  Manager.inputData()
  Manager.inputTunjangan()
  
  //Output data
  console.log('\n========== Hasil Input Pegawai ==========\n')
  console.log('1. Data Satpam')
  Satpam.print()
  console.log('1. Data Sales')
  Sales.print()
  console.log('3. Data Manager')
  Manager.print()
  