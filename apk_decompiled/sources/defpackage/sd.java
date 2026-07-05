package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd {
    public final long a;
    public final long b;

    public sd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return this.a == sdVar.a && this.b == sdVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
