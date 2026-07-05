package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xvi {
    public final yvi a;
    public final int b;

    public xvi(yvi yviVar, int i) {
        sq6.a(i);
        this.a = yviVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvi)) {
            return false;
        }
        xvi xviVar = (xvi) obj;
        return this.a.equals(xviVar.a) && this.b == xviVar.b;
    }

    public final int hashCode() {
        return sq6.F(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.a + ", source=" + kgh.w(this.b) + ")";
    }
}
