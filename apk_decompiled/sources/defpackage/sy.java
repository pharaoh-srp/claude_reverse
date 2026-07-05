package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sy extends fwj {
    public final int l;

    public sy(int i) {
        this.l = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sy) && ((sy) obj).l == this.l;
    }

    public final int hashCode() {
        return this.l * 31;
    }
}
