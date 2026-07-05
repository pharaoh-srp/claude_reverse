package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageCompletionStatus;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageJank;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bm2 extends xzg implements pz7 {
    public final /* synthetic */ em2 E;
    public final /* synthetic */ nl2 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ChatEvents$StreamingMessageCompletionStatus H;
    public final /* synthetic */ long I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ long K;
    public final /* synthetic */ zc9 L;
    public final /* synthetic */ List M;
    public final /* synthetic */ boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm2(em2 em2Var, nl2 nl2Var, String str, ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus, long j, boolean z, long j2, zc9 zc9Var, List list, boolean z2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = em2Var;
        this.F = nl2Var;
        this.G = str;
        this.H = chatEvents$StreamingMessageCompletionStatus;
        this.I = j;
        this.J = z;
        this.K = j2;
        this.L = zc9Var;
        this.M = list;
        this.N = z2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new bm2(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        bm2 bm2Var = (bm2) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        bm2Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Map linkedHashMap;
        nm6 nm6Var;
        Map map;
        sf5.h0(obj);
        em2 em2Var = this.E;
        qi3 qi3Var = em2Var.a;
        nl2 nl2Var = this.F;
        String str = nl2Var.b;
        String str2 = nl2Var.d;
        String str3 = str2 == null ? null : str2;
        int i = (int) this.I;
        int i2 = (int) this.K;
        Integer num = new Integer(nl2Var.i);
        zc9 zc9Var = this.L;
        int i3 = zc9Var.a;
        int i4 = (int) zc9Var.b;
        String str4 = str3;
        int i5 = (int) zc9Var.c;
        int i6 = zc9Var.d;
        int i7 = zc9Var.e;
        int i8 = zc9Var.f;
        int i9 = zc9Var.g;
        Integer num2 = new Integer(em2Var.f.j);
        Integer num3 = num2.intValue() > 0 ? num2 : null;
        Integer num4 = new Integer((int) zc9Var.h);
        boolean z = this.N;
        Integer num5 = z ? num4 : null;
        Integer num6 = z ? new Integer(zc9Var.i) : null;
        Integer num7 = z ? new Integer(zc9Var.j) : null;
        Integer num8 = z ? new Integer(zc9Var.k) : null;
        List list = this.M;
        boolean zIsEmpty = list.isEmpty();
        nm6 nm6Var2 = nm6.E;
        if (zIsEmpty) {
            nm6Var = nm6Var2;
            linkedHashMap = nm6Var;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nm6 nm6Var3 = nm6Var2;
                String strC = em2.c(em2Var, em2.b(em2Var, (mtc) it.next()));
                int i10 = i6;
                int i11 = i7;
                Integer num9 = new Integer(1);
                xl2 xl2Var = xl2.E;
                linkedHashMap.merge(strC, num9, new gm2());
                nm6Var2 = nm6Var3;
                i6 = i10;
                i7 = i11;
            }
            nm6Var = nm6Var2;
        }
        int i12 = i6;
        int i13 = i7;
        if (list.isEmpty()) {
            map = nm6Var;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                mtc mtcVar = (mtc) it2.next();
                Map map2 = linkedHashMap;
                String strC2 = em2.c(em2Var, em2.b(em2Var, mtcVar));
                String body = mtcVar.getBody();
                Iterator it3 = it2;
                Integer num10 = new Integer(body != null ? body.length() : 0);
                xl2 xl2Var2 = xl2.E;
                linkedHashMap2.merge(strC2, num10, new gm2());
                linkedHashMap = map2;
                it2 = it3;
            }
            map = linkedHashMap2;
        }
        qi3Var.e(new ChatEvents$StreamingMessageJank(str, this.G, str4, this.H, i, this.J, i2, num, i3, i4, i5, i12, i13, i8, i9, num3, num5, num6, num7, num8, linkedHashMap, map, em2.a(em2Var, list)), ChatEvents$StreamingMessageJank.Companion.serializer());
        return iei.a;
    }
}
