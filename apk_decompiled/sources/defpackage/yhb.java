package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yhb implements zhb {
    public final mtc a;

    public yhb(mtc mtcVar) {
        this.a = mtcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhb) && this.a.equals(((yhb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleBlock(block=" + this.a + ")";
    }
}
