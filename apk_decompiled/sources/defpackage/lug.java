package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class lug extends hqb implements pu9 {
    public pug S;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        pug pugVar = this.S;
        pugVar.getClass();
        jne jneVarU1 = pug.u1(pugVar, 1);
        float f = jneVarU1.L;
        float f2 = jneVarU1.T;
        final float f3 = f + f2;
        float f4 = jneVarU1.M + f2;
        final float f5 = jneVarU1.N + f2;
        float f6 = jneVarU1.O + f2;
        int iRound = Math.round(f4 + f3);
        int iRound2 = Math.round(f6 + f5);
        final c3d c3dVarU = h5bVar.u(sl4.i(-iRound, -iRound2, j));
        return q5bVar.U(sl4.g(c3dVarU.E + iRound, j), sl4.f(c3dVarU.F + iRound2, j), nm6.E, new bz7() { // from class: kug
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                ((b3d) obj).f(c3dVarU, Math.round(f3), Math.round(f5), MTTypesetterKt.kLineSkipLimitMultiplier);
                return iei.a;
            }
        });
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        p6i p6iVarF = j8.F(this, "StyleOuterNode");
        p6iVarF.getClass();
        pug pugVar = (pug) p6iVarF;
        pugVar.U = this;
        this.S = pugVar;
        pugVar.v1(true);
    }
}
