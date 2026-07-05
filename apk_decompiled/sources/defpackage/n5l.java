package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n5l {
    public int a;
    public byte b;

    public final t5l a() {
        if (this.b == 3) {
            return new t5l(this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        sz6.j("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
