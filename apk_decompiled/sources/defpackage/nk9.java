package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public enum nk9 {
    BOOLEAN(vfd.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(vfd.CHAR, "char", "C", "java.lang.Character"),
    BYTE(vfd.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(vfd.SHORT, "short", "S", "java.lang.Short"),
    INT(vfd.INT, "int", "I", "java.lang.Integer"),
    FLOAT(vfd.FLOAT, "float", "F", "java.lang.Float"),
    LONG(vfd.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(vfd.DOUBLE, "double", "D", "java.lang.Double");

    public static final HashSet Q = new HashSet();
    public static final HashMap R = new HashMap();
    public static final EnumMap S = new EnumMap(vfd.class);
    public static final HashMap T = new HashMap();
    public final vfd E;
    public final String F;
    public final String G;
    public final ww7 H;

    static {
        for (nk9 nk9Var : values()) {
            Q.add(nk9Var.d());
            R.put(nk9Var.F, nk9Var);
            S.put(nk9Var.c(), nk9Var);
            T.put(nk9Var.G, nk9Var);
        }
    }

    nk9(vfd vfdVar, String str, String str2, String str3) {
        if (vfdVar == null) {
            a(6);
            throw null;
        }
        this.E = vfdVar;
        this.F = str;
        this.G = str2;
        this.H = new ww7(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk9.a(int):void");
    }

    public static nk9 b(String str) {
        nk9 nk9Var = (nk9) R.get(str);
        if (nk9Var != null) {
            return nk9Var;
        }
        sz6.h("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final vfd c() {
        vfd vfdVar = this.E;
        if (vfdVar != null) {
            return vfdVar;
        }
        a(10);
        throw null;
    }

    public final ww7 d() {
        ww7 ww7Var = this.H;
        if (ww7Var != null) {
            return ww7Var;
        }
        a(13);
        throw null;
    }
}
