package com.anthropic.claude.code.remote;

import android.content.Context;
import com.anthropic.claude.R;
import defpackage.d4c;
import defpackage.iei;
import defpackage.iuj;
import defpackage.kh4;
import defpackage.l45;
import defpackage.lsc;
import defpackage.m45;
import defpackage.nh4;
import defpackage.ph4;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xzg;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        i iVar = this.G;
        switch (i) {
            case 0:
                return new g(iVar, tp4Var, 0);
            case 1:
                return new g(iVar, tp4Var, 1);
            default:
                return new g(iVar, tp4Var, 2);
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
        return ((g) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws StreamConnectFailedException {
        String string;
        int i = this.E;
        Object obj2 = iei.a;
        m45 m45Var = m45.E;
        i iVar = this.G;
        int i2 = 1;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 != 0 && i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                while (!(iVar.o0() instanceof kh4)) {
                    ph4 ph4VarO0 = iVar.o0();
                    nh4 nh4Var = ph4VarO0 instanceof nh4 ? (nh4) ph4VarO0 : null;
                    if (nh4Var != null) {
                        throw new StreamConnectFailedException(nh4Var.a);
                    }
                    this.F = 1;
                    if (d4c.K(100L, this) == m45Var) {
                        return m45Var;
                    }
                }
                return obj2;
            case 1:
                int i4 = this.F;
                if (i4 == 0 || i4 == 1) {
                    sf5.h0(obj);
                    do {
                        ph4 ph4VarO02 = iVar.o0();
                        lsc lscVar = iVar.f1;
                        if (ph4VarO02 instanceof kh4) {
                            return obj2;
                        }
                        ph4 ph4VarO03 = iVar.o0();
                        if (ph4VarO03 instanceof nh4) {
                            throw new StreamConnectFailedException(((nh4) ph4VarO03).a);
                        }
                        if (((String) lscVar.getValue()) == null) {
                            this.F = 1;
                        } else {
                            sz6.j((String) lscVar.getValue());
                        }
                    } while (d4c.K(100L, this) != m45Var);
                    return m45Var;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i5 = this.F;
                try {
                    if (i5 == 0) {
                        sf5.h0(obj);
                        long j = j.a;
                        g gVar = new g(iVar, tp4Var, i2);
                        this.F = 1;
                        if (iuj.P(j, gVar, this) == m45Var) {
                            obj2 = m45Var;
                        }
                    } else {
                        if (i5 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    return obj2;
                } catch (Throwable th) {
                    if ((th instanceof CancellationException) && !(th instanceof TimeoutCancellationException)) {
                        throw th;
                    }
                    iVar.p1(null);
                    Context context = iVar.o;
                    if ((th instanceof TimeoutCancellationException) || (th instanceof StreamConnectFailedException)) {
                        string = context.getString(R.string.ccr_backplane_connection_failed);
                    } else {
                        string = th.getMessage();
                        if (string == null) {
                            string = context.getString(R.string.ccr_error_unknown);
                            string.getClass();
                        }
                    }
                    string.getClass();
                    iVar.g1.f(string);
                    return obj2;
                }
        }
    }
}
