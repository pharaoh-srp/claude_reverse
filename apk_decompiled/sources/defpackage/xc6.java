package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xc6 {
    public final e0g a;
    public final e0g b;
    public final e0g c;

    public xc6(e0g e0gVar, e0g e0gVar2, e0g e0gVar3) {
        this.a = e0gVar;
        this.b = e0gVar2;
        this.c = e0gVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xc6)) {
            return false;
        }
        xc6 xc6Var = (xc6) obj;
        return x44.r(this.a, xc6Var.a) && x44.r(this.b, xc6Var.b) && x44.r(this.c, xc6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
