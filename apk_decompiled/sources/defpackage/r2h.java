package defpackage;

import com.anthropic.claude.bell.tts.f;

/* JADX INFO: loaded from: classes2.dex */
public final class r2h extends xzg implements pz7 {
    public jxb E;
    public f F;
    public dae G;
    public dae H;
    public int I;
    public int J;
    public final /* synthetic */ f K;
    public final /* synthetic */ int L;
    public final /* synthetic */ dae M;
    public final /* synthetic */ dae N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2h(f fVar, int i, dae daeVar, dae daeVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = fVar;
        this.L = i;
        this.M = daeVar;
        this.N = daeVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new r2h(this.K, this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((r2h) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        f fVar;
        dae daeVar;
        jxb jxbVar;
        dae daeVar2;
        int i;
        int i2 = this.J;
        if (i2 == 0) {
            sf5.h0(obj);
            fVar = this.K;
            jxb jxbVar2 = fVar.k;
            this.E = jxbVar2;
            this.F = fVar;
            daeVar = this.M;
            this.G = daeVar;
            dae daeVar3 = this.N;
            this.H = daeVar3;
            int i3 = this.L;
            this.I = i3;
            this.J = 1;
            Object objC = jxbVar2.c(this);
            m45 m45Var = m45.E;
            if (objC == m45Var) {
                return m45Var;
            }
            jxbVar = jxbVar2;
            daeVar2 = daeVar3;
            i = i3;
        } else {
            if (i2 != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I;
            daeVar2 = this.H;
            daeVar = this.G;
            fVar = this.F;
            jxbVar = this.E;
            sf5.h0(obj);
        }
        try {
            int i4 = fVar.n;
            lsc lscVar = fVar.w;
            if (i4 == i) {
                if (daeVar.E != null) {
                    fVar.i.m(null);
                    fVar.j = null;
                    lscVar.setValue(null);
                    fVar.g(false);
                } else if (fVar.o == i) {
                    lscVar.setValue(null);
                    fVar.g(false);
                } else {
                    lscVar.setValue((String) daeVar2.E);
                }
            }
            jxbVar.d(null);
            return iei.a;
        } catch (Throwable th) {
            jxbVar.d(null);
            throw th;
        }
    }
}
