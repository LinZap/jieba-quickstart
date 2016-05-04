using JiebaNet.Segmenter;
using System;
using System.Collections.Generic;

namespace C_sharp
{
    class Program
    {
        static void Main(string[] args)
        {

            JiebaSegmenter segmenter = new JiebaSegmenter();
            //var segments = segmenter.Cut("資訊工程學系");
            //Console.WriteLine(string.Join(" ", segments));
            IEnumerable<string> segments = segmenter.Cut("我来到北京清华大学");  // 默认为精确模式
            Console.WriteLine("【精确模式】：{0}", string.Join("/ ", segments));

        }
    }
}
