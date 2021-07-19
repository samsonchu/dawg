package com.dawg.java14.textblocks;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class TextBlocks {
    static final Logger LOG = Logger.getLogger(TextBlocks.class.getName());

    public static void main(String... args) {
        htmlExample();
    }

    private static void exampleSql() {
        String sqlString = "SELECT waiv_non_sscrb_sircon_fee_ind\n" +
                "  FROM st_srvc\n" +
                " WHERE st_srvc_st_cd = :stSrvcStCd\n" +
                "   AND st_srvc_type_cd = :stSrvcTypeCd";

        String textBlock = """
                SELECT waiv_non_sscrb_sircon_fee_ind 
                  FROM st_srvc 
                 WHERE st_srvc_st_cd = :stSrvcStCd
                   AND st_srvc_type_cd = :stSrvcTypeCd""";

        System.out.println(sqlString);
        System.out.println(textBlock);
        assertEquals(textBlock, sqlString);
    }


    private static void htmlExample() {
        var html = "<html>\n"
                + "\n"
                + "    <body>\n"
                + "        <span>example text</span>\n"
                + "    </body>\n"
                + "</html>";

        var textBlock = """ 
                <html>
                        
                    <body>
                        <span>example text</span>
                    </body>
                </html>""";

        System.out.println(html);
        System.out.println(textBlock);
        assertEquals(textBlock, html);
    }
}
