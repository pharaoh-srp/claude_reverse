package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class x5i extends xzg implements pz7 {
    public float E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ a6i H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5i(a6i a6iVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = a6iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        x5i x5iVar = new x5i(this.H, tp4Var);
        x5iVar.G = obj;
        return x5iVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((x5i) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        final float fI;
        l45 l45Var;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            l45 l45Var2 = (l45) this.G;
            fI = mpk.I(l45Var2.getCoroutineContext());
            l45Var = l45Var2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fI = this.E;
            l45Var = (l45) this.G;
            sf5.h0(obj);
        }
        while (fd9.d0(l45Var)) {
            final a6i a6iVar = this.H;
            bz7 bz7Var = new bz7() { // from class: w5i
                @Override // defpackage.bz7
                public final Object invoke(Object obj2) {
                    long jLongValue = ((Long) obj2).longValue();
                    a6i a6iVar2 = a6iVar;
                    boolean zG = a6iVar2.g();
                    jsc jscVar = a6iVar2.g;
                    if (!zG) {
                        if (jscVar.h() == Long.MIN_VALUE) {
                            jscVar.i(jLongValue);
                            ((lsc) a6iVar2.a.E).setValue(Boolean.TRUE);
                        }
                        long jH = jLongValue - jscVar.h();
                        float f = fI;
                        if (f != MTTypesetterKt.kLineSkipLimitMultiplier) {
                            jH = mwa.M(jH / ((double) f));
                        }
                        a6iVar2.n(jH);
                        a6iVar2.h(jH, f == MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                    return iei.a;
                }
            };
            this.G = l45Var;
            this.E = fI;
            this.F = 1;
            Object objB0 = j8.O(getContext()).b0(this, bz7Var);
            m45 m45Var = m45.E;
            if (objB0 == m45Var) {
                return m45Var;
            }
        }
        return iei.a;
    }
}
