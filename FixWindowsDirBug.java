import java.util.*;

class FixWindowsDirBug{
	public static void main(String[] args){
		FixWindowsDirBug quickFix = new FixWindowsDirBug();
		String[] dirPath = {"asd", "dfg","sd","dfghh","ggd","dgdghj","dfd","gjgdgd"};
		quickFix.moveToPath(dirPath, 0);
	}

	void moveToPath(String[] paths, int i){
		int pathLength = paths.length;
		int chunkSize = 10;

		while(i < pathLength){
			int chunkLen = 0;
			int j=0;
			StringBuilder stringBuilder = new StringBuilder();
			while(chunkLen+paths[i+j].length() < chunkSize){
				stringBuilder.append(paths[i+j]);
				chunkLen += paths[i+j].length();
				j++;
				if(i+j>=pathLength)break; 				
			}
			System.out.println(stringBuilder.toString());
			i = i+j;
		}
	}
}

