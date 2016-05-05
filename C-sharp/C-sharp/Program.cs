using JiebaNet.Segmenter;
using System;

namespace C_sharp
{
    class Program
    {
        static void Main(string[] args)
        {

            JiebaSegmenter segmenter = new JiebaSegmenter();
            segmenter.AddWord("學系");

            String[] sets = new String[] { "資訊工程學系", "資訊管理學系", "應用化學學系", "土木工程學系", "外國語言學系" };

            foreach (string s in sets) 
                Console.WriteLine(string.Join(" ", segmenter.Cut(s)));
            
            Console.ReadKey();
         }
    }
}
