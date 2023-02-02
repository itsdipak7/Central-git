const convertBtn = document.getElementById("convertBtn");
const amountInput = document.getElementById("amount");
const fromSelect = document.getElementById("from");
const toSelect = document.getElementById("to");
const result = document.getElementById("result");

convertBtn.addEventListener("click", function() {

    const conversionRates = {
        USD: 1,
        EUR: 1.20,
        GBP: 1.35,
        INR: 82,
        AUD: 0.76,
        CAD: 0.80,
        SGD: 0.74,
        MYR: 0.24
    };

    function convertCurrency(amount, from, to) {
        return amount * (conversionRates[to] / conversionRates[from]);
    }


    const amount = amountInput.value;
    const from = fromSelect.value;
    const to = toSelect.value;
    const convertedAmount = convertCurrency(amount, from, to);
    console.log(amount + " " + from + " = " + convertedAmount + " " + to);
    result.textContent = amount + " " + from + " = " + convertedAmount + " " + to;


});