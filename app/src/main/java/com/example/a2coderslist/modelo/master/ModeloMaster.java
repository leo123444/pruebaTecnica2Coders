package com.example.a2coderslist.modelo.master;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.example.a2coderslist.Mediador;
import com.example.a2coderslist.R;
import com.example.a2coderslist.presentador.master.IPresentadorMaster;

import java.util.ArrayList;

public class ModeloMaster implements IModeloMaster {
    private static ModeloMaster singleton = null;
    private Mediador mediador;

    private ArrayList<ContenidoListaMaster> listaMaster;
    private ArrayList<String>descriptions;
    private ArrayList<ContenidoListaMaster>favoritos;

    public ModeloMaster() {

        listaMaster = new ArrayList<ContenidoListaMaster>();
        favoritos= new ArrayList<ContenidoListaMaster>();
        listaMaster.add(new ContenidoListaMaster(R.drawable.assasination_classroom,"Assasin Class", "Humor anime"));
                listaMaster.add(new ContenidoListaMaster(R.drawable.attack_on_titan,"Attack on Titan", "Action Anime"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.black_clover,"Black Clover", "Humor/Action anime"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.danganronpa,"Danganronpa", "Investigation"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.kingdom_hearts,"KingdomHearts", "heroes"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.boku_no_hero,"My Hero Academy", "Heroes"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.naruto,"Naruto Shipudden","Ninja anime"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.sailor_moon,"SailorMoon","Girls anime"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.ruffy2,"OnePiece","Pirates Anime"));
        listaMaster.add(new ContenidoListaMaster(R.drawable.your_lie_in_april,"Your Lie in April","Romantic anime"));

        descriptions = new ArrayList<String>(listaMaster.size());
        descriptions.add("A humorous and action-packed story about a class of misfits who are trying to kill their new teacher – an alien octopus with bizarre powers and super strength! The teacher has just destroyed the moon and is threatening to destroy the earth – unless his students can destroy him first. What makes things more complicated is that he's the best teacher they've ever had!");
        descriptions.add("Several hundred years ago, humans were nearly exterminated by giants. Giants are typically several stories tall, seem to have no intelligence, devour human beings and, worst of all, seem to do it for the pleasure rather than as a food source. A small percentage of humanity survived by walling themselves in a city protected by extremely high walls, even taller than the biggest of giants. Flash forward to the present and the city has not seen a giant in over 100 years. Teenage boy Eren and his foster sister Mikasa witness something horrific as the city walls are destroyed by a super giant that appears out of thin air. As the smaller giants flood the city, the two kids watch in horror as their mother is eaten alive. Eren vows that he will murder every single giant and take revenge for all of mankind.\n" +
                "\n");
        descriptions.add("In a world where magic is everything, Asta and Yuno are both found abandoned at a church on the same day. While Yuno is gifted with exceptional magical powers, Asta is the only one in this world without any. At the age of fifteen, both receive grimoires, magic books that amplify their holder’s magic. Asta’s is a rare Grimoire of Anti-Magic that negates and repels his opponent’s spells. Being opposite but good rivals, Yuno and Asta are ready for the hardest of challenges to achieve their common dream: to be the Wizard King. Giving up is never an option!\n" +
                "\n");
        descriptions.add("Being just a normal student without a special talent, Makoto Naegi wins a lottery to attend the prestigious Hope's Peak Academy where only the top prodigies attend. However, instead of this being the beginning of a wonderful high school life, it's a ticket to despair, because the only way to graduate from Hope's Peak Academy is to kill one of your fellow students or be one of their victims.");
        descriptions.add("China’s Warring States period, a raging dragon that would raze the land for 500 years, saw many kingdoms rise and fall, making way for the next generation of kings and generals to fight for supremacy. Eventually, seven powerful states emerged from the endless cycle of warfare. In the kingdom of Qin, Xin Li, a war-orphaned slave, trains vigorously with fellow slave and best friend, Piao, who shares his proud dream of one day becoming a Great General of the Heavens. However, the two are suddenly forced to part ways when Piao is recruited to work in the royal palace by a retainer of the King. After a fierce coup d'état unfolds, Piao returns to Xin, half dead, with a mission that will lead him to a meeting with China's young King, Zheng Ying, who bears a striking resemblance to Piao. Kingdom follows Xin as he takes his first steps into the great blood-soaked pages of China's history. He must carve his own path to glory on his long quest to become a Great General of the historic Seven");
        descriptions.add("What's a hero? For Izuku Midoriya, the answer to that question has always been simple: \"Everything I want to be!\" And who is the ultimate hero? Well, the legendary All Might, of course. All Might is the number one ranked hero and also the \"Symbol of Peace\" in the world. Not in his wildest dreams could Izuku have imagined that he would soon cross paths with his childhood hero... In Boku no Hero Academia, status is governed by \"Quirks\"—unique superpowers which develop in childhood. But, unfortunately, hero otaku Midoriya \"Deku\" Izuku never had a Quirk. That is, until he met All Might, the greatest hero of all time. Izuku's transformation from dreamer to superhero begins at Yuuei Academy, the top-ranked hero-training high school in Japan. Izuku is on cloud nine when he's accepted to this prestigious academy, especially when he finds out that All Might is one of the teachers. What surprises does this mighty academy offer? And will Izuku be able to keep up with his elite classmates?\n" +
                "\n");
        descriptions.add("It has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for intense training following events which fueled his desire to be stronger. Now Akatsuki, the mysterious organization of elite rogue ninja, is closing in on their grand plan which may threaten the safety of the entire shinobi world. Although Naruto is older and sinister events loom on the horizon, he has changed little in personality—still rambunctious and childish—though he is now far more confident and possesses an even greater determination to protect his friends and home. Come whatever may, Naruto will carry on with the fight for what is important to him, even at the expense of his own body, in the continuation of the saga about the boy who wishes to become Hokage.\n");
        descriptions.add("Tsukino Usagi is a 14-year-old girl in junior high. She's ditzy, whiny, and a crybaby. She often flunks her tests, and she is always scolded by her family. However after a bad day, Usagi is surprised to encounter a black cat that can talk! The cat, Luna, grants Usagi the power to transform into Sailor Moon, a fighter who is to save the world against the Dark Kingdom and its evil ruler, Queen Beryl. Of course, Usagi can't do it alone, and there are others who will help her on the way...\n");
        descriptions.add("A story about Monkey D. Luffy, who wants to become a real pirate. In a world of mystical, those who eat mystical fruit will gain its true power but also has its greatest weakness. For example, Luffy ate Gum-Gum Fruit which gave him a strange power but he can NEVER swim. His dream of becoming a pirate to find the ultimate treasure. His greatest fear is the big ocean. Nevertheless, he journeys by himself to find more people to go with him on his journey. Along his ways, with luck and determination, he finds himself many members who are devoted but to different causes. Together, they sail the Seven Seas of adventure in search of the elusive treasure \"One Piece.\"\n");
        descriptions.add("Piano prodigy Arima Kosei dominated the competition and all child musicians knew his name. But after his mother, who was also his instructor, passed away, he had a mental breakdown while performing at a recital that resulted in him no longer being able to hear the sound of his piano even though his hearing was perfectly fine. Even two years later, Kosei hasn't touched the piano and views the world in monotone, and without any flair or color. He was content at living out his life with his good friends Tsubaki and Watari until, one day, a girl changed everything. Miyazono Kaori is a pretty, free spirited violinist whose playing style reflects her personality. Kaori helps Kosei return to the music world and show that it should be free and mold breaking unlike the structured and rigid style Kosei was used to.\n" +
                "\n" +
                "\n");
    }

    public static ModeloMaster getInstance() {
        if (singleton == null) {
            singleton = new ModeloMaster();
        }
        return singleton;
    }


    @Override
    public ArrayList<ContenidoListaMaster> getListaMaster() {
        return this.listaMaster;
    }



    @Override
    public ArrayList<String>getDescription(){
        return this.descriptions;
    }

    @Override
    public ArrayList<ContenidoListaMaster>getFavoritos(){
        return favoritos;
    }
@Override
    public int getCurrentPosition(){
        return mediador.getInstance().getPresentadorMaster().getCurrentListPosition();
}

//Método para controlar si se puede añadir un elemento a favoritos o no
@Override
public int sameElement(ContenidoListaMaster item){
    int isEqual=0;
   if(favoritos.size()==0){
       isEqual=0;
   }
            for(int i=0;i<favoritos.size();i++){
                if(item.equals(getFavoritos().get(i))){
                    isEqual++;
                }
        }
     return isEqual;
    }
}