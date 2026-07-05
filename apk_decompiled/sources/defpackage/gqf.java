package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class gqf extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ iqf G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqf(iqf iqfVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = iqfVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        iqf iqfVar = this.G;
        switch (i) {
            case 0:
                return new gqf(iqfVar, tp4Var, 0);
            default:
                return new gqf(iqfVar, tp4Var, 1);
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
                ((gqf) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return m45.E;
            default:
                return ((gqf) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        int i2 = 0;
        m45 m45Var = m45.E;
        iqf iqfVar = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a4e a4eVar = iqfVar.g;
                    fqf fqfVar = new fqf(iqfVar, i2);
                    this.F = 1;
                    if (a4eVar.E.a(fqfVar, this) == m45Var) {
                    }
                }
                sz6.r();
                break;
            default:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    jrf jrfVar = iqfVar.a;
                    this.F = 1;
                    obj = jrfVar.z(this);
                    if (obj == m45Var) {
                    }
                }
                vkf vkfVar = (vkf) obj;
                if (vkfVar instanceof ukf) {
                    iqfVar.j.m(null);
                    amg amgVar = iqfVar.i;
                    Boolean bool = Boolean.FALSE;
                    amgVar.getClass();
                    amgVar.n(null, bool);
                    i iVar = iqfVar.c;
                    iVar.b0();
                    iVar.k0();
                    fkg fkgVar = iVar.J1;
                    if (fkgVar != null) {
                        fkgVar.d(null);
                    }
                    iVar.J1 = null;
                    iVar.o1(false);
                    zpf zpfVarT0 = iVar.t0();
                    leb lebVar = zpfVarT0 instanceof leb ? (leb) zpfVarT0 : null;
                    if (lebVar == null || !lebVar.e) {
                        iVar.K1 = true;
                        fkg fkgVar2 = iVar.L1;
                        if (fkgVar2 != null) {
                            fkgVar2.d(null);
                        }
                        iVar.L1 = gb9.D(iVar.a, null, null, new o14(iVar, tp4Var, 23), 3);
                    }
                    iVar.s1(false);
                    iVar.s2.setValue(null);
                    iVar.u2.setValue(null);
                    iVar.t2.setValue(null);
                    iVar.v2 = null;
                    iVar.w2.setValue(null);
                    iVar.z1(null);
                } else if (!(vkfVar instanceof tkf)) {
                    wg6.i();
                } else {
                    iqfVar.j.m(null);
                    i iVar2 = iqfVar.c;
                    ((tkf) vkfVar).a.getMessage();
                    n2g n2gVar = iVar2.g1;
                    String string = iVar2.o.getString(R.string.ccr_interrupt_failed);
                    string.getClass();
                    n2gVar.f(string);
                }
                break;
        }
        return null;
    }
}
