const myArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15];

const _odd = n => n % 2 === 1;
const _double = n => n * 2;
const _sum = (n,acc) => acc + n;

const sum = myArray
    .filter(_odd)
    .map(_double)
    .reduce(_sum);

console.log(sum);

