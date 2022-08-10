
function shiftToRight(value, power){
    // console.log("power:" + power);
    // console.log("value:" + value);
    if(power == 1){
        return Math.floor(value/2);
    }
    else{
        value = Math.floor(value/2);
    }
    return shiftToRight(value, power-1);
}

console.log(shiftToRight(80, 3));
console.log(shiftToRight(-24, 2));
console.log(shiftToRight(-5, 1));
console.log(shiftToRight(4666, 6));
console.log(shiftToRight(3777, 6));
console.log(shiftToRight(-512, 10));
