package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zv8 {
    public final String a;
    public final String b;

    public zv8(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv8)) {
            return false;
        }
        zv8 zv8Var = (zv8) obj;
        return x44.r(this.a, zv8Var.a) && this.b.equals(zv8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("ImageAttachmentPreview(fileName=", this.a, ", url=", this.b, ")");
    }
}
