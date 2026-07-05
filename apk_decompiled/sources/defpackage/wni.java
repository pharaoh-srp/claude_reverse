package defpackage;

import android.content.Context;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wni implements uja {
    public static final oqb h;
    public final koi a;
    public final Context b;
    public final k8i c;
    public final u5e d;
    public final j9 e;
    public final hj f;
    public final d8a g;

    static {
        oqb oqbVar = new oqb();
        kce kceVar = jce.a;
        xai xaiVar = new xai(kceVar.b(zni.class));
        w7f w7fVar = new w7f(new qh1(xaiVar, kceVar.b(wni.class), null, new vxh(4), kq9.G));
        oqbVar.a(w7fVar);
        fd9.n0(new ir9(oqbVar, w7fVar));
        oqbVar.d.add(xaiVar);
        h = oqbVar;
    }

    public wni(koi koiVar, Context context, q79 q79Var, k8i k8iVar, u5e u5eVar, j9 j9Var, hj hjVar) {
        this.a = koiVar;
        this.b = context;
        this.c = k8iVar;
        this.d = u5eVar;
        this.e = j9Var;
        this.f = hjVar;
        d8a d8aVarE = x44.E();
        d8aVarE.add(new vni(0, this));
        d8aVarE.add(new vni(1, this));
        d8aVarE.add(new vni(2, this));
        d8aVarE.add(q79Var);
        d8aVarE.add(new vni(3, this));
        d8aVarE.add(new vni(4, this));
        d8aVarE.add(new vni(5, this));
        this.g = x44.v(d8aVarE);
    }

    @Override // defpackage.uja
    public final void a() {
        ListIterator listIterator = this.g.listIterator(0);
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return;
            } else {
                ((uja) c8aVar.next()).a();
            }
        }
    }
}
