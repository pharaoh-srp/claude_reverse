package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bv6 {
    public final boolean a;
    public final boolean b;

    public bv6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv6)) {
            return false;
        }
        bv6 bv6Var = (bv6) obj;
        return this.a == bv6Var.a && this.b == bv6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BatchUploadResult(shouldDeleteFile=" + this.a + ", shouldStopUploading=" + this.b + ")";
    }
}
