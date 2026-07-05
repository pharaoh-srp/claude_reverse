package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e87 {
    public final v3i a;
    public final int[] b;

    public e87(v3i v3iVar, int... iArr) {
        if (iArr.length == 0) {
            ysj.k("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = v3iVar;
        this.b = iArr;
    }
}
