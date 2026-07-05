package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yte {
    public final long a = d54.h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yte) {
            return d54.c(this.a, ((yte) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.a) * 961;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) d54.i(this.a)) + ", focus=null, rippleAlpha=null)";
    }
}
