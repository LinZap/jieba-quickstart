package main;
import java.io.IOException;
import java.util.List;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;
import com.huaban.analysis.jieba.SegToken;

public class Main {

	public static void main(String[] args) throws IOException {

		JiebaSegmenter segmenter = new JiebaSegmenter();
		
		segmenter.addWord("�Ǩt");
		
	    String[] sentences =
	        new String[] {"��T�u�{�Ǩt","��T�޲z�Ǩt","���ΤƾǾǨt","�g��u�{�Ǩt","�~��y���Ǩt"};
	    for (String sentence : sentences) {
	    	List<SegToken> res = segmenter.process(sentence, SegMode.SEARCH);
	        
	    	for(SegToken t: res)
	    		System.out.print(t.word+"�@");
	    	System.out.println();
	    	
	    }
	}

}
