#variaveis globais
lista_produtos = []
codigoProduto = 0

#funçoes
def cadastrarPeca(codigo): #para cadastrar e armazenar as peças
    print("Voce selecionou a opção de cadastrar uma peça em nosso sistema")
    print("Codigo do produto: {}".format (codigo))
    nome = input("Entre com o NOME da peça: ")
    fabricante = input("Entre com o FABRICANTE da peça: ")
    preco = int(input("Entre com o PREÇO da peça: "))
    dicionarioProduto = {"codigo"     : codigo,
                         "nome"       : nome,
                         "fabricante" : fabricante,
                         "preço"      : preco}
    lista_produtos.append(dicionarioProduto.copy())


def consultarPeca(): #para consultar as peças
    print("Voce selecionou a opção de consultar uma peça em nosso sistema")
    while True:
        opçãoConsultar = (input("Qual ação deseja realizar? \n"+
    "1 - Consultar todas as Peça \n" +
    "2 - Consultar produto por codigo \n" +
    "3 - consultar produto(s) por fabricante \n " +
    "4 - Retornar\n "+
    ">> "))
        if opçãoConsultar == "1":
            print("Voce escolheu consultar todas as peças")
            for produto in lista_produtos: #produto vai varrer toda a lista de produtos
                 print("-----------------------------")
                 for key, value in produto.items():
                    print("{}: {}".format(key, value))
                 print("-----------------------------")
        elif opçãoConsultar == "2":
                print("Voce escolheu consultar por codigo")
                valorDesejado = int(input("Entre com o codigo desejado:"))
                for produto in lista_produtos:
                     if produto["codigo"] == valorDesejado: # o valor do campo codigo desse dicionario é igual o valor desejado
                        print("-----------------------------")
                        for key, value in produto.items():
                            print("{}: {}".format(key, value))
                        print("-----------------------------")
        elif opçãoConsultar == "3":
                print("Voce escolheu consultar por fabricante")
                valorDesejado = input("Entre com o fabricante desejado:")
                for produto in lista_produtos:
                     if produto["fabricante"] == valorDesejado: # o valor do campo fabricante desse dicionario é igual o valor desejado
                        print("-----------------------------")
                        for key, value in produto.items():
                            print("{}: {}".format(key, value))
                        print("-----------------------------")
        elif opçãoConsultar == "4":
                print("Voce escolheu voltar ao menu principal")
                return # sai da função de consultar peças e volta ao main
        else:
            print("opção invalida, digite uma opção valida.")
            continue #volta para o inicio do laço




def removerPeca(): #para remover as peças
    print("Voce selecionou a opção de remover uma peça de nosso sistema")
    valorDesejado = int(input("Entre com o codigo do produto que deseja remover: "))
    for produto in lista_produtos:
         if produto["codigo"] == valorDesejado:
              lista_produtos.remove(produto)
              print("Produto removido")


# programa principal


print("Sistema de estoque da bicicletaria de Beatriz Silva Antunes")
while True:


    opçãoPrincipal = (input("Qual ação deseja realizar? \n"+
    "1 - Cadastrar Peça \n" +
"2 - Consultar Peça \n" +
"3 - Remover Peça \n " +
"4 - Sair"))
    if opçãoPrincipal == "1":
        codigoProduto = codigoProduto + 1
        cadastrarPeca(codigoProduto)
    elif opçãoPrincipal == "2":
        consultarPeca()
    elif opçãoPrincipal == "3":
        removerPeca()
    elif opçãoPrincipal == "4":
        print("Encerrando programa...")
        break # encerra o laço
    else:
        print("opção invalida, digite uma opção valida.")
        continue #volta para o inicio do laço