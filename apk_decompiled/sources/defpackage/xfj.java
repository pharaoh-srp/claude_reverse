package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xfj {
    public final String a;
    public final int b;

    public xfj(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfj)) {
            return false;
        }
        xfj xfjVar = (xfj) obj;
        return x44.r(this.a, xfjVar.a) && this.b == xfjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return vb7.r(sb, this.b, ')');
    }
}
