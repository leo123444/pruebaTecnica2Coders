package com.example.a2coderslist.modelo.master;

import android.graphics.drawable.Drawable;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;

import java.io.Serializable;

public class ContenidoListaMaster implements Serializable {
private int icon;
private String title, detail;

public ContenidoListaMaster(int icon, String title, String detail){
    this.icon=icon;
    this.title=title;
    this.detail=detail;

}

    public int getIcon() {
        return this.icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
