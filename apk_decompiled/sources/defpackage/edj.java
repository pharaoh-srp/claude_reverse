package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class edj extends ddj {
    @Override // defpackage.ddj, defpackage.fdj
    public final boolean b() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.ddj, defpackage.fdj
    public final void c(boolean z) {
        this.a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.ddj, defpackage.fdj
    public final void d(boolean z) {
        this.a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
