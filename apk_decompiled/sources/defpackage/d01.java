package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d01 implements h01 {
    public final Throwable a;

    public d01(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d01) && this.a.equals(((d01) obj).a);
    }

    @Override // defpackage.h01
    public final Object getValue() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.h01
    public final boolean isComplete() {
        return true;
    }

    public final String toString() {
        return "Failure(exception=" + this.a + ")";
    }
}
