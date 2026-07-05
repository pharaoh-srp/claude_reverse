package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z7f {
    public final p35 a;
    public final int b;
    public final int c;

    public z7f(p35 p35Var, int i, int i2) {
        this.a = p35Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7f)) {
            return false;
        }
        z7f z7fVar = (z7f) obj;
        return this.a.equals(z7fVar.a) && this.b == z7fVar.b && this.c == z7fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenInfo(cornerRadii=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return vb7.r(sb, this.c, ')');
    }
}
