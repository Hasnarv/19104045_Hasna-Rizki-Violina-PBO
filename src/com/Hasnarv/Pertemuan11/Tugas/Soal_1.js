//Deklarasi dan inisialisasi atribut
var loop = true;
var idMahasiswa = [];
var mahasiswa = {};
var pil;
let idx = 0;

//Function untuk menampung data mahasiswa
function Mahasiswa(parName, parBirth, parNim, parProdi, parNilai) {
  var name = parName;
  var birth = parBirth;
  var nim = parNim;
  var prodi = parProdi;
  var nilai = parNilai;
  
  this.getName = function() {
    return name;
  }

  this.getNim = function() {
    return nim;
  }

  this.getBirth = function() {
    return birth;
  }

  this.getAge = function() {
    let year = birth.slice(birth.length - 4);
    return 2021 - year;
  }

  this.getProdi = function() {
    return prodi;
  }
  
  this.getNilai = function() {
    return nilai;
  }

  //Function untuk update nilai
  this.setNilai = function(newNilai) {
    nilai = newNilai;
  }
}

while (loop == true) {
  console.log("<============== Menu Penilaian ==============>");
  console.log("1. Tambah Mahasiswa");
  console.log("2. Penilaian");
  console.log("3. Lihat seluruh Mahasiswa");
  console.log("4. Keluar");
  menu = prompt("\nMasukan pilihan\t: ");

  //menentukan pilihan 
  switch (menu) {
    case '1':
      console.log("\n<===== Tambah Mahasiswa =====>");
      //Input
      let firstName = prompt("Input Nama \t: ");
      let birth = prompt("Input Tanggal Lahir\t: ");
      let nim = prompt("Input NIM\t: ");
      //Deklarasi prodi
      console.log("\n<=== Prodi");
      console.log("1. S1 SE");
      console.log("2. S1 IF");
      console.log("3. S1 SI");
      let prod = prompt("Masukan Pilihan Prodi\t: ");
      let prodi;
      if (prod == '1') {
        prodi = "S1 SE";
      } else if (prod == '2') {
        prodi = "S1 IF";
      } else if (prod == '3'){
        prodi = "S1 SI";
      } else{
        console.log("Tidak Ada Prodi")
      }

      //Inisialisasi parameter object dengan atribut sebelumnya 
      mahasiswa = new Mahasiswa(firstName, birth, nim, prodi);
      //Masukan object ke array
      idMahasiswa.push(mahasiswa);

      console.log("\n\n");
      break;

    case '2':
      //input data
      let niim = prompt("NIM Mahasiswa\t: ");
      let nilai = prompt("Masukan Nilai\t: ");

      let nilaii;
      if (nilai <= 100 && nilai >= 85) {
        nilaii = "A";
      
      } else if (nilai <= 84 && nilai >= 75) {
        nilaii = "B";
      
      } else if (nilai <= 74 && nilai >= 65) {
        nilaii = "BC";
      
      } else if (nilai <= 64 && nilai >= 55) {
        nilaii = "C";

      } else if (nilai <= 54 && nilai >= 45) {
        nilaii = "D";

      } else if (nilai <= 44 && nilai >= 0) {
        nilaii = "E";
      
      } else {
        nilaii = ">unknown<";
  
      }

      //memasukan data sesuai dengan elemen array
      for (let a in idMahasiswa) {
        if (idMahasiswa[a].getNim() == niim) {
          idMahasiswa[a].setNilai(nilaii);
        }
      }
      console.log("\n\n");
      break;

    case "3":
      //Output data
      for (let x in idMahasiswa) {
        console.log(`\nMahasiswa\: ${ idx }`);
        idx++;
        console.log(`Nama\t\t\t: ${ idMahasiswa[x].getName() }`);
        console.log(`Tanggal Lahir\t: ${ idMahasiswa[x].getBirth() }`);
        console.log(`Umur\t\t\t: ${ idMahasiswa[x].getAge() }`);
        console.log(`NIM\t\t\t\t: ${ idMahasiswa[x].getNim() }`);
        console.log(`Prodi\t\t\t: ${ idMahasiswa[x].getProdi() }`);
        console.log(`Nilai\t\t\t: ${ idMahasiswa[x].getNilai() }`);

      }
      console.log("\n\n");
      break;

    case '4':
      //mengakhiri program
      loop = false;
      console.log("Bye !!!");
      break;

    default:
      //jika input  tidak sesuai
      console.log("Mohon Masukan Pilihan Yang Sesuai");
      break;
  }
}