package com.agog.mathdisplay.render;

import defpackage.mdj;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tB\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0002\u0010\rJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\b\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/agog/mathdisplay/render/BoundingBox;", "", "<init>", "()V", "minX", "", "minY", "maxX", "maxY", "(FFFF)V", "numbers", "", "", "(Ljava/util/List;)V", "lowerLeftX", "getLowerLeftX", "()F", "setLowerLeftX", "(F)V", "lowerLeftY", "getLowerLeftY", "setLowerLeftY", "upperRightX", "getUpperRightX", "setUpperRightX", "upperRightY", "getUpperRightY", "setUpperRightY", "width", "getWidth", "height", "getHeight", "contains", "", "x", "y", "toString", "", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class BoundingBox {
    private float lowerLeftX;
    private float lowerLeftY;
    private float upperRightX;
    private float upperRightY;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoundingBox(List<? extends Number> list) {
        this();
        list.getClass();
        this.lowerLeftX = list.get(0).floatValue();
        this.lowerLeftY = list.get(1).floatValue();
        this.upperRightX = list.get(2).floatValue();
        this.upperRightY = list.get(3).floatValue();
    }

    public final boolean contains(float x, float y) {
        return x >= this.lowerLeftX && x <= this.upperRightX && y >= this.lowerLeftY && y <= this.upperRightY;
    }

    public final float getHeight() {
        return this.upperRightY - this.lowerLeftY;
    }

    public final float getLowerLeftX() {
        return this.lowerLeftX;
    }

    public final float getLowerLeftY() {
        return this.lowerLeftY;
    }

    public final float getUpperRightX() {
        return this.upperRightX;
    }

    public final float getUpperRightY() {
        return this.upperRightY;
    }

    public final float getWidth() {
        return this.upperRightX - this.lowerLeftX;
    }

    public final void setLowerLeftX(float f) {
        this.lowerLeftX = f;
    }

    public final void setLowerLeftY(float f) {
        this.lowerLeftY = f;
    }

    public final void setUpperRightX(float f) {
        this.upperRightX = f;
    }

    public final void setUpperRightY(float f) {
        this.upperRightY = f;
    }

    public String toString() {
        return "[" + this.lowerLeftX + "," + this.lowerLeftY + "," + this.upperRightX + "," + this.upperRightY + "]";
    }

    public BoundingBox(float f, float f2, float f3, float f4) {
        this();
        this.lowerLeftX = f;
        this.lowerLeftY = f2;
        this.upperRightX = f3;
        this.upperRightY = f4;
    }

    public BoundingBox() {
    }
}
