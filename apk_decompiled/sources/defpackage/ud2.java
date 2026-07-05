package defpackage;

import com.anthropic.claude.conway.protocol.b0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ud2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ dae G;
    public final /* synthetic */ dae H;
    public final /* synthetic */ z9e I;
    public final /* synthetic */ dae J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Serializable O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud2(od2 od2Var, gri griVar, qd2 qd2Var, uub uubVar, dae daeVar, dae daeVar2, dae daeVar3, z9e z9eVar, z9e z9eVar2, mub mubVar, xc2 xc2Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = od2Var;
        this.L = griVar;
        this.M = qd2Var;
        this.N = uubVar;
        this.G = daeVar;
        this.H = daeVar2;
        this.J = daeVar3;
        this.I = z9eVar;
        this.O = z9eVar2;
        this.P = mubVar;
        this.Q = xc2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.Q;
        Object obj3 = this.P;
        Serializable serializable = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        switch (i) {
            case 0:
                return new ud2((od2) this.K, (gri) obj6, (qd2) obj5, (uub) obj4, this.G, this.H, this.J, this.I, (z9e) serializable, (mub) obj3, (xc2) obj2, tp4Var);
            default:
                ud2 ud2Var = new ud2((b0) obj6, this.G, (String) obj5, (f8) obj4, this.H, (bae) serializable, (lqa) obj3, this.I, this.J, (l45) obj2, tp4Var);
                ud2Var.K = obj;
                return ud2Var;
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
        return ((ud2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.Q;
        Object obj3 = this.P;
        Serializable serializable = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        m45 m45Var = m45.E;
        Object obj6 = this.L;
        switch (i) {
            case 0:
                gri griVar = (gri) obj6;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    z9e z9eVar = (z9e) serializable;
                    l0 l0Var = new l0((mub) obj3, 28, griVar);
                    nn nnVar = new nn(9, (xc2) obj2);
                    this.F = 1;
                    if (((od2) this.K).b(((vc2) griVar.a).e, new sd2(this.G, this.H, this.J, this.I, z9eVar, null), (qd2) obj5, new nn(8, griVar), new td2(griVar, null), (uub) obj4, l0Var, nnVar, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                b0 b0Var = (b0) obj6;
                l45 l45Var = (l45) this.K;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    kp7 kp7VarK = j8.K(j8.q(new vn4(b0Var, null)), b0Var.d.b());
                    lqa lqaVar = (lqa) obj3;
                    dae daeVar = this.J;
                    l45 l45Var2 = (l45) obj2;
                    r15 r15Var = new r15(this.G, (String) obj5, (f8) obj4, this.H, (bae) serializable, lqaVar, l45Var, this.I, daeVar, l45Var2, b0Var);
                    this.K = null;
                    this.F = 1;
                    if (kp7VarK.a(r15Var, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud2(b0 b0Var, dae daeVar, String str, f8 f8Var, dae daeVar2, bae baeVar, lqa lqaVar, z9e z9eVar, dae daeVar3, l45 l45Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = b0Var;
        this.G = daeVar;
        this.M = str;
        this.N = f8Var;
        this.H = daeVar2;
        this.O = baeVar;
        this.P = lqaVar;
        this.I = z9eVar;
        this.J = daeVar3;
        this.Q = l45Var;
    }
}
