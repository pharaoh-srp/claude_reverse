package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ wb0(vb0 vb0Var, int i, int i2, String str, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, vb0Var, (i3 & 8) != 0 ? "" : str);
    }

    public final yb0 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            c39.c("Item.end should be set first");
        }
        return new yb0(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        return x44.r(this.a, wb0Var.a) && this.b == wb0Var.b && this.c == wb0Var.c && x44.r(this.d, wb0Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + vb7.c(this.c, vb7.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return vb7.s(sb, this.d, ')');
    }

    public wb0(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
