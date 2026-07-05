package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class i4g {
    public static final i4g c;
    public final mnc a;
    public final float b;

    static {
        c = new i4g((3 & 1) != 0 ? new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) : null, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public i4g(mnc mncVar, float f) {
        mncVar.getClass();
        this.a = mncVar;
        this.b = f;
    }

    public static i4g a(i4g i4gVar, float f) {
        mnc mncVar = i4gVar.a;
        i4gVar.getClass();
        mncVar.getClass();
        return new i4g(mncVar, f);
    }

    public final qnc b() {
        mnc mncVar = this.a;
        fu9 fu9Var = fu9.E;
        return gb9.d(gb9.m(mncVar, fu9Var), MTTypesetterKt.kLineSkipLimitMultiplier, gb9.l(mncVar, fu9Var), this.b, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4g)) {
            return false;
        }
        i4g i4gVar = (i4g) obj;
        return x44.r(this.a, i4gVar.a) && va6.b(this.b, i4gVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SheetContentPadding(horizontal=" + this.a + ", bottom=" + va6.c(this.b) + ")";
    }
}
