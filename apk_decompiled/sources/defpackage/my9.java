package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class my9 extends nvk {
    public final /* synthetic */ qqb h;
    public final /* synthetic */ Set i;
    public final /* synthetic */ bz7 j;

    public my9(qqb qqbVar, Set set, bz7 bz7Var) {
        this.h = qqbVar;
        this.i = set;
        this.j = bz7Var;
    }

    @Override // defpackage.nvk
    public final boolean k(Object obj) {
        qqb qqbVar = (qqb) obj;
        qqbVar.getClass();
        if (qqbVar == this.h) {
            return true;
        }
        fab fabVarB0 = qqbVar.b0();
        fabVarB0.getClass();
        if (!(fabVarB0 instanceof oy9)) {
            return true;
        }
        this.i.addAll((Collection) this.j.invoke(fabVarB0));
        return false;
    }

    @Override // defpackage.nvk
    public final /* bridge */ /* synthetic */ Object t() {
        return iei.a;
    }
}
