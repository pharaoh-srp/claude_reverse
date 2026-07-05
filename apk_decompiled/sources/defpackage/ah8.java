package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ah8 {
    public final tkh a;
    public final tkh b;
    public final tkh c;
    public final tkh d;
    public final tkh e;
    public final tkh f;
    public final tkh g;

    public ah8(tkh tkhVar, tkh tkhVar2, tkh tkhVar3) {
        tkhVar.getClass();
        tkhVar2.getClass();
        tkhVar3.getClass();
        tkhVar3.getClass();
        tkhVar3.getClass();
        tkhVar3.getClass();
        tkhVar.getClass();
        this.a = tkhVar;
        this.b = tkhVar2;
        this.c = tkhVar3;
        this.d = tkhVar3;
        this.e = tkhVar3;
        this.f = tkhVar3;
        this.g = tkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah8)) {
            return false;
        }
        ah8 ah8Var = (ah8) obj;
        return x44.r(this.a, ah8Var.a) && x44.r(this.b, ah8Var.b) && x44.r(this.c, ah8Var.c) && this.d.equals(ah8Var.d) && this.e.equals(ah8Var.e) && this.f.equals(ah8Var.f) && this.g.equals(ah8Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gid.n(this.f, gid.n(this.e, gid.n(this.d, gid.n(this.c, gid.n(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "HeadingStyles(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", h0=" + this.g + ")";
    }
}
