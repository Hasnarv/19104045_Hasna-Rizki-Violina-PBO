var data = {
    value : function(num) {
        return this.nilai + num
    }
}

var value2 = {
    nilai: "Nilai\t\t\t: "
}

console.log(data.value.apply(value2, ["5, 6, 2, 3, 7"]))

var data2 = {
    minMax: function(){
        return this.nilaiMax + Math.max(5, 6, 2, 3, 7) + "\n" + 
        this.nilaiMin + Math.min(5, 6, 2, 3, 7)
    }
}

var minMax2 = {
    nilaiMax: "Nilai Tertinggi\t: " ,
    nilaiMin: "Nilai Terendah\t: "
}

console.log(data2.minMax.apply(minMax2))
