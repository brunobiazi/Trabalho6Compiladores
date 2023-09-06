grammar Birl;

/* sintático */

program:
body EOF;

body: info (bloco_daily)*;

info:
'nome: ' NOME
'dia da semana: ' NOME
'estilo: ' MODO
'data: ' DATA
;


bloco_daily:  'ROTINA'
'periodo: ' PERIODO_DIA
(daily)+
'END_ROTINA' ;

daily: NOME_ATV ':' NUMINT 'horas e ' NUMINT ' minutos' ;


/* -------------------- LEXICO ------------*/

PERIODO_DIA : 'Matutino' | 'Vespertino' | 'Noturno';

NOME : '"' ( ~('"'|'\\'|'\n'|'\r') )* '"';

MODO : 'Trabalho' | 'Férias' | 'Projetinho' | 'Estudos' | 'Família' 
| 'Atividades ao Ar Livre' | 'Cuidados Pessoais' | 'Lazer' | 'Viagem' | 'Hobbies' | 'Exercícios Físicos' | 'Social' | 'Aprendizado Online'
 | 'Trabalho Remoto' | 'Projetos de Casa' ;


NUMINT	: ('+'|'-')?('0'..'9')+
	;

NUMINTPOS : ('0'..'9')+
	;

DATA : NUMINTPOS'/'NUMINTPOS'/'NUMINTPOS;

TIPO: 'periodo:';

NOME_ATV :   'acordar' 
    | 'tomar café da manhã'
    | 'ir para o trabalho'
    | 'reunião de equipe'
    | 'almoçar'
    | 'trabalhar'
    | 'pausa para o café'
    | 'continuar o trabalho'
    | 'voltar para casa'
    | 'jantar'
    | 'exercício'
    | 'estudar'
    | 'relaxar'
    | 'assistir TV'
    | 'ler'
    | 'dormir'
    | 'outras atividades'
    | 'fazer compras'
    | 'visitar amigos'
    | 'praticar esportes'
    | 'cozinhar'
    | 'limpar a casa'
    | 'passear com o cachorro'
    | 'ouvir música'
    | 'viajar'
    | 'trabalhar em projetos pessoais'
    | 'fazer exercícios de meditação'
    | 'aprender uma nova habilidade'
    | 'participar de eventos sociais'
    | 'preparar um churrasco'
    | 'fazer um piquenique'
    ;


fragment
ESC_SEQ	: '\\\'';
COMENTARIO
    :   '%' ~('\n'|'\r')* '\r'? '\n' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;





