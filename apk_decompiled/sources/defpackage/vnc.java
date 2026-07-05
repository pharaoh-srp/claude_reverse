package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vnc implements xy9 {
    public final koc a;
    public final int b;

    public vnc(koc kocVar, int i) {
        this.a = kocVar;
        this.b = i;
    }

    @Override // defpackage.xy9
    public final int a() {
        return this.a.l();
    }

    @Override // defpackage.xy9
    public final int b() {
        return Math.min(r0.l() - 1, ((r5b) w44.U0(this.a.k().a)).a + this.b);
    }

    @Override // defpackage.xy9
    public final int c() {
        int i;
        koc kocVar = this.a;
        if (kocVar.k().a.size() == 0) {
            return 0;
        }
        int iG = kyk.g(kocVar.k());
        int i2 = kocVar.k().b + kocVar.k().c;
        if (i2 != 0 && (i = iG / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.xy9
    public final boolean d() {
        return !this.a.k().a.isEmpty();
    }

    @Override // defpackage.xy9
    public final int e() {
        return Math.max(0, this.a.e - this.b);
    }
}
