package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fe implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ fe(l45 l45Var, h86 h86Var, p05 p05Var, Context context) {
        this.E = 16;
        this.G = l45Var;
        this.H = h86Var;
        this.I = p05Var;
        this.F = context;
    }

    private final Object d(Object obj) {
        List list = (List) this.F;
        bae baeVar = (bae) this.G;
        List list2 = (List) this.H;
        dx9 dx9Var = (dx9) this.I;
        kcd kcdVar = (kcd) obj;
        dvg dvgVar = kcdVar.e;
        int iD = dvgVar != null ? dvgVar.d() : 0;
        int iE = 0;
        for (int i = 0; i < iD; i++) {
            iE += (int) (dx9Var.q == ukc.E ? kcdVar.e(i) & 4294967295L : kcdVar.e(i) >> 32);
        }
        if (list != null) {
            list.add(Integer.valueOf(iE));
        }
        if (baeVar.E != list2.size()) {
            baeVar.E++;
        }
        return iei.a;
    }

    private final Object e(Object obj) {
        vza vzaVar = (vza) this.F;
        fj0 fj0Var = (fj0) this.G;
        String str = (String) this.H;
        zy7 zy7Var = (zy7) this.I;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : copyOnWriteArrayList) {
                ((n30) ((zfa) obj2)).getClass();
                arrayList.add(obj2);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str2 = "Render process gone in fullscreen (crash=" + zBooleanValue + "); evicting + dismissing";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, "McpAppViewHost", str2);
                }
            }
        }
        vzaVar.h.setValue(Boolean.TRUE);
        fd9.z(vzaVar.c, null);
        fj0Var.o(str);
        zy7Var.a();
        return iei.a;
    }

    private final Object f(Object obj) {
        List list = (List) this.F;
        String str = (String) this.G;
        bz7 bz7Var = (bz7) this.H;
        qnc qncVar = (qnc) this.I;
        haa haaVar = (haa) obj;
        haaVar.getClass();
        haa.a(haaVar, !list.isEmpty(), new ta4(-395547798, true, new hpb(list, str, bz7Var, qncVar, 0)), 2);
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c47  */
    /* JADX WARN: Type inference failed for: r9v0, types: [mq5, tp4] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // defpackage.bz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ fe(t4g t4gVar, hi4 hi4Var, Context context, f03 f03Var) {
        this.E = 15;
        this.G = t4gVar;
        this.H = hi4Var;
        this.F = context;
        this.I = f03Var;
    }

    public /* synthetic */ fe(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ fe(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ fe(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.E = i;
        this.F = obj;
        this.I = obj2;
        this.G = obj3;
        this.H = obj4;
    }

    public /* synthetic */ fe(ArrayList arrayList, bae baeVar, List list, int i, dx9 dx9Var) {
        this.E = 24;
        this.F = arrayList;
        this.G = baeVar;
        this.H = list;
        this.I = dx9Var;
    }
}
