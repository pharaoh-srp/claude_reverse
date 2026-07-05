package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yl9 extends am9 {
    public final yr9 a;

    public yl9(yr9 yr9Var) {
        this.a = yr9Var;
    }

    public final yr9 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl9) && this.a.equals(((yl9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}
