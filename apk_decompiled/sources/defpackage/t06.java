package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t06 implements wc0 {
    public static final /* synthetic */ wn9[] F;
    public final dfa E;

    static {
        kce kceVar = jce.a;
        F = new wn9[]{kceVar.g(new mrd(kceVar.b(t06.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public t06(gfa gfaVar, zy7 zy7Var) {
        gfaVar.getClass();
        this.E = new dfa(gfaVar, zy7Var);
    }

    @Override // defpackage.wc0
    public final jc0 P(ww7 ww7Var) {
        return bsk.c(this, ww7Var);
    }

    @Override // defpackage.wc0
    public boolean isEmpty() {
        return ((List) wd6.s0(this.E, F[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) wd6.s0(this.E, F[0])).iterator();
    }

    @Override // defpackage.wc0
    public final boolean x(ww7 ww7Var) {
        return bsk.d(this, ww7Var);
    }
}
