package com.dnf;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class dnfMove {

    //先移动x后移动y
    public void MoveX(Robot robot, int x, int y) throws InterruptedException {
        System.out.println("准备开始移动");
        for (int i = 0; i < 100; i++) {
            System.out.println("AAAA");
            Thread.sleep(cratNum());
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
        }
        //向左
        if (x < 0) {
            System.out.println("左移动：" + x);
            for (int i = 0; i > x; x++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
            }
        }
        //向右
        if (x > 0) {
            System.out.println("右移动：" + x);
            for (int i = 0; i < x; i++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
            }
        }

        //向下
        if (y < 0) {
            System.out.println("下移动：" + y);
            for (int i = 0; i > y; y++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
        }

        //向上
        if (y > 0) {
            System.out.println("下移动：" + y);
            for (int i = 0; i < y; i++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
            }
        }

        System.out.println("移动结束");

    }
    //先移动y后移动x
    public void MoveY(Robot robot, int x, int y) throws InterruptedException {
        System.out.println("准备开始移动");

        for (int i = 0; i < 100; i++) {
            System.out.println("BBB");
            Thread.sleep(cratNum());
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
        }



        //向左
        if (x < 0) {
            System.out.println("左移动：" + x);
            for (int i = 0; i > x; x++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
            }
        }
        //向右
        if (x > 0) {
            System.out.println("右移动：" + x);
            for (int i = 0; i < x; i++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
            }
        }

        //向下
        if (y < 0) {
            System.out.println("下移动：" + y);
            for (int i = 0; i > y; y++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
        }

        //向上
        if (y > 0) {
            System.out.println("下移动：" + y);
            for (int i = 0; i < y; i++) {
                Thread.sleep(cratNum());
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
            }
        }

        System.out.println("移动结束");

    }

    //生成随机毫秒
    public int cratNum() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(99);
            if (i1 > 20) {
                return (i1 / 2) * 10;
            }
        }
        return 200;
    }

}
