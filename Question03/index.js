const dataImported = require("./dados.json");

let maxValue = 0;
let minValue = 0;
let sumOfValues = 0;
let values = [];
let validDays = 0;
let daysWithMoreInvoice = 0;

for (let i = 0; i < dataImported.length; i++) {
    if(dataImported[i].valor != 0){
      if (i == 0) {
        maxValue = dataImported[i].valor;
        minValue = dataImported[i].valor;
        sumOfValues += dataImported[i].valor;
        validDays++;
        values.push(dataImported[i].valor);
        continue;
      }

      if (dataImported[i].valor < minValue) {
        minValue = dataImported[i].valor;
      }
    
      if(dataImported[i].valor > maxValue){
        maxValue = dataImported[i].valor;
      }

      validDays++;
  }

  values.push(dataImported[i].valor);
  sumOfValues += dataImported[i].valor;
}

let midiumValue = sumOfValues/validDays;

for (const value of values) {
    if(value > midiumValue){
        daysWithMoreInvoice++;
    }
}

console.log(`Lower invoice: ${minValue};\nHigher invoice: ${maxValue};\nHow many days in a month the invoice was higher the midium invoice: ${daysWithMoreInvoice}`);
