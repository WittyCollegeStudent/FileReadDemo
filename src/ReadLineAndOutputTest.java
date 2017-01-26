import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadLineAndOutputTest {

	public static void main(String[] args) {
		File fileSrc = new File("D:\\javaStudy\\MyJavaCode\\writeFile.txt");
		ReadLineAndOutputTool tool = new ReadLineAndOutputTool(fileSrc);
		tool.readLineAndOutput();
	}

}

class ReadLineAndOutputTool{
	private File fileSrc;
	public ReadLineAndOutputTool(File fileSrc){
		this.fileSrc = fileSrc;
	}
	public void readLineAndOutput(){
		//读取fileSrc，同时输出顺序和逆序
		try {
			BufferedReader dis = new BufferedReader(new InputStreamReader(new FileInputStream(fileSrc)));
			String line;
			char[] list = new char[1000];
			while((line = dis.readLine())!=null){
				System.out.println("读入:"+line);
				list = line.toCharArray();
				System.out.println("逆序输出:");
				for(int i = list.length-1;i >= 0;i--)
					System.out.print(list[i]);
				System.out.println();
			}
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
