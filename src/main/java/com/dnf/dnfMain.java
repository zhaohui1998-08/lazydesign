package com.dnf;

import java.awt.*;
import java.util.Random;

public class dnfMain {

  public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        dnfMove dnfMove = new dnfMove();
        Random random = new Random();
        Thread.sleep(2000);
        for (int i = 0; i < 1; i++) {
            int i1 = random.nextInt(2);
            if (i1 == 0) {
                dnfMove.MoveX(robot,10,-10);
            }else {
                dnfMove.MoveY(robot,20,-20);
            }
        }
    }

}
