package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rf6 {
    public final pf6 a;
    public final ud0 b;
    public final String c;
    public final qf6 d;
    public final re6 e;

    public /* synthetic */ rf6(pf6 pf6Var, ud0 ud0Var, String str, int i) {
        this(pf6Var, ud0Var, str, (i & 8) != 0 ? qf6.E : qf6.F, (i & 16) != 0 ? null : re6.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf6)) {
            return false;
        }
        rf6 rf6Var = (rf6) obj;
        return this.a == rf6Var.a && x44.r(this.b, rf6Var.b) && x44.r(this.c, rf6Var.c) && this.d == rf6Var.d && this.e == rf6Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + kgh.l((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        re6 re6Var = this.e;
        return iHashCode + (re6Var == null ? 0 : re6Var.hashCode());
    }

    public final String toString() {
        return "DrawerTabConfig(tab=" + this.a + ", icon=" + this.b + ", title=" + this.c + ", badge=" + this.d + ", discoveryKey=" + this.e + ")";
    }

    public rf6(pf6 pf6Var, ud0 ud0Var, String str, qf6 qf6Var, re6 re6Var) {
        pf6Var.getClass();
        ud0Var.getClass();
        str.getClass();
        qf6Var.getClass();
        this.a = pf6Var;
        this.b = ud0Var;
        this.c = str;
        this.d = qf6Var;
        this.e = re6Var;
    }
}
