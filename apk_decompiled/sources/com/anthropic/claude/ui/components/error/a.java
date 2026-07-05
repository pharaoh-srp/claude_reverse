package com.anthropic.claude.ui.components.error;

import defpackage.gh2;
import defpackage.gsk;
import defpackage.lf0;
import defpackage.mf0;
import defpackage.n30;
import defpackage.nf0;
import defpackage.nt6;
import defpackage.sfa;
import defpackage.tt6;
import defpackage.vt6;
import defpackage.wg6;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static void a(vt6 vt6Var, gh2 gh2Var) {
        vt6Var.getClass();
        gh2Var.getClass();
        if (vt6Var instanceof nt6) {
            com.anthropic.claude.ui.components.snackbar.a.b(((nt6) vt6Var).a, gh2Var);
            return;
        }
        gh2Var.r(vt6Var);
        ErrorMessageException errorMessageException = new ErrorMessageException();
        zfa.a.getClass();
        if (yfa.b()) {
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
            String str = "ErrorMessage:  " + vt6Var + ": " + gsk.c(errorMessageException);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "ErrorMessage", str);
            }
        }
    }

    public static final vt6 b(nf0 nf0Var) {
        nf0Var.getClass();
        if (nf0Var instanceof lf0) {
            return new nt6(((lf0) nf0Var).b);
        }
        if (nf0Var instanceof mf0) {
            return new tt6(true);
        }
        wg6.i();
        return null;
    }
}
