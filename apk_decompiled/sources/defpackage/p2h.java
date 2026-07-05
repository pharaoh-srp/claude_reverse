package defpackage;

import com.anthropic.claude.bell.tts.e;
import com.anthropic.claude.bell.tts.f;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p2h extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ f F;
    public final /* synthetic */ List G;
    public final /* synthetic */ i2h H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ cae J;
    public final /* synthetic */ String K;
    public final /* synthetic */ long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2h(f fVar, List list, i2h i2hVar, bz7 bz7Var, cae caeVar, String str, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = fVar;
        this.G = list;
        this.H = i2hVar;
        this.I = bz7Var;
        this.J = caeVar;
        this.K = str;
        this.L = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new p2h(this.F, this.G, this.H, this.I, this.J, this.K, this.L, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((p2h) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        d6d d6dVar = new d6d(23, this.J);
        f fVar = this.F;
        String str = this.K;
        o2h o2hVar = new o2h(fVar, str, this.L);
        u3e u3eVar = new u3e(fVar, 10, str);
        this.E = 1;
        Set set = f.y;
        fVar.getClass();
        Object objN = fd9.N(new e(fVar, this.G, this.H, d6dVar, this.I, o2hVar, u3eVar, null), this);
        m45 m45Var = m45.E;
        if (objN != m45Var) {
            objN = ieiVar;
        }
        return objN == m45Var ? m45Var : ieiVar;
    }
}
