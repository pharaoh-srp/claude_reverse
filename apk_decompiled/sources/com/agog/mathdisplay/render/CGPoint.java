package com.agog.mathdisplay.render;

import defpackage.mdj;
import defpackage.mq5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/agog/mathdisplay/render/CGPoint;", "", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class CGPoint {
    private float x;
    private float y;

    public /* synthetic */ CGPoint(float f, float f2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public static /* synthetic */ CGPoint copy$default(CGPoint cGPoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cGPoint.x;
        }
        if ((i & 2) != 0) {
            f2 = cGPoint.y;
        }
        return cGPoint.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final CGPoint copy(float x, float y) {
        return new CGPoint(x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CGPoint)) {
            return false;
        }
        CGPoint cGPoint = (CGPoint) other;
        return Float.compare(this.x, cGPoint.x) == 0 && Float.compare(this.y, cGPoint.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public String toString() {
        return "CGPoint(x=" + this.x + ", y=" + this.y + ")";
    }

    public CGPoint(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CGPoint() {
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        this(f, f, 3, null);
    }
}
