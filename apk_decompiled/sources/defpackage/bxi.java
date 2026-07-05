package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bxi {
    public final int a;

    public bxi(int i) {
        sq6.a(i);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxi) && this.a == ((bxi) obj).a;
    }

    public final int hashCode() {
        return sq6.F(this.a);
    }

    public final String toString() {
        return "Privacy(replayLevel=" + fsh.H(this.a) + ")";
    }
}
