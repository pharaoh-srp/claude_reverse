package defpackage;

import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class aq6 implements n39 {
    public static final efe a;
    public static final efe b;
    public static final efe c;
    public static final efe d;

    static {
        n78 n78VarF = efe.f();
        n78VarF.Q('0', '9');
        n78VarF.Q('A', 'F');
        n78VarF.Q('a', 'f');
        a = new efe(n78VarF);
        n78 n78VarF2 = efe.f();
        n78VarF2.Q('0', '9');
        b = new efe(n78VarF2);
        n78 n78VarF3 = efe.f();
        n78VarF3.Q('A', 'Z');
        n78VarF3.Q('a', 'z');
        efe efeVar = new efe(n78VarF3);
        c = efeVar;
        n78 n78VarX = efeVar.x();
        n78VarX.Q('0', '9');
        d = new efe(n78VarX);
    }

    public static i49 b(l42 l42Var, t6f t6fVar) {
        return i49.V0(new edh(vp8.a(t6fVar.e(l42Var, t6fVar.q()).g())), t6fVar.q());
    }

    @Override // defpackage.n39
    public final i49 a(s39 s39Var) {
        t6f t6fVar = s39Var.e;
        l42 l42VarQ = t6fVar.q();
        t6fVar.j();
        char cN = t6fVar.n();
        if (cN != '#') {
            if (!((BitSet) c.F).get(cN)) {
                return null;
            }
            t6fVar.g(d);
            if (t6fVar.k(';')) {
                return b(l42VarQ, t6fVar);
            }
            return null;
        }
        t6fVar.j();
        if (t6fVar.k('x') || t6fVar.k('X')) {
            int iG = t6fVar.g(a);
            if (1 > iG || iG > 6 || !t6fVar.k(';')) {
                return null;
            }
            return b(l42VarQ, t6fVar);
        }
        int iG2 = t6fVar.g(b);
        if (1 > iG2 || iG2 > 7 || !t6fVar.k(';')) {
            return null;
        }
        return b(l42VarQ, t6fVar);
    }
}
