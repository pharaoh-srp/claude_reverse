package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q12 extends hfd {
    public static final q12 c = new q12(t12.a);

    @Override // defpackage.x0
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.s44, defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        j12 j12Var = (j12) obj;
        j12Var.getClass();
        j12Var.e(ud4Var.o(this.b, i));
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new j12(bArr);
    }

    @Override // defpackage.hfd
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.hfd
    public final void k(vd4 vd4Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        vd4Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vd4Var.n(this.b, i2, bArr[i2]);
        }
    }
}
