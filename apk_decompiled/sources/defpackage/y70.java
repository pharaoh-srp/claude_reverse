package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class y70 extends xzg implements bz7 {
    public nb0 E;
    public z9e F;
    public int G;
    public final /* synthetic */ a80 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ gb0 J;
    public final /* synthetic */ long K;
    public final /* synthetic */ bz7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(a80 a80Var, Object obj, gb0 gb0Var, long j, bz7 bz7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.H = a80Var;
        this.I = obj;
        this.J = gb0Var;
        this.K = j;
        this.L = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new y70(this.H, this.I, this.J, this.K, this.L, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((y70) create((tp4) obj)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        nb0 nb0Var;
        z9e z9eVar;
        gb0 gb0Var = this.J;
        a80 a80Var = this.H;
        nb0 nb0Var2 = a80Var.c;
        int i = this.G;
        try {
            if (i == 0) {
                sf5.h0(obj);
                nb0Var2.G = (sb0) a80Var.a.a().invoke(this.I);
                a80Var.e.setValue(gb0Var.g());
                a80Var.d.setValue(Boolean.TRUE);
                nb0 nb0Var3 = new nb0(nb0Var2.E, nb0Var2.F.getValue(), j8.w(nb0Var2.G), nb0Var2.H, Long.MIN_VALUE, nb0Var2.J);
                z9e z9eVar2 = new z9e();
                long j = this.K;
                x70 x70Var = new x70(a80Var, nb0Var3, this.L, z9eVar2, 0);
                this.E = nb0Var3;
                this.F = z9eVar2;
                this.G = 1;
                Object objL = mpk.l(nb0Var3, gb0Var, j, x70Var, this);
                m45 m45Var = m45.E;
                if (objL == m45Var) {
                    return m45Var;
                }
                nb0Var = nb0Var3;
                z9eVar = z9eVar2;
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z9eVar = this.F;
                nb0Var = this.E;
                sf5.h0(obj);
            }
            hb0 hb0Var = z9eVar.E ? hb0.E : hb0.F;
            a80.a(a80Var);
            return new kb0(nb0Var, hb0Var);
        } catch (CancellationException e) {
            a80.a(a80Var);
            throw e;
        }
    }
}
