package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l5l extends k0l {
    public String H;
    public HashSet I;
    public bp0 J;
    public Long K;
    public Long L;

    @Override // defpackage.k0l
    public final boolean Q0() {
        return false;
    }

    public final ArrayList R0(String str, List list, List list2, Long l, Long l2) {
        return S0(str, list, list2, l, l2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList S0(java.lang.String r26, java.util.List r27, java.util.List r28, java.lang.Long r29, java.lang.Long r30, boolean r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5l.S0(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final s5l T0(Integer num) {
        if (this.J.containsKey(num)) {
            return (s5l) this.J.get(num);
        }
        s5l s5lVar = new s5l(this, this.H);
        this.J.put(num, s5lVar);
        return s5lVar;
    }

    public final void U0(List list, boolean z) throws Throwable {
        Iterator it;
        fvj fvjVar;
        boolean z2;
        boolean z3;
        Integer num;
        fvj fvjVar2;
        b bVar;
        if (list.isEmpty()) {
            return;
        }
        tjb tjbVar = new tjb(this);
        bp0 bp0Var = new bp0(0);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            x xVar = (x) it2.next();
            x xVarB = tjbVar.b(xVar, this.H);
            if (xVarB != null) {
                wrj wrjVarM0 = M0();
                String str = this.H;
                String strD = xVarB.D();
                fvj fvjVarF1 = wrjVarM0.F1("events", str, xVar.D());
                if (fvjVarF1 == null) {
                    wrjVarM0.b0().M.a(qgk.Q0(str), ((umk) wrjVarM0.E).Q.b(strD), "Event aggregate wasn't created during raw event logging. appId, event");
                    fvjVar = new fvj(str, xVar.D(), 1L, 1L, 1L, xVar.B(), 0L, null, null, null, null);
                    it = it2;
                } else {
                    it = it2;
                    fvjVar = new fvj(fvjVarF1.a, fvjVarF1.b, fvjVarF1.c + 1, fvjVarF1.d + 1, fvjVarF1.e + 1, fvjVarF1.f, fvjVarF1.g, fvjVarF1.h, fvjVarF1.i, fvjVarF1.j, fvjVarF1.k);
                }
                M0().l1("events", fvjVar);
                x1l.a();
                Cursor cursorQuery = null;
                if (((umk) this.E).K.X0(null, zvj.b1) && z) {
                    it2 = it;
                } else {
                    String strD2 = xVarB.D();
                    Map map = (Map) bp0Var.get(strD2);
                    if (map == null) {
                        wrj wrjVarM02 = M0();
                        String str2 = this.H;
                        wrjVarM02.O0();
                        wrjVarM02.K0();
                        dgj.s(str2);
                        dgj.s(strD2);
                        bp0 bp0Var2 = new bp0(0);
                        try {
                            try {
                                cursorQuery = wrjVarM02.R0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str2, strD2}, null, null, null);
                                if (cursorQuery.moveToFirst()) {
                                    do {
                                        try {
                                            bVar = (b) ((wck) dik.e1(b.u(), cursorQuery.getBlob(1))).b();
                                            z2 = false;
                                        } catch (IOException e) {
                                            z2 = false;
                                            wrjVarM02.b0().J.a(qgk.Q0(str2), e, "Failed to merge filter. appId");
                                        }
                                        try {
                                            int i = cursorQuery.getInt(0);
                                            List arrayList = (List) bp0Var2.get(Integer.valueOf(i));
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                bp0Var2.put(Integer.valueOf(i), arrayList);
                                            }
                                            arrayList.add(bVar);
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            wrjVarM02.b0().J.a(qgk.Q0(str2), e, "Database error querying filters. appId");
                                            map = Collections.EMPTY_MAP;
                                        }
                                    } while (cursorQuery.moveToNext());
                                    cursorQuery.close();
                                    map = bp0Var2;
                                } else {
                                    map = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    z2 = false;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                z2 = false;
                            }
                            bp0Var.put(strD2, map);
                        } finally {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    Map map2 = map;
                    for (Integer num2 : map2.keySet()) {
                        int iIntValue = num2.intValue();
                        if (this.I.contains(num2)) {
                            b0().R.c("Skipping failed audience ID", num2);
                        } else {
                            Iterator it3 = ((List) map2.get(num2)).iterator();
                            boolean zD = true;
                            while (true) {
                                if (!it3.hasNext()) {
                                    z3 = z2;
                                    num = num2;
                                    fvjVar2 = fvjVar;
                                    break;
                                }
                                b bVar2 = (b) it3.next();
                                spj spjVar = new spj(this, this.H, iIntValue, bVar2, 0);
                                Long l = this.K;
                                Long l2 = this.L;
                                int iT = bVar2.t();
                                s5l s5lVar = (s5l) this.J.get(num2);
                                boolean z4 = s5lVar == null ? z2 : s5lVar.d.get(iT);
                                fvj fvjVar3 = fvjVar;
                                num = num2;
                                fvjVar2 = fvjVar3;
                                z3 = z2;
                                zD = spjVar.d(l, l2, xVarB, fvjVar3.c, fvjVar2, z4);
                                if (!zD) {
                                    this.I.add(num);
                                    break;
                                }
                                T0(num).c(spjVar);
                                num2 = num;
                                fvjVar = fvjVar2;
                                z2 = z3;
                            }
                            if (!zD) {
                                this.I.add(num);
                            }
                            fvjVar = fvjVar2;
                            z2 = z3;
                        }
                    }
                    it2 = it;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x021c, code lost:
    
        r0 = b0().M;
        r2 = defpackage.qgk.Q0(r20.H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022c, code lost:
    
        if (r4.x() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022e, code lost:
    
        r3 = java.lang.Integer.valueOf(r4.p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0237, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0238, code lost:
    
        r0.a(r2, java.lang.String.valueOf(r3), "Invalid property filter ID. appId, id");
        r0 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27, types: [spj] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6, types: [s5l] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [w6g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(java.util.List r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5l.V0(java.util.List):void");
    }

    public final ArrayList W0() {
        ArrayList arrayList = new ArrayList();
        xo0<Integer> xo0Var = (xo0) this.J.keySet();
        xo0Var.removeAll(this.I);
        for (Integer num : xo0Var) {
            int iIntValue = num.intValue();
            s5l s5lVar = (s5l) this.J.get(num);
            dgj.v(s5lVar);
            v vVarA = s5lVar.a(iIntValue);
            arrayList.add(vVarA);
            wrj wrjVarM0 = M0();
            String str = this.H;
            e0 e0VarW = vVarA.w();
            wrjVarM0.O0();
            wrjVarM0.K0();
            dgj.s(str);
            dgj.v(e0VarW);
            byte[] bArrC = e0VarW.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrC);
            try {
                if (wrjVarM0.R0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    wrjVarM0.b0().J.c("Failed to insert filter results (got -1). appId", qgk.Q0(str));
                }
            } catch (SQLiteException e) {
                wrjVarM0.b0().J.a(qgk.Q0(str), e, "Error storing filter results. appId");
            }
        }
        return arrayList;
    }
}
