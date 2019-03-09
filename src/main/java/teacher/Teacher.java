package teacher;

import document.DocumentUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.*;

public class Teacher extends DocumentUtils implements Subject {

    private Elements teachers;
    private List<String> listOfTeachers = new ArrayList<>();
    private Map<String, List<String>> mapOfTeachersAndSubjects = new HashMap<>();

    @Override
    public Document openFile(String addition) {
        try {
            doc = Jsoup.connect("http://aladin.elf.stuba.sk/rozvrh/index_ucitel.html").get();
            return doc;
        } catch (Exception e) {
            System.out.println("Page cant be loaded");
            return null;
        }
    }

    public void downloadListOfTeachers() {

        openFile("okej");
        teachers = doc.select("a");
        teachers.forEach(element -> {
            if (element.ownText().contains(","))
                listOfTeachers.add(element.ownText());
        });
        System.out.println("sd");
    }

    public void putTeachersWithSubjectsIntoMap() {

        //B
        mapOfTeachersAndSubjects.put(listOfTeachers.get(0), Collections.emptyList()); //Babinec, Andrej
        mapOfTeachersAndSubjects.put(listOfTeachers.get(1), Collections.emptyList()); //Bajusova, Alica
        mapOfTeachersAndSubjects.put(listOfTeachers.get(2), listOfBalloPeterSubjects); //Ballo, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(3), listOfBaloghRichardSubjects); //Balogh, Richard
        mapOfTeachersAndSubjects.put(listOfTeachers.get(4), listOfBaloghStefanSubjects); //Balogh, Stefan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(5), listOfBaronakIvanSubjects); //Baronak, Ivan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(6), Collections.emptyList()); //Belai, Igor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(7), listOfBelanAntonSubjects); //Belan, Anton
        mapOfTeachersAndSubjects.put(listOfTeachers.get(8), Collections.emptyList()); //Beringerova, Katarina
        mapOfTeachersAndSubjects.put(listOfTeachers.get(9), Collections.emptyList()); //Bielek, Jozef
        mapOfTeachersAndSubjects.put(listOfTeachers.get(10), listOFBistakPavolSubjects); //Bistak, Pavol
        mapOfTeachersAndSubjects.put(listOfTeachers.get(11), Collections.emptyList()); //Bittera, Mikulas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(12), Collections.emptyList()); //Bock, Igor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(13), listOfBokesPeterSubjects); //Bokes, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(14), Collections.emptyList()); //Breza, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(15), Collections.emptyList()); //Brilla, Igor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(16), listOfBugarMartinSubjects); //Bugar, Martin

        //C
        mapOfTeachersAndSubjects.put(listOfTeachers.get(17), Collections.emptyList()); //Cernanova, Viera
        mapOfTeachersAndSubjects.put(listOfTeachers.get(18), listOfCervenovaJozefaSubjects); //Cervenova, Jozefa
        mapOfTeachersAndSubjects.put(listOfTeachers.get(19), listOfCiganekJanSubjects); //Ciganek, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(20), Collections.emptyList()); //Cipkova, Karla
        mapOfTeachersAndSubjects.put(listOfTeachers.get(21), listOfCirakJuliusSubjects); //Cirak, Julius
        mapOfTeachersAndSubjects.put(listOfTeachers.get(22), Collections.emptyList()); //Cocherova, Elena

        //D
        mapOfTeachersAndSubjects.put(listOfTeachers.get(23), Collections.emptyList()); //Dariusova, Zlatica
        mapOfTeachersAndSubjects.put(listOfTeachers.get(24), Collections.emptyList()); //Dekan, Julius
        mapOfTeachersAndSubjects.put(listOfTeachers.get(25), Collections.emptyList()); //Dobrocka, Eduard
        mapOfTeachersAndSubjects.put(listOfTeachers.get(26), listOfDonovalDanielSubjects); //Donoval, Daniel
        mapOfTeachersAndSubjects.put(listOfTeachers.get(27), Collections.emptyList()); //Donoval, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(28), listOfDosoudilRastislavSubjects); //Dosoudil, Rastislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(29), listOfDrahosPeterSubjects); //Drahos, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(30), listOfDrozdaMartinSubjects); //Drozda, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(31), Collections.emptyList()); //Dubnicka, ROman
        mapOfTeachersAndSubjects.put(listOfTeachers.get(32), listOfDubravskyJozefSubjects); //Dubravsky, Jozef
        mapOfTeachersAndSubjects.put(listOfTeachers.get(33), listOfDuchonFrantisekSubjects); //Duchon, Frantisek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(34), Collections.emptyList()); //Durman, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(35), Collections.emptyList()); //Durny, Rudolf
        mapOfTeachersAndSubjects.put(listOfTeachers.get(36), Collections.emptyList()); //Dvorscak, Branislav

        //E
        mapOfTeachersAndSubjects.put(listOfTeachers.get(37), listOfEleschovaZanetaSubjects); //Eleschova, Zaneta
        mapOfTeachersAndSubjects.put(listOfTeachers.get(38), Collections.emptyList()); //Erdody, Frantisek

        //F
        mapOfTeachersAndSubjects.put(listOfTeachers.get(39), Collections.emptyList()); //Fabova, Ludmila
        mapOfTeachersAndSubjects.put(listOfTeachers.get(40), listOfFarkasGabrielSubjects); //Farkas, Gabriel
        mapOfTeachersAndSubjects.put(listOfTeachers.get(41), listOfFarkasPeterSubjects); //Farkas, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(42), Collections.emptyList()); //Farkas, Smitkova, Miroslava
        mapOfTeachersAndSubjects.put(listOfTeachers.get(43), listOfFerenceyViktorSubjects); //Ferencey, Viktor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(44), Collections.emptyList()); //Flickingerova, Iveta
        mapOfTeachersAndSubjects.put(listOfTeachers.get(45), Collections.emptyList()); //Fodrek, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(46), Collections.emptyList()); //Foltin, Ondrej
        mapOfTeachersAndSubjects.put(listOfTeachers.get(47), Collections.emptyList()); //Fric, RObert
        mapOfTeachersAndSubjects.put(listOfTeachers.get(48), Collections.emptyList()); //Frtala, Tomas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(49), listOfFuchsPeterSubjects); //Fuchs, Peter


        //G
        mapOfTeachersAndSubjects.put(listOfTeachers.get(50), Collections.emptyList()); //Galik, Gabriel
        mapOfTeachersAndSubjects.put(listOfTeachers.get(51), Collections.emptyList()); //Gallo, Ondrej
        mapOfTeachersAndSubjects.put(listOfTeachers.get(52), listOfGasparovskyDionyzSubjects); //Gasparovsky, Dionyz
        mapOfTeachersAndSubjects.put(listOfTeachers.get(53), Collections.emptyList()); //Glatz, Maria
        mapOfTeachersAndSubjects.put(listOfTeachers.get(54), Collections.emptyList()); //Goga, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(55), Collections.emptyList()); //Gogola, ROman
        mapOfTeachersAndSubjects.put(listOfTeachers.get(56), listOfGrmanJanSubjects); //Grman, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(57), listOfGrosekOtokarSubjects); //Grosek, Otokar
        mapOfTeachersAndSubjects.put(listOfTeachers.get(58), Collections.emptyList()); //Gruskova, Anna
        mapOfTeachersAndSubjects.put(listOfTeachers.get(59), Collections.emptyList()); //Guzmicky, Peter

        //H
        mapOfTeachersAndSubjects.put(listOfTeachers.get(60), listOfHafnerOtoSubjects); //Hafner, Oto
        mapOfTeachersAndSubjects.put(listOfTeachers.get(61), Collections.emptyList()); //Hagara, Miroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(62), listOfHalgosJanSubjects); //Halgos, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(63), listOfHallonJozefSubjects); //Hallon, Jozef
        mapOfTeachersAndSubjects.put(listOfTeachers.get(64), Collections.emptyList()); //Hambalik, Alexander
        mapOfTeachersAndSubjects.put(listOfTeachers.get(65), Collections.emptyList()); //Hamracek, Jaroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(66), Collections.emptyList()); //Hanak, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(67), listOfHartanskyReneSubjects); //Hartansky, Rene
        mapOfTeachersAndSubjects.put(listOfTeachers.get(68), Collections.emptyList()); //Hascik, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(69), listOfHincaRobertSubjects); //Hinca, Robert
        mapOfTeachersAndSubjects.put(listOfTeachers.get(70), Collections.emptyList()); //Hotovy, Ivan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(71), Collections.emptyList()); //Hrabovsky, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(72), listOfHromadaViliamSubjects); //Hromada, Viliam
        mapOfTeachersAndSubjects.put(listOfTeachers.get(73), listOfHubaMikulasSubjects); //Huba, Mikulas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(74), Collections.emptyList()); //Huba, Tomas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(75), listOfHubinskyPeterSubjects); //Hubinsky, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(76), listOfHuttnerLudovitSubjects); //Huttner, Ludovit
        mapOfTeachersAndSubjects.put(listOfTeachers.get(77), Collections.emptyList()); //Hypiusova, Maria

        //CH
        mapOfTeachersAndSubjects.put(listOfTeachers.get(78), listOfChramazStefanSubjects); //Chamraz, Stefan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(79), listOfChlpikJurajSubjects); //Chlpik, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(80), Collections.emptyList()); //Chudy, Michal

        //J
        mapOfTeachersAndSubjects.put(listOfTeachers.get(81), Collections.emptyList()); //Jakubec, Jakub
        mapOfTeachersAndSubjects.put(listOfTeachers.get(82), listOfJancarikVladimirSubjects); //Jancarik, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(83), listOfJanicekFrantisekSubjects); //Janicek, Frantisek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(84), Collections.emptyList()); //Janiga, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(85), Collections.emptyList()); //Janik, Zoltan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(86), listOfJokayMatusSubjects); //Jokay, Matus
        mapOfTeachersAndSubjects.put(listOfTeachers.get(87), listOfJuhasGabrielSubjects); // Juhas, Gabriel
        mapOfTeachersAndSubjects.put(listOfTeachers.get(88), Collections.emptyList()); // Jurcacko, Ludovit
        mapOfTeachersAndSubjects.put(listOfTeachers.get(89), Collections.emptyList()); // Jurisica, Ladislav

        //K
        mapOfTeachersAndSubjects.put(listOfTeachers.get(90), listOfKacurJurajSubjects); // Kacur, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(91), Collections.emptyList()); // Kajan, Slavomir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(92), Collections.emptyList()); // Kamensky, Miroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(93), listOfKardosJanSubjects); // Kardos, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(94), Collections.emptyList()); // Kazlov, Igor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(95), Collections.emptyList()); // Keckemetyova, Maria
        mapOfTeachersAndSubjects.put(listOfTeachers.get(96), Collections.emptyList()); // Kermietova, Katarina
        mapOfTeachersAndSubjects.put(listOfTeachers.get(97), Collections.emptyList()); // Klucik, Marian
        mapOfTeachersAndSubjects.put(listOfTeachers.get(98), Collections.emptyList()); // Klucik, Stanislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(99), listOfKmentAttilaSubjects); // Kment, Attila
        mapOfTeachersAndSubjects.put(listOfTeachers.get(100), Collections.emptyList()); //  Kocur, Michal
        mapOfTeachersAndSubjects.put(listOfTeachers.get(101), listOfKohutkaLukasSubjects); //  Kohutka, Lukas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(102), listOfKonopkaMartinSubjects); //  Konopka, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(103), Collections.emptyList()); //  Kopca, Miroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(104), Collections.emptyList()); //  Korenko, Branislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(105), Collections.emptyList()); //  Korosi, Ladislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(106), listOfKossaczkyIgorSubjects); //  Kossaczky, Igor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(107), listOfKotuliakovaKvetoslavaSubjects); // Kotuliakova, Kvetoslava
        mapOfTeachersAndSubjects.put(listOfTeachers.get(108), listOfKovacJaroslavSubjects); // Kovac, Jaroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(109), listOfKovacKarolSubjects); // Kovac, Karol
        mapOfTeachersAndSubjects.put(listOfTeachers.get(110), Collections.emptyList()); // Kozak, Stefan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(111), listOfKozakovaAlenaSubjects); // Kozakova, Alena
        mapOfTeachersAndSubjects.put(listOfTeachers.get(112), Collections.emptyList()); // Kralikova, Eva
        mapOfTeachersAndSubjects.put(listOfTeachers.get(113), listOfKralovaZdenkaSubjects); // Kralova, Zdenka
        mapOfTeachersAndSubjects.put(listOfTeachers.get(114), Collections.emptyList()); // Krammer, Anton
        mapOfTeachersAndSubjects.put(listOfTeachers.get(115), Collections.emptyList()); //  Kubica, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(116), Collections.emptyList()); //  Kubinec, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(117), Collections.emptyList()); //  Kukucka, Marek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(118), listOfKutisVladimirSubjects); //  Kutis, Vladimir

        //L
        mapOfTeachersAndSubjects.put(listOfTeachers.get(119), Collections.emptyList()); //  Lehocki, Fedor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(120), Collections.emptyList()); //  Lelak, Jaroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(121), Collections.emptyList()); //  Lipnicky, Lukas

        //M
        mapOfTeachersAndSubjects.put(listOfTeachers.get(122), Collections.emptyList()); //  Maly, Oto
        mapOfTeachersAndSubjects.put(listOfTeachers.get(123), Collections.emptyList()); // Marcek, Stanislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(124), Collections.emptyList()); // Marinova, Ivica
        mapOfTeachersAndSubjects.put(listOfTeachers.get(125), listOfMarkoLubomirSubjects); //  Marko, Lubomir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(126), Collections.emptyList()); //  Markos, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(127), Collections.emptyList()); //  Matej, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(128), Collections.emptyList()); //  Mazanec, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(129), listOfMedveckyMartinSubjects); //  Medvecky, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(130), Collections.emptyList()); //  Miglierini, Marcel
        mapOfTeachersAndSubjects.put(listOfTeachers.get(131), listOfMiklovicovaEvaSubjects); //  Miklovicova, Eva
        mapOfTeachersAndSubjects.put(listOfTeachers.get(132), Collections.emptyList()); //  Mikus, Michal
        mapOfTeachersAndSubjects.put(listOfTeachers.get(133), Collections.emptyList()); //   Misota, Branislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(134), Collections.emptyList()); //   Mosko, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(135), listOfMrafkoLeoSubjects); //   Mrafko, Leo
        mapOfTeachersAndSubjects.put(listOfTeachers.get(136), listOfMurgasJanSubjects); //   Murgas, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(137), Collections.emptyList()); //   Murin, Justin

        //N
        mapOfTeachersAndSubjects.put(listOfTeachers.get(138), listOfNanasiovaOlgaSubjects); //   Nanasiova, Olga
        mapOfTeachersAndSubjects.put(listOfTeachers.get(139), listOfNecasVladimirSubjects); //  Necas, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(140), listOfNemogaKarolSubjects); //  Nemoga, Karol
        mapOfTeachersAndSubjects.put(listOfTeachers.get(141), Collections.emptyList()); //  Novak, Vladislav

        //O
        mapOfTeachersAndSubjects.put(listOfTeachers.get(142), Collections.emptyList()); //  Olejcek, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(143), listOfOndracekOldrichSubjects); //  Ondracek, Oldrich
        mapOfTeachersAndSubjects.put(listOfTeachers.get(144), Collections.emptyList()); //  Oravec, Ivan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(145), listOfOravecMilosSubjects); //  Oravec, Milos
        mapOfTeachersAndSubjects.put(listOfTeachers.get(146), Collections.emptyList()); // Orgon, Milos
        mapOfTeachersAndSubjects.put(listOfTeachers.get(147), Collections.emptyList()); // Osusky, Jakub

        //P
        mapOfTeachersAndSubjects.put(listOfTeachers.get(148), Collections.emptyList()); // Packa, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(149), Collections.emptyList()); // Palenik, Tomas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(150), Collections.emptyList()); // Pancza, David
        mapOfTeachersAndSubjects.put(listOfTeachers.get(151), Collections.emptyList()); // Pastuchova, Elena
        mapOfTeachersAndSubjects.put(listOfTeachers.get(152), Collections.emptyList()); // Paulech, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(153), Collections.emptyList()); // Paulusova, Jana
        mapOfTeachersAndSubjects.put(listOfTeachers.get(154), Collections.emptyList()); // Pavlovic, Marius
        mapOfTeachersAndSubjects.put(listOfTeachers.get(155), listOfPavlovicovaJarmilaSubjects); // Pavlovicova, Jarmila
        mapOfTeachersAndSubjects.put(listOfTeachers.get(156), Collections.emptyList()); //  Perny, Milan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(157), listOfPipaMarekSubjects); //  Pipa, Marek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(158), Collections.emptyList()); //  Podhoransky, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(159), Collections.emptyList()); //  Podpera, Ivan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(160), listOfPolakovicMarcelSubjects); //  Polakovic, Marcel
        mapOfTeachersAndSubjects.put(listOfTeachers.get(161), listOfPolecJaroslavSubjects); //  Polec, Jaroslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(162), Collections.emptyList()); // Poljovka, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(163), listOfPribilovaAnnaSubjects); // Pribilova, Anna
        mapOfTeachersAndSubjects.put(listOfTeachers.get(164), listOfPucikJozefSubjects); // Pucik, Jozef

        //R
        mapOfTeachersAndSubjects.put(listOfTeachers.get(165), listOfRaditschovaJanaSubjects); // Raditschova, Jana
        mapOfTeachersAndSubjects.put(listOfTeachers.get(166), listOfRakusMartinSubjects); // Rakus, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(167), Collections.emptyList()); //  Redhammer, RObert
        mapOfTeachersAndSubjects.put(listOfTeachers.get(168), Collections.emptyList()); //  Repka, Marek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(169), Collections.emptyList()); //  Rodina, Jozef
        mapOfTeachersAndSubjects.put(listOfTeachers.get(170), listOfRokaRastislavSubjects); // Roka, Rastislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(171), listOfRosinovaDanicaSubjects); //  Rosinova, Danica
        mapOfTeachersAndSubjects.put(listOfTeachers.get(172), Collections.emptyList()); //  Rovanova, Lubica
        mapOfTeachersAndSubjects.put(listOfTeachers.get(173), listOfRozinajGregorSubjects); //  Rozinaj, Gregor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(174), listOfRudolfBorisSubjects); //  Rudolf, Boris

        //S
        mapOfTeachersAndSubjects.put(listOfTeachers.get(175), Collections.emptyList()); //  Sabelova, Veronika
        mapOfTeachersAndSubjects.put(listOfTeachers.get(176), Collections.emptyList()); //  Sagatova, Andrea
        mapOfTeachersAndSubjects.put(listOfTeachers.get(177), listOfSalyVladimirSubjects); //  Saly, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(178), listOfSatkaAlexanderSubjects); //  Satka, Alexander
        mapOfTeachersAndSubjects.put(listOfTeachers.get(179), Collections.emptyList()); //  Sedlar, Tibor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(180), listOfSekajIvanSubjects); //  Sekaj, Ivan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(181), Collections.emptyList()); // Sevcikova, Zuzana
        mapOfTeachersAndSubjects.put(listOfTeachers.get(182), Collections.emptyList()); // Sitek, Jozef
        mapOfTeachersAndSubjects.put(listOfTeachers.get(183), listOfSlackaJurajSubjects); // Slacka, Juraj
        mapOfTeachersAndSubjects.put(listOfTeachers.get(184), listOfSlugenVladimirSubjects); // Slugen, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(185), listOfSmieskoViktorSubjects); // Smiesko, Viktor
        mapOfTeachersAndSubjects.put(listOfTeachers.get(186), Collections.emptyList()); // Sojak, Stanislav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(187), Collections.emptyList()); // Soka, Martin
        mapOfTeachersAndSubjects.put(listOfTeachers.get(188), listOfSpirkovaDanielaSubjects); // Spirkova, Daniela
        mapOfTeachersAndSubjects.put(listOfTeachers.get(189), listOfSramkaMichalSubjects); // Sramka, Michal
        mapOfTeachersAndSubjects.put(listOfTeachers.get(190), listOfStofanikVladimirSubjects); // Stofanik, Vladimir
        mapOfTeachersAndSubjects.put(listOfTeachers.get(191), Collections.emptyList()); // Stofka, Marian
        mapOfTeachersAndSubjects.put(listOfTeachers.get(192), listOfStopjakovaVieraSubjects); // Stopjakova, Viera
        mapOfTeachersAndSubjects.put(listOfTeachers.get(193), listOfStuchlikovaLubicaSubjects); // Stuchlikova, Lubica
        mapOfTeachersAndSubjects.put(listOfTeachers.get(194), Collections.emptyList()); // Sturcel, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(195), listOfSysMarekSubjects); // Sys, Marek

        //T
        mapOfTeachersAndSubjects.put(listOfTeachers.get(196), listOfTapakPeterSubjects); // Tapak, Peter
        mapOfTeachersAndSubjects.put(listOfTeachers.get(197), listOfTarnikMarianSubjects); // Tarnik, Marian
        mapOfTeachersAndSubjects.put(listOfTeachers.get(198), Collections.emptyList()); // Tolgyessy, M.
        mapOfTeachersAndSubjects.put(listOfTeachers.get(199), Collections.emptyList()); // Tomaska, Martin

        //U
        mapOfTeachersAndSubjects.put(listOfTeachers.get(200), listOfUherekFrantisekSubjects); // Uherek, Frantisek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(201), listOfUsakElemirSubjects); //  Usak, Elemir

        //V
        mapOfTeachersAndSubjects.put(listOfTeachers.get(202), Collections.emptyList()); //  Vajda, Jan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(203), Collections.emptyList()); //  Valent, Ferdinand
        mapOfTeachersAndSubjects.put(listOfTeachers.get(204), listOfValkoPavolSubjects); //  Valko, Pavol
        mapOfTeachersAndSubjects.put(listOfTeachers.get(205), Collections.emptyList()); // Valkova, Maria
        mapOfTeachersAndSubjects.put(listOfTeachers.get(206), Collections.emptyList()); // Vanco, Marek
        mapOfTeachersAndSubjects.put(listOfTeachers.get(207), listOfVargicRadoslavSubjects); // Vargic, Radoslav
        mapOfTeachersAndSubjects.put(listOfTeachers.get(208), Collections.emptyList()); // Vary, Michal
        mapOfTeachersAndSubjects.put(listOfTeachers.get(209), Collections.emptyList()); // Vavrinsky, Erik
        mapOfTeachersAndSubjects.put(listOfTeachers.get(210), Collections.emptyList()); // Vesely, Vojtech
        mapOfTeachersAndSubjects.put(listOfTeachers.get(211), Collections.emptyList()); // Vitazek, Klement
        mapOfTeachersAndSubjects.put(listOfTeachers.get(212), Collections.emptyList()); // Vitko, Anton
        mapOfTeachersAndSubjects.put(listOfTeachers.get(213), Collections.emptyList()); // Vlnieska, Alfred
        mapOfTeachersAndSubjects.put(listOfTeachers.get(214), listOfVojvodaMilanSubjects); // Vojvoda, Milan

        //Z
        mapOfTeachersAndSubjects.put(listOfTeachers.get(215), listOfZajacMichalSubjects); // Zajac, Michal
        mapOfTeachersAndSubjects.put(listOfTeachers.get(216), listOfZajacPavolSubjects); // Zajac, Pavol
        mapOfTeachersAndSubjects.put(listOfTeachers.get(217), Collections.emptyList()); // Zajko, Marian
        mapOfTeachersAndSubjects.put(listOfTeachers.get(218), listOfZakopcanMichalSubjects); // Zakopcan, Michal
        mapOfTeachersAndSubjects.put(listOfTeachers.get(219), listOfZakovaKatarinaSubjects); //  Zakova, Katarina
        mapOfTeachersAndSubjects.put(listOfTeachers.get(220), Collections.emptyList()); //  Zalman, Milan
        mapOfTeachersAndSubjects.put(listOfTeachers.get(221), Collections.emptyList()); //  Zilka, Tomas
        mapOfTeachersAndSubjects.put(listOfTeachers.get(222), Collections.emptyList()); //  Ziska, Milan

    }
}