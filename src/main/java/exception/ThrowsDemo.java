package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public void dosome() throws IOException, AWTException{}
}


class SubClass extends ThrowsDemo{

    // 允許拋出超類所有異常
    public void dosome() throws IOException,AWTException{}

    // 允許子類拋出超類方法聲明的一部份
//    public void dosome() throws IOException{}

    // 允許不再拋出異常
//    public void dosome(){}

    // 允許拋出，超類繼承子類中有拋出的異常
//    public void dosome() throws FileNotFoundException{}

    // 不允許拋出額外異常( 沒有任何繼承關係 )
//    public void dosome() throws SQLException{}

    // 不允許拋出比超類大的異常聲明
//    public void dosome() throws Exception{}



}