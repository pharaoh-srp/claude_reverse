package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n20 implements k5d {
    public final int E;

    public n20(int i) {
        this.E = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n20) && this.E == ((n20) obj).E;
    }

    public final int hashCode() {
        return Integer.hashCode(this.E);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.E, ')');
    }
}
