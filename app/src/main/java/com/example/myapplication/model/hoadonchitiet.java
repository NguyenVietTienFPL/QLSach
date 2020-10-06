package com.example.myapplication.model;

public class hoadonchitiet {
    private int idhoadonchitiet;
    private int idBook;
    private int idBill;

    public hoadonchitiet() {
    }

    public hoadonchitiet(int idhoadonchitiet, int idBook, int idBill) {
        this.idhoadonchitiet = idhoadonchitiet;
        this.idBook = idBook;
        this.idBill = idBill;
    }

    public int getIdhoadonchitiet() {
        return idhoadonchitiet;
    }

    public void setIdhoadonchitiet(int idhoadonchitiet) {
        this.idhoadonchitiet = idhoadonchitiet;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }
}
