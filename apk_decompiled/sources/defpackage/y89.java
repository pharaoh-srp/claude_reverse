package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y89 extends jv8 {
    public final String b;
    public final String c;
    public final String d;

    public y89(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y89.class != obj.getClass()) {
            return false;
        }
        y89 y89Var = (y89) obj;
        return this.c.equals(y89Var.c) && this.b.equals(y89Var.b) && this.d.equals(y89Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(kgh.l(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
