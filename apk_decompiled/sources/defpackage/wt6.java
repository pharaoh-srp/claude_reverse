package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wt6 implements yt6 {
    public final int a;
    public final zy7 b;

    public wt6(int i, zy7 zy7Var) {
        zy7Var.getClass();
        this.a = i;
        this.b = zy7Var;
    }

    @Override // defpackage.yt6
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt6)) {
            return false;
        }
        wt6 wt6Var = (wt6) obj;
        return this.a == wt6Var.a && x44.r(this.b, wt6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Custom(labelResId=" + this.a + ", onAction=" + this.b + ")";
    }
}
