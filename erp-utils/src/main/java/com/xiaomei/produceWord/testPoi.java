package com.xiaomei.produceWord;

import org.apache.poi.xwpf.usermodel.*;

import java.io.FileOutputStream;

/**
 * Created by lixiang on 12/11/2016.
 */
public class testPoi {
    public static void main(String[] args) {
        XWPFDocument doc = new XWPFDocument();

        //创建一个新的文档
        XWPFParagraph p1 = doc.createParagraph();
        //设置文档居中
        p1.setAlignment(ParagraphAlignment.CENTER);
        //设置四边的边界
        p1.setBorderBottom(Borders.DOUBLE);
        p1.setBorderTop(Borders.DOUBLE);

        p1.setBorderRight(Borders.DOUBLE);
        p1.setBorderLeft(Borders.DOUBLE);

        p1.setBorderBetween(Borders.SINGLE);
        //设置垂直的居中程度
        p1.setVerticalAlignment(TextAlignment.TOP);

        //定义一些属性
        XWPFRun r1 = p1.createRun();
        //设置为粗体
        r1.setBold(true);
        //设置文字
        r1.setText("The quick brown fox");

        //r1.setBold(true);
        //设置字体
        r1.setFontFamily("Courier");
        //设置下划线
        r1.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
        //设置文字高度，与BaseLine相比的位置
        r1.setTextPosition(40);

        XWPFParagraph p2 = doc.createParagraph();
        p2.setAlignment(ParagraphAlignment.RIGHT);

        //BORDERS
        p2.setBorderBottom(Borders.DOUBLE);
        p2.setBorderTop(Borders.DOUBLE);
        p2.setBorderRight(Borders.DOUBLE);
        p2.setBorderLeft(Borders.DOUBLE);
        p2.setBorderBetween(Borders.SINGLE);

        XWPFRun r2 = p2.createRun();
        r2.setText("jumped over the lazy dog");
        //设置删除线
        r2.setStrike(true);
        r2.setFontSize(20);

        XWPFRun r3 = p2.createRun();
        r3.setText("and went away");
        r3.setStrike(true);
        r3.setFontSize(20);
        //设置上标/下标
        r3.setSubscript(VerticalAlign.SUBSCRIPT);


        XWPFParagraph p3 = doc.createParagraph();
        p3.setWordWrap(true);
        //设置分页
        p3.setPageBreak(false);

        //p3.setAlignment(ParagraphAlignment.DISTRIBUTE);
        p3.setAlignment(ParagraphAlignment.BOTH);
        p3.setSpacingLineRule(LineSpacingRule.EXACT);
        //设置行缩进多少个字符
        p3.setIndentationFirstLine(1000);


        XWPFRun r4 = p3.createRun();
        r4.setTextPosition(20);
        r4.setText("To be, or not to be: that is the question: "
                + "Whether 'tis nobler in the mind to suffer "
                + "The slings and arrows of outrageous fortune, "
                + "Or to take arms against a sea of troubles, "
                + "And by opposing end them? To die: to sleep; ");
        //设置结束方式是页面的方式
        r4.addBreak(BreakType.PAGE);
        r4.setText("No more; and by a sleep to say we end "
                + "The heart-ache and the thousand natural shocks "
                + "That flesh is heir to, 'tis a consummation "
                + "Devoutly to be wish'd. To die, to sleep; "
                + "To sleep: perchance to dream: ay, there's the rub; "
                + ".......");
        // 设置为斜体
        r4.setItalic(true);
//This would imply that this break shall be treated as a simple line break, and break the line after that word:

        XWPFRun r5 = p3.createRun();
        //与baseLine相比的位置
        r5.setTextPosition(-10);
        r5.setText("For in that sleep of death what dreams may come");
        //换行？ 和Break 有什么区别
        r5.addCarriageReturn();
        r5.setText("When we have shuffled off this mortal coil,"
                + "Must give us pause: there's the respect"
                + "That makes calamity of so long life;");
        //这种方式结束一行会造成排版不好看 ？？
        r5.addBreak();
        r5.setText("For who would bear the whips and scorns of time,"
                + "The oppressor's wrong, the proud man's contumely,");
        //这种方式结束结束一行效果还可以 ？？
        r5.addBreak(BreakClear.ALL);
        r5.setText("The pangs of despised love, the law's delay,"
                + "The insolence of office and the spurns" + ".......");

        try{
            FileOutputStream out = new FileOutputStream("simple.docx");
            doc.write(out);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
