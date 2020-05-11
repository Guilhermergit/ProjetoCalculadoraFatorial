const soap = require("soap")
const url = "http://localhost:10000/calculafatorial?wsdl"
const num = { num: "10" }
soap.createClient(url, function (err, client) {
 client.fatorial(num, function (err, result) {
   console.log('O fatorial do número', num, ' é: ' , result)
 })
})