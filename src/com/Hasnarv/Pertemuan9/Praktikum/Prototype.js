function Mahasiswa(nim,nama,prodi){
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;

    //fungsi untuk menampilkan
    this.tampil = function(){
        console.log('NIM : ',this.nim)
        console.log('Nama : ',this.nama)
        console.log('Prodi : ',this.prodi)
    }
}

let jmlMhs = prompt('Masukkan jumlah mahasiswa : ')

//array mahasiswa
var arrayMhs = []

//objek mahasiswa
var mhs = {}

for(let i=1;i<=jmlMhs;i++){
    console.log(`\nMahasiswa ke-${i}`)

    //buat objek mahasiswa
    mhs = new Mahasiswa(
        prompt('Masukan NIM : '),
        prompt('Masukkan Nama : '),
        prompt('Masukkan Prodi : ')
    )

    arrayMhs.push(mhs)
}

var editData = prompt('Ingin mengubah data? [ya/tidak] : ')

if(editData == 'ya'){
    var noMhs = prompt('Masukkan no urut mahasiswa : ')

    //tambah fungsi baru ke constructor
    Mahasiswa.prototype.editData = function(){
        prompt('Masukan NIM : '),
        prompt('Masukkan Nama : '),
        prompt('Masukkan Prodi : '),
        tampil = this.tampil
        return {nim,nama,prodi,tampil}
    }

    let index = noMhs-1
    arrayMhs[index] = arrayMhs[index].edit()

    console.log('\nData setelah diubah')
    index = 1

    for(let i in arrayMhs){
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[index].tampil()
    }
}else if(editData =='Tidak'){
    console.log('\nData setelah diubah')
    index = 1

    for(let i in arrayMhs){
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[index].tampil()
    }
}else{
    console.log('Pilihan tidak sesuai')
}