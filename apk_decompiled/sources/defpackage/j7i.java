package defpackage;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j7i extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ o7i H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7i(o7i o7iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = o7iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        o7i o7iVar = this.H;
        switch (i) {
            case 0:
                j7i j7iVar = new j7i(o7iVar, tp4Var, 0);
                j7iVar.G = obj;
                return j7iVar;
            default:
                j7i j7iVar2 = new j7i(o7iVar, tp4Var, 1);
                j7iVar2.G = obj;
                return j7iVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((j7i) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((j7i) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        y4i y4iVar;
        int i = this.E;
        o7i o7iVar = this.H;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                guc gucVar = (guc) this.G;
                this.F = 1;
                Object objA = o7i.a(o7iVar, gucVar, this);
                return objA == m45Var ? m45Var : objA;
            default:
                int i3 = this.F;
                try {
                    if (i3 == 0) {
                        sf5.h0(obj);
                        y4iVar = (y4i) this.G;
                        this.G = y4iVar;
                        this.F = 1;
                        obj = y4iVar.a(this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                sf5.h0(obj);
                                return (Set) obj;
                            }
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y4iVar = (y4i) this.G;
                        sf5.h0(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        x4i x4iVar = x4i.F;
                        j7i j7iVar = new j7i(o7iVar, tp4Var, 0);
                        this.G = null;
                        this.F = 2;
                        obj = y4iVar.d(x4iVar, j7iVar, this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return um6.E;
        }
    }
}
