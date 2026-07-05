package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.google.android.gms.maps.model.CameraPosition;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wvj {
    public static final ta4 a = new ta4(1294815446, false, new ua4(23));
    public static final bm4 b = new bm4();
    public static fuj c;

    public static final void a(List list, List list2, pz7 pz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        list.getClass();
        list2.getClass();
        pz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1737124620);
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.f(list2) ? 32 : 16) | (e18Var2.h(pz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            r4g r4gVarS = gb9.S(null, null, null, zy7Var, e18Var2, i2 & 7168, 7);
            String strE0 = d4c.e0(R.plurals.knowledge_sources, list2.size() + list.size(), e18Var2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new tfe(list, list2, pz7Var, 22);
                e18Var2.k0(objN);
            }
            pz7 pz7Var2 = (pz7) objN;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            ovj.a(r4gVarS, strE0, fqbVar, null, false, false, null, null, null, null, null, null, null, pz7Var2, e18Var, 392, 0, 32760);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(list, list2, pz7Var, zy7Var, iqbVar2, i, 9);
        }
    }

    public static final void b(WorkDatabase workDatabase, fg4 fg4Var, pfj pfjVar) {
        int i;
        workDatabase.getClass();
        fg4Var.getClass();
        ArrayList arrayListA0 = x44.a0(pfjVar);
        int i2 = 0;
        while (!arrayListA0.isEmpty()) {
            List list = ((pfj) b54.z0(arrayListA0)).d;
            list.getClass();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((tgc) it.next()).b.j.g() && (i = i + 1) < 0) {
                        x44.m0();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) u00.E(workDatabase.w().a, true, false, new f9j(5))).intValue();
        int i3 = fg4Var.j;
        if (iIntValue + i2 <= i3) {
            return;
        }
        sz6.p(vb7.l(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", vb7.v("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", i3, iIntValue, ";\ncurrent enqueue operation count: ")));
    }

    public static qbg c(ArrayList arrayList) {
        qbg qbgVar = new qbg();
        qbgVar.addAll(arrayList);
        return qbgVar;
    }

    public static SimpleDateFormat d() {
        return new SimpleDateFormat(ij0.C("MMM d, yyyy", " ", "h:mm:ss a"), Locale.US);
    }

    public static poj e(CameraPosition cameraPosition) {
        dgj.w("cameraPosition must not be null", cameraPosition);
        try {
            fuj fujVar = c;
            dgj.w("CameraUpdateFactory is not initialized", fujVar);
            Parcel parcelH = fujVar.H();
            gyj.c(parcelH, cameraPosition);
            Parcel parcelF = fujVar.F(parcelH, 7);
            lu8 lu8VarF = cbc.F(parcelF.readStrongBinder());
            parcelF.recycle();
            return new poj(lu8VarF);
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }

    public static final void f(eli eliVar, KnowledgeSource knowledgeSource) {
        eliVar.getClass();
        knowledgeSource.getClass();
        String url = knowledgeSource.getUrl();
        if (url != null) {
            try {
                eliVar.a(url);
            } catch (IllegalArgumentException e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    zfa.a.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    zfa.a.getClass();
                    String strK = ij0.k("Failed to open source URL: ", url, ": ", gsk.c(e));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.ERROR, "ViewCombinedSourcesBottomSheet", strK);
                    }
                }
            }
        }
    }

    public static void g(xwg xwgVar, int i, gm4 gm4Var) {
        long jG = xwgVar.g(i);
        List listI = xwgVar.i(jG);
        if (listI.isEmpty()) {
            return;
        }
        if (i == xwgVar.l() - 1) {
            e0.b();
            return;
        }
        long jG2 = xwgVar.g(i + 1) - xwgVar.g(i);
        if (jG2 > 0) {
            gm4Var.accept(new hd5(jG, jG2, listI));
        }
    }

    public static final void h(j0a j0aVar, List list, mnc mncVar, bz7 bz7Var) {
        j0aVar.W(list.size(), new zkd(new hzh(9), 19, list), new wxf(list, 8), new ta4(2039820996, true, new izh(list, mncVar, bz7Var, list, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(defpackage.xwg r12, defpackage.cxg r13, defpackage.gm4 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.d(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.l()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.g(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.l()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.i(r0)
            long r2 = r12.g(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            hd5 r6 = new hd5
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.l()
            if (r3 >= r6) goto L5f
            g(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            g(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            hd5 r6 = new hd5
            java.util.List r11 = r12.i(r0)
            long r7 = r12.g(r4)
            long r12 = r12.g(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvj.i(xwg, cxg, gm4):void");
    }
}
