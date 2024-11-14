package com.example.extreme_energy_efficiency.dao.entity;

public class InfoEntity {
    private String id;
    private String article_name;
    private String author;
    private String institution;
    private String source;
    private String data;
    private String keyword;
    private String classification_number;
    private String summary;
    private String web_location;
    private String pdf_location;

    

    @Override
    public String toString() {
        return "InfoEntity{" +
                "id='" + id + '\'' +
                ", article_name='" + article_name + '\'' +
                ", author='" + author + '\'' +
                ", institution='" + institution + '\'' +
                ", source='" + source + '\'' +
                ", data='" + data + '\'' +
                ", keyword='" + keyword + '\'' +
                ", Classification_number='" + classification_number + '\'' +
                ", summary='" + summary + '\'' +
                ", web_location='" + web_location + '\'' +
                ", pdf_location='" + pdf_location + '\'' +
                '}';
    }
}
