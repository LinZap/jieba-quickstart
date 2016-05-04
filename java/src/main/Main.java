package main;
import java.io.IOException;
import java.util.List;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;
import com.huaban.analysis.jieba.SegToken;

public class Main {

	public static void main(String[] args) throws IOException {

		JiebaSegmenter segmenter = new JiebaSegmenter();
		
		segmenter.addWord("學系");
		
	    String[] sentences =
	        new String[] {"資訊工程學系","資訊管理學系","應用化學學系","土木工程學系","外國語言學系"};
	    for (String sentence : sentences) {
	    	List<SegToken> res = segmenter.process(sentence, SegMode.SEARCH);
	        
	    	for(SegToken t: res)
	    		System.out.print(t.word+"　");
	    	System.out.println();
	    	
	    }
	}

}
