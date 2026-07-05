package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wjg implements yjg {
    public final int a;
    public final String b;

    public wjg(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjg)) {
            return false;
        }
        wjg wjgVar = (wjg) obj;
        return this.a == wjgVar.a && x44.r(this.b, wjgVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PainterIcon(resId=" + this.a + ", contentDescription=" + this.b + ")";
    }
}
