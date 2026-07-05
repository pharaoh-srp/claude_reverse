package com.pvporbit.freetype;

import defpackage.vb7;

/* JADX INFO: loaded from: classes3.dex */
public class Kerning {
    private final int x;
    private final int y;

    public Kerning(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public int getHorizontalKerning() {
        return this.x;
    }

    public int getVerticalKerning() {
        return this.y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Kerning(");
        sb.append(this.x);
        sb.append(", ");
        return vb7.l(this.y, ")", sb);
    }
}
