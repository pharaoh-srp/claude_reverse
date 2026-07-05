package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yic extends dch {
    public final Throwable p;

    public yic(Throwable th) {
        this.p = th;
    }

    public final String toString() {
        return "FAILURE (" + this.p.getMessage() + ")";
    }
}
