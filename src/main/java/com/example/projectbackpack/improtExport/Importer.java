package com.example.projectbackpack.improtExport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Importer {
    String path;

    public Importer(String path) throws FileNotFoundException {
        this.path = path;
    }
    FileInputStream file = new FileInputStream(new File(path));
}
