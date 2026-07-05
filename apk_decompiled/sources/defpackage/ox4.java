package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class ox4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ f G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox4(f fVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = fVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        f fVar = this.G;
        switch (i) {
            case 0:
                return new ox4(fVar, tp4Var, 0);
            case 1:
                return new ox4(fVar, tp4Var, 1);
            case 2:
                return new ox4(fVar, tp4Var, 2);
            case 3:
                return new ox4(fVar, tp4Var, 3);
            case 4:
                return new ox4(fVar, tp4Var, 4);
            default:
                return new ox4(fVar, tp4Var, 5);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((ox4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        f fVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (f.b0(fVar, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    v70 v70Var = new v70(j8.A(fVar.m.H), 1);
                    m61 m61Var = new m61(fVar, null);
                    this.F = 1;
                    if (j8.u(v70Var, m61Var, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (d4c.K(30000L, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (!((Boolean) fVar.g0.getValue()).booleanValue()) {
                    amg amgVar = fVar.i0;
                    Boolean bool = Boolean.TRUE;
                    amgVar.getClass();
                    amgVar.n(null, bool);
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    fkg fkgVar = fVar.M0;
                    if (fkgVar != null) {
                        this.F = 1;
                        obj = knk.p(fkgVar, this);
                        if (obj == m45Var) {
                        }
                    }
                    fVar.h1.set(false);
                    f.k0(fVar, false, false, 6);
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                fVar.h1.set(false);
                f.k0(fVar, false, false, 6);
                break;
            case 4:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    fkg fkgVar2 = fVar.M0;
                    if (fkgVar2 != null) {
                        this.F = 1;
                        obj = knk.p(fkgVar2, this);
                        if (obj == m45Var) {
                        }
                    }
                    fVar.h1.set(false);
                    f.k0(fVar, false, true, 3);
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                fVar.h1.set(false);
                f.k0(fVar, false, true, 3);
                break;
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    fkg fkgVar3 = fVar.M0;
                    if (fkgVar3 != null) {
                        this.F = 1;
                        obj = knk.p(fkgVar3, this);
                        if (obj == m45Var) {
                        }
                    }
                    fVar.h1.set(false);
                    amg amgVar2 = fVar.e0;
                    String string = fVar.b.getString(R.string.conway_error_send_queue_timeout);
                    string.getClass();
                    hs4 hs4Var = new hs4(string);
                    amgVar2.getClass();
                    amgVar2.n(null, hs4Var);
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                fVar.h1.set(false);
                amg amgVar22 = fVar.e0;
                String string2 = fVar.b.getString(R.string.conway_error_send_queue_timeout);
                string2.getClass();
                hs4 hs4Var2 = new hs4(string2);
                amgVar22.getClass();
                amgVar22.n(null, hs4Var2);
                break;
        }
        return ieiVar;
    }
}
