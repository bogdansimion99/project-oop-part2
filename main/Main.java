package main;

import angels.*;
import fileio.FileSystem;
import heroes.*;
import maps.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) throws IOException {
        /*FileSystem fs = new FileSystem("F://Documente_Bogdan//Facultate//POO//tema2//teme-master/" +
                "/teme//proiect-etapa2-league-of-oop//checker//checker//resources//in//fightKKD.in",
                "F://Documente_Bogdan//Facultate//POO//tema2//teme-master//teme//" +
                        "proiect-etapa2-league-of-oop//checker//test.out");*/
        FileSystem fs = new FileSystem(args[0], args[1]);
        int rows = fs.nextInt();
        int columns = fs.nextInt();
        Map[][] map = new Map[rows][columns];
        String[] buffer = new String[columns];
        for (int i = 0; i < columns; i++) {
            buffer[i] = fs.nextWord();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                switch (buffer[j].charAt(i)) {
                    case 'W':
                        map[i][j] = new Woods(map[i][j]);
                        break;
                    case 'D':
                        map[i][j] = new Desert(map[i][j]);
                        break;
                    case 'L':
                        map[i][j] = new Land(map[i][j]);
                        break;
                    case 'V':
                        map[i][j] = new Volcanic(map[i][j]);
                        break;
                    default:
                        break;
                }
            }
        }
        int noHeroes = fs.nextInt();
        ArrayList<Hero> heroes = new ArrayList<>();
        for (int i = 0; i < noHeroes; i++) {
            Hero hero;
            switch (fs.nextWord()) {
                case "W":
                    hero = new Wizard(new Hero(), new int[]{fs.nextInt(), fs.nextInt()});
                    heroes.add(hero);
                    break;
                case "K":
                    hero = new Knight(new Hero(), new int[]{fs.nextInt(), fs.nextInt()});
                    heroes.add(hero);
                    break;
                case "P":
                    hero = new Pyromancer(new Hero(), new int[]{fs.nextInt(), fs.nextInt()});
                    heroes.add(hero);
                    break;
                default:
                    hero = new Rogue(new Hero(), new int[]{fs.nextInt(), fs.nextInt()});
                    heroes.add(hero);
                    break;
            }
        }
        int noRounds = fs.nextInt();
        String[] moves = new String[noRounds];
        for (int i = 0; i < noRounds; i++) {
            moves[i] = fs.nextWord();
        }
        for (int i = 0; i < noRounds; i++) {
            fs.writeWord("~~ Round ");
            fs.writeInt(i + 1);
            fs.writeWord(" ~~");
            fs.writeNewLine();
            for (int j = 0; j < noHeroes; j++) {
                if (heroes.get(j).getHp() <= 0) {
                    continue;
                }
                for (int k = j + 1; k < noHeroes; k++) {
                    if (Arrays.equals(heroes.get(j).getPosition(), heroes.get(k).getPosition())) {
                        if (heroes.get(j).getOvertime() > 0) {
                            heroes.get(j).setHp(heroes.get(j).getHp() - heroes.get(j).
                                    getDamageOvertime());
                            heroes.get(j).setOvertime(heroes.get(j).getOvertime() - 1);
                        }
                        if (heroes.get(k).getOvertime() > 0) {
                            heroes.get(k).setHp(heroes.get(k).getHp() - heroes.get(k).
                                    getDamageOvertime());
                            heroes.get(k).setOvertime(heroes.get(k).getOvertime() - 1);
                        }
                        if (heroes.get(k).getHp() <= 0) {
                            continue;
                        }
                        heroes.get(j).action(heroes.get(j), heroes.get(k), map[heroes.get(j).
                                getPosition()[0]][heroes.get(j).getPosition()[1]]);
                        heroes.get(k).action(heroes.get(k), heroes.get(j), map[heroes.get(k).
                                getPosition()[0]][heroes.get(k).getPosition()[1]]);
                    }
                }
            }
            int noAngels = fs.nextInt();
            if (noAngels != 0) {
                String aux = fs.nextWord();
                int[] angelPosition = new int[2];
                angelPosition[1] = aux.charAt(aux.length() - 1) - 48;
                angelPosition[0] = aux.charAt(aux.length() - 3) - 48;
                String angelType = aux.substring(0, aux.length() - 4);
                fs.writeWord("Angel " + angelType + " was spawned at " + angelPosition[0] + " "
                        + angelPosition[1]);
                fs.writeNewLine();
                ArrayList<Angel> angels = new ArrayList<>();
                for (int j = 0; j < noAngels; j++) {
                    Angel angel;
                    switch (angelType) {
                        case "DamageAngel":
                            angel = new DamageAngel(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "DarkAngel":
                            angel = new DarkAngel(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "Dracula":
                            angel = new Dracula(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "GoodBoy":
                            angel = new GoodBoy(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "LevelUpAngel":
                            angel = new LevelUpAngel(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "LifeGiver":
                            angel = new LifeGiver(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "SmallAngel":
                            angel = new SmallAngel(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "Spawner":
                            angel = new Spawner(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "XPAngel":
                            angel = new XPAngel(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        case "TheDoomer":
                            angel = new TheDoomer(angelPosition, new Angel());
                            angels.add(angel);
                            break;
                        default:
                            break;
                    }
                }
                for (int j = 0; j < noAngels; j++) {
                    for (int k = 0; k < noHeroes; k++) {
                        if (Arrays.equals(angels.get(j).getPosition(), heroes.get(k).
                                getPosition())) {
                            angels.get(j).action(heroes.get(k));
                            fs.writeWord(angels.get(j).getType() + " " + angels.get(j).message()
                                    + " " + heroes.get(k).getType() + " " + k);
                            fs.writeNewLine();
                            if (heroes.get(k).getHp() == 0) {
                                fs.writeWord("Player " + heroes.get(k).getType() + " " + k
                                        + " was killed by an angel");
                                fs.writeNewLine();
                            }
                        }
                    }
                }
            }

            for (int j = 0; j < noHeroes; j++) {
                switch (moves[i].charAt(j)) {
                    case 'U':
                        if (heroes.get(j).getOvertime() > 0) {
                            heroes.get(j).setPosition(new int[] {heroes.get(j).getPosition()[0] - 1,
                                    heroes.get(j).getPosition()[1]});
                        }
                        break;
                    case 'D':
                        if (heroes.get(j).getOvertime() > 0) {
                            heroes.get(j).setPosition(new int[] {heroes.get(j).getPosition()[0] + 1,
                                    heroes.get(j).getPosition()[1]});
                        }
                        break;
                    case 'L':
                        if (heroes.get(j).getOvertime() > 0) {
                            heroes.get(j).setPosition(new int[] {heroes.get(j).getPosition()[0],
                                    heroes.get(j).getPosition()[1] - 1});
                        }
                        break;
                    case 'R':
                        if (heroes.get(j).getOvertime() > 0) {
                            heroes.get(j).setPosition(new int[] {heroes.get(j).getPosition()[0],
                                    heroes.get(j).getPosition()[1] + 1});
                        }
                        break;
                    default:
                        break;
                }
            }
            fs.writeNewLine();
        }
        fs.writeWord("~~ Results ~~");
        fs.writeNewLine();
        for (Hero x: heroes) {
            switch (x.getType()) {
                case "Pyromancer":
                    fs.writeWord("P ");
                    break;
                case "Knight":
                    fs.writeWord("K ");
                    break;
                case "Rogue":
                    fs.writeWord("R ");
                    break;
                case "Wizard":
                    fs.writeWord("W ");
                    break;
                default:
                    break;
            }
            if (x.getHp() <= 0) {
                fs.writeWord("dead");
                fs.writeNewLine();
                continue;
            }
            fs.writeWord(x.getLevel() + " ");
            fs.writeWord(x.getXp() + " ");
            fs.writeWord(x.getHp() + " ");
            fs.writeWord(x.getPosition()[0] + " ");
            fs.writeInt(x.getPosition()[1]);
            fs.writeNewLine();
        }
        fs.close();
    }
}
