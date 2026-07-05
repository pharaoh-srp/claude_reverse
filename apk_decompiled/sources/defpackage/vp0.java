package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class vp0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ tp0 G;
    public final /* synthetic */ xp0 H;
    public final /* synthetic */ Uri I;
    public final /* synthetic */ zy7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp0(tp0 tp0Var, xp0 xp0Var, Uri uri, zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = tp0Var;
        this.H = xp0Var;
        this.I = uri;
        this.J = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new vp0(this.G, this.H, this.I, this.J, tp4Var, 0);
            default:
                return new vp0(this.G, this.H, this.I, this.J, tp4Var, 1);
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
        return ((vp0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.J;
        Uri uri = this.I;
        xp0 xp0Var = this.H;
        tp0 tp0Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    if (tp0Var != null) {
                        Context context = xp0Var.e;
                        h86 h86Var = xp0Var.f;
                        this.F = 1;
                        ide ideVar = rq0.a;
                        String strG = tp0Var.a.g();
                        e45 e45VarB = h86Var.b();
                        b6c b6cVar = b6c.F;
                        e45VarB.getClass();
                        obj = gb9.c0(nai.Z(e45VarB, b6cVar), new qq0(context, uri, strG, null), this);
                        if (obj == m45Var) {
                        }
                    }
                    zy7Var.a();
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                }
                zy7Var.a();
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    if (tp0Var != null) {
                        Context context2 = xp0Var.e;
                        h86 h86Var2 = xp0Var.f;
                        this.F = 1;
                        obj = zr0.f(context2, tp0Var, uri, h86Var2, this);
                        if (obj == m45Var) {
                        }
                    }
                    zy7Var.a();
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                }
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
