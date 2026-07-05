package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class p91 implements n39 {
    public static final Pattern a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // defpackage.n39
    public final i49 a(s39 s39Var) {
        t6f t6fVar = s39Var.e;
        t6fVar.j();
        l42 l42VarQ = t6fVar.q();
        if (t6fVar.b('>') > 0) {
            d80 d80VarE = t6fVar.e(l42VarQ, t6fVar.q());
            String strG = d80VarE.g();
            t6fVar.j();
            String strConcat = a.matcher(strG).matches() ? strG : b.matcher(strG).matches() ? "mailto:".concat(strG) : null;
            if (strConcat != null) {
                l6a l6aVar = new l6a(strConcat, null);
                edh edhVar = new edh(strG);
                edhVar.g(d80VarE.j());
                l6aVar.c(edhVar);
                return i49.V0(l6aVar, t6fVar.q());
            }
        }
        return null;
    }
}
