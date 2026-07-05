package defpackage;

import android.content.Context;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f7i implements ia4, pek, ri6 {
    public final /* synthetic */ int E;

    public /* synthetic */ f7i(int i) {
        this.E = i;
    }

    public static final void b(f7i f7iVar, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new cej(iIntValue, ((Number) it2.next()).intValue()));
            }
            b54.t0(arrayList, arrayList2);
        }
        w44.t1(arrayList);
    }

    @Override // defpackage.ri6
    public qi6 a(Context context, String str, pi6 pi6Var) {
        qi6 qi6Var = new qi6();
        int iB = pi6Var.b(context, str, true);
        qi6Var.b = iB;
        if (iB != 0) {
            qi6Var.c = 1;
            return qi6Var;
        }
        int iC = pi6Var.c(context, str);
        qi6Var.a = iC;
        if (iC != 0) {
            qi6Var.c = -1;
        }
        return qi6Var;
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(el5Var);
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 3:
                f4l.F.get();
                Boolean bool = (Boolean) h4l.b.a();
                bool.getClass();
                return bool;
            case 4:
                l1l.F.get();
                Boolean bool2 = (Boolean) n1l.a.a();
                bool2.getClass();
                return bool2;
            case 5:
                t2l.F.get();
                Boolean bool3 = (Boolean) v2l.c.a();
                bool3.getClass();
                return bool3;
            case 6:
                k1l.F.get();
                Long l = (Long) m1l.N.a();
                l.getClass();
                return l;
            case 7:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.Y.a()).longValue());
            case 8:
                x3l.F.get();
                Long l2 = (Long) z3l.b.a();
                l2.getClass();
                return l2;
            case 9:
                k1l.F.get();
                Long l3 = (Long) m1l.K.a();
                l3.getClass();
                return l3;
            case 10:
                k1l.F.get();
                return (String) m1l.c0.a();
            case 11:
                u2l.F.get();
                Boolean bool4 = (Boolean) w2l.a.a();
                bool4.getClass();
                return bool4;
            case 12:
                j2l.F.get();
                Boolean bool5 = (Boolean) l2l.a.a();
                bool5.getClass();
                return bool5;
            default:
                return Boolean.valueOf(g3l.b());
        }
    }
}
