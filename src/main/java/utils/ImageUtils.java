package utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by sky on 2018/11/26.
 */
public class ImageUtils {
    private static String absolute = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();

    public static String generateThumbnail(File thumbnail, String targetAddr)  {
        String realactiveAddr="";
        try {

            String realName = getRandomFileName();
            String extension = getFileExtenson(thumbnail);
            targetAddr=makeDirPath(targetAddr);
             realactiveAddr = targetAddr + realName + extension;
            Thumbnails.of(new FileInputStream(thumbnail)).size(200, 200).watermark(Positions.BOTTOM_RIGHT,
                    ImageIO.read(new File(absolute+"/watermark.jpg")),0.25f).outputQuality(0.8f).toFile(realactiveAddr);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        return realactiveAddr;
    }

    /*
       获取输入流文件扩展名
        */
    private static String getFileExtenson(File thumbnail) {
        String originalFileName = thumbnail.getName();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }


    private static String makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtils.getImageBasePath() + targetAddr;
        File dirpath = new File(realFileParentPath);
        if (!dirpath.exists()) {
            dirpath.mkdirs();
        }

        return realFileParentPath+"/";
    }

    private static String getRandomFileName() {
        String rannum = String.valueOf(r.nextInt(89999) + 10000);
        String nowtTime = format.format(new Date());
        return nowtTime + rannum;
    }

    public static void main(String args[]) throws IOException {
        //获取当前线程对应的路径
        String absolute = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        Thumbnails.of(new File("C:\\Users\\sky\\Desktop\\image\\robot.jpg")).size(320, 320).
                watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("C:\\Users\\" +
                        "sky\\Desktop\\image\\watermark.jpg")), 0.85f).outputQuality(0.8f).
                toFile(new File("C:\\Users\\sky\\Desktop\\image\\newMe.jpg"));
    }
}
