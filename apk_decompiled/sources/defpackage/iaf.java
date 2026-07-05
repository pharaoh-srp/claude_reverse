package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class iaf {
    public static final iaf e = new iaf(haf.F, MTTypesetterKt.kLineSkipLimitMultiplier, uxe.c0, new wj(1, null, 3));
    public final haf a;
    public final float b;
    public final zy7 c;
    public final bz7 d;

    public iaf(haf hafVar, float f, zy7 zy7Var, bz7 bz7Var) {
        this.a = hafVar;
        this.b = f;
        this.c = zy7Var;
        this.d = bz7Var;
    }

    public final haf a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final zy7 c() {
        return this.c;
    }

    public final bz7 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaf)) {
            return false;
        }
        iaf iafVar = (iaf) obj;
        return this.a == iafVar.a && Float.compare(this.b, iafVar.b) == 0 && this.c.equals(iafVar.c) && this.d.equals(iafVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + vb7.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.a + ", speedMultiplier=" + this.b + ", maxScrollDistanceProvider=" + this.c + ", onScroll=" + this.d + ')';
    }
}
