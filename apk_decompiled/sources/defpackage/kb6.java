package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kb6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ w79 G;
    public final /* synthetic */ nwb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb6(w79 w79Var, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = w79Var;
        this.H = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new kb6(this.G, this.H, tp4Var, 0);
            case 1:
                return new kb6(this.G, this.H, tp4Var, 1);
            default:
                return new kb6(this.G, this.H, tp4Var, 2);
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
        return ((kb6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        w79 w79Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    ArrayList arrayList = new ArrayList();
                    kp7 kp7VarA = w79Var.a();
                    jb6 jb6Var = new jb6(arrayList, nwbVar, 0);
                    this.F = 1;
                    if (kp7VarA.a(jb6Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    ArrayList arrayList2 = new ArrayList();
                    kp7 kp7VarA2 = w79Var.a();
                    jb6 jb6Var2 = new jb6(arrayList2, nwbVar, 1);
                    this.F = 1;
                    if (kp7VarA2.a(jb6Var2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    ArrayList arrayList3 = new ArrayList();
                    kp7 kp7VarA3 = w79Var.a();
                    jb6 jb6Var3 = new jb6(arrayList3, nwbVar, 2);
                    this.F = 1;
                    if (kp7VarA3.a(jb6Var3, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
