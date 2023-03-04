const dataImported = require("./dados.json");

const valuesArray = dataImported.map((key)=> key.value);
let sumValues = 0;

for (const value of valuesArray) {
    sumValues += value
}

for (const keys of dataImported) {
    const value = (keys.value/sumValues)*100
    console.log(`The state ${keys.state} represents ${value.toFixed(2)}% of the invoice;`);
}
