package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kxa {
    public final zy7 a;
    public final zy7 b;
    public final bz7 c;
    public final pz7 d;
    public final bz7 e;
    public final bz7 f;
    public final bz7 g;
    public final bz7 h;
    public final pz7 i;
    public final bz7 j;
    public final pz7 k;
    public final bz7 l;
    public final rz7 m;
    public final pz7 n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxa)) {
            return false;
        }
        kxa kxaVar = (kxa) obj;
        return x44.r(this.a, kxaVar.a) && x44.r(this.b, kxaVar.b) && x44.r(this.c, kxaVar.c) && x44.r(this.d, kxaVar.d) && x44.r(this.e, kxaVar.e) && x44.r(this.f, kxaVar.f) && x44.r(this.g, kxaVar.g) && x44.r(this.h, kxaVar.h) && x44.r(this.i, kxaVar.i) && x44.r(this.j, kxaVar.j) && x44.r(this.k, kxaVar.k) && x44.r(this.l, kxaVar.l) && x44.r(this.m, kxaVar.m) && x44.r(this.n, kxaVar.n);
    }

    public final int hashCode() {
        zy7 zy7Var = this.a;
        int iHashCode = (zy7Var == null ? 0 : zy7Var.hashCode()) * 31;
        zy7 zy7Var2 = this.b;
        int iHashCode2 = (iHashCode + (zy7Var2 == null ? 0 : zy7Var2.hashCode())) * 31;
        bz7 bz7Var = this.c;
        int iHashCode3 = (iHashCode2 + (bz7Var == null ? 0 : bz7Var.hashCode())) * 31;
        pz7 pz7Var = this.d;
        int iHashCode4 = (iHashCode3 + (pz7Var == null ? 0 : pz7Var.hashCode())) * 31;
        bz7 bz7Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (bz7Var2 == null ? 0 : bz7Var2.hashCode())) * 31;
        bz7 bz7Var3 = this.f;
        int iHashCode6 = (iHashCode5 + (bz7Var3 == null ? 0 : bz7Var3.hashCode())) * 31;
        bz7 bz7Var4 = this.g;
        int iHashCode7 = (iHashCode6 + (bz7Var4 == null ? 0 : bz7Var4.hashCode())) * 31;
        bz7 bz7Var5 = this.h;
        int iHashCode8 = (iHashCode7 + (bz7Var5 == null ? 0 : bz7Var5.hashCode())) * 31;
        pz7 pz7Var2 = this.i;
        int iHashCode9 = (iHashCode8 + (pz7Var2 == null ? 0 : pz7Var2.hashCode())) * 31;
        bz7 bz7Var6 = this.j;
        int iHashCode10 = (iHashCode9 + (bz7Var6 == null ? 0 : bz7Var6.hashCode())) * 31;
        pz7 pz7Var3 = this.k;
        int iHashCode11 = (iHashCode10 + (pz7Var3 == null ? 0 : pz7Var3.hashCode())) * 31;
        bz7 bz7Var7 = this.l;
        int iHashCode12 = (iHashCode11 + (bz7Var7 == null ? 0 : bz7Var7.hashCode())) * 31;
        rz7 rz7Var = this.m;
        int iHashCode13 = (iHashCode12 + (rz7Var == null ? 0 : rz7Var.hashCode())) * 31;
        pz7 pz7Var4 = this.n;
        return iHashCode13 + (pz7Var4 != null ? pz7Var4.hashCode() : 0);
    }

    public final String toString() {
        return "McpAppCallbacks(onInitialized=" + this.a + ", onSandboxProxyReady=" + this.b + ", onSizeChanged=" + this.c + ", onMessage=" + this.d + ", onOpenLink=" + this.e + ", onLog=" + this.f + ", onTeardownResponse=" + this.g + ", onRenderProcessGone=" + this.h + ", onUpdateModelContext=" + this.i + ", onRequestDisplayMode=" + this.j + ", onServerRequest=" + this.k + ", onBridgeEvent=" + this.l + ", onError=" + this.m + ", onShowFileChooser=" + this.n + ")";
    }

    public kxa(zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, bz7 bz7Var5, pz7 pz7Var2, bz7 bz7Var6, pz7 pz7Var3, bz7 bz7Var7, rz7 rz7Var, pz7 pz7Var4) {
        this.a = zy7Var;
        this.b = zy7Var2;
        this.c = bz7Var;
        this.d = pz7Var;
        this.e = bz7Var2;
        this.f = bz7Var3;
        this.g = bz7Var4;
        this.h = bz7Var5;
        this.i = pz7Var2;
        this.j = bz7Var6;
        this.k = pz7Var3;
        this.l = bz7Var7;
        this.m = rz7Var;
        this.n = pz7Var4;
    }
}
