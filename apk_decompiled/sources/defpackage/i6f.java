package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i6f {
    public static final i6f E;
    public static final i6f F;
    public static final i6f G;
    public static final i6f H;
    public static final i6f I;
    public static final /* synthetic */ i6f[] J;

    static {
        i6f i6fVar = new i6f("TopBar", 0);
        E = i6fVar;
        i6f i6fVar2 = new i6f("MainContent", 1);
        F = i6fVar2;
        i6f i6fVar3 = new i6f("Snackbar", 2);
        G = i6fVar3;
        i6f i6fVar4 = new i6f("Fab", 3);
        H = i6fVar4;
        i6f i6fVar5 = new i6f("BottomBar", 4);
        I = i6fVar5;
        J = new i6f[]{i6fVar, i6fVar2, i6fVar3, i6fVar4, i6fVar5};
    }

    public static i6f valueOf(String str) {
        return (i6f) Enum.valueOf(i6f.class, str);
    }

    public static i6f[] values() {
        return (i6f[]) J.clone();
    }
}
