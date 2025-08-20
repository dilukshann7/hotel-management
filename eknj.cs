using System;
namespace StoreThreeIntApp
{
    class Integer
    {
        static void Main(string[] args)
        {
            int StudentNo;
            String studentName;
            double mathsMarks;
            double scienceMarks;
            double englishMarks;
            double avg;

            avg = (mathsMarks + scienceMarks + englishMarks) / 3;

            if (avg <= 100) {
                Console.WriteLine("Distinction")
            }
            else if (avg < 80) {
                Console.WriteLine("Credit");
            }
            else if (avg < 60) {
                Console.WriteLine("Pass");
            }
            else if (avg < 40) {
                Console.WriteLine("Fail");
            }
        }
    }
}