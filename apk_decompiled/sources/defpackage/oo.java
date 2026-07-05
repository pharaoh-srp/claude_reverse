package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oo implements so {
    public final ph4 a;

    public oo(ph4 ph4Var) {
        this.a = ph4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo) && this.a.equals(((oo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "State(state=" + this.a + ")";
    }
}
