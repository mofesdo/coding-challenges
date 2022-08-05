
function repeat(string,times){
    if(times>268435440){
        times=268435440;
    }
    if(times==0){
        return "";
    }
    let multiplier=Math.floor(Math.log2(times)); //amount of 2 to the power of 'multiplier' that fits in times
    if(multiplier==0){
        return string;
    }
    let str=string;
    for(i=0;i<multiplier;i++){//repeat by doubling each time
        string+=string;
    }
    return repeat(str,times-Math.pow(2,multiplier))+string; //recurse with remainning times
   
}
console.log(repeat("a",268435437).length);