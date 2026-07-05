package com.anthropic.claude.project.knowledge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final k E;
    public static final k F;
    public static final /* synthetic */ k[] G;

    static {
        k kVar = new k("File", 0);
        E = kVar;
        k kVar2 = new k("Doc", 1);
        F = kVar2;
        G = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) G.clone();
    }
}
