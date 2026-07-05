package defpackage;

import com.anthropic.claude.types.strings.ChatId;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n7 extends xzg implements pz7 {
    public hxb E;
    public w3c F;
    public Object G;
    public Object H;
    public int I;
    public boolean J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ w3c M;
    public final /* synthetic */ int N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ String P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(w3c w3cVar, int i, boolean z, String str, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.M = w3cVar;
        this.N = i;
        this.O = z;
        this.P = str;
        this.Q = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        n7 n7Var = new n7(this.M, this.N, this.O, this.P, this.Q, tp4Var);
        n7Var.L = obj;
        return n7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((n7) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        hxb hxbVar;
        String str;
        boolean z;
        int i;
        Object obj2;
        w3c w3cVar;
        Throwable th;
        Throwable th2;
        hxb hxbVar2;
        w3c w3cVar2;
        Object obj3;
        l45 l45Var = (l45) this.L;
        int i2 = this.K;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        m45 m45Var = m45.E;
        try {
            try {
                if (i2 == 0) {
                    sf5.h0(obj);
                    w3c w3cVar3 = this.M;
                    hxbVar = (jxb) ((cbf) w3cVar3.F).F;
                    this.L = l45Var;
                    this.E = hxbVar;
                    this.F = w3cVar3;
                    str = this.P;
                    this.G = str;
                    Object obj4 = this.Q;
                    this.H = obj4;
                    int i3 = this.N;
                    this.I = i3;
                    z = this.O;
                    this.J = z;
                    this.K = 1;
                    if (hxbVar.c(this) != m45Var) {
                        i = i3;
                        obj2 = obj4;
                        w3cVar = w3cVar3;
                    }
                    return m45Var;
                }
                if (i2 == 1) {
                    boolean z2 = this.J;
                    i = this.I;
                    Object obj5 = this.H;
                    str = (String) this.G;
                    w3c w3cVar4 = this.F;
                    hxb hxbVar3 = this.E;
                    sf5.h0(obj);
                    z = z2;
                    hxbVar = hxbVar3;
                    obj2 = obj5;
                    w3cVar = w3cVar4;
                } else {
                    if (i2 != 2) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.G;
                    w3cVar2 = this.F;
                    hxbVar2 = this.E;
                    try {
                        sf5.h0(obj);
                        obj2 = obj3;
                        w3cVar = w3cVar2;
                        ((cyf) w3cVar.G).b.invoke(obj2);
                        hxbVar = hxbVar2;
                        hxbVar.d(null);
                        return ieiVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (((AtomicInteger) ((cbf) w3cVar.F).G).get() == i) {
            if (!z) {
                int i4 = 3;
                if (str != null) {
                    gb9.D(l45Var, null, null, new o0(w3cVar, str, obj2, tp4Var, 1), 3);
                }
                gb9.D(l45Var, null, null, new m0(w3cVar, obj2, tp4Var, i4), 3);
            } else if (str != null) {
                cbf cbfVar = (cbf) w3cVar.H;
                this.L = null;
                this.E = hxbVar;
                this.F = w3cVar;
                this.G = obj2;
                this.H = null;
                this.K = 2;
                try {
                    Object objInvoke = ((rz7) cbfVar.G).invoke(ChatId.m978boximpl(str), obj2, this);
                    if (objInvoke != m45Var) {
                        objInvoke = ieiVar;
                    }
                    if (objInvoke != m45Var) {
                        hxbVar2 = hxbVar;
                        w3cVar2 = w3cVar;
                        obj3 = obj2;
                        obj2 = obj3;
                        w3cVar = w3cVar2;
                        ((cyf) w3cVar.G).b.invoke(obj2);
                        hxbVar = hxbVar2;
                    }
                    return m45Var;
                } catch (Throwable th6) {
                    th = th6;
                }
            } else {
                hxbVar2 = hxbVar;
                ((cyf) w3cVar.G).b.invoke(obj2);
                hxbVar = hxbVar2;
            }
            th2 = th;
            hxbVar2 = hxbVar;
            hxbVar2.d(null);
            throw th2;
        }
        hxbVar.d(null);
        return ieiVar;
    }
}
