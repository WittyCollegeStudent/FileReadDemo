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
		//��ȡfileSrc��ͬʱ���˳�������
		try {
			BufferedReader dis = new BufferedReader(new InputStreamReader(new FileInputStream(fileSrc)));
			String line;
			char[] list = new char[1000];
			while((line = dis.readLine())!=null){
				System.out.println("����:"+line);
				list = line.toCharArray();
				System.out.println("�������:");
				for(int i = list.length-1;i >= 0;i--)
					System.out.print(list[i]);
				System.out.println();
			}
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
