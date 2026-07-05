package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class nub implements xd2 {
    public final LinkedHashMap a;
    public final double b;
    public final double c;
    public final double d;

    public nub(mub mubVar) {
        this.a = mubVar.c;
        Double d = mubVar.a;
        this.b = d != null ? d.doubleValue() : 0.0d;
        Double d2 = mubVar.b;
        this.c = d2 != null ? d2.doubleValue() : 0.0d;
        this.d = mubVar.d;
    }

    @Override // defpackage.xd2
    public final double a() {
        return this.c;
    }

    @Override // defpackage.xd2
    public final double b() {
        return this.b;
    }

    @Override // defpackage.xd2
    public final double d() {
        return this.d;
    }

    @Override // defpackage.xd2
    public final lub e(qa1 qa1Var) {
        LinkedHashMap linkedHashMap = this.a;
        lub lubVar = (lub) linkedHashMap.get(qa1Var);
        return lubVar != null ? lubVar : (lub) sta.f0(null, linkedHashMap);
    }
}
