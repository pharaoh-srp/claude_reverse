package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i64 {
    public final k64 a;
    public final float b;
    public final int c;

    public i64(k64 k64Var, float f, int i) {
        this.a = k64Var;
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i64)) {
            return false;
        }
        i64 i64Var = (i64) obj;
        return this.a.equals(i64Var.a) && Float.compare(this.b, i64Var.b) == 0 && this.c == i64Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column(entry=");
        sb.append(this.a);
        sb.append(", canvasY=");
        sb.append(this.b);
        sb.append(", color=");
        return vb7.l(this.c, ")", sb);
    }
}
