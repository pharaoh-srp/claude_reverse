package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yr9 implements ub0, cs9 {
    public int E;

    public abstract fab G();

    public abstract List H();

    public abstract r9i K();

    public abstract u9i O();

    public abstract boolean b0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr9)) {
            return false;
        }
        yr9 yr9Var = (yr9) obj;
        return b0() == yr9Var.b0() && uhk.j(k0(), yr9Var.k0());
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        return zc0.a(K());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.E;
        if (i != 0) {
            return i;
        }
        if (ttj.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (b0() ? 1 : 0) + ((H().hashCode() + (O().hashCode() * 31)) * 31);
        }
        this.E = iHashCode;
        return iHashCode;
    }

    public abstract yr9 j0(es9 es9Var);

    public abstract fhi k0();
}
