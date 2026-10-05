package com.Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUD
{
    String fileName = "student.txt";

    // CREATE
    void createFile()
    {
        try
        {
            File f = new File(fileName);

            if(f.createNewFile())
            {
                System.out.println("File Created Successfully");
            }
            else
            {
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error while creating file");
        }
    }

    // WRITE
    void writeDataIntoFile()
    {
        try
        {
            FileWriter fw = new FileWriter(fileName);

            fw.write("Name : Ram\n");
            fw.write("Age : 20\n");
            fw.write("Address : Pune\n");

            fw.close();

            System.out.println("Data Written Successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error while writing data");
        }
    }

    // READ
    void readDataFromFile()
    {
        try
        {
            File f = new File(fileName);

            Scanner sc = new Scanner(f);

            while(sc.hasNextLine())
            {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        }
        catch(IOException e)
        {
            System.out.println("Error while reading file");
        }
    }

    // DELETE
    void deleteFile()
    {
        File f = new File(fileName);

        if(f.delete())
        {
            System.out.println("File Deleted Successfully");
        }
        else
        {
            System.out.println("File Not Found");
        }
    }


    public static void main(String[] args)
    {
        CRUD c = new CRUD();

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n1. Create File");
            System.out.println("2. Write Data");
            System.out.println("3. Read Data");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    c.createFile();
                    break;

                case 2:
                    c.writeDataIntoFile();
                    break;

                case 3:
                    c.readDataFromFile();
                    break;

                case 4:
                    c.deleteFile();
                    break;

                case 5:
                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}