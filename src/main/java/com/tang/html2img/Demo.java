package com.tang.html2img;

import gui.ava.html.image.generator.HtmlImageGenerator;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream
                                (new File("html2image_demo\\src\\main\\resources\\8311108商品信息.html"))));
        StringBuilder html = new StringBuilder();
        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            html.append(temp);
        }

        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();

        //加载html模版
        imageGenerator.loadHtml(html.toString());

        //把html写入到图片
        imageGenerator.saveAsImage("html2image_demo\\src\\main\\resources\\1.png");
    }
}
