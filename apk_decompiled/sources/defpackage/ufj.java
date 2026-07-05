package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.CodeEvents$PlanApproved;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ufj extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufj(zaa zaaVar, tgj tgjVar, wfj wfjVar, Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = zaaVar;
        this.H = tgjVar;
        this.I = wfjVar;
        this.J = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                return new ufj((zaa) this.G, (tgj) obj4, (wfj) obj3, (Context) obj2, tp4Var);
            default:
                ufj ufjVar = new ufj((i) obj4, (j4d) obj3, (PermissionMode) obj2, tp4Var);
                ufjVar.G = obj;
                return ufjVar;
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
        return ((ufj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        int i = this.E;
        m45 m45Var = m45.E;
        Object obj2 = this.H;
        Object obj3 = this.I;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                tgj tgjVar = (tgj) obj2;
                zaa zaaVar = (zaa) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    o92 o92VarA = zaaVar.a();
                    this.F = 1;
                    objA = rhj.a(o92VarA, zaaVar, this);
                    if (objA != m45Var) {
                    }
                    return m45Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                objA = obj;
                yv7 yv7Var = (yv7) objA;
                if (yv7Var == null) {
                    sz6.j(ij0.m(new StringBuilder("Worker was marked important ("), tgjVar.c, ") but did not provide ForegroundInfo"));
                    return null;
                }
                int i3 = vfj.a;
                nga.c().getClass();
                wfj wfjVar = (wfj) obj3;
                o92 o92VarI = rwj.i(wfjVar.a.a, "setForegroundAsync", new n5h(wfjVar, zaaVar.b.a, yv7Var, (Context) obj4, 3));
                this.F = 2;
                Object objC = uwj.c(o92VarI, this);
                if (objC != m45Var) {
                    return objC;
                }
                return m45Var;
            default:
                j4d j4dVar = (j4d) obj3;
                String str = j4dVar.b;
                i iVar = (i) obj2;
                l45 l45Var = (l45) this.G;
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.G = l45Var;
                    this.F = 1;
                    objD = jrf.D(iVar.d, j4dVar.b, true, (PermissionMode) obj4, null, null, this, 48);
                    if (objD == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objD = obj;
                }
                ylf ylfVar = (ylf) objD;
                if (ylfVar instanceof wlf) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE = iuj.E(l45Var);
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj5)).getClass();
                            arrayList.add(obj5);
                        }
                        if (!arrayList.isEmpty()) {
                            String strM = ebh.m(zfa.a, "Failed to approve plan: ", str);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strM);
                            }
                        }
                    }
                    n2g n2gVar = iVar.g1;
                    String message = ((wlf) ylfVar).a.getMessage();
                    if (message == null) {
                        message = iVar.o.getString(R.string.ccr_error_failed_to_approve_plan);
                        message.getClass();
                    }
                    n2gVar.f(message);
                    if (!iVar.u1.contains(str) && iVar.w0() == null) {
                        iVar.q1(j4dVar);
                    }
                } else {
                    qi3 qi3Var = iVar.l;
                    String str2 = iVar.m;
                    String strE0 = iVar.E0();
                    if (strE0 == null) {
                        strE0 = "";
                    }
                    PermissionMode permissionMode = (PermissionMode) obj4;
                    qi3Var.e(new CodeEvents$PlanApproved(str2, strE0, permissionMode != null ? permissionMode.toWireFormat() : null), CodeEvents$PlanApproved.Companion.serializer());
                }
                iVar.v1 = null;
                return iei.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufj(i iVar, j4d j4dVar, PermissionMode permissionMode, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = iVar;
        this.I = j4dVar;
        this.J = permissionMode;
    }
}
