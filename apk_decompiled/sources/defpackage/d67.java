package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d67 extends e67 {
    public final fva a;

    public d67(fva fvaVar) {
        this.a = fvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d67)) {
            return false;
        }
        return this.a.equals(((d67) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WeightTarget(mass=" + this.a + ')';
    }
}
