package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r46 extends kud {
    public final int M;

    public r46(int i) {
        this.M = i;
        if (i > 0) {
            return;
        }
        sz6.p("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r46) {
            return this.M == ((r46) obj).M;
        }
        return false;
    }

    public final int hashCode() {
        return this.M;
    }

    public final String toString() {
        return String.valueOf(this.M);
    }
}
