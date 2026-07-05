package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zw7 implements oh7 {
    public static final List g = x44.X(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public final h1 a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final int f;

    static {
        x44.X(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public zw7() {
        List list = g;
        list.getClass();
        y28 y28Var = vph.d;
        y28Var.getClass();
        this.a = y28Var;
        this.b = 1;
        this.c = 9;
        this.d = list;
        this.e = 1;
        this.f = 9;
    }

    @Override // defpackage.oh7
    public final af4 a() {
        this.a.a();
        this.d.getClass();
        af4 af4Var = new af4();
        int i = this.b;
        if (1 > i || i >= 10) {
            mr9.q(grc.u("The minimum number of digits (", i, ") is not in range 1..9"));
            return null;
        }
        int i2 = this.c;
        if (i <= i2 && i2 < 10) {
            return af4Var;
        }
        mr9.q(vb7.q("The maximum number of digits (", ") is not in range ", i2, i, "..9"));
        return null;
    }

    @Override // defpackage.oh7
    public final auc b() {
        h1 h1Var = this.a;
        return new auc(x44.W(new bac(x44.W(new yw7(this.b, this.c, h1Var.a(), h1Var.c())))), lm6.E);
    }

    @Override // defpackage.oh7
    public final h1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zw7)) {
            return false;
        }
        zw7 zw7Var = (zw7) obj;
        return this.e == zw7Var.e && this.f == zw7Var.f;
    }

    public final int hashCode() {
        return (this.e * 31) + this.f;
    }
}
