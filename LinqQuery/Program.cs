using System.Linq;

namespace LinqQuery
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = { 12, 5, 24, 10, 9, 8, 4, 87, 23, 7, 11, 43 };

            var res = from num in arr
                         where num < 20
                         select num;

            foreach (var n in res)
            {
                Console.WriteLine(n);
            }
        }
    }
}
