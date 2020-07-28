package com.solid.hr.framework.documents;

public interface ExportableDocument {
    byte[] toPdf();
    String toJson();
    String toTxt();
}
