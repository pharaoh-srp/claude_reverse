package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t5l {
    public final int a;

    public t5l(int i) {
        this.a = i;
    }

    public static n5l a(int i) {
        n5l n5lVar = new n5l();
        n5lVar.a = i;
        n5lVar.b = (byte) (((byte) (n5lVar.b | 1)) | 2);
        return n5lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof t5l) && this.a == ((t5l) obj).a;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return grc.u("AppUpdateOptions{appUpdateType=", this.a, ", allowAssetPackDeletion=false}");
    }
}
