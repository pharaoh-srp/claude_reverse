package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class d3g extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ a80 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3g(a80 a80Var, boolean z, float f, float f2, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = a80Var;
        this.G = z;
        this.H = f;
        this.I = f2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new d3g(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((d3g) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            va6 va6Var = new va6(this.G ? this.H : this.I);
            yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new va6(0.5f), 1);
            this.E = 1;
            Object objC = a80.c(this.F, va6Var, yigVarK, null, this, 12);
            m45 m45Var = m45.E;
            if (objC == m45Var) {
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
