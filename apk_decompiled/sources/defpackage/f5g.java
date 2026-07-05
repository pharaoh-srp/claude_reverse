package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f5g extends hfd {
    public static final f5g c = new f5g(h5g.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        e5g e5gVar = (e5g) obj;
        e5gVar.getClass();
        e5gVar.e(ud4Var.q(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return new e5g(sArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        vd4Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.s(this.b, i2, sArr[i2]);
        }
    }
}
