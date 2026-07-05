package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o44 {
    public final int a;
    public final int b;

    public o44(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o44)) {
            return false;
        }
        o44 o44Var = (o44) obj;
        return this.a == o44Var.a && this.b == o44Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.a);
        sb.append(", columnCount=");
        return vb7.r(sb, this.b, ')');
    }
}
