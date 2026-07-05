package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sy9 {
    public final int a;
    public final int b;

    public sy9(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            e39.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        e39.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy9)) {
            return false;
        }
        sy9 sy9Var = (sy9) obj;
        return this.a == sy9Var.a && this.b == sy9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vb7.r(sb, this.b, ')');
    }
}
