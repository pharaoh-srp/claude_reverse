package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class drc {
    public final x30 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public drc(x30 x30Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = x30Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final l9e a(l9e l9eVar) {
        return l9eVar.m((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = kkh.b;
            if (kkh.c(j, j2)) {
                return j2;
            }
        }
        int i = kkh.c;
        int i2 = this.b;
        return mwa.m(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final l9e c(l9e l9eVar) {
        float f = -this.f;
        return l9eVar.m((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return wd6.e0(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drc) {
            drc drcVar = (drc) obj;
            if (this.a == drcVar.a && this.b == drcVar.b && this.c == drcVar.c && this.d == drcVar.d && this.e == drcVar.e && Float.compare(this.f, drcVar.f) == 0 && Float.compare(this.g, drcVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + vb7.b(this.f, vb7.c(this.e, vb7.c(this.d, vb7.c(this.c, vb7.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return ebh.o(sb, this.g, ')');
    }
}
