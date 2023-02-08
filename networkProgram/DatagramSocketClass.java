package networkProgram;
import java.net.*;
import java.util.*;

public class DatagramSocketClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            byte []str = null;
            System.out.println("client started");