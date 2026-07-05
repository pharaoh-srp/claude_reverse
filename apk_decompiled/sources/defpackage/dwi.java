package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dwi {
    public final Number a;

    public dwi(Number number) {
        this.a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwi) && x44.r(this.a, ((dwi) obj).a);
    }

    public final int hashCode() {
        Number number = this.a;
        if (number == null) {
            return 0;
        }
        return number.hashCode();
    }

    public final String toString() {
        return "DdCls(devicePixelRatio=" + this.a + ")";
    }
}
