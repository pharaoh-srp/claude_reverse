package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pgh {
    public final m2a a;
    public final zhh b;
    public final cjh c;
    public final boolean d;
    public final boolean e;
    public final jkh f;
    public final occ g;
    public final aei h;
    public final un5 i;
    public final am4 j;
    public final bz7 k;
    public final int l;

    public pgh(m2a m2aVar, zhh zhhVar, cjh cjhVar, boolean z, boolean z2, jkh jkhVar, occ occVar, aei aeiVar, un5 un5Var, bz7 bz7Var, int i) {
        am4 am4Var = nai.g;
        this.a = m2aVar;
        this.b = zhhVar;
        this.c = cjhVar;
        this.d = z;
        this.e = z2;
        this.f = jkhVar;
        this.g = occVar;
        this.h = aeiVar;
        this.i = un5Var;
        this.j = am4Var;
        this.k = bz7Var;
        this.l = i;
    }

    public final void a(List list) {
        epk epkVar = this.a.d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new jl7());
        this.k.invoke(epkVar.i(arrayList));
    }
}
