package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bkb {
    H("BIDIRECTIONAL", true, true),
    I("RECOGNITION_ONLY", false, false);

    public final int E;
    public final boolean F;
    public final boolean G;

    bkb(String str, boolean z, boolean z2) {
        this.E = i;
        this.F = z;
        this.G = z2;
    }

    public final int a() {
        return this.E;
    }

    public final boolean b() {
        return this.G;
    }

    public final boolean c() {
        return this.F;
    }
}
