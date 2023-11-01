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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getClassification_number() {
        return classification_number;
    }

    public void setClassification_number(String classification_number) {
        classification_number = classification_number;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWeb_location() {
        return web_location;
    }

    public void setWeb_location(String web_location) {
        this.web_location = web_location;
    }

    public String getPdf_location() {
        return pdf_location;
    }

    public void setPdf_location(String pdf_location) {
        this.pdf_location = pdf_location;
    }

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
