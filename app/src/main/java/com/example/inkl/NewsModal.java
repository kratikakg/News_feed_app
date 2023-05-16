package com.example.inkl;

public class NewsModal {
    private int TotalResults;
    private String status;
    private ArrayList<Articles> articles;

    public NewsModal(int totalResults, String status, ArrayList<Articles> articles) {
        this.TotalResults = totalResults;
        this.status = status;
        this.articles = articles;
    }

    public int getTotalResults() {
        return TotalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public ArrayList<Articles> getArticles() {  
        return articles;
    }
    public void setArticles(ArrayList<Articles> articles){
        this.articles = articles;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
