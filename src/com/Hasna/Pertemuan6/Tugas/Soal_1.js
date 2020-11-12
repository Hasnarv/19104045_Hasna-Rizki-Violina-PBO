console.log('Bilangan prima antara 1-50\t: ')
//perulangan deret bilangan prima antara 1-50
for(var a = 0; a < 50; a++){
    var i = 0
    for(b = 0; b < 50; b++){
        //jika hasil bagi a oleh b adalah 0
        if(a % b == 0){
            i++
        }
    }
    //cetak output mulai dari 2
    if((i == 2) && (a != 1)){
        console.log(a + ', ')
    }
}
