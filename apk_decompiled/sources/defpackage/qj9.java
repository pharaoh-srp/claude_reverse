package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qj9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ uqb G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj9(uqb uqbVar, int i) {
        super(0);
        this.F = i;
        this.G = uqbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        uqb uqbVar = this.G;
        switch (i) {
            case 0:
                return new pj9(uqbVar);
            case 1:
                d86 d86Var = uqbVar.K;
                if (d86Var == null) {
                    String str = uqbVar.getName().E;
                    str.getClass();
                    mr9.g(str, " were not set before querying module content", "Dependencies of module ");
                    return null;
                }
                List list = d86Var.a;
                if (!uqbVar.M) {
                    ssj.r(uqbVar);
                    throw null;
                }
                list.contains(uqbVar);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((uqb) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    zmc zmcVar = ((uqb) it2.next()).L;
                    zmcVar.getClass();
                    arrayList.add(zmcVar);
                }
                return new be4(arrayList, "CompositeProvider@ModuleDescriptor for " + uqbVar.getName());
            default:
                return uqbVar.a0(pkg.h).K;
        }
    }
}
