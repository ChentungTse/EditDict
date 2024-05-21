import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {

        System.out.println("你想处理哪一个字典数据？（1 印尼语，2葡萄牙语）");

        // 新建一个字典，并初始化数据
        Data_Dict dataDict = new Data_Dict();
        dataDict.versionIndonesia = "未获取到字典版本";
        dataDict.versionPortuguese = "未获取到字典版本";
        //新建一个变量，判断用户需要编辑葡萄牙语字典还是和印尼语字典
        int chooseDict = 0; // 1 = 印尼语字典数据；2 = 葡萄牙语字典数据
        Scanner enterDict = new Scanner(System.in);
        chooseDict = enterDict.nextInt();
        if (chooseDict == 1)
        {
            //开始处理印尼语字典的数据
            dataDict.locationIndonesia = "no localtion";
            //System.out.println("印尼语字典数据地址是："+dataDict.locationIndonesia);
            while(!new File(dataDict.locationIndonesia).exists())
            {
                System.out.println("请拖拽印尼语字典文件的位置至此：");
                dataDict.locationIndonesia = new Scanner(System.in).nextLine();
                if (!new File(dataDict.locationIndonesia).exists())
                    System.out.println( dataDict.locationIndonesia + "地址有误：" );
            }
            System.out.println("成功找到字典文件" + dataDict.locationIndonesia);

        }
        else if (chooseDict == 2)
        {
            //开始处理葡萄牙语字典的数据
            System.out.println("你要处理葡萄牙语数据。");
        }
    }
}