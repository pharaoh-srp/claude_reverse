package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xjh {
    public final zb0 a;
    public final tkh b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final cz5 g;
    public final fu9 h;
    public final wt7 i;
    public final long j;

    public xjh(zb0 zb0Var, tkh tkhVar, List list, int i, boolean z, int i2, cz5 cz5Var, fu9 fu9Var, wt7 wt7Var, long j) {
        this.a = zb0Var;
        this.b = tkhVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = cz5Var;
        this.h = fu9Var;
        this.i = wt7Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjh)) {
            return false;
        }
        xjh xjhVar = (xjh) obj;
        return x44.r(this.a, xjhVar.a) && x44.r(this.b, xjhVar.b) && x44.r(this.c, xjhVar.c) && this.d == xjhVar.d && this.e == xjhVar.e && this.f == xjhVar.f && x44.r(this.g, xjhVar.g) && this.h == xjhVar.h && x44.r(this.i, xjhVar.i) && rl4.b(this.j, xjhVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + vb7.c(this.f, fsh.p((kgh.m(gid.n(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) rl4.l(this.j));
        sb.append(')');
        return sb.toString();
    }
}
