package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v54 implements ejh {
    public final long a;

    public v54(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        c39.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.ejh
    public final float a() {
        return d54.d(this.a);
    }

    @Override // defpackage.ejh
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ejh
    public final jy1 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v54) && d54.c(this.a, ((v54) obj).a);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) d54.i(this.a)) + ')';
    }
}
