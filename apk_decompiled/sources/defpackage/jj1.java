package defpackage;

import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.BellApiClientMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class jj1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ mj1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj1(mj1 mj1Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = mj1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        mj1 mj1Var = this.G;
        switch (i) {
            case 0:
                return new jj1(mj1Var, tp4Var, 0);
            case 1:
                return new jj1(mj1Var, tp4Var, 1);
            default:
                return new jj1(mj1Var, tp4Var, 2);
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
        return ((jj1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objG2;
        Object objG3;
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                m45 m45Var = m45.E;
                int i = this.F;
                if (i == 0) {
                    sf5.h0(obj);
                    v70 v70Var = new v70(this.G.K, 2);
                    this.F = 1;
                    objG = j8.G(v70Var, this);
                    if (objG == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objG = obj;
                }
                tn1 tn1Var = (tn1) ((fn1) objG);
                synchronized (tn1Var.H) {
                    no1 no1VarQ = tn1Var.q();
                    no1VarQ.getClass();
                    tn1Var.G.setValue(no1.a(no1VarQ, false, false, false, false, false, false, false, false, false, true, 511));
                }
                ci1 ci1Var = tn1Var.m;
                lsc lscVar = ci1Var.f;
                if (!ci1Var.d.a.isEmpty()) {
                    if (!((Boolean) lscVar.getValue()).booleanValue()) {
                        lscVar.setValue(Boolean.TRUE);
                        ci1Var.b.b(BellApiClientMessage.AttachmentFlowStart.INSTANCE);
                    }
                    gb9.D(ci1Var.e, null, null, new cj(ci1Var, tp4Var, 5), 3);
                }
                return iei.a;
            case 1:
                mj1 mj1Var = this.G;
                m45 m45Var2 = m45.E;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    v70 v70Var2 = new v70(mj1Var.K, 2);
                    this.F = 1;
                    objG2 = j8.G(v70Var2, this);
                    if (objG2 == m45Var2) {
                        return m45Var2;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objG2 = obj;
                }
                tn1 tn1Var2 = (tn1) ((fn1) objG2);
                if (!tn1Var2.g.c()) {
                    tn1Var2.L(tn1Var2.h0 ? false : tn1Var2.g0);
                }
                mj1Var.h.d(new ll1(10));
                return iei.a;
            default:
                mj1 mj1Var2 = this.G;
                m45 m45Var3 = m45.E;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    v70 v70Var3 = new v70(mj1Var2.K, 2);
                    this.F = 1;
                    objG3 = j8.G(v70Var3, this);
                    if (objG3 == m45Var3) {
                        return m45Var3;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objG3 = obj;
                }
                ((tn1) ((fn1) objG3)).P();
                xm1 xm1Var = mj1Var2.h;
                k6d k6dVar = PlaybackPace.Companion;
                String strA = mj1Var2.i.a();
                k6dVar.getClass();
                xm1Var.e(k6d.a(strA));
                return iei.a;
        }
    }
}
