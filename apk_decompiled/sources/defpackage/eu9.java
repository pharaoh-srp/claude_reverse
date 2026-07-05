package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eu9 {
    public final du9 a;
    public final du9 b;
    public final du9 c;
    public final du9 d;

    public /* synthetic */ eu9() {
        this(new du9(), new du9(), new du9(), new du9());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu9)) {
            return false;
        }
        eu9 eu9Var = (eu9) obj;
        return x44.r(this.a, eu9Var.a) && x44.r(this.b, eu9Var.b) && x44.r(this.c, eu9Var.c) && x44.r(this.d, eu9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutCorners(topStart=" + this.a + ", topEnd=" + this.b + ", bottomEnd=" + this.c + ", bottomStart=" + this.d + ')';
    }

    public eu9(du9 du9Var, du9 du9Var2, du9 du9Var3, du9 du9Var4) {
        this.a = du9Var;
        this.b = du9Var2;
        this.c = du9Var3;
        this.d = du9Var4;
    }
}
