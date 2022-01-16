using System;

namespace HanoiTower
{
    class Program
    {
        public static int HEIGHT;
        public static int[] A;
        public static int[] B;
        public static int[] C;
        public static int atop;
        public static int btop;
        public static void draw(int[] a, int[] b, int[] c)
        {
            for (int i = HEIGHT - 1; i >= 0; i--)
            {
                for (int j = 0; j < a[i]; j++)
                {
                    Console.Write("*");
                }
                Console.Write("\t");
                for (int j = 0; j < b[i]; j++)
                {
                    Console.Write("*");
                }
                Console.Write("\t");
                for (int j = 0; j < c[i]; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            Console.WriteLine("A\tB\tC\n");
            return;
        }

        public static void moveHanoi(int n, int[] from, int[] to, int[] tmp, char a, char b, char c)
        {


            // Console.WriteLine("n = {0}, from = {1},temp = {2}, to = {3},", n, a, b, c);

            if (n == 1)
            {
                int test1 = HEIGHT;
                while (true)
                {
                    if (from[test1-1] != 0) // atop 함수 체크
                    {
                        break;
                    }
                    else
                    {
                        test1--;
                    }
                }
                btop = 0;
                while (true)
                {
                    if (to[btop] == 0) // to 안에 탑갯수 체크
                    {
                        break;
                    }
                    else
                    {
                        btop++;
                    }
                }
                Console.WriteLine("Move : {0} -> {1}", a, b);
                to[btop] = from[test1-1]; // atop 현재 보고있는 줄의 별을 to에 대입
                from[test1-1] = 0;
                draw(A, B, C);
                return;
            }
            else
            {

                moveHanoi(n - 1, from, tmp, to, a, c, b);
                int test2 = HEIGHT;
                while (true)
                {
                    if (from[test2 - 1] != 0) // atop 함수 체크
                    {
                        break;
                    }
                    else
                    {
                        test2--;
                    }
                }
                btop = 0;
                while (true)
                {
                    if (to[btop] == 0)
                    {
                        break;
                    }
                    else
                    {
                        btop++;
                    }
                }
                Console.WriteLine("Move : {0} -> {1}", a, b);
                to[btop] = from[test2-1];
                from[test2-1] = 0;
                
 
                draw(A, B, C);

                moveHanoi(n - 1, tmp, to, from, c, b, a);
                //moveHanoi(n - 1, from, tmp, to, a, c, b);
                
            }


        }
        static void Main(string[] args)
        {
            String input = Console.ReadLine();
            HEIGHT = int.Parse(input);
            A = new int[HEIGHT];
            B = new int[HEIGHT];
            C = new int[HEIGHT];

            for (int i = 0; i < HEIGHT; i++)
            {
                A[i] = HEIGHT - i;
                B[i] = 0;
                C[i] = 0;
                atop++;
            }
            draw(A, B, C);

            moveHanoi(HEIGHT, A, C, B, 'A', 'C', 'B');

            input = Console.ReadLine();

            return;
        }
    }
}
