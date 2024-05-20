package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameController {

        public void Run() {
            String[] Commands = {
                    "\\s*exit\\s*",                                                             //0 ok
                    "user create -u (.*) -p (random|(.*)\\s+(.*)) -email (.*)@(\\w).com -n (.*)", //1
                    "question pick -q (.*) -a (.*) -c (.*) ",
                    "user login -u (.*) -p (.*)",
                    "forgot my password -u (.*)",
                    "log out",
                    "show information",
                    "profile change (-u|-n|-e) (.*)",
                    "profile change password -o (.*) -n (.*)",
                    "for test"
            };
            Scanner scan = new Scanner(System.in);
            String k;
            boolean TC = false;
            int com_num = 0;
            Matcher TM = null;
            boolean Exitprogram = false;
            while (!Exitprogram) {
                k = scan.nextLine();
                TC = false;
                com_num = 0;
                for (String ss : Commands) {
                    if (Pattern.matches(ss, k)) {
                        TM = Pattern.compile(ss).matcher(k);
                        TM.find();
                        TC = true;
                        switch (com_num) {
                            case 0:
                                Exitprogram = true;
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                        }
                    }
                    com_num++;
                }
                if (!TC) {
                }
            }
        }

    }
