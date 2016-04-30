/*
 * and open the template in the editor.
 */
package wildwest;
import java.awt.Desktop;
import java.io.*;
import java.util.*;
import sun.audio.*;
/**
 *
 * @author jtcwo_000
 */
public class WildWest {
    public static int tomBeat;
    public static Scanner scan = new Scanner(System.in);
    public static int strength = 0;
    public static int intelligence = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       menu();
       
    }
        public static void menu() {
            System.out.println("Welcome to the Wild West Adventure game!\n");
            System.out.println("1: Play Game\n");
            System.out.println("2: About\n");
            System.out.println("3: Show\n");
            int menu = Integer.parseInt(scan.nextLine());
            switch (menu) {
            case 1: 
                game();
            case 2:
                System.out.println("This is a classic a classic choose your own adventure game! You\n"
                                + "will be going through a world based on text where your choices\n"
                                + "maydetermine your fate as you play as Max Waltson, a man come to\n"
                                + "seek his fortune in the gold rush, only to find his dreams of\n"
                                + "golden rivers are filled with scorpions and dry creek beds.\n"
                                + "In order  to play you simply select the 1 option, from there\n"
                                + "you will be given multiple choices after getting brief \n"
                                + "descriptions of events that determine how things continue \n"
                                + "in the same manner as you chose options from the main menu.\n"
                                + "There may be pop up pictures involved and links to videos.\n"
                                + "\n"
                                + "You are Brian McCreed, a poor Irish immigrant who came to seek\n"
                                + "a better life in the land of opportunity, but have found it tougher\n"
                                + "than expected. With little more than the clothes on your back\n"
                                + "and the change in your pocket, you set out west to make your\n"
                                + "fortune in the gold rush where the last letter from your missing\n"
                                + "cousin made mention of a life changing vein of wealth.\n"
                                + "\n"
                                + "1: Back to menu?\n"
                                + "2: Quit");
                                int back = Integer.parseInt(scan.nextLine());
                                if (back == 1) {
                                    menu();
                                }
                                else {
                                    return;
                                }
            case 3:
                return;
       }
            
        }
        public static void game() {
            int water = 10;
            int bullets = 6;
            System.out.println("You\n"
                    + "You wake up with a start, your head throbs as if it has just been run over\n"
                    + "by a pack of wild horses. As you slowly open your eyes, you see a man standing\n"
                    + "over you, who upon seening you wake, gives you a swift kick in the ribs before\n"
                    + "speaking "
                    + "\n"
                    + "'Ya think ya can just come in n' make a claim on the Riker Boys' Turf?\n"
                    + "That ain't how this works son, now you're workin' for us see?'\n"
                    + "\n"
                    + "WHAT DO YOU DO?\n"
                    + "1: Beg for mercy\n"
                    + "2: Stay silent and wait\n"
                    + "3: Grab him and try to fight");
            try {
                    File PICCY = new File("miner.jpg");
                    Desktop dt = Desktop.getDesktop();
                    dt.open(PICCY);
                    System.out.println("Done.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            int action = Integer.parseInt(scan.nextLine());
            switch (action) {
            case 1: 
                System.out.println("You clasp your hands together in front of you, and with a quivering\n"
                        + "lip, start speaking \n"
                        + "'I didn't mean nuthin' by nuthin'! Please, just let me go\n"
                        + "n' I'll go find a new claim, nowhere near here, honest! Just let me go, yeah?' \n");
                mines(1);
            case 2: 
                System.out.println("...\n");
                mines(2);
            case 3: 
                System.out.println("As the man gets closer to you, you grab his ankle and give it a sharp yank,\n"
                        + "bringing the man down in a jumble with a hard thud and a string of curses, he\n"
                        + "immediatly starts scuffling on the ground to try and get the better position\n"
                        + "over you and you both start rolling around, throwing punches and jabs, but \n"
                        + "you hear shouting coming from the distance and just as you get the man pinned \n"
                        + "to the ground under you, strong hands grab you by the shoulders and pull you off \n"
                        + "but, not before you manage one final blow.");
                try {
                    String myFile = "ko.wav";
                    InputStream in = new FileInputStream(myFile);
                    AudioStream audioStream = new AudioStream(in);
                    AudioPlayer.player.start(audioStream);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mines(3);
                WildWest.tomBeat=1;
            
            }
    }
        
    public static void mines(int event) {
        System.out.println("\n");
        if (event == 1){
            System.out.println("'Ain't nuffin gonna save ya boy, ya stepped on our turf, ya got\n"
                    + "a debt that's needing paid son, but hey, if ya live a couple years \n"
                    + "maybe we'll be lettin' ya go!' \n");
        }
        else if (event == 2){
            System.out.println("'Did the boys hit you too hard? Knock the sense outta ya son? \n"
                    + "Don't make no matterin' to me, just means no'in gonna know you fell\n"
                    + "down a shaft n' need savin'.\n");
        }
        else if (event == 3){
            System.out.println("You wake up chained to a chair, your headache ten times worse \n"
                    + "than it already was. Both your feet and your left hand seem to be cuffed]n"
                    + "to the legs of the chair, but your right hand is strapped down to a blood stained\n"
                    + "table in front of you, illuminated by a flickering oil lamp. A man \n"
                    + "in a large duster comes out a door across the table, in his hands \n"
                    + "the glinting metal of a wicked butcher's knife. He has a large, drooping \n"
                    + "hat and a taller collar on his duster, almost totally masking his face, \n"
                    + "he sits across from you. \n"
                    + "'tsk, tsk, fightin' at The Pit, first you steal \n"
                    + "from us, and now you go and beat up poor Tommy. We can't have that \n"
                    + "disorder round' these parts, so now I want ya to understand, this ain't \n"
                    + "bringin' me no joy, it's just my job.' \n"
                    + "\n"
                    + "The man sits down, and try as you might, the bonds holidng you firm do not\n"
                    + "budge. You attempt to  ball up your hand and pull it through the table's \n"
                    + "restraints to equally little avail. The oil lamp's light dances off the blade \n"
                    + "\n"
                    + "'Now stop yer squirmin', it's yer first offense, it aint the end o' the world yet \n"
                    + "so now, unless'n yer wantin' to lose some more bits, hold still.' \n"
                    + "\n"
                    + "The man grabs your hand and roughly pries two of your fingers open, pressing them \n"
                    + "flat against the table. The blade flashes an orange arch in the dark room.\n"
                    + "You feel nothing at first, but there is now a steel wall between your knuckles \n"
                    + "and your index and pinky fingers. The cleaver scrapes across the table, pulling \n"
                    + "away, leaving tracks of fresh blood that start to quickly get subsumed by the \n"
                    + "steady flow coming from your hand."
                    + "\n"
                    + "'Bandage him up and get him outta here'\n"
                    + "\n"
                    + "WHAT DO YOU DO?\n"
                    + "1: Scream in pain and try to clutch your stumps as you're taken away\n"
                    + "2: Stay silent and wait\n");
                try {
                    File PICCY = new File("cleaver.jpg");
                    Desktop dt = Desktop.getDesktop();
                    dt.open(PICCY);
                    System.out.println("Done.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    int action = Integer.parseInt(scan.nextLine());
                    switch (action) {
                        case 1:
                            System.out.println("The man in the duster stairs at you, and calmly says \n"
                                    + "\n"
                                    + "'Again, I take no pleasure in it, but please, do not make it harder\n"
                                    + "and give me a headache with your screaming.\n");
                        case 2:
                            System.out.println("The man in the duster collects your two fingers and turns away\n"
                                    + "\n"
                                    + "'Stoic, good, that'll serve you well here' \n");
                    }
        }
        System.out.println("Two large, grizzled men approach from behind drag you up and roughly \n"
                + "push you to start walking. As you walk they continue to shove or pull you to change \n"
                + "direction as needed. They take you through an encampment of a dozen tents \n"
                + "surrounding a roaring bonfire that several dozen men were smoking and drinking \n"
                + "around. One man shouts out 'Got us a new one do we? Hopefully Tom don't \n"
                + "decide this one's only good for target practice!'\n"
                + "\n");
                if (tomBeat == 1) {
                    System.out.println("One of your guards shouts out in reply 'Ha! This one \n"
                            + "went n' saw off ol' Tom himself, ya better watch it or I'll \n"
                            + "let em' get you too Bill'\n"
                            + "\n");
                }
                else {
                    System.out.println("'Your guard sighs heavily before replying 'This one \n"
                            + "ain't no fun, didn't put up a fight or anything, I doubt \n"
                            + "Tom'd have any interest, ain't no sport in this one' \n"
                            + "\n");
                }
        System.out.println("As you leave the light of the campfire you see a cliffside \n"
                + "looming ahead and at its base, the only other source of light than\n"
                + "the campfire, a mineshaft entrance with sealed lamps hanging on the \n"
                + "wooden support columns. Another one of the gang members stands at the\n"
                + "entrance with a rifle on his chest. \n"
                + "\n"
                + "'Got a new volunteer? He been assigned yet?'"
                + "\n"
                + "'Nope, no idea what he's good at, if anything \n'"
                + "\n"
                + "'Then let's see what he's good at. Aye you, I got some ink n' paper, \n"
                + "ya good at that or just liftin? Urry up n' show me afore I put a round \n"
                + "in ya'"
                + "WHAT DO YOU DO?\n"
                + "1: Pick up the largest, heaviest boulder you can lift to prove you're strong\n"
                + "2: Write and read a simple letter and math problem to prove you know your letters\n");
                int test = Integer.parseInt(scan.nextLine());
                down(test);
    }
    public static void down(int event) {
        int decision;
        System.out.println("\n"
                + "'Well hot damn, I'm impressed, looks like we got oursef a good worker here!\n");
        if (event==1){
            strength=1;
            System.out.println("Put a pick in his hand and get him in the new wing pronto!'\n");
        }
        else if (event==2){
            intelligence=1;
            if(tomBeat==1)
                {
                    System.out.println("Well...He bled all over the paper...but...\n");
                }
            System.out.println("Make sure this one gets put with the old man down there, he needs\n"
                    + "some extra help managing'\n");
        }
        System.out.println("The guards shove  you forward, inot the mouth of the mine. The air temperature \n"
                + "drops significantly as does the ground and you find yourself rapidly descending into the dim \n"
                + "tunnel weakly illuminated by another mining lamp hanging from a support column every \n"
                + "dozen feet. Eventually you hear the clanging of metal on stone and you start seeing \n"
                + "alternate paths, down which gaunt, frail shadows are swinging picks or lugging sacks of\n"
                + "stone. Down here, in the close confines full of humans the mines started to heat up again\n"
                + "to the point where you start sweating. Eventually the guards stop at the mouth of a quiet \n"
                + "tunnel and push you down it, but do not follow.");
        try {
            String myFile = "ko.wav";
            InputStream in = new FileInputStream(myFile);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (strength==1){
            System.out.println("A gruff man meets, covered in coal with a thick, unkempt beard"
                    + "\n"
                    + "'They caught a new one eh? And Mike's hardly even in the ground, bastards. \n"
                    + "Well, lucky for you, and you better not tell the guards this, or I'll gut ya \n"
                    + "that us slaves are plannin' an escape see? N' you been the newest here gives us \n"
                    + "the perfect chance. Now I'm supposed ta send ya up in the mornin' to get your \n"
                    + "pick and clothes before you get bound to the chain gang, and that's what's gonna \n"
                    + "happen, but you're gonna slip the key from the guard's pocket see? \n"
                    + "The boys've been plannin' a jailbreak forever and you're our queue to do it, so \n"
                    + "ya in or ya out?'\n"
                    + "\n"
                    + "WHAT DO YOU DO?\n"
                    + "1: Agree\n"
                    + "2: Decline\n");
                decision = Integer.parseInt(scan.nextLine());
                
        }
        if (intelligence==1) {
            try {
                String myFile = "freedom.wav";
                InputStream in = new FileInputStream(myFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("You walk down the seemingly endless shaft until you \n"
                    + "get to a make-shift doorway, crudely rigged together to roughly\n"
                    + "block off the end of the tunnel from the rest of it. As you \n"
                    + "gingerly open it, you find a withered old man under a blanket \n"
                    + "sitting behind a large wood table stacked with papers and a scale. \n"
                    + "The old man looks up from his scribbling at your entrance"
                    + "\n"
                    + "'Oh! Who are you? Oh, no, no no, don't tell me they caught another \n"
                    + "unfortunate soul? Yes, yes that must be it, you're far too clean \n"
                    + "to have been here long...Hm...If they sent you here though, it \n"
                    + "isn't all bad then! At least you're gonna live kiddo! Yup, \n"
                    + "gonna be old and ragged just like me, but you get three square \n"
                    + "meals a day! and now I got somebody to talk to other than the guards!\n"
                    + "Come on, settle in!'\n");
            if (tomBeat==1) {
                System.out.println("'Oh! Oh my, you must've already made them mad huh? \n"
                        + "don't worry, I'll even let you heal up before I put you to \n"
                        + "work then! Just make sure you keep those bandages clean! \n");
            }
            System.out.println("\n"
                    + "Hit anything to escape\n");
            int bluh = Integer.parseInt(scan.nextLine());
            try {
                    File PICCY = new File("oldmanend.jpg");
                    Desktop dt = Desktop.getDesktop();
                    dt.open(PICCY);
                    System.out.println("Done.");
                } catch (Exception e) {
                    e.printStackTrace();
            }
        }
    }
    public static void strEnd (int decision) {
        if (decision==1){
            if (tomBeat==1){
                System.out.println("'Great! I see you ain't got no love for them scoundrels \n"
                        + "already by the look of your hand, well we'll be sure as hell to get \n"
                        + "vengenace on em' for that too...So yeah, great'\n");
            }
            System.out.println("'Great, great! Get some rest'\n"
                    + "\n"
                    + "The foreman leads you to a thin linen mat simply laid out in the floor \n"
                    + "of one of the wider areas of the mine where several dozen other miners \n"
                    + "are fast asleep. Eventually, bruised and battered as you are, you manage to \n"
                    + "drift off into blissful sleep for a few short hours. It hardly seems to last \n"
                    + "anytime at all though as the same foreman is waking you up and telling you it's time. \n"
                    + "He quickly runs you through your directions, to go to the surface, and ask the guard"
                    + "at the front of the mine to get a uniform and pick ax with him,and while he's distracted \n"
                    + "steal his key. As you make your way back up the shaft your pulse quickens, people\n"
                    + "are going to die this morning, and one of them could be you. You question why you\n"
                    + "ever came west in the first place.\n"
                    + "\n"
                    + "'What do you want, bucko?'"
                    + "\n"
                    + "You're snapped out of your thoughts by the voice of the guard \n"
                    + "as you respond that you need your uniform and tools. He grunts and motions you to follow, \n"
                    + "turning and revealing the keyring on his belt. You lung for it immediatly, catching\n"
                    + "the guard by surprise, and with all your might, tear it off of his belt, sending him off balance.\n"
                    + "\n"
                    + "'What do you think you're doing!?'"
                    + "\n"
                    + "the guard brings his gun to bare on you and lets off a shot that cracks past your ear and pings \n"
                    + "off the cliff face, but before he can fire another shot, you're already gone into the mines again. \n"
                    + "Your feet echo down the tunnel as you run down it full speed, reaching the foreman in record time\n"
                    + "with the literal key to freedom. Other workers who knew the rebellion was coming gather around and \n"
                    + "the mass of freed slaves soon grows into a horde, the foreman jumps up on a nearby boulder \n"
                    + "\n"
                    + "'Go my brothers! FIGHT FOR OUR FREEDOM!'"
                    + "\n"
                    + "Hit anything to escape");
            try {
                    File PICCY = new File("minerrevolt.jpg");
                    Desktop dt = Desktop.getDesktop();
                    dt.open(PICCY);
                    System.out.println("Done.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    int blah = Integer.parseInt(scan.nextLine());
                    try {
                        String myFile = "freedom.wav";
                        InputStream in = new FileInputStream(myFile);
                        AudioStream audioStream = new AudioStream(in);
                        AudioPlayer.player.start(audioStream);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
        }
        if (decision ==2){
            System.out.println("The foreman looks at you with a mixture of confusion and disgust."
                    + "\n"
                    + "'I hope you have your own way out of here then boy, your life here'll \n"
                    + "be shorter then most when word gets out you were a coward in this moment. \n"
                    + "go, be a lacky, get outta my sight and make sure you get your pick. \n'"
                    + "\n"
                    + "The foreman turns away in disgust, leaving you alone. You try and find \n"
                    + "a bed for the night and are unable, all the sleeping mats seem to be taken \n"
                    + "forcing you to sleep on the plain rock. In the morning, you get your uniform \n"
                    + "and pick ax and return to the mine, resigned to your fate as a slave \n."
                    + "\n"
                    + "Hit anything to escape");
                    int bloh = Integer.parseInt(scan.nextLine());
        }
    }
}
