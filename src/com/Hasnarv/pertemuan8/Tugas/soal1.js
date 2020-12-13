// deklarasi dan inisialisasi atribut
var loop = true;
var idMahasiswa = [];
var mahasiswa = {};
var menu;
let idx = 0;

//function untuk menampung data mahasiswa
function Mahasiswa(firstName, birth, nim, prodi, nilai) {
  this.firstName = firstName;

  this.fullName = function() {
    return this.firstName + " "
  };

  this.birth = birth;
  this.nim = nim;

  this.age = function() {
    let year = this.birth.slice(this.birth.length - 4)
    return 2020 - year
  };

  this.prodi = prodi;
  this.nilai = nilai;
}

//Ini untuk Output Program
while (loop == true) {
  console.log("<============== Menu Penilaian ==============>");
  console.log("1. Tambah Mahasiswa");
  console.log("2. Penilaian");
  console.log("3. Lihat seluruh Mahasiswa");
  console.log("4. Keluar");
  menu = prompt("\nMasukan pilihan\t: ");

  // Ini untuk menentukan fungsi program 
  switch (menu) {
    case '1':
      console.log("\n<===== Tambah Mahasiswa =====>");
      //  input
      let firstName = prompt("Input Nama \t: ");
      let birth = prompt("Input Tanggal Lahir\t: ");
      let nim = prompt("Input NIM\t: ");
      // deklarasi prodi
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

      //ini untuk inisialisasi parameter object dengan atribut sebelumnya 
      mahasiswa = new Mahasiswa(firstName, birth, nim, prodi);
      //masukan object ke array
      idMahasiswa.push(mahasiswa);

      console.log("\n\n");
      break;

    case '2':
      console.log("\n<===== Penilaian =====>");

      //input data
      let niim = prompt("NIM Mahasiswa\t: ");
      let nilai = prompt("Masukan Nilai\t: ");

      let predikat;
      if (nilai <= 100 && nilai >= 80) {
        predikat = "A";

      } else if (nilai < 80 && nilai >= 60) {
        predikat = "B";

      } else if (nilai < 60 && nilai >= 40) {
        predikat = "C";

      } else if (nilai < 40 && nilai >= 0) {
        predikat = "D";

      } else {
        predikat = ">unknown<";

      }

      //untuk masukan data disesuaikan dengan elemen array
      for (let a in idMahasiswa) {
        if (idMahasiswa[a].nim == niim) {
          idMahasiswa[a].nilai = predikat;
        }
      }
      console.log("\n\n");
      break;

    case "3":
      //output data
      for (let x in idMahasiswa) {
        console.log(`\nMahasiswa\: ${idx}`);
        idx++;
        console.log(`Nama\t\t\t: ${idMahasiswa[x].fullName()}`);
        console.log(`Tanggal Lahir\t: ${idMahasiswa[x].birth}`);
        console.log(`Umur\t\t\t: ${idMahasiswa[x].age()}`);
        console.log(`NIM\t\t\t\t: ${idMahasiswa[x].nim}`);
        console.log(`Prodi\t\t\t: ${idMahasiswa[x].prodi}`);
        console.log(`Nilai\t\t\t: ${idMahasiswa[x].nilai}`);

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