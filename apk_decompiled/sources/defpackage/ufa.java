package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ufa implements no8 {
    public final al2 a;
    public final ArrayList b;

    public ufa(al2 al2Var) {
        this.a = al2Var;
        List list = al2Var.j;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(Math.pow(10.0d, ((Number) it.next()).doubleValue())));
        }
        this.b = arrayList;
    }

    @Override // defpackage.no8
    public final List a(ge2 ge2Var, oub oubVar, eq3 eq3Var) {
        ge2Var.getClass();
        oubVar.getClass();
        return this.a.j;
    }

    @Override // defpackage.no8
    public final List c(yd2 yd2Var, eq3 eq3Var, eq3 eq3Var2, float f) {
        return this.b;
    }

    @Override // defpackage.no8
    public final float d(ge2 ge2Var, oub oubVar, float f, float f2) {
        ge2Var.getClass();
        oubVar.getClass();
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.no8
    public final List e(ge2 ge2Var, oub oubVar, eq3 eq3Var) {
        ge2Var.getClass();
        oubVar.getClass();
        return this.a.j;
    }

    @Override // defpackage.no8
    public final List g(yd2 yd2Var, eq3 eq3Var, eq3 eq3Var2) {
        return this.b;
    }

    @Override // defpackage.no8
    public final float h(ge2 ge2Var, oub oubVar, float f, float f2) {
        ge2Var.getClass();
        oubVar.getClass();
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }
}
