package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q42 {
    public static final q42 E;
    public static final q42 F;
    public static final q42 G;
    public static final q42 H;
    public static final HashMap I;
    public static final /* synthetic */ q42[] J;

    /* JADX INFO: Fake field, exist only in values array */
    q42 EF1;

    static {
        q42 q42Var = new q42("target", 0);
        q42 q42Var2 = new q42("root", 1);
        q42 q42Var3 = new q42("nth_child", 2);
        E = q42Var3;
        q42 q42Var4 = new q42("nth_last_child", 3);
        q42 q42Var5 = new q42("nth_of_type", 4);
        F = q42Var5;
        q42 q42Var6 = new q42("nth_last_of_type", 5);
        G = q42Var6;
        q42 q42Var7 = new q42("first_child", 6);
        q42 q42Var8 = new q42("last_child", 7);
        q42 q42Var9 = new q42("first_of_type", 8);
        q42 q42Var10 = new q42("last_of_type", 9);
        q42 q42Var11 = new q42("only_child", 10);
        q42 q42Var12 = new q42("only_of_type", 11);
        q42 q42Var13 = new q42("empty", 12);
        q42 q42Var14 = new q42("not", 13);
        q42 q42Var15 = new q42("lang", 14);
        q42 q42Var16 = new q42("link", 15);
        q42 q42Var17 = new q42("visited", 16);
        q42 q42Var18 = new q42("hover", 17);
        q42 q42Var19 = new q42("active", 18);
        q42 q42Var20 = new q42("focus", 19);
        q42 q42Var21 = new q42("enabled", 20);
        q42 q42Var22 = new q42("disabled", 21);
        q42 q42Var23 = new q42("checked", 22);
        q42 q42Var24 = new q42("indeterminate", 23);
        q42 q42Var25 = new q42("UNSUPPORTED", 24);
        H = q42Var25;
        J = new q42[]{q42Var, q42Var2, q42Var3, q42Var4, q42Var5, q42Var6, q42Var7, q42Var8, q42Var9, q42Var10, q42Var11, q42Var12, q42Var13, q42Var14, q42Var15, q42Var16, q42Var17, q42Var18, q42Var19, q42Var20, q42Var21, q42Var22, q42Var23, q42Var24, q42Var25};
        I = new HashMap();
        for (q42 q42Var26 : values()) {
            if (q42Var26 != H) {
                I.put(q42Var26.name().replace('_', '-'), q42Var26);
            }
        }
    }

    public static q42 valueOf(String str) {
        return (q42) Enum.valueOf(q42.class, str);
    }

    public static q42[] values() {
        return (q42[]) J.clone();
    }
}
