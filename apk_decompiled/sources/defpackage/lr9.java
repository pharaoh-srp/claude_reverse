package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lr9 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ or9 F;

    public /* synthetic */ lr9(or9 or9Var, int i) {
        this.E = i;
        this.F = or9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        or9 or9Var = this.F;
        switch (i) {
            case 0:
                return Arrays.asList(or9Var.k().a0(pkg.j), or9Var.k().a0(pkg.l), or9Var.k().a0(pkg.m), or9Var.k().a0(pkg.k));
            default:
                EnumMap enumMap = new EnumMap(vfd.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (vfd vfdVar : vfd.values()) {
                    String strB = vfdVar.E.b();
                    if (strB == null) {
                        or9.a(46);
                        throw null;
                    }
                    j7g j7gVarW = or9Var.j(strB).W();
                    if (j7gVarW == null) {
                        or9.a(47);
                        throw null;
                    }
                    String strB2 = vfdVar.F.b();
                    if (strB2 == null) {
                        or9.a(46);
                        throw null;
                    }
                    j7g j7gVarW2 = or9Var.j(strB2).W();
                    if (j7gVarW2 == null) {
                        or9.a(47);
                        throw null;
                    }
                    enumMap.put(vfdVar, j7gVarW2);
                    map.put(j7gVarW, j7gVarW2);
                    map2.put(j7gVarW2, j7gVarW);
                }
                return new nr9(enumMap, map, map2);
        }
    }
}
