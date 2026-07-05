package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aic extends ln7 {
    public static final aic d = new aic(0, 2, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        int i = ((d79) gjcVar.b(0)).a;
        List list = (List) gjcVar.b(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            hn0Var.a(i3, obj);
            hn0Var.h(i3, obj);
        }
    }
}
