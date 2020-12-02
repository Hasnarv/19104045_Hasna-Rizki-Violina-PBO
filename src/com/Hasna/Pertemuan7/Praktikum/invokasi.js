//contoh 1
function myFunction(a, b, c){
    console.log("Hello, my name is ", a)
    console.log("I'm ", b, " yeard old")
    console.log("I like ", c)
}

console.log("\nOutput Contoh 1")
//melakukan invokasi fungsi
myFunction("Hasna Rizkiv", 19, "Swimming")

//contoh 2
function myFunction2(arg1, arg2){
    this.firstName = arg1
    this.lastName = arg2
}

//membuat objek dari fungsi myfunction
var x = new myFunction2("Lala", "Yeyeye")

console.log("\nOutput Contoh 2")
/*memanggil fungsi dari properti 
yang ada didalam fungsi*/
x.firstName