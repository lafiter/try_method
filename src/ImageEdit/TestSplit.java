package ImageEdit;
import java.awt.Graphics;      
import java.awt.Image;      
import java.awt.Toolkit;      
import java.awt.color.ColorSpace;      
import java.awt.image.BufferedImage;      
import java.awt.image.ColorConvertOp;      
import java.awt.image.CropImageFilter;      
import java.awt.image.FilteredImageSource;      
import java.awt.image.ImageFilter;      
import java.awt.image.ImageProducer;      
import java.io.File;      
import java.io.IOException;      
  
import javax.imageio.ImageIO; 

public class TestSplit {
	//��ͼ�������
//      public static void scale(String srcImageFile,String result,int scale,boolean flag){
//    	  try {
//			BufferedImage src = ImageIO.read(new File(srcImageFile));
//			int width = src.getWidth();
//			int height = src.getHeight();
//			if(flag){
//				//�Ŵ�
//				width = width*scale;
//				height = height*scale;
//			}else{
//				width=width/scale;
//				height = height/scale;
//			}
//			Image image = src.getScaledInstance(width, height, Image.SCALE_DEFAULT);
//			BufferedImage tag = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
//			Graphics g = tag.getGraphics();
//			g.drawImage(image, 0, 0, null);
//			ImageIO.write(tag, "JPEG", new File(result));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//      }
//      //ͼ���и�
//      public static void cut(String srcImageFile,final String descDir,final int destWidth,final int destHeight){
//    	  try {
//			BufferedImage bi = ImageIO.read(new File(srcImageFile));
//			final int srcWidth = bi.getHeight();
//			final int srcHeight = bi.getWidth();
//			if(srcWidth<=destWidth && srcHeight<=destHeight)
//				return;
//			//������Ƭ�ĺ������������
//			int temp = srcWidth/destWidth;
//			int cols = srcWidth%destWidth ==0?temp:temp+1;
//			temp = srcHeight/destHeight;
//			int rows=srcHeight%destHeight ==0?temp:temp+1;
//			//ѭ��������Ƭ��Ҳ���Զ��̼߳ӿ��ٶ�
//			final Image image = bi.getScaledInstance(srcWidth, srcHeight, Image.SCALE_DEFAULT);
//			for(int i=0;i<rows;i++){
//				for(int j=0;j<rows;j++){
//					long bg = System.currentTimeMillis();
//					//�ĸ������ֱ�Ϊͼ���������Ϳ��
//					ImageFilter cropFilter = new CropImageFilter(j * destWidth, i * destHeight, Math.min(destWidth,srcWidth - j * destWidth), Math.min(srcHeight - i * destHeight, destHeight));  
//				
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//      }
	public void main(String args[]){
		System.out.println(123);
	}
}
