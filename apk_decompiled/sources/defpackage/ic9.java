package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic9 {
    public final Object a;
    public final int b;

    public ic9(int i, Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic9)) {
            return false;
        }
        ic9 ic9Var = (ic9) obj;
        return x44.r(this.a, ic9Var.a) && this.b == ic9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemKey(value=");
        sb.append(this.a);
        sb.append(", index=");
        return vb7.r(sb, this.b, ')');
    }
}
