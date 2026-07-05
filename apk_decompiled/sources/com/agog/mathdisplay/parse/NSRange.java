package com.agog.mathdisplay.parse;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.vb7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/agog/mathdisplay/parse/NSRange;", "", "location", "", "length", "<init>", "(II)V", "getLocation", "()I", "setLocation", "(I)V", "getLength", "setLength", "equal", "", "cmp", "maxrange", "getMaxrange", "union", "a", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class NSRange {
    private int length;
    private int location;

    public /* synthetic */ NSRange(int i, int i2, int i3, mq5 mq5Var) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public static /* synthetic */ NSRange copy$default(NSRange nSRange, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nSRange.location;
        }
        if ((i3 & 2) != 0) {
            i2 = nSRange.length;
        }
        return nSRange.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    public final NSRange copy(int location, int length) {
        return new NSRange(location, length);
    }

    public final boolean equal(NSRange cmp) {
        cmp.getClass();
        return cmp.location == this.location && cmp.length == this.length;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NSRange)) {
            return false;
        }
        NSRange nSRange = (NSRange) other;
        return this.location == nSRange.location && this.length == nSRange.length;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int getMaxrange() {
        return this.location + this.length;
    }

    public int hashCode() {
        return Integer.hashCode(this.length) + (Integer.hashCode(this.location) * 31);
    }

    public final void setLength(int i) {
        this.length = i;
    }

    public final void setLocation(int i) {
        this.location = i;
    }

    public String toString() {
        return vb7.q("NSRange(location=", ", length=", this.location, this.length, ")");
    }

    public final NSRange union(NSRange a) {
        a.getClass();
        int iMax = Math.max(a.getMaxrange(), getMaxrange());
        int iMin = Math.min(a.location, this.location);
        return new NSRange(iMin, iMax - iMin);
    }

    public NSRange(int i, int i2) {
        this.location = i;
        this.length = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NSRange() {
        int i = 0;
        this(i, i, 3, null);
    }
}
