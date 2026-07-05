package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yh2 extends zh2 {
    public final Throwable a;

    public yh2(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yh2) {
            return x44.r(this.a, ((yh2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.zh2
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
