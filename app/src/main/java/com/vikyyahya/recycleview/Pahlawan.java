package com.vikyyahya.recycleview;

import android.os.Parcel;
import android.os.Parcelable;

public class Pahlawan implements Parcelable{
 private String name, remark , foto , detail,tglLahir,tglWafat ;

    protected Pahlawan(Parcel in) {
        name = in.readString();
        remark = in.readString();
        foto = in.readString();
        detail = in.readString();
        tglLahir = in.readString();
        tglWafat = in.readString();
    }

    public Pahlawan() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(remark);
        dest.writeString(foto);
        dest.writeString(detail);
        dest.writeString(tglLahir);
        dest.writeString(tglWafat);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Pahlawan> CREATOR = new Creator<Pahlawan>() {
        @Override
        public Pahlawan createFromParcel(Parcel in) {
            return new Pahlawan(in);
        }

        @Override
        public Pahlawan[] newArray(int size) {
            return new Pahlawan[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getTglWafat() {
        return tglWafat;
    }

    public void setTglWafat(String tglWafat) {
        this.tglWafat = tglWafat;
    }
}
