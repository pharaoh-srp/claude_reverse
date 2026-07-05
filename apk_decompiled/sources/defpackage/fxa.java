package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fxa implements jxa {
    public final rxa a;

    public fxa(rxa rxaVar) {
        this.a = rxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxa) && this.a.equals(((fxa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Card(error=" + this.a + ")";
    }
}
