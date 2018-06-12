const myArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15];

let sum = 0;
for(let n of myArray) {
    if(n%2===1) {
        sum += n * 2;
    }
}
console.log(sum);

