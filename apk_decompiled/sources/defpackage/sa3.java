package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class sa3 extends xzg implements pz7 {
    public jxb E;
    public w3c F;
    public String G;
    public Boolean H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ w3c L;
    public final /* synthetic */ int M;
    public final /* synthetic */ String N;
    public final /* synthetic */ Boolean O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa3(w3c w3cVar, int i, String str, Boolean bool, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = w3cVar;
        this.M = i;
        this.N = str;
        this.O = bool;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        sa3 sa3Var = new sa3(this.L, this.M, this.N, this.O, tp4Var);
        sa3Var.K = obj;
        return sa3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((sa3) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        int i;
        String str;
        w3c w3cVar;
        jxb jxbVar;
        l45 l45Var = (l45) this.K;
        int i2 = this.J;
        if (i2 == 0) {
            sf5.h0(obj);
            w3c w3cVar2 = this.L;
            jxb jxbVar2 = (jxb) ((cbf) w3cVar2.F).F;
            this.K = l45Var;
            this.E = jxbVar2;
            this.F = w3cVar2;
            String str2 = this.N;
            this.G = str2;
            Boolean bool2 = this.O;
            this.H = bool2;
            int i3 = this.M;
            this.I = i3;
            this.J = 1;
            Object objC = jxbVar2.c(this);
            m45 m45Var = m45.E;
            if (objC == m45Var) {
                return m45Var;
            }
            bool = bool2;
            i = i3;
            str = str2;
            w3cVar = w3cVar2;
            jxbVar = jxbVar2;
        } else {
            if (i2 != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I;
            Boolean bool3 = this.H;
            String str3 = this.G;
            w3c w3cVar3 = this.F;
            jxbVar = this.E;
            sf5.h0(obj);
            str = str3;
            w3cVar = w3cVar3;
            bool = bool3;
        }
        tp4 tp4Var = null;
        try {
            if (((AtomicInteger) ((cbf) w3cVar.F).G).get() == i) {
                if (str == null) {
                    ((bz7) ((tk5) w3cVar.H).F).invoke(bool);
                } else {
                    gb9.D(l45Var, null, null, new pb2(w3cVar, str, bool, tp4Var, 18), 3);
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
