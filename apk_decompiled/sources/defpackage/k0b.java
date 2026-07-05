package defpackage;

import com.anthropic.claude.tool.mcp.b;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k0b extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ l0b F;
    public final /* synthetic */ String G;
    public final /* synthetic */ z9e H;
    public final /* synthetic */ LinkedHashMap I;
    public final /* synthetic */ lp7 J;
    public final /* synthetic */ long K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0b(l0b l0bVar, String str, z9e z9eVar, LinkedHashMap linkedHashMap, lp7 lp7Var, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = l0bVar;
        this.G = str;
        this.H = z9eVar;
        this.I = linkedHashMap;
        this.J = lp7Var;
        this.K = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new k0b(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((k0b) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            l0b l0bVar = this.F;
            kp7 kp7VarK = j8.K(j8.l(j8.q(new cx(l0bVar, this.G, (tp4) null)), Integer.MAX_VALUE, py1.E), l0bVar.d.b());
            b bVar = new b(l0bVar, this.H, this.I, this.J, this.K);
            this.E = 1;
            Object objA = kp7VarK.a(bVar, this);
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
        return iei.a;
    }
}
