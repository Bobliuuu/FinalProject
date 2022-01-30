import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats extends World
{
    private Image backButton;
    private GreenfootImage background;
    private GreenfootSound music;
    private UserInfo user;
    private SuperTextBox levelLabel;
    private SuperTextBox winLossLabel;
    private SuperTextBox gemsSpentLabel;
    private SuperTextBox timePlayedLabel;
    
    private SuperTextBox firstPlaceLabel;
    private SuperTextBox secondPlaceLabel;
    private SuperTextBox thirdPlaceLabel;
    private SuperTextBox fourthPlaceLabel;
    private SuperTextBox fifthPlaceLabel;
    
    private SuperTextBox firstPlaceLevelLabel;
    private SuperTextBox secondPlaceLevelLabel;
    private SuperTextBox thirdPlaceLevelLabel;
    private SuperTextBox fourthPlaceLevelLabel;
    private SuperTextBox fifthPlaceLevelLabel;
    
    private static final Color transparent = new Color(0, 0, 0, 0);
    /**
     * Constructor for objects of class Stats.
     * 
     */
    public Stats()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        
        background = new GreenfootImage("Worlds/MyStatsBackground.PNG");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        backButton = new Image(new GreenfootImage("Buttons/backbutton.png"));
        backButton.getImage().scale(80, 50);
        addObject(backButton, 65, 45);
        
        Font font = new Font ("Open Sans", true, false, 30);
        if (UserInfo.isStorageAvailable()){
            user = UserInfo.getMyInfo();
            
            // Set different values here
            levelLabel = new SuperTextBox(Integer.toString(user.getScore()), transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(levelLabel, 382, 153);

            winLossLabel = new SuperTextBox(Integer.toString(user.getInt(7)) + " : " + Integer.toString(user.getInt(8)), transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(winLossLabel, 363, 244);

            gemsSpentLabel = new SuperTextBox(Integer.toString(user.getInt(0)), transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(gemsSpentLabel, 355, 344);

            timePlayedLabel = new SuperTextBox(Integer.toString(user.getInt(9) / 60) + ":" + Integer.toString(user.getInt(9) % 60), transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(timePlayedLabel, 352, 450);

            // Leaderboard

            font = new Font ("Courier New", true, false, 30);

            firstPlaceLabel = new SuperTextBox("TestUsername123", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(firstPlaceLabel, 626, 153);

            secondPlaceLabel = new SuperTextBox("TestUsername123", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(secondPlaceLabel, 626, 245);

            thirdPlaceLabel = new SuperTextBox("TestUsername123", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(thirdPlaceLabel, 626, 343);

            fourthPlaceLabel = new SuperTextBox("TestUsername123", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(fourthPlaceLabel, 626, 450);

            fifthPlaceLabel = new SuperTextBox("TestUsername123", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(fifthPlaceLabel, 626, 541);

            firstPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(firstPlaceLevelLabel, 840, 149);

            secondPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(secondPlaceLevelLabel, 840, 241);

            thirdPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(thirdPlaceLevelLabel, 840, 343);

            fourthPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(fourthPlaceLevelLabel, 840, 450);

            fifthPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(fifthPlaceLevelLabel, 840, 541);
        }
        else {
            // Player Stats Labels
            levelLabel = new SuperTextBox("0", transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(levelLabel, 382, 153);

            winLossLabel = new SuperTextBox("0" + " : " + "0", transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(winLossLabel, 363, 244);

            gemsSpentLabel = new SuperTextBox("1000", transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(gemsSpentLabel, 355, 344);

            timePlayedLabel = new SuperTextBox("00:00", transparent, Color.BLACK, font, false, 18*6, 0, transparent);
            addObject(timePlayedLabel, 352, 450);

            // Leaderboard

            font = new Font ("Courier New", true, false, 30);

            firstPlaceLabel = new SuperTextBox("Me", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(firstPlaceLabel, 626, 153);

            secondPlaceLabel = new SuperTextBox("Anonymous", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(secondPlaceLabel, 626, 245);

            thirdPlaceLabel = new SuperTextBox("Anonymous", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(thirdPlaceLabel, 626, 343);

            fourthPlaceLabel = new SuperTextBox("Anonymous", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(fourthPlaceLabel, 626, 450);

            fifthPlaceLabel = new SuperTextBox("Anonymous", transparent, Color.BLUE, font, false, 20*10, 0, transparent);
            addObject(fifthPlaceLabel, 626, 541);

            firstPlaceLevelLabel = new SuperTextBox("Lvl " + "1", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(firstPlaceLevelLabel, 840, 149);

            secondPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(secondPlaceLevelLabel, 840, 241);

            thirdPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(thirdPlaceLevelLabel, 840, 343);

            fourthPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(fourthPlaceLevelLabel, 840, 450);

            fifthPlaceLevelLabel = new SuperTextBox("Lvl " + "5", transparent, Color.BLACK, font, false, 20*10, 0, transparent);
            addObject(fifthPlaceLevelLabel, 840, 541);
        }
    }
    
    public void started(){
        if (UserInfo.isStorageAvailable()){
            user = UserInfo.getMyInfo();
            if (user.getInt(3) == 0){
                if (music != null){
                    music.stop();
                }
            }
            else {
                if (music != null){
                    music.stop();
                }
                music = new GreenfootSound("mainsong" + user.getInt(3) + ".mp3");
                music.play();
            }
            if (music != null){
                music.setVolume(user.getInt(2));
            }
        }
    }
    
    public void act(){
        checkClick();
    }
    
    public void checkClick(){
        if (Greenfoot.mouseClicked(backButton)){
            Start start = new Start();
            start.started();
            Greenfoot.setWorld(start);
        }
    }
}