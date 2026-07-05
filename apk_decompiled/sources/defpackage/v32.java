package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class v32 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v32(boolean z, i iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = z;
        this.G = iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        i iVar = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                return new v32(z, iVar, tp4Var, 0);
            default:
                return new v32(z, iVar, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((v32) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((v32) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        i iVar = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (!z) {
                    iVar.i0();
                    g81 g81Var = iVar.d2;
                    gb9.D((l45) g81Var.a, null, null, new o6e(g81Var, (tp4) null, 14), 3);
                }
                break;
            default:
                sf5.h0(obj);
                if (z) {
                    iVar.h0();
                }
                break;
        }
        return ieiVar;
    }
}
