package com.telenav.wzone.util.html2photo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Main.class.getResourceAsStream("/com/telenav/wzone/util/html2photo/tmpl.html");
        ReadableByteChannel channel = Channels.newChannel(inputStream);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        StringBuilder stringBuilder = new StringBuilder();
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        while (channel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            while(byteBuffer.hasRemaining()) {
                CharBuffer charBuffer = decoder.decode(byteBuffer);
                stringBuilder.append(charBuffer.toString());
            }
            byteBuffer.clear();
        }
        channel.close();
        JLabel label = new JLabel();
        label.setText(stringBuilder.toString());
        int i = 31;
        int height = 220+ i * 25;
        label.setSize(640, height);

        BufferedImage image = new BufferedImage(label.getWidth(), label.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        label.paint(g);
        g.dispose();
        ImageIO.write(image, "png", new File("/home/ttx/tool/test.png"));
//        ImageIO.write(image, "png", new File("/var/root/Pictures/test.png"));
    }

}
