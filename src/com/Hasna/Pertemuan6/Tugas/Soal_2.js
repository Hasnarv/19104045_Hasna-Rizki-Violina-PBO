//inisialisasi variable
var f1 = 0
var f2 = 1

//output
console.log('Bilangan Fibonacci\t: ')
//perulangan 15 deret bilangan fibonacci
for(var i = 0; i < 15; i++){
    console.log(f1 + ', ')
    /*bilangan fibonacci didapat dari penjumlahan 
    suatu bilangan dengan bilangan selanjutnya
    */
    fib = f1 + f2
    f1 = f2
    f2 = fib
}