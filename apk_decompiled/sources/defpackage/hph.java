package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hph implements fjb {
    public final long a;

    public hph(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hph.class == obj.getClass() && this.a == ((hph) obj).a;
    }

    public final int hashCode() {
        return dkk.i(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
