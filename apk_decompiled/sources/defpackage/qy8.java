package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qy8 {
    public final py8 a;
    public final int b;

    public qy8(py8 py8Var, int i) {
        this.a = py8Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy8)) {
            return false;
        }
        qy8 qy8Var = (qy8) obj;
        return this.a.equals(qy8Var.a) && this.b == qy8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return vb7.r(sb, this.b, ')');
    }
}
