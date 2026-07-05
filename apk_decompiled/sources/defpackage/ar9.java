package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ar9 {
    public static final bm4 F;
    public static final ArrayList G;
    public static final ar9 H;
    public static final ar9 I;
    public static final ar9 J;
    public static final ar9 K;
    public static final /* synthetic */ ar9[] L;
    public static final /* synthetic */ gq6 M;
    public final String E;

    static {
        ar9 ar9Var = new ar9("PROVISION", 0, "provision");
        H = ar9Var;
        ar9 ar9Var2 = new ar9("CLONE", 1, "clone");
        I = ar9Var2;
        ar9 ar9Var3 = new ar9("SETUP_SCRIPT", 2, "setup_script");
        J = ar9Var3;
        ar9 ar9Var4 = new ar9("START_CC", 3, "start_cc");
        K = ar9Var4;
        ar9[] ar9VarArr = {ar9Var, ar9Var2, ar9Var3, ar9Var4};
        L = ar9VarArr;
        gq6 gq6Var = new gq6(ar9VarArr);
        M = gq6Var;
        F = new bm4();
        ArrayList arrayList = new ArrayList(x44.y(gq6Var, 10));
        Iterator<E> it = gq6Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((ar9) it.next()).E);
        }
        G = arrayList;
    }

    public ar9(String str, int i, String str2) {
        this.E = str2;
    }

    public static ar9 valueOf(String str) {
        return (ar9) Enum.valueOf(ar9.class, str);
    }

    public static ar9[] values() {
        return (ar9[]) L.clone();
    }
}
