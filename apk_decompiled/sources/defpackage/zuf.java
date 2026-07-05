package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zuf implements fvf {
    public final ph4 a;

    public zuf(ph4 ph4Var) {
        this.a = ph4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zuf) && this.a.equals(((zuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "State(state=" + this.a + ")";
    }
}
