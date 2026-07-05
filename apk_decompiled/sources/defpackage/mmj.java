package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mmj {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final e88 a;

    public mmj(e88 e88Var) {
        this.a = e88Var;
    }

    public final noj a(noj nojVar) {
        nojVar.f();
        e88 e88Var = this.a;
        j88 j88Var = e88Var.j;
        j88Var.getClass();
        umj umjVar = new umj(new cnj(nojVar), j88Var.M.get(), e88Var);
        xnj xnjVar = j88Var.Q;
        xnjVar.sendMessage(xnjVar.obtainMessage(4, umjVar));
        return nojVar;
    }
}
