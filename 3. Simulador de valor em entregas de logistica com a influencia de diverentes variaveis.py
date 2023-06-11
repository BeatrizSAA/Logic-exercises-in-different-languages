#cabeçalho da empresa
print("Bem vindo a companhia de logistica de Beatriz Silva Antunes")
print("Trabalhamos com um sistema que calcula um valor personalizado de acordo com as especificações de sua entrega")

#pré definições

def dimensoesObjeto(): #calculando o volume da mercadoria em centimetros cubicos
    while True:
     try:
      comprimento = int(input("Digite o comprimento do objeto (em cm): "))
      altura = int(input("Digite a altura do objeto (em cm): "))
      largura = int(input("Digite a largura do objeto (em cm): "))
      volume = int(comprimento * altura * largura)
     except ValueError: #caso digite uma letra ou valor invalido, dará a seguinte mensagem:
         print ("valor invalido. Digite apenas numeros")
         continue

     if ( volume < 1000): #calculo de relação preço/volume
       valorCaixa = 10
     elif (volume >= 1000) and (volume < 10000):
       valorCaixa = 20
     elif (volume >= 10000) and (volume < 30000):
       valorCaixa = 30
     elif (volume >=30000) and (volume < 100000):
       valorCaixa = 50
     else: # caso o objeto seja maior que o suportado
       print("Não trabalhamos com este tamanho de objeto")
       continue
     return(valorCaixa) 
    
def pesoObjeto(): #calculo da relação entre o valor e o peso do bjeto
  while True:
     try:
       peso = int(input("Digite o peso (em kg) de seu objeto:"))
     except ValueError: #caso digite uma letra, dará a seguinte mensagem
         print ("valor invalido. Digite apenas numeros")
         continue

     if ( peso < 0.1):
       valorPeso = (peso * 1)
     elif (peso >= 0.1) and (peso < 1):
       valorPeso = (peso * 1.5)
     elif (peso >= 1) and (peso < 10):
       valorPeso = (peso * 2)
     elif (peso >= 10) and (peso < 30):
      valorPeso = (peso * 3)
     else:  #caso o objeto seja muito pesado para transporte
       print("Não trabalhamos com este peso de objeto")
       continue
     return (valorPeso) 
       
def rotaObjeto():# relação entre o valor e a rota do objeto
  while True:
    print("Qual rota voce gostaria que seu objeto seguisse?")
    rota = input("RS - De Rio de Janeiro até São Paulo \n" +
                 "SR - De São Paulo até Rio de Janeiro  \n" +
                 "BS - De Brasília até São Paulo  \n" +
                 "SB - De São Paulo até Brasília  \n" +
                 "BR - De Brasília até Rio de Janeiro  \n" +
                 "RB - Rio de Janeiro até Brasília \n" +
                ">> ")
    if rota == "RS":
      return 1 
    elif rota == "SR":
      return 1 
    elif rota == "BS":
      return 1.2
    elif rota == "SB":
      return 1.2
    elif rota == "BR":
      return 1.5
    elif rota == "RB":
      return 1.5
    else: #caso a rota seja inexistente
      print("rota não encontrada, tente novamente")
      continue

#variaveis para chamar as funções
precoCaixa = dimensoesObjeto()
precoPeso = pesoObjeto()
precoRota = rotaObjeto()

#impressão dos valores

print("O valor de sua caixa é R$ {}".format(precoCaixa))
print("O valor de seu peso é R$ {}".format(precoPeso))
print("O multiplicador de sua rota é {}".format(precoRota))

total = (precoCaixa * precoPeso * precoRota)
print("O valor total de seu transporte é R${}".format(total))