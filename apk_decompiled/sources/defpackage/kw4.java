package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kw4 extends lsk {
    public final or4 b;

    public kw4(or4 or4Var) {
        this.b = or4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw4) && this.b.equals(((kw4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StyledBox(style=" + this.b + ")";
    }
}
