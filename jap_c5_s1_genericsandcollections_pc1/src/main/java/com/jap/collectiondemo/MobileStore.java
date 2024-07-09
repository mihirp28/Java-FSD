package com.jap.collectiondemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileStore {



    public MobileStore()
    {

    }
    public List<Mobile> readMobileData(String fileName)
    {
        Mobile m=null;
        List<Mobile> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            String[] keep=null;
            String read=null;
            while((read=br.readLine())!=null) {
                keep=read.split(",");
                m = new Mobile(keep[0],keep[1],Double.parseDouble(keep[2]),keep[3],keep[4],keep[5],Integer.parseInt(keep[6]));
                list.add(m);
            }
            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
        Mobile m=null;
        List<Mobile> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("mobile.csv"));
            br.readLine();
            String[] keep=null;
            String read=null;
            while((read=br.readLine())!=null) {
                keep=read.split(",");
                if(keep[0].equals(brandName)) {
                    m = new Mobile(keep[0],keep[1],Double.parseDouble(keep[2]),keep[3],keep[4],keep[5],Integer.parseInt(keep[6]));
                    list.add(m);
                }
            }
            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {
        Mobile m=null;
        List<Mobile> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("mobile.csv"));
            br.readLine();
            String[] keep=null;
            String read=null;
            while((read=br.readLine())!=null) {
                keep=read.split(",");
                if(Double.parseDouble(keep[2])>500) {
                    m = new Mobile(keep[0],keep[1],Double.parseDouble(keep[2]),keep[3],keep[4],keep[5],Integer.parseInt(keep[6]));
                    list.add(m);
                }
            }
            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
        Mobile m=null;
        List<Mobile> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("mobile.csv"));
            br.readLine();
            String[] keep=null;
            String read=null;
            while((read=br.readLine())!=null) {
                keep=read.split(",");
                if(Integer.parseInt(keep[6])>12) {
                    m = new Mobile(keep[0],keep[1],Double.parseDouble(keep[2]),keep[3],keep[4],keep[5],Integer.parseInt(keep[6]));
                    list.add(m);
                }
            }
            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        String fileName = "mobile.csv";
        MobileStore ms = new MobileStore();
        List<Mobile> list;
        list=ms.findPhonePixelMoreThan12MP();
        Iterator<Mobile> i = list.iterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
            System.out.println();
        }
    }

}