package defpackage;

import com.anthropic.claude.api.account.MemoryMode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hcb {
    public static final am4 E;
    public static final hcb F;
    public static final hcb G;
    public static final hcb H;
    public static final /* synthetic */ hcb[] I;
    public static final /* synthetic */ gq6 J;

    static {
        hcb hcbVar = new hcb("MEMORY_FILES", 0);
        F = hcbVar;
        hcb hcbVar2 = new hcb("CLASSIC", 1);
        G = hcbVar2;
        hcb hcbVar3 = new hcb("OFF", 2);
        H = hcbVar3;
        hcb[] hcbVarArr = {hcbVar, hcbVar2, hcbVar3};
        I = hcbVarArr;
        J = new gq6(hcbVarArr);
        E = new am4(13);
    }

    public static hcb valueOf(String str) {
        return (hcb) Enum.valueOf(hcb.class, str);
    }

    public static hcb[] values() {
        return (hcb[]) I.clone();
    }

    public final boolean a() {
        return this == F;
    }

    public final MemoryMode b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return MemoryMode.MELANGE;
        }
        if (iOrdinal == 1) {
            return MemoryMode.CLASSIC;
        }
        if (iOrdinal == 2) {
            return MemoryMode.OFF;
        }
        wg6.i();
        return null;
    }

    public final boolean c() {
        return this == G;
    }
}
