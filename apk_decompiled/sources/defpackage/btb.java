package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class btb implements fjb {
    public final long a;
    public final long b;
    public final long c;

    public btb(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btb)) {
            return false;
        }
        btb btbVar = (btb) obj;
        return this.a == btbVar.a && this.b == btbVar.b && this.c == btbVar.c;
    }

    public final int hashCode() {
        return dkk.i(this.c) + ((dkk.i(this.b) + ((dkk.i(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
