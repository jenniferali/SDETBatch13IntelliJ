package com.syntax.class24;
public class HW {
    //Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
    // while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
    // of open behaviour. Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft
    // word to be installed etc
}
abstract class File {
    abstract void open();
    void edit() {
        System.out.println("Edit File");
    }
    void close() {
        System.out.println("Close File");
    }
}
class JavaFile extends File {
    @Override
    void open() {
        System.out.println("Please install IntelliJ to open .java file");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("Please install OfficeSuite to open .doc file");
    }
    }
class PdfFile extends File {
        @Override
        void open() {
            System.out.println("Please install Adobe to open .pdf file");
        }
    }


