package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gug extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ hug G;
    public final /* synthetic */ w1c H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gug(hug hugVar, w1c w1cVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = hugVar;
        this.H = w1cVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        w1c w1cVar = this.H;
        hug hugVar = this.G;
        switch (i) {
            case 0:
                return new gug(hugVar, w1cVar, tp4Var, 0);
            default:
                return new gug(hugVar, w1cVar, tp4Var, 1);
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
        return ((gug) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objC;
        int i = this.E;
        iei ieiVar = iei.a;
        hug hugVar = this.G;
        m45 m45Var = m45.E;
        w1c w1cVar = this.H;
        switch (i) {
            case 0:
                int i2 = this.F;
                try {
                    if (i2 == 0) {
                        sf5.h0(obj);
                        a80 a80Var = hugVar.e;
                        Float f = new Float(MTTypesetterKt.kLineSkipLimitMultiplier);
                        yig yigVar = hugVar.d;
                        this.F = 1;
                        objC = a80.c(a80Var, f, yigVar, null, this, 12);
                        if (objC == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i2 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                        objC = obj;
                    }
                    return ieiVar;
                } finally {
                }
            default:
                int i3 = this.F;
                try {
                    if (i3 == 0) {
                        sf5.h0(obj);
                        a80 a80Var2 = hugVar.e;
                        Float f2 = new Float(MTTypesetterKt.kLineSkipLimitMultiplier);
                        this.F = 1;
                        if (a80Var2.g(this, f2) == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i3 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    return ieiVar;
                } finally {
                }
        }
    }
}
