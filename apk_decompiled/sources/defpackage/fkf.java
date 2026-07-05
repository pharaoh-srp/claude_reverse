package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fkf {
    public static final Comparator[] a;
    public static final c0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new pa9(7, new pa9(i == 0 ? mt7.I : mt7.G));
            i++;
        }
        a = comparatorArr;
        b = c0.Z;
    }

    public static final void a(wjf wjfVar, ArrayList arrayList, h4 h4Var, h4 h4Var2, xub xubVar) {
        qjf qjfVar = wjfVar.d;
        Object objG = qjfVar.E.g(akf.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) h4Var2.invoke(wjfVar)).booleanValue()) && ((Boolean) h4Var.invoke(wjfVar)).booleanValue()) {
            arrayList.add(wjfVar);
        }
        if (zBooleanValue) {
            xubVar.i(wjfVar.f, b(wjfVar, h4Var, h4Var2, wjf.j(7, wjfVar)));
            return;
        }
        List listJ = wjf.j(7, wjfVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((wjf) listJ.get(i), arrayList, h4Var, h4Var2, xubVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.wjf r17, defpackage.h4 r18, defpackage.h4 r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkf.b(wjf, h4, h4, java.util.List):java.util.ArrayList");
    }
}
