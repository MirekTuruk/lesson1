package lesson1;

public class Lesson
{
    public static void main(String[] args)
    {
        int x = 0;
        int tab[] = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        int tab2[] = new int[]{5, 6, 7, 8, 9};
        String tab3[] = new String[]{"aaa", "bbb", "ccc"};

        for (int y = 0; y < tab3.length; y++)
            System.out.println(y + " : " + tab3[y]);

        while (x < tab3.length)
        {
            System.out.println(tab3[x]);
            x++;
        }
    }
}
