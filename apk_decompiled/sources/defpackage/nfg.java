package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nfg {
    public final ifg a;

    public nfg(ifg ifgVar) {
        this.a = ifgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfg) && this.a.equals(((nfg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Network(client=" + this.a + ")";
    }
}
