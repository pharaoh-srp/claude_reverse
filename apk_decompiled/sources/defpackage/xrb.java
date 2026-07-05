package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xrb implements fjb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public xrb(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xrb.class == obj.getClass()) {
            xrb xrbVar = (xrb) obj;
            if (this.a == xrbVar.a && this.b == xrbVar.b && this.c == xrbVar.c && this.d == xrbVar.d && this.e == xrbVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return dkk.i(this.e) + ((dkk.i(this.d) + ((dkk.i(this.c) + ((dkk.i(this.b) + ((dkk.i(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
