package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml3 {
    public static final /* synthetic */ int f = 0;
    public final hm3 a;
    public final of6 b;
    public final zy7 c;
    public final zy7 d;
    public final boolean e;

    static {
        xg5 xg5Var = new xg5(10);
        new ml3(hm3.E, new of6(og6.E, xg5Var), new rk3(5), (zy7) null, 24);
    }

    public ml3(hm3 hm3Var, of6 of6Var, zy7 zy7Var, zy7 zy7Var2, boolean z) {
        of6Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        this.a = hm3Var;
        this.b = of6Var;
        this.c = zy7Var;
        this.d = zy7Var2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml3)) {
            return false;
        }
        ml3 ml3Var = (ml3) obj;
        return this.a == ml3Var.a && x44.r(this.b, ml3Var.b) && x44.r(this.c, ml3Var.c) && x44.r(this.d, ml3Var.d) && this.e == ml3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClaudeDrawerState(navigationButtonType=");
        sb.append(this.a);
        sb.append(", drawerState=");
        sb.append(this.b);
        sb.append(", onClickBack=");
        sb.append(this.c);
        sb.append(", onOpenDrawer=");
        sb.append(this.d);
        sb.append(", showToggleBadge=");
        return sq6.v(")", sb, this.e);
    }

    public /* synthetic */ ml3(hm3 hm3Var, of6 of6Var, zy7 zy7Var, zy7 zy7Var2, int i) {
        this(hm3Var, of6Var, zy7Var, (i & 8) != 0 ? new rk3(5) : zy7Var2, false);
    }
}
