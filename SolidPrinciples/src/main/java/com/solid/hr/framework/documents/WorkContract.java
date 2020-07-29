package com.solid.hr.framework.documents;

public class WorkContract implements
        ExportableJson,
        ExportableTxt,
        ExportablePdf {
    private String content;

    public WorkContract(String content) {
        this.content = content;
    }

    @Override
    public byte[] toPdf() {
        // Test implementation, it will be more complex
        return content.getBytes();
    }

    @Override
    public String toJson() {
        // Test implementation, it will be more complex
        return "{'content':'" + this.content + "'}";
    }

    @Override
    public String toTxt() {
        // Test implementation, it will be more complex
        return this.content;
    }
}