package defpackage;

import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes2.dex */
public final class oz5 extends h59 implements pu9 {
    public wbj U;
    public poc V;
    public wbj W;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        int iA;
        poc pocVar = this.V;
        wbj wbjVar = this.W;
        switch (pocVar.E) {
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                iA = wbjVar.a(q5bVar);
                break;
            default:
                iA = wbjVar.c(q5bVar);
                break;
        }
        int i = iA;
        nm6 nm6Var = nm6.E;
        if (i == 0) {
            return q5bVar.U(0, 0, nm6Var, new fg7(19));
        }
        c3d c3dVarU = h5bVar.u(rl4.a(0, 0, i, i, 3, j));
        return q5bVar.U(c3dVarU.E, i, nm6Var, new b1(c3dVarU, 8));
    }

    @Override // defpackage.h59
    public final wbj p1(wbj wbjVar) {
        return wbjVar;
    }

    @Override // defpackage.h59
    public final void q1() {
        this.W = new c57(this.U, this.S);
        super.q1();
        yfd.W(this).T();
    }
}
