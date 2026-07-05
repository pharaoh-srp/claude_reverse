package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ec5 extends iuj {
    public final yok k;

    public ec5(yok yokVar) {
        this.k = yokVar;
    }

    @Override // defpackage.iuj
    public final int l(int i, int i2, fu9 fu9Var, c3d c3dVar, int i3) {
        int iC = this.k.c(c3dVar);
        if (iC == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iC;
        return fu9Var == fu9.F ? (i - i2) - i4 : i4;
    }

    @Override // defpackage.iuj
    public final Integer o(c3d c3dVar) {
        return Integer.valueOf(this.k.c(c3dVar));
    }
}
