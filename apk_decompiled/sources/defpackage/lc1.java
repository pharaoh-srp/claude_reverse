package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lc1 implements n39 {
    @Override // defpackage.n39
    public final i49 a(s39 s39Var) {
        t6f t6fVar = s39Var.e;
        l42 l42VarQ = t6fVar.q();
        int iH = t6fVar.h('`');
        l42 l42VarQ2 = t6fVar.q();
        while (t6fVar.b('`') > 0) {
            l42 l42VarQ3 = t6fVar.q();
            if (t6fVar.h('`') == iH) {
                kq3 kq3Var = new kq3();
                String strReplace = t6fVar.e(l42VarQ2, l42VarQ3).g().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && ybi.j(strReplace)) {
                    strReplace = vb7.j(1, 1, strReplace);
                }
                kq3Var.j(strReplace);
                return i49.V0(kq3Var, t6fVar.q());
            }
        }
        return i49.V0(new edh(t6fVar.e(l42VarQ, l42VarQ2).g()), l42VarQ2);
    }
}
