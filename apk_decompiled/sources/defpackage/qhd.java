package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qhd {
    public final int a;

    public qhd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qhd) {
            return this.a == ((qhd) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
