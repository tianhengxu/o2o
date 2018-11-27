package utils;

/**
 * Created by sky on 2018/11/26.
 */
public class PathUtils {
    private  static  String seperator=System.getProperty("file.operator");
    public  static  String getImageBasePath(){
        String os=System.getProperty("os.name");
        String basePath="";
        if (os.toLowerCase().startsWith("win")){
            basePath="D:/projectdev/image/";
        }else {
            basePath="/home/projectdev/image/";
        }
        basePath=basePath.replace("/",seperator);
        return  basePath;
    }
    public  static  String getShopImagePath(){
        String imagePath="D:/uplode/item/shop/shopid";
        return  imagePath;
    }
}
