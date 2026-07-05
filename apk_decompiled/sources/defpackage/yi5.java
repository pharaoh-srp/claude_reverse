package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.db.ClaudeDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class yi5 extends xzg implements pz7 {
    public List E;
    public ft2 F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ft2 I;
    public final /* synthetic */ List J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ bj5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi5(ft2 ft2Var, List list, boolean z, bj5 bj5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = ft2Var;
        this.J = list;
        this.K = z;
        this.L = bj5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        yi5 yi5Var = new yi5(this.I, this.J, this.K, this.L, tp4Var);
        yi5Var.H = obj;
        return yi5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((yi5) create((kq4) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        List list;
        kq4 kq4Var = (kq4) this.H;
        int i = this.G;
        ft2 ft2Var = this.I;
        m45 m45Var = m45.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                xz8 xz8Var = kq4Var.b;
                this.H = kq4Var;
                this.G = 1;
                obj = xz8Var.e(ft2Var, this.J, this.K, this);
                if (obj != m45Var) {
                }
                return m45Var;
            }
            if (i != 1) {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ft2Var = this.F;
                list = this.E;
                try {
                    sf5.h0(obj);
                    return list;
                } catch (Exception e) {
                    exc = e;
                    List list2 = xah.a;
                    xah.f(exc, "Failed to " + ((Object) ("persist " + ft2Var + " conversations")), ozf.F, null, 24);
                    return list;
                }
            }
            sf5.h0(obj);
            List list3 = (List) obj;
            if (ft2Var.a()) {
                bj5 bj5Var = this.L;
                try {
                    List list4 = list3;
                    ArrayList arrayList = new ArrayList(x44.y(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(knk.J((ChatConversationWithProjectReference) it.next(), bj5Var.a));
                    }
                    List list5 = list3;
                    ArrayList arrayList2 = new ArrayList(x44.y(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new at2(ft2Var, ((ChatConversationWithProjectReference) it2.next()).m209getUuidRjYBDck()));
                    }
                    ClaudeDatabase claudeDatabase = kq4Var.a;
                    x25 x25Var = new x25(kq4Var, arrayList, ft2Var, arrayList2, null, 1);
                    this.H = null;
                    this.E = list3;
                    this.F = ft2Var;
                    this.G = 2;
                    if (oq5.V(claudeDatabase, x25Var, this) == m45Var) {
                        return m45Var;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    list = list3;
                    List list22 = xah.a;
                    xah.f(exc, "Failed to " + ((Object) ("persist " + ft2Var + " conversations")), ozf.F, null, 24);
                    return list;
                }
            }
            return list3;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
