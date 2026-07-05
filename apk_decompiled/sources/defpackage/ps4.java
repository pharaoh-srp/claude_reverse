package defpackage;

import com.anthropic.claude.conway.protocol.ContainerReplacedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ps4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rs4 F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps4(rs4 rs4Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = rs4Var;
        this.G = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.G;
        rs4 rs4Var = this.F;
        switch (i) {
            case 0:
                return new ps4(rs4Var, str, tp4Var, 0);
            default:
                return new ps4(rs4Var, str, tp4Var, 1);
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
        return ((ps4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        String str = this.G;
        rs4 rs4Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                try {
                    return rs4.a(rs4Var, str);
                } catch (ContainerReplacedException e) {
                    zfa.a.getClass();
                    boolean zB = yfa.b();
                    String str2 = e.E;
                    if (zB) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            String strM = ebh.m(zfa.a, "mint-token: container replaced, re-minting for ", str2);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.INFO, "Conway", strM);
                            }
                        }
                    }
                    return rs4.a(rs4Var, str2);
                }
            default:
                sf5.h0(obj);
                hdc hdcVar = rs4Var.e;
                jie jieVar = new jie();
                jieVar.g(str + "/health");
                rs4Var.b(jieVar);
                jieVar.c();
                kie kieVar = new kie(jieVar);
                hdcVar.getClass();
                pqe pqeVarF = new f4e(hdcVar, kieVar, false).f();
                try {
                    Integer num = new Integer(pqeVarF.H);
                    pqeVarF.close();
                    return num;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        wd6.Z(pqeVarF, th);
                        throw th2;
                    }
                }
        }
    }
}
