from suds.client import Client
url = "http://localhost:10000/calculafatorial?wsdl"  
client = Client(url)
num = input("Digite um número para o calulo de seu fatorial: ")
response= client.service.fatorial(num)
print("O fatorial do número", num, "é:",response)

