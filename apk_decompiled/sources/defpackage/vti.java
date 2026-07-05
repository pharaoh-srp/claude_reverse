package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vti {
    public static final vti E;
    public static final vti F;
    public static final /* synthetic */ vti[] G;

    static {
        vti vtiVar = new vti("Outside", 0);
        E = vtiVar;
        vti vtiVar2 = new vti("Inside", 1);
        F = vtiVar2;
        G = new vti[]{vtiVar, vtiVar2};
    }

    public static vti valueOf(String str) {
        return (vti) Enum.valueOf(vti.class, str);
    }

    public static vti[] values() {
        return (vti[]) G.clone();
    }
}
