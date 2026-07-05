package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dhi {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        chi[] chiVarArrValues = chi.values();
        ArrayList arrayList = new ArrayList(chiVarArrValues.length);
        for (chi chiVar : chiVarArrValues) {
            arrayList.add(chiVar.F);
        }
        a = w44.t1(arrayList);
        ygi[] ygiVarArrValues = ygi.values();
        ArrayList arrayList2 = new ArrayList(ygiVarArrValues.length);
        for (ygi ygiVar : ygiVarArrValues) {
            arrayList2.add(ygiVar.E);
        }
        w44.t1(arrayList2);
        b = new HashMap();
        c = new HashMap();
        sta.g0(new cpc(ygi.UBYTEARRAY, sxb.e("ubyteArrayOf")), new cpc(ygi.USHORTARRAY, sxb.e("ushortArrayOf")), new cpc(ygi.UINTARRAY, sxb.e("uintArrayOf")), new cpc(ygi.ULONGARRAY, sxb.e("ulongArrayOf")));
        chi[] chiVarArrValues2 = chi.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (chi chiVar2 : chiVarArrValues2) {
            linkedHashSet.add(chiVar2.G.i());
        }
        d = linkedHashSet;
        for (chi chiVar3 : chi.values()) {
            HashMap map = b;
            gh3 gh3Var = chiVar3.G;
            gh3 gh3Var2 = chiVar3.E;
            map.put(gh3Var, gh3Var2);
            c.put(gh3Var2, chiVar3.G);
        }
    }

    public static gh3 a(gh3 gh3Var) {
        return (gh3) b.get(gh3Var);
    }

    public static boolean b(sxb sxbVar) {
        sxbVar.getClass();
        return d.contains(sxbVar);
    }

    public static final boolean c(yr9 yr9Var) {
        xh3 xh3VarA;
        if (fbi.m(yr9Var) || (xh3VarA = yr9Var.O().a()) == null) {
            return false;
        }
        bo5 bo5VarH = xh3VarA.h();
        return (bo5VarH instanceof wmc) && x44.r(((xmc) ((wmc) bo5VarH)).I, pkg.j) && a.contains(xh3VarA.getName());
    }
}
