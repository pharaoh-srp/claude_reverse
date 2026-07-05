package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class k8 extends xzg implements pz7 {
    public hxb E;
    public cbf F;
    public Serializable G;
    public int H;
    public boolean I;
    public int J;
    public final /* synthetic */ cbf K;
    public final /* synthetic */ int L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Serializable N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(cbf cbfVar, int i, boolean z, Serializable serializable, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = cbfVar;
        this.L = i;
        this.M = z;
        this.N = serializable;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new k8(this.K, this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((k8) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        cbf cbfVar;
        hxb hxbVar;
        Serializable serializable;
        int i;
        boolean z;
        Throwable th;
        hxb hxbVar2;
        int i2 = this.J;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        try {
            if (i2 == 0) {
                sf5.h0(obj);
                cbfVar = this.K;
                hxbVar = (jxb) ((cbf) cbfVar.F).F;
                this.E = hxbVar;
                this.F = cbfVar;
                serializable = this.N;
                this.G = serializable;
                int i3 = this.L;
                this.H = i3;
                boolean z2 = this.M;
                this.I = z2;
                this.J = 1;
                if (hxbVar.c(this) != m45Var) {
                    i = i3;
                    z = z2;
                }
                return m45Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hxbVar2 = this.E;
                try {
                    sf5.h0(obj);
                    hxbVar = hxbVar2;
                    hxbVar.d(null);
                    return ieiVar;
                } catch (Throwable th2) {
                    th = th2;
                    hxbVar2.d(null);
                    throw th;
                }
            }
            z = this.I;
            i = this.H;
            serializable = this.G;
            cbfVar = this.F;
            hxb hxbVar3 = this.E;
            sf5.h0(obj);
            hxbVar = hxbVar3;
            if (((AtomicInteger) ((cbf) cbfVar.F).G).get() == i) {
                cyf cyfVar = (cyf) cbfVar.G;
                if (!z) {
                    this.E = hxbVar;
                    this.F = null;
                    this.G = null;
                    this.J = 2;
                    Object objInvoke = cyfVar.a.invoke(serializable, this);
                    if (objInvoke != m45Var) {
                        objInvoke = ieiVar;
                    }
                    if (objInvoke != m45Var) {
                        hxbVar2 = hxbVar;
                        hxbVar = hxbVar2;
                    }
                    return m45Var;
                }
                cyfVar.b.invoke(serializable);
            }
            hxbVar.d(null);
            return ieiVar;
        } catch (Throwable th3) {
            hxb hxbVar4 = hxbVar;
            th = th3;
            hxbVar2 = hxbVar4;
            hxbVar2.d(null);
            throw th;
        }
    }
}
