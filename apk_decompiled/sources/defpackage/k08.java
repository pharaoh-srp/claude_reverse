package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class k08 extends c7g {
    public k08(bo5 bo5Var, k08 k08Var, int i, boolean z) {
        super(bo5Var, k08Var, dd8.F, jjc.g, i, neg.n);
        this.Q = true;
        this.Y = z;
        this.Z = false;
    }

    @Override // defpackage.j08, defpackage.h08
    public final boolean B() {
        return false;
    }

    @Override // defpackage.c7g, defpackage.j08
    public final j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        bo5Var.getClass();
        if (i == 0) {
            throw null;
        }
        wc0Var.getClass();
        return new k08(bo5Var, (k08) h08Var, i, this.Y);
    }

    @Override // defpackage.j08
    public final j08 Q0(i08 i08Var) {
        sxb sxbVar;
        k08 k08Var = (k08) super.Q0(i08Var);
        if (k08Var == null) {
            return null;
        }
        List listI = k08Var.I();
        listI.getClass();
        List list = listI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return k08Var;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yr9 type = ((eri) it.next()).getType();
            type.getClass();
            if (cpk.i(type) != null) {
                List listI2 = k08Var.I();
                listI2.getClass();
                List list2 = listI2;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    yr9 type2 = ((eri) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(cpk.i(type2));
                }
                int size = k08Var.I().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listI3 = k08Var.I();
                    listI3.getClass();
                    ArrayList<cpc> arrayListV1 = w44.v1(arrayList, listI3);
                    if (arrayListV1.isEmpty()) {
                        return k08Var;
                    }
                    for (cpc cpcVar : arrayListV1) {
                        if (!x44.r((sxb) cpcVar.E, ((eri) cpcVar.F).getName())) {
                        }
                    }
                    return k08Var;
                }
                List listI4 = k08Var.I();
                listI4.getClass();
                List<eri> list3 = listI4;
                ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
                for (eri eriVar : list3) {
                    sxb name = eriVar.getName();
                    name.getClass();
                    int i = eriVar.J;
                    int i2 = i - size;
                    if (i2 >= 0 && (sxbVar = (sxb) arrayList.get(i2)) != null) {
                        name = sxbVar;
                    }
                    arrayList2.add(eriVar.N0(k08Var, name, i));
                }
                i08 i08VarT0 = k08Var.T0(a.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((sxb) it3.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                i08VarT0.Z = Boolean.valueOf(z);
                i08VarT0.K = arrayList2;
                i08VarT0.I = k08Var.M0();
                j08 j08VarQ0 = super.Q0(i08VarT0);
                j08VarQ0.getClass();
                return j08VarQ0;
            }
        }
        return k08Var;
    }

    @Override // defpackage.j08, defpackage.w9b
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.j08, defpackage.h08
    public final boolean isInline() {
        return false;
    }
}
