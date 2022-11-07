package org.hy.common.zxing.junit;

import java.io.IOException;

import org.hy.common.zxing.ZXingHelp;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;





/**
 * 生成二维码图片
 * 解释二维码图片
 *
 * @author      ZhengWei(HY)
 * @createDate  2017-09-28
 * @version     v1.0
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU_ZXingHelp
{
  
    /**
     * 生成图像
     * 
     * @throws WriterException
     * @throws IOException
     */
    @Test
    public void test001_Encode() throws WriterException ,IOException
    {
        //ZXingHelp.encodeToFile(BarcodeFormat.QR_CODE  ,"C:\\Users\\hyzhe\\Desktop\\zxing2D.png"       ,"https://www.baidu.com" ,300 ,300);
        ZXingHelp.encodeToFile(BarcodeFormat.QR_CODE  ,"C:\\Users\\hyzhe\\Desktop\\互联网标示解析.png" ,"88.162.02/C40.001.21013295" ,1024 ,1024);
        ZXingHelp.encodeToFile(BarcodeFormat.QR_CODE  ,"C:\\Users\\hyzhe\\Desktop\\计算书.png" ,"https://www.wzyb.com.cn/xx/specification/previewLectotypeRes.z?modelID=8a81b2a9602ab2c9016067597dfb0203&&productModelID=AF26C147E4F543758CB439300D44613F&&exportType=3#" ,2048 ,2048);
        ZXingHelp.encodeToFile(BarcodeFormat.QR_CODE  ,"C:\\Users\\hyzhe\\Desktop\\数据表.png" ,"https://www.wzyb.com.cn/xx/specification/previewLectotypeRes.z?modelID=8a81b2a9602ab2c9016067597dfb0203&&productModelID=AF26C147E4F543758CB439300D44613F&&exportType=1#" ,2048 ,2048);
        // ZXingHelp.encodeToFile(BarcodeFormat.CODE_128 ,"C:\\Users\\hyzhe\\Desktop\\zxing1D.png"       ,"Abc1234567890"        ,200 ,50);
        
        System.out.println("输出成功.");
    }
    
    
  
    /**
     * 解析图像
     */
    @Test
    public void test002_Decode()
    {
        System.out.println("识别二维码：" + ZXingHelp.decode("C:\\Users\\hyzhe\\Desktop\\zxing2D.png"));
        System.out.println("识别条形码：" + ZXingHelp.decode("C:\\Users\\hyzhe\\Desktop\\zxing1D.png"));
    }
    
}
