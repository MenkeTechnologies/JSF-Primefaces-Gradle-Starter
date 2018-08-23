package com.jakobmenke.beans;

import org.apache.commons.io.FileUtils;

import javax.faces.bean.ManagedBean;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@ManagedBean
public class Form {
    private String text;
    private String choice;
    private String result;

    public void submit() {
        try {
            boolean x = FileUtils.isSymlink(new File("/etc/passwd"));

            try (Scanner scanner = new Scanner(Form.class.getClassLoader().getResourceAsStream("t.properties"))) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }

        result = "Submitted values: " + text + ", " + choice;
        System.out.println(result);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getResult() {
        return result;
    }
}