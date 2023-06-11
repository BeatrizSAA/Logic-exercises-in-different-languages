* Note: the codes and images have not yet been translated into english, but will be soon.

print("Bem vindo ao bea's lanche - lanchonete de Beatriz Silva Antunes")
print("******************CARDAPIO*****************")
print("| Codigo |       Descrição       |  Valor |")
print("|   100  |    Cachorro Quente    |  09,00 |")
print("|   101  | Cachorro Quente duplo |  11,00 |")
print("|   102  |         X-Egg         |  12,00 |")
print("|   103  |        X-Salada       |  13,00 |")
print("|   104  |        X-Bacon        |  14,00 |")
print("|   105  |         X-Tudo        |  17,00 |")
print("|   200  |     Refri de Lata     |  05,00 |")
print("|   201  |       Chá Gelado      |  04,00 |")
print("|  sair  |    Cancelar Pedido    |        |")
print("*******************************************")

valorTotal = 0 #variavel que calculará o valor total dos pedidos

while True:
    codProduto = input("Digite o codigo do seu pedido: ") #inicio do atendimento

    if codProduto == "100": #opção de pedido
        print("Voce selecionou o Cachorro Quente")
        valorTotal = valorTotal + 09.00

    elif codProduto == "101":#opção de pedido
        print("Voce selecionou o Cachorro Quente duplo")
        valorTotal = valorTotal + 11.00

    elif codProduto == "102":#opção de pedido
        print("Voce selecionou o X-Egg")
        valorTotal = valorTotal + 12.00

    elif codProduto == "103": #opção de pedido
        print("Voce selecionou o X-Salada")
        valorTotal = valorTotal + 13.00
    
    elif codProduto == "104": #opção de pedido
        print("Voce selecionou o X-Bacon")
        valorTotal = valorTotal + 14.00
    
    elif codProduto == "105": #opção de pedido
        print("Voce selecionou o X-Tudo")
        valorTotal = valorTotal + 17.00
    
    elif codProduto == "200": #opção de pedido
        print("Voce selecionou o Refri de Lata")
        valorTotal = valorTotal + 05.00

    elif codProduto == "201": #opção de pedido
        print("Voce selecionou o Cha Gelado")
        valorTotal = valorTotal + 04.00

    elif codProduto == "sair": # opção caso o cliente decida cancelar seu pedido
        print("Pedido cancelado")
        break

    else: #contenção caso o cliente digite um codigo errado
        print ("Opção invalida, Digite outro codigo")
        continue
    
    pedir_mais = input("Deseja mais alguma coisa? (sim/não)") #opção para o cliente realizar mais de um pedido
    if pedir_mais == "sim":
        continue
    else: #pedido concluido, valor total a pagar:
        print("Valor total a ser pago: R${:.2f}".format(valorTotal))
        break


        





    

    
