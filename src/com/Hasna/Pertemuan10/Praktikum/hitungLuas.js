function PersegiPanjang(panjang, lebar){
    this.panjang = panjang
    this.lebar = lebar
  }
  
  PersegiPanjang.prototype.getLuas = function(){
    var luas = this.panjang * this.lebar
    console.log('Luas : ', this.panjang, 'x ', this.lebar, ': ', luas)
  }
  
  PersegiPanjang.prototype.print = function(){
    console.log('Penjang Sisi\t: ', this.panjang)
    console.log('Lebar Sisi\t\t: ', this.lebar)
  }
  
  function Persegi(sisi){
    this.panjang = sisi
    this.lebar = sisi
  }
  
  Persegi.prototype = new PersegiPanjang()
  Persegi.prototype.constructor = PersegiPanjang
  
  Persegi.prototype.print = function(){
    console.log('Panjang Sisi\t: ', this.panjang)
  }
  
  console.log('Persegi Panjang')
  var obPersegiPanjang = new PersegiPanjang(
    prompt('Masukkan Panjang\t: '),
    prompt('Masukkan Lebar\t\t: ')
  )
  
  console.log('\nPersegi')
  var obPersegi = new Persegi(
    prompt('Masukkan Panjang sisi')
  )
  
  console.log('\n\nMenghitung luas persegi panjang')
  obPersegiPanjang.print()
  obPersegiPanjang.getLuas()
  
  console.log('\nManghitung luas persegi')
  obPersegi.print()
  obPersegi.getLuas()