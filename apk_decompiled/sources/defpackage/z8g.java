package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z8g {
    public final dw9 a;
    public final dw9 b;

    public z8g(dw9 dw9Var, dw9 dw9Var2) {
        this.a = dw9Var;
        this.b = dw9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8g)) {
            return false;
        }
        z8g z8gVar = (z8g) obj;
        return this.a == z8gVar.a && this.b == z8gVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.a + ", height=" + this.b + ')';
    }
}
