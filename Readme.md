
/*
exercicio 13
serializacion2
Utilizando  a serializacion de obxectos e partindo do array seguinte:
String[] cod={"p1","p2","p3"};
String[] desc ={"parafusos","cravos ","tachas"};
int[] prezo ={3,4,5};

Crea tres obxectos tipo product ( esta clase xa a tes feita nun exercicio anterior (productStream) e almacenaos nun ficheiro secuencial binario (FileOutputStream) utilizando os metodos adecuados da clase ObjectOutputStream

O obxectivo coma sempre e que despois de escritos podas leelos dende dito ficheiro e imprimilos . Facer este exercicio utilizando o bucle while para ler os obxectos almacenados
suponse que non sabemos cantos obxectos hai almacenados .

nota : o  metodo close() do ObjectOutputStream  non mete un null cando se executa dito metodo polo que se uso un  bucle while para lelo ata o final  non teño forma de saber onde remata, dandome o erro "/Exception during deserialization: java.io.EOFException "
O que podemos facer e gardar un null xusto antes de lanzar o close(()  deste xeito
cando lea os obxectos podo preguntar se o obxecto lido e un  null para deter o bucle de lectura.
(outra cousa que podemos facer e usar o metodo available() para ver canto queda por ler do ficheiro, se non queda nada rematamos e xa esta . pero CUIDADO : o metodo available() da clase ObjectInputStream non devolve o numero de bytes que quedan por ler senon o numero de bytes bloqueados , pero podemos usar o metodo available() da clase File InputStream porque ao fin e ao cabo ObjectInputStream esta  lendo os obxectos serializados  a traves de dita clase.)
 
