package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ioc extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ koc G;
    public final /* synthetic */ int H;
    public final /* synthetic */ float I;
    public final /* synthetic */ mb0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioc(koc kocVar, int i, float f, mb0 mb0Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = kocVar;
        this.H = i;
        this.I = f;
        this.J = mb0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ioc iocVar = new ioc(this.G, this.H, this.I, this.J, tp4Var);
        iocVar.F = obj;
        return iocVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ioc) create((h9f) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        if (i2 != 0) {
            if (i2 == 1) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        h9f h9fVar = (h9f) this.F;
        koc kocVar = this.G;
        s0a s0aVar = new s0a(h9fVar, kocVar, 1);
        this.E = 1;
        loc locVar = moc.a;
        int i3 = this.H;
        kocVar.q.i(kocVar.j(new Integer(i3).intValue()));
        boolean z = i3 > kocVar.e;
        int iE = (s0aVar.e() - kocVar.e) + 1;
        if (((z && i3 > s0aVar.e()) || (!z && i3 < kocVar.e)) && Math.abs(i3 - kocVar.e) >= 3) {
            if (z) {
                i = i3 - iE;
                int i4 = kocVar.e;
                if (i < i4) {
                    i = i4;
                }
            } else {
                int i5 = iE + i3;
                i = kocVar.e;
                if (i5 <= i) {
                    i = i5;
                }
            }
            s0aVar.f(i, 0);
        }
        Object objM = mpk.m(MTTypesetterKt.kLineSkipLimitMultiplier, s0aVar.a(i3) + this.I, this.J, new lpa(new aae(), 16, s0aVar), this, 4);
        m45 m45Var = m45.E;
        if (objM != m45Var) {
            objM = ieiVar;
        }
        return objM == m45Var ? m45Var : ieiVar;
    }
}
