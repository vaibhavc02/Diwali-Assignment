namespace ArrayList
    
{
    using System.Collections;
    internal class Program
    {
        static void Main(string[] args)
        {
            ArrayList arr = new ArrayList();

            for (int i = 0; i < 10; i++)
            {
                Console.Write($"Enter name {i + 1}: ");
                string name = Console.ReadLine();
                arr.Add(name);
            }
            arr.Sort();

            Console.WriteLine("\nSorted Names:");
            foreach (string name in arr)
            {
                Console.WriteLine(name);
            }
        }
    }
}
