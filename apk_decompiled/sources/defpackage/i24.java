package defpackage;

import com.anthropic.claude.code.remote.i;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i24 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ i F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Map H;
    public final /* synthetic */ awc I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Map K;
    public final /* synthetic */ Map L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i24(i iVar, String str, Map map, awc awcVar, int i, Map map2, Map map3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = iVar;
        this.G = str;
        this.H = map;
        this.I = awcVar;
        this.J = i;
        this.K = map2;
        this.L = map3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new i24(this.F, this.G, this.H, this.I, this.J, this.K, this.L, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((i24) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        i24 i24Var;
        awc awcVar;
        int i = this.E;
        i iVar = this.F;
        if (i == 0) {
            sf5.h0(obj);
            jrf jrfVar = iVar.d;
            this.E = 1;
            i24Var = this;
            obj = jrf.D(jrfVar, this.G, true, null, this.H, null, i24Var, 44);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
            i24Var = this;
        }
        if ((((ylf) obj) instanceof wlf) && (awcVar = i24Var.I) != null) {
            iVar.R1.remove(i24Var.G);
            iVar.A1(awcVar, i24Var.J, i24Var.K, i24Var.L);
        }
        return iei.a;
    }
}
