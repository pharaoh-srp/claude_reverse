package defpackage;

import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class tx4 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ b0 F;
    public final /* synthetic */ f G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ z9e I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx4(b0 b0Var, f fVar, boolean z, z9e z9eVar, boolean z2, boolean z3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = b0Var;
        this.G = fVar;
        this.H = z;
        this.I = z9eVar;
        this.J = z2;
        this.K = z3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new tx4(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((tx4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
        return m45.E;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            z9e z9eVar = new z9e();
            a4e a4eVar = this.F.m;
            sx4 sx4Var = new sx4(this.G, z9eVar, this.H, this.I, this.J, this.K);
            this.E = 1;
            Object objA = a4eVar.E.a(sx4Var, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        sz6.r();
        return null;
    }
}
