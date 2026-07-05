package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class jrc implements vb0 {
    public final int a;
    public final int b;
    public final long c;
    public final hjh d;
    public final i5d e;
    public final d6a f;
    public final int g;
    public final int h;
    public final hkh i;

    public jrc(int i, int i2, long j, hjh hjhVar, i5d i5dVar, d6a d6aVar, int i3, int i4, hkh hkhVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = hjhVar;
        this.e = i5dVar;
        this.f = d6aVar;
        this.g = i3;
        this.h = i4;
        this.i = hkhVar;
        if (clh.a(j, clh.c) || clh.c(j) >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        c39.c("lineHeight can't be negative (" + clh.c(j) + ')');
    }

    public final jrc a(jrc jrcVar) {
        return jrcVar == null ? this : krc.a(this, jrcVar.a, jrcVar.b, jrcVar.c, jrcVar.d, jrcVar.e, jrcVar.f, jrcVar.g, jrcVar.h, jrcVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrc)) {
            return false;
        }
        jrc jrcVar = (jrc) obj;
        return this.a == jrcVar.a && this.b == jrcVar.b && clh.a(this.c, jrcVar.c) && x44.r(this.d, jrcVar.d) && x44.r(this.e, jrcVar.e) && x44.r(this.f, jrcVar.f) && this.g == jrcVar.g && this.h == jrcVar.h && x44.r(this.i, jrcVar.i);
    }

    public final int hashCode() {
        int iC = vb7.c(this.b, Integer.hashCode(this.a) * 31, 31);
        dlh[] dlhVarArr = clh.b;
        int iE = vb7.e(iC, 31, this.c);
        hjh hjhVar = this.d;
        int iHashCode = (iE + (hjhVar != null ? hjhVar.hashCode() : 0)) * 31;
        i5d i5dVar = this.e;
        int iHashCode2 = (iHashCode + (i5dVar != null ? i5dVar.hashCode() : 0)) * 31;
        d6a d6aVar = this.f;
        int iC2 = vb7.c(this.h, vb7.c(this.g, (iHashCode2 + (d6aVar != null ? d6aVar.hashCode() : 0)) * 31, 31), 31);
        hkh hkhVar = this.i;
        return iC2 + (hkhVar != null ? hkhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) fdh.a(this.a)) + ", textDirection=" + ((Object) weh.a(this.b)) + ", lineHeight=" + ((Object) clh.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) e5a.a(this.g)) + ", hyphens=" + ((Object) et8.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public jrc(int i, hjh hjhVar, int i2) {
        this((i2 & 1) != 0 ? 0 : i, 0, clh.c, (i2 & 8) != 0 ? null : hjhVar, null, null, 0, 0, null);
    }
}
