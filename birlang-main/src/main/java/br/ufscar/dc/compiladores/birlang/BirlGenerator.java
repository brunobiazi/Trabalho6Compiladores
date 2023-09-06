package br.ufscar.dc.compiladores.birlang;

import br.ufscar.dc.compiladores.birl.BirlBaseVisitor;
import br.ufscar.dc.compiladores.birl.BirlParser;
import br.ufscar.dc.compiladores.birlang.BirlUtils.BirlType;

public class BirlGenerator extends BirlBaseVisitor<Void> {
    StringBuilder out;

    // Constructor
    public BirlGenerator() {
        this.out = new StringBuilder();
    }

    // Main visitor
    @Override
    public Void visitProgram(BirlParser.ProgramContext ctx) {

        // Declaring libs
        //out.append("#include <stdio.h>\n");
        out.append("<html>\n" +
                "    <head>\n" +
                "        <title>Rotina</title>\n" +
                "        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n" +
                "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n" +
                "<link href=\"https://fonts.googleapis.com/css2?family=Inconsolata:wght@500&display=swap\" rel=\"stylesheet\">\n" +
                "        <style>\n" +
                "            body {\n" +
                "                background-color: #171714;\n" +
                "                font-family: Inconsolata,monospace;\n" +
                "                letter-spacing: 0!important;\n" +
                "                color: white;\n" +
                "            }\n" +
                "            #page-container {\n" +
                "                padding: 10px;\n" +
                "            }\n" +
                "            .info, .daily-info {\n" +
                "                padding: 5px;\n" +
                "            }\n" +
                "            .info-title, .routine-title {\n" +
                "                color: #ff69b4;\n" +
                "            }\n" +
                "            .routine-title {\n" +
                "                margin-bottom: 5px;\n" +
                "            }\n" +
                "            .routine-info,  .type-title {\n" +
                "                color: #008000;\n" +
                "            }\n" +
                "            .info-value, .routine-value, .type-value {\n" +
                "                color: #fffbec;\n" +
                "            }\n" +
                "\n" +
                "            #daily-container {\n" +
                "                margin-top: 30px;\n" +
                "            }\n" +
                "\n" +
                "            .routine-info {\n" +
                "                margin-left: 20px;\n" +
                "            }\n" +
                "\n" +
                "            .exercicio {\n" +
                "                margin-top: 10px;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"page-container\">\n" +
                "            <div id=\"info-container\">\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Nome</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>");


        visitBody(ctx.body());

        out.append("        </div>\n" +
                "    </body>\n" +
                "</html>");

        return null;
    }

    @Override
    public Void visitBody(BirlParser.BodyContext ctx) {

        if (ctx.info() != null) {
            visitInfo(ctx.info());
        }

        if (ctx.bloco_daily().size() > 0) {

            out.append("            <div id=\"daily-container\">\n" +
                    "                <div class=\"daily\">");

            for (var b : ctx.bloco_daily()) {
                visitBloco_daily(b);
            }

            out.append("                </div>\n" +
                    "            </div>");
        }
        return null;
    }

    @Override
    public Void visitInfo(BirlParser.InfoContext ctx) {

        out.append("                    <span class=\"info-value\">"+ctx.NOME(0).getText()+"</span>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Dia da semana</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n" +
                "                    <span class=\"info-value\">"+ctx.NOME(1).getText()+"</span>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Tipo da rotina</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n" +
                "                    <span class=\"info-value\">"+ctx.MODO().getText()+"</span>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <span class=\"info-title\"><strong>Data</strong>&nbsp;&nbsp;</span>\n" +
                "                    <span class=\"info-value\">"+ctx.DATA().getText()+"</span>\n" +
                "                </div>\n" +
                "            </div>");

        return null;
    }

    @Override
    public Void visitBloco_daily(BirlParser.Bloco_dailyContext ctx) {

        out.append("            <div id=\"daily-container\">\n" +
                "                <div class=\"daily\">");

        out.append("                    <div class=\"tipo\">\n" +
                "                        <div class=\"daily-info\">\n" +
                "                            <span class=\"type-title\"><strong>Período do dia</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n" +
                "                            <span class=\"type-value\">"+ctx.PERIODO_DIA().getText()+"</span>\n" +
                "                        </div>\n" +
                "                    </div>");

        if (ctx.daily().size() > 0) {

            for (var t: ctx.daily()) {
                out.append("                    <div class=\"exercicio\">\n" +
                        "                        <div class=\"daily-info\">\n" +
                        "                            <span class=\"routine-title\">\n" +
                        "                                <strong>"+t.NOME_ATV().getText()+"</strong>\n" +
                        "                            </span>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"daily-info\">\n" +
                        "                            <span class=\"routine-info\">\n" +
                        "                                <strong>horas</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                            </span>\n" +
                        "                            <span class=\"routine-value\">"+t.NUMINT(0).getText()+"</span>\n" +
                        "                        </div>\n" +
                        "                        <div class=\"daily-info\">\n" +
                        "                            <span class=\"routine-info\">\n" +
                        "                                <strong>minutos</strong>&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                            </span>\n" +
                        "                            <span class=\"routine-value\">"+t.NUMINT(1).getText()+"</span>\n" +
                        "                        </div>\n" +
                        "                    </div>");
            }

            out.append("</div>");
        }



        out.append("                </div>\n" +
                "            </div>");

        return null;
    }
}