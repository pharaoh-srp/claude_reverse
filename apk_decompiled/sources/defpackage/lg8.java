package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llg8;", "Lnqb;", "Lmg8;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class lg8 extends nqb {
    public final ng8 E;

    public lg8(ng8 ng8Var) {
        ng8Var.getClass();
        this.E = ng8Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new mg8(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg8) && x44.r(this.E, ((lg8) obj).E) && Float.compare(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) == 0;
    }

    public final int hashCode() {
        return vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, this.E.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.E + ", zIndex=0.0, key=null)";
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        mg8 mg8Var = (mg8) hqbVar;
        mg8Var.getClass();
        ng8 ng8Var = this.E;
        ng8Var.getClass();
        kdg kdgVar = mg8Var.T.a;
        bg8 bg8Var = mg8Var.S;
        boolean zContains = kdgVar.contains(bg8Var);
        if (zContains) {
            ng8 ng8Var2 = mg8Var.T;
            ng8Var2.getClass();
            bg8Var.getClass();
            ng8Var2.a.remove(bg8Var);
        }
        mg8Var.T = ng8Var;
        if (zContains) {
            bg8Var.getClass();
            ng8Var.a.add(bg8Var);
        }
        bg8Var.c.i(MTTypesetterKt.kLineSkipLimitMultiplier);
    }
}
