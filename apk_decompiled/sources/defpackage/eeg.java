package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eeg extends jy1 implements na9 {
    public final long a;

    public eeg(long j) {
        this.a = j;
    }

    @Override // defpackage.jy1
    public final void a(float f, long j, v30 v30Var) {
        v30Var.c(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = d54.b(d54.d(jB) * f, jB);
        }
        v30Var.e(jB);
        if (v30Var.c != null) {
            v30Var.i(null);
        }
    }

    @Override // defpackage.na9
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new eeg(d54.g);
        }
        if (!(obj instanceof eeg)) {
            return null;
        }
        return new eeg(d4c.Y(f, this.a, ((eeg) obj).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eeg) {
            return d54.c(this.a, ((eeg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) d54.i(this.a)) + ')';
    }
}
