package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ey extends xzg implements sz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey() {
        super(4, null);
        this.E = 0;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 4;
        switch (i) {
            case 0:
                ey eyVar = new ey(i2, (tp4) obj4, 0);
                eyVar.F = (qy) obj;
                eyVar.G = (vq5) obj2;
                eyVar.H = obj3;
                eyVar.invokeSuspend(ieiVar);
                return ieiVar;
            default:
                ey eyVar2 = new ey(i2, (tp4) obj4, 1);
                eyVar2.F = (String) obj;
                eyVar2.G = (f56) obj2;
                eyVar2.H = (n56) obj3;
                return eyVar2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        switch (this.E) {
            case 0:
                sf5.h0(obj);
                qy qyVar = (qy) this.F;
                float f = ((vq5) this.G).f(this.H);
                if (!Float.isNaN(f)) {
                    qyVar.a(f, MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                return iei.a;
            default:
                String str = (String) this.F;
                f56 f56Var = (f56) this.G;
                n56 n56Var = (n56) this.H;
                sf5.h0(obj);
                return new g56(n56Var, str, f56Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }
}
