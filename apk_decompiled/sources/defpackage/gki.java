package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gki implements hki {
    public final int a;
    public final int b;

    public gki(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gki)) {
            return false;
        }
        gki gkiVar = (gki) obj;
        return this.a == gkiVar.a && this.b == gkiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("Success(acceptedCount=", ", rejectedCount=", this.a, this.b, ")");
    }
}
