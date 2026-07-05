package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pf6 {
    public static final efk G;
    public static final Set H;
    public static final pf6 I;
    public static final pf6 J;
    public static final pf6 K;
    public static final pf6 L;
    public static final pf6 M;
    public static final pf6 N;
    public static final pf6 O;
    public static final pf6 P;
    public static final /* synthetic */ pf6[] Q;
    public static final /* synthetic */ gq6 R;
    public final String E;
    public final DrawerEvents$DrawerItem F;

    static {
        pf6 pf6Var = new pf6("CHATS", 0, "chats", DrawerEvents$DrawerItem.CHATS);
        I = pf6Var;
        pf6 pf6Var2 = new pf6("AGENT_CHAT", 1, "cowork", DrawerEvents$DrawerItem.COWORK);
        J = pf6Var2;
        pf6 pf6Var3 = new pf6("TASKS", 2, "tasks", DrawerEvents$DrawerItem.TASKS);
        K = pf6Var3;
        pf6 pf6Var4 = new pf6("PROJECTS", 3, "projects", DrawerEvents$DrawerItem.PROJECTS);
        L = pf6Var4;
        pf6 pf6Var5 = new pf6("ARTIFACTS", 4, "artifacts", DrawerEvents$DrawerItem.ARTIFACTS);
        M = pf6Var5;
        pf6 pf6Var6 = new pf6("CODE", 5, "code", DrawerEvents$DrawerItem.CODE);
        N = pf6Var6;
        pf6 pf6Var7 = new pf6("DRAMATIC_SHRIMP", 6, "dramaticShrimp", DrawerEvents$DrawerItem.UNSPECIFIED);
        O = pf6Var7;
        pf6 pf6Var8 = new pf6("CONWAY", 7, "conway", DrawerEvents$DrawerItem.CONWAY);
        P = pf6Var8;
        pf6[] pf6VarArr = {pf6Var, pf6Var2, pf6Var3, pf6Var4, pf6Var5, pf6Var6, pf6Var7, pf6Var8};
        Q = pf6VarArr;
        R = new gq6(pf6VarArr);
        G = new efk(17);
        H = sf5.f0(pf6Var);
    }

    public pf6(String str, int i, String str2, DrawerEvents$DrawerItem drawerEvents$DrawerItem) {
        this.E = str2;
        this.F = drawerEvents$DrawerItem;
    }

    public static pf6 valueOf(String str) {
        return (pf6) Enum.valueOf(pf6.class, str);
    }

    public static pf6[] values() {
        return (pf6[]) Q.clone();
    }
}
