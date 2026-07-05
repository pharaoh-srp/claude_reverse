package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ScreenSource;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mt2 extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ pt2 F;
    public final /* synthetic */ List G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ ChatEvents$AttachmentSource J;
    public final /* synthetic */ ScreenSource K;
    public final /* synthetic */ bz7 L;
    public final /* synthetic */ rz7 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt2(pt2 pt2Var, List list, bz7 bz7Var, String str, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, bz7 bz7Var2, rz7 rz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = pt2Var;
        this.G = list;
        this.H = bz7Var;
        this.I = str;
        this.J = chatEvents$AttachmentSource;
        this.K = screenSource;
        this.L = bz7Var2;
        this.M = rz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        mt2 mt2Var = new mt2(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
        mt2Var.E = obj;
        return mt2Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        mt2 mt2Var = (mt2) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        mt2Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        l45 l45Var = (l45) this.E;
        sf5.h0(obj);
        pt2 pt2Var = this.F;
        yw2 yw2Var = pt2Var.a;
        int iD = pt2Var.d();
        AtomicInteger atomicInteger = pt2Var.j;
        int i = iD - atomicInteger.get();
        if (i < 0) {
            i = 0;
        }
        List list = this.G;
        List listJ1 = w44.j1(list, i);
        List listI0 = w44.I0(list, i);
        tp4 tp4Var = null;
        if (!listI0.isEmpty()) {
            for (Object obj2 : listI0) {
                String str = (String) this.H.invoke(obj2);
                String str2 = pt2Var.b.e;
                String str3 = this.I;
                yw2Var.i(new ChatEvents$AddAttachment(str2, str3 == null ? "" : str3, str, this.J, this.K, Boolean.valueOf(yw2Var.k(str3))), ((Boolean) this.L.invoke(obj2)).booleanValue(), str3);
            }
            gb9.D(pt2Var.h, pt2Var.f.a(), null, new kk0(pt2Var, tp4Var, 10), 2);
        }
        atomicInteger.addAndGet(listJ1.size());
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            gb9.D(l45Var, null, null, new cm(this.M, it.next(), pt2Var, tp4Var, 13), 3);
        }
        return iei.a;
    }
}
