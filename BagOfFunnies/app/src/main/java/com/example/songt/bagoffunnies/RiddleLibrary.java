package com.example.songt.bagoffunnies;

import java.util.Random;

/**
 * Created by songt on 2017-12-05.
 */

public class RiddleLibrary {
    int randoRiddleNumber;

    private String mRiddles [] = {
            "The faster you run, the harder I am to catch.",
            "Tall I am young, short I am old, while with life I glow, wind is my foe. What am I?",
            "What loses it's head in the morning but gets it back at night?",
            "The more you take, the more you leave behind.",
            "Once spoken, broken.",
            "A king has two sons and he cannot decide which one should be " +
                    "the next king. So he holds a race where whichever son’s horse finishes last will be made the king. " +
                    "The two sons take off towards the finish line but keep slowing until they stop. " +
                    "Realizing that it is pointless, they go ask a wise man in the crowd what to do. " +
                    "He tells them what he thinks and they both get back on the horses and race to the finish. " +
                    "What did he tell them?",
            "When brightest, I am darkest. " +
                    "When darkest, I am gone. " +
                    "When I am gone forever, so are you. " +
                    "What am I?",
            "Two uniformed men are found dead in a cabin in the middle of the woods. The cabin is upside down." +
                    "What happened?",
            "The maker doesn't want it. " +
                    "The buyer doesn't need it." +
                    "The user doesn't realize they are using it. " +
                    "What is it?",
            "One night, four men sat down to play. " +
                    "They played all night through break of day. " +
                    "They played for gold, and not for fun, " +
                    "With separate scores for everyone. " +
                    "When it came time to square accounts, " +
                    "All men had made quite fair amounts. " +
                    "Can you the paradox explain:" +
                    "If no man lost, how could all gain?",
            "Two spies are doing some reconnaissance around a military base that they wish to sneak into. The base has a sentry posted at the front that gives a number to whoever enters and the person must answer with the correct counter number in order to gain access." +
                    "So the first soldier walks up to the sentry and the sentry says the number 6. The soldier gives the counter number 3 and is allowed into the base. " +
                    "A second soldier walks up. The sentry says the number 12. The soldier gives the counter number 6 and is also allowed in. " +
                    "One of the spies, thinking he understood the pattern for the codes, walks up to the sentry. The sentry says the number 8, to which the spy replies 4, and is promptly shot dead. " +
                    "What was the correct response and why?",
            "You answer me, but I never ask you a question. " +
                    "What am I?",
            "What's at the beginning of eternity and at the end of time and space?",
            "A man is found dead in the middle of the desert, wearing a backpack. The contents of the backpack are scattered around the man: Everything he needs to survive in the desert and even a reliable, working means of communication that would have ensured he'd be rescued before he ran out of supplies. None of these items have been used. There is also no evidence to suggest that he was attacked by another person or an animal." +
                    "How did he die?",
            "A man wakes up very hungry in the middle of the night. To curb his hunger, he goes upstairs, grabs something out of the fridge to eat, closes the fridge, turns off the light, and heads back downstairs to go to sleep. When he wakes up in the morning, there is wreckage and destruction all around his house." +
                    "Where does he live?",
            "Imagine you are in a dark room. How do you get out?",
            "There is a pond with one lily in it, and every day the lily doubles in size. In 48 days the lily completely covers the pond. " +
                    "How many days does it take for the lily to cover half the pond?",
            "What when forward is heavy but backwards in not?",
            "You are inside a four-walled structure. Each wall faces south. Where is the structure located?",
            "Poor people have it, Rich people need it, and if you eat it, you will die.",
            "I gurgle but never speak, run but never walk, have a bed but never sleep. What am I?",
            "I am not alive but I can grow. I do not have lungs but I need air to survive. What am I?",
            "There was a girl half my age when I was 12, now I am 64, how old is she?",
            "You bury me when I’m alive and dig me up when I’m dead. What am I?",
            "What has hands but can not clap?",
            "A boy throws a baseball. It travels 40 feet and then goes right back to the boy. How is that possible?",
            "It weighs next to nothing but no one can hold it for long. What is it?",
            "What comes down but never goes up?",
            "A girl is sitting in a house at night that has no lights on at all. There is no lamp, no candle, nothing. Yet she is reading. How?",
            "Which weighs more, a pound of feathers or a pound of bricks?",
            "A man was outside taking a walk, when it started to rain. The man didn’t have an umbrella and he wasn’t wearing a hat. His clothes got soaked, yet not a single hair on his head got wet. How could this happen?",
            "What’s full of holes but still holds water?",
            "What belongs to you but other people use it more than you?",
            "I fly without wings, I cry without eyes. What am I?",
            "If you have me, you want to share me. If you share me, you haven't got me. What am I?",
            "An old lady forgets her drivers licence at home. She travels down a one way street the wrong way. She does not stop at stop signs, or stop for people crossing the road. A cop is watching her do this and he does not give her a ticket. Why didn't he give her a ticket?",
            "A murderer is condemned to death. He has to choose between three rooms. The first is full of raging fires, the second is full of assassins with loaded guns, and the third is full of lions that haven't eaten in 3 years. Which room is safest for him?",
            "A man shaves several times a day, yet he still has a beard. Who is this man?",
            "You have three stoves: a gas stove, a wood stove, and a coal stove, but only one match. Which should you light first?",
            "You use a knife to slice my head and weep beside me when I am dead." +
                    "What am I?",
            "What goes up but never comes down?",
            "Always in you, Sometimes on you; " +
                    "If I surround you, I can kill you. " +
                    "What am I?"



    };

    private String mRiddleAnswers [] = {
            "Breath","Candle","Pillow","Footsteps","Silence","Switch Horses","My Shadow","Plane Crash","Coffin","They were playing music","5, the number of letters in eight",
            "The Door","The letter E","He grabbed the wrong backpack before jumping out of a plane","A lighthouse","Open your eyes","47 days","Ton","The North Pole",
            "Nothing","I am a river","Fire","58","A plant","A Clock","The boy threw the baseball straight up in the air","Your Breath","Rain","She is blind and reading braille",
            "Neither, they both weigh one pound","He is Bald","A sponge","Your name","Clouds","Secret","She was walking","The third room. Lions that haven't eaten in three years are dead.",
            "A barber","The Match","An onion","Age","Water"

    };
    public String getRiddle(int a){
        String riddle = mRiddles[a];
        return riddle;
    }
    public String getRiddleAnswer(int a){
        String riddleAnswer = mRiddleAnswers[a];
        return riddleAnswer;
    }
    public int getRiddleLibraryLength(){
        int riddleLibraryLength = mRiddles.length;
        return riddleLibraryLength;
    }

}
