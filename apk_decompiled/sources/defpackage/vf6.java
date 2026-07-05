package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class vf6 extends xzg implements rz7 {
    public int E;
    public /* synthetic */ lp7 F;
    public /* synthetic */ Throwable G;

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vf6 vf6Var = new vf6(3, (tp4) obj3);
        vf6Var.F = (lp7) obj;
        vf6Var.G = (Throwable) obj2;
        return vf6Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        lp7 lp7Var = this.F;
        Throwable th = this.G;
        int i = this.E;
        boolean z = true;
        if (i == 0) {
            sf5.h0(obj);
            if (!(th instanceof IOException)) {
                throw th;
            }
            yvb yvbVar = new yvb(z);
            this.F = null;
            this.G = null;
            this.E = 1;
            Object objG = lp7Var.g(yvbVar, this);
            m45 m45Var = m45.E;
            if (objG == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
