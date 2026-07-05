package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xxc implements zxc {
    public final boolean a;

    public xxc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxc) && this.a == ((xxc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return y6a.p(new StringBuilder("Denied(shouldShowRationale="), this.a, ')');
    }
}
