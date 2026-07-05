package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class dgh {
    public static final dgh f = new dgh(false, 9205357640488583168L, MTTypesetterKt.kLineSkipLimitMultiplier, lne.E, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final lne d;
    public final boolean e;

    public dgh(boolean z, long j, float f2, lne lneVar, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = lneVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgh)) {
            return false;
        }
        dgh dghVar = (dgh) obj;
        return this.a == dghVar.a && fcc.c(this.b, dghVar.b) && Float.compare(this.c, dghVar.c) == 0 && this.d == dghVar.d && this.e == dghVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + vb7.b(this.c, vb7.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) fcc.k(this.b));
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return y6a.p(sb, this.e, ')');
    }
}
