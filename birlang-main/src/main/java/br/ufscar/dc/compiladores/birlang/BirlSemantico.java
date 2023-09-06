package br.ufscar.dc.compiladores.birlang;
import br.ufscar.dc.compiladores.birl.BirlBaseVisitor;
import br.ufscar.dc.compiladores.birl.BirlParser;
import br.ufscar.dc.compiladores.birlang.BirlUtils.BirlType;


public class BirlSemantico extends BirlBaseVisitor<Void> {

    // Main visitor
    @Override
    public Void visitProgram(BirlParser.ProgramContext ctx) {

        visitBody(ctx.body());
        return null;
    }

    @Override
    public Void visitBody(BirlParser.BodyContext ctx) {

        if (ctx.info() != null) {
            visitInfo(ctx.info());
        }

        if (ctx.bloco_daily().size() > 0) {
            for (var b : ctx.bloco_daily()) {
                visitBloco_daily(b);
            }
        }
        return null;
    }


    @Override
    public Void visitInfo(BirlParser.InfoContext ctx) {
        if (ctx.NOME(1) == null) {
            // Não foi encontrado um dia da semana
            BirlType.adicionarErroSemantico(ctx.stop, "Dia da semana nulo próximo a: " + ctx.stop.getText());
        } else {
            // Um dia da semana foi encontrado
            String diaSemana = ctx.NOME(1).getText();
            
            // Remova as aspas duplas no início e no fim, se presentes
            diaSemana = diaSemana.replaceAll("^\"|\"$", "");
            
            // Faça a verificação se diaSemana é válido aqui
            if (ehDiaDaSemanaValido(diaSemana)) {
                // É um dia da semana válido
            } else {
                BirlType.adicionarErroSemantico(ctx.stop, "Dia da semana inválido próximo a: " + ctx.stop.getText());
            }
        }
    
        return null;
    }
    
    // Função para verificar se uma string representa um dia da semana válido
    private boolean ehDiaDaSemanaValido(String diaSemana) {
        String[] diasValidos = {"Segunda", "segunda", "Segunda-feira", "segunda-feira",
        "Terça", "terça", "Terça-feira", "terça-feira",
        "Quarta", "quarta", "Quarta-feira", "quarta-feira",
        "Quinta", "quinta", "Quinta-feira", "quinta-feira",
        "Sexta", "sexta", "Sexta-feira", "sexta-feira",
        "Sábado", "sábado","Domingo", "domingo"};
        for (String dia : diasValidos) {
            if (diaSemana.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Void visitBloco_daily(BirlParser.Bloco_dailyContext ctx) {

        if (ctx.PERIODO_DIA() == null) {
            // add error
            BirlType.adicionarErroSemantico(ctx.stop, " periodo do dia nao definido proximo a: "+ctx.stop.getText());
        } else if (ctx.daily() != null) {
            for (var t : ctx.daily()) {
                if (t.NOME_ATV() == null ||
                t.NUMINT().size() < 2) {
                    // add error
                    BirlType.adicionarErroSemantico(ctx.stop, " daily definido de maneira incorreta proximo a: "+ctx.stop.getText());
                }
            }
        }
        int horas = -1; // Valor padrão para horas
        int minutos = -1; // Valor padrão para minutos
        
        for (var t : ctx.daily()) {
            var numIntList = t.NUMINT();
        
            if (numIntList.size() == 2) {
                horas = Integer.parseInt(numIntList.get(0).getText());
                minutos = Integer.parseInt(numIntList.get(1).getText());
        
                // Validação para horas
                if (horas < 0 || horas > 23) {
                    BirlType.adicionarErroSemantico(numIntList.get(0).getSymbol(), "Valor de horas inválido: " + horas);
                }
        
                // Validação para minutos
                if (minutos < 0 || minutos > 59) {
                    BirlType.adicionarErroSemantico(numIntList.get(1).getSymbol(), "Valor de minutos inválido: " + minutos);
                }
            } else {
                BirlType.adicionarErroSemantico(t.getStart(), "Deve haver dois números inteiros.");
            }
        }

        return null;
    }
}
