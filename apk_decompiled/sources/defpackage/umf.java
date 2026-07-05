package defpackage;

import io.sentry.g;
import io.sentry.h1;
import io.sentry.n0;
import io.sentry.t4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class umf implements fch {
    @Override // defpackage.fch
    public final void a() {
        t4.m();
    }

    @Override // defpackage.fch
    public final void e(String str, String str2, Map map) {
        String string;
        str2.getClass();
        map.getClass();
        g gVar = new g();
        gVar.K = str2;
        gVar.H = str;
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "null";
            }
            gVar.c(str3, string);
        }
        t4.g().m(gVar);
    }

    @Override // defpackage.fch
    public final void h(Throwable th, Throwable th2, String str, ozf ozfVar, Map map) {
        th.getClass();
        if (r0c.b(th)) {
            return;
        }
        ozf ozfVarB = skk.b(th);
        if (ozfVarB != null) {
            ozfVar = ozfVarB;
        }
        if (str != null) {
            h1 h1VarG = t4.g();
            h1VarG.getClass();
            g gVar = new g();
            gVar.H = str;
            gVar.K = "captureExceptionAndLog";
            h1VarG.m(gVar);
        }
        u95 u95Var = new u95(ozfVar, 14, map);
        h1 h1VarG2 = t4.g();
        h1VarG2.getClass();
        h1VarG2.o(th2, new n0(), u95Var);
    }
}
