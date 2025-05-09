import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("E:\\6th semester\\network porgeamming\\programs\\chaneltxt.txt", "r");
        FileChannel fileChannel = file.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (fileChannel.read(byteBuffer) > 0) {
            byteBuffer.flip(); // prepare buffer for reading
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear(); // prepare buffer for next read
        }

        file.close();
    }
}
