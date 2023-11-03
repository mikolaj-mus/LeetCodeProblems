/**
 * @param {string[]} words
 * @return {string}
 */
var oddString = function(words) {

    const final = [];
    const arr = [];
    let value = 0;
    

    for(let i = 0; i < words.length; i++) {
        const temp = [];
        for (let j = 1; j < words[i].length; j++) {
            value = words[i][j].charCodeAt(0) - words[i][j-1].charCodeAt(0);         
            temp.push(value);
        }
        let val = 0;
        for(let i = 0; i < temp.length; i++) {
            val += temp[i] * (i + 1) * (i + 1);
        }

        final.push(val);
    }
    console.log(final);
    
    for(let i = 0; i < final.length; i++) {
        if(elementCount(final, final[i]) === 1) return words[i];
    }
};

function elementCount(arr, element){
 return arr.filter((currentElement) => currentElement == element).length;
};