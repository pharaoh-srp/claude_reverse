package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hk implements jk {
    public final fk a;
    public final String b;

    public hk(fk fkVar, String str) {
        fkVar.getClass();
        this.a = fkVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        return x44.r(this.a, hkVar.a) && this.b.equals(hkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(attachment=" + this.a + ", previewUrl=" + this.b + ")";
    }
}
