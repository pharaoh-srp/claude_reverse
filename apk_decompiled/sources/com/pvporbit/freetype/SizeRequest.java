package com.pvporbit.freetype;

/* JADX INFO: loaded from: classes3.dex */
public class SizeRequest {
    private long height;
    private int horiResolution;
    private int type;
    private int vertResolution;
    private long width;

    public SizeRequest(int i, int i2, int i3, int i4, int i5) {
        this.type = (i < 0 || i > 5) ? 0 : i;
        this.width = i2;
        this.height = i3;
        this.horiResolution = i4;
        this.vertResolution = i5;
    }

    public long getHeight() {
        return this.height;
    }

    public int getHoriResolution() {
        return this.horiResolution;
    }

    public int getType() {
        return this.type;
    }

    public int getVertResolution() {
        return this.vertResolution;
    }

    public long getWidth() {
        return this.width;
    }

    public void setHeight(long j) {
        this.height = j;
    }

    public void setHoriResolution(int i) {
        this.horiResolution = i;
    }

    public void setType(int i) {
        if (i < 0 || i > 5) {
            i = 0;
        }
        this.type = i;
    }

    public void setVertResolution(int i) {
        this.vertResolution = i;
    }

    public void setWidth(long j) {
        this.width = j;
    }

    public SizeRequest(int i, int i2, int i3, int i4) {
        this(0, i, i2, i3, i4);
    }
}
