/**
 * @param {number[]} target
 * @param {number} n
 * @return {string[]}
 */
var buildArray = function(target, n) {
    
    const tab = [];
    const words = [];
    for(let i = 1; i <= n; i++) {
        tab.push(i);
        words.push("Push");
        if (tab.join(",") === target.join(",")){
          return words;  
        } else if (!target.includes(i)) {
            tab.pop();
            words.push("Pop");
        }
    }
    return words;
};