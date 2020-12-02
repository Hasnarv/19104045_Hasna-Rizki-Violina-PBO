class mean {
    constructor(nama = null, nilaiAsArray = []) {
        this.nama = nama
        this.nilai = nilaiAsArray
    }
    getMean() {
        // menambahkan semua nilai pada array
        var tambahSemua = this.sum(this.nilai)

        // dan bagi dengan jumlah data
        var hasil = Number(tambahSemua / this.nilai.length)

        console.log(this.nama + "rata rata nilai Anda adalah " + hasil);
    }
    // untuk menjumlahkan semua value pada array
    sum(input){
        if (toString.call(input) !== "[object Array]")
        return false;
      
        var total =  0;
        for(var i = 0; i < input.length; i++)
        {                  
            if(isNaN(input[i])){
            continue;
             }
              total += Number(input[i]);
        }
        return total;
    }
}
//Method untuk menanyakan inputan
function input(name) {
    return prompt("Masukan " + name)
}

var tanyaJumlahNilai = input("Jumlah nilai");

// Untuk masukan kedalam array
var nilai = []
for (let i = 0; i < tanyaJumlahNilai; i++) {
    nilai[i] = input("Nilai ke-" + (i + 1) )
}
// Untuk masukan kedalam class tadi lalu di proses
var app = new mean("Hasna Rizki Vioina, ", nilai)

// Untuk mencetak rata ratanya
app.getMean()