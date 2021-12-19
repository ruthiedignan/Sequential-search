
/**
 * This class searches through a collection of music using the sequence search.
 *
 * @author Ruthie Dignan
 * @version 03/02/21
 */
public class MusicTester
{
    public static void main(String[] args)
    {
        Music[] songs = new Music[10];
        
        songs[0] = new Music("Fly Me to the Moon", 1963, "Frank Sinatra");
        songs[1] = new Music("Put Your Head On My Shoulder", 1959, "Paul Anka");
        songs[2] = new Music("Blue Skies", 1958, "Ella Fitzgerald");
        songs[3] = new Music("It's A Sin To Tell A Lie", 1963, "Bobby Rydell");
        songs[4] = new Music("Come Together", 1969, "The Beatles");
        songs[5] = new Music("A Teenager's Romance", 1957, "Ricky Nelson");
        songs[6] = new Music("Bohemian Rhapsody", 1975, "Queen");
        songs[7] = new Music("Material Girl", 1984, "Madonna");
        songs[8] = new Music("Jolene", 1974, "Dolly Parton");
        songs[9] = new Music("9 to 5", 1980, "Dolly Parton");
        
        printSongs(songs);
        
        //searching by title
        System.out.println("\n\nSearching for Bohemian Rhapsody: ");
        findTitle(songs, "Bohemian Rhapsody");

        ///searching by year
        System.out.println("\n\nSearching for songs made in 1963: ");
        findYear(songs, 1969);
  
        //searching by artist
        System.out.println("\n\nSearching for songs by Dolly Parton: ");
        findTitle(songs, "Bohemian Rhapsody");
        
    }
    
    public static void printSongs(Music[] s)
    {
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
    
    public static void findTitle(Music[] s, String toFind)
    {
        int found = -1;

        for(int i = 0; i < s.length; i++)
        {
            if(s[i].getTitle().compareTo(toFind) == 0)
            {
                found = i;
                break;   
            }
        }
        
        if(found != -1)
        {
            System.out.println("We found " + toFind + " in the song list: ");
            System.out.println(s[found]);
        }
        else
            System.out.println(toFind + " is not in the song list");
    }
    
    public static void findYear(Music[] s, int toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < s.length; i++)
        {
            if(s[i].getYear() == toFind)
            {
                System.out.println(s[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   
            System.out.println(toFind + " is not in the songlist");
        }
    }
    
    public static void findArtist(Music[] s, String toFind)
    {
        int found = -1;

        for(int i = 0; i < s.length; i++)
        {
            if(s[i].getArtist().compareTo(toFind) == 0)
            {
                found = i;
                break;   
            }
        }
        
        if(found != -1)
        {
            System.out.println("We found " + toFind + " in the song list: ");
            System.out.println(s[found]);
        }
        else
            System.out.println(toFind + " is not in the song list");
    }
}
