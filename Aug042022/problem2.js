
function repeat(string,times){
    let str = '';
    if(times > 0){
        let count = times;
        if(times>268435440){
            count=268435440;
        }
        while(count > 1){
            if(count & 1){
                str += string;
            }
            count >>= 1;
            string += string;
        }
        str += string   
    }
   return str;
}
console.log(repeat("a",268435441).length);