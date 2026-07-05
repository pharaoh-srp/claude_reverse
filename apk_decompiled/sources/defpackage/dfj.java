package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dfj {
    public static final dfj E;
    public static final dfj F;
    public static final dfj G;
    public static final dfj H;
    public static final dfj I;
    public static final dfj J;
    public static final dfj K;
    public static final dfj L;
    public static final dfj M;
    public static final /* synthetic */ dfj[] N;

    static {
        dfj dfjVar = new dfj("INT", 0);
        E = dfjVar;
        dfj dfjVar2 = new dfj("LONG", 1);
        F = dfjVar2;
        dfj dfjVar3 = new dfj("FLOAT", 2);
        G = dfjVar3;
        dfj dfjVar4 = new dfj("DOUBLE", 3);
        H = dfjVar4;
        dfj dfjVar5 = new dfj("BOOLEAN", 4);
        I = dfjVar5;
        dfj dfjVar6 = new dfj("STRING", 5);
        J = dfjVar6;
        f22 f22Var = f22.G;
        dfj dfjVar7 = new dfj("BYTE_STRING", 6);
        K = dfjVar7;
        dfj dfjVar8 = new dfj("ENUM", 7);
        L = dfjVar8;
        dfj dfjVar9 = new dfj("MESSAGE", 8);
        M = dfjVar9;
        N = new dfj[]{dfjVar, dfjVar2, dfjVar3, dfjVar4, dfjVar5, dfjVar6, dfjVar7, dfjVar8, dfjVar9};
    }

    public static dfj valueOf(String str) {
        return (dfj) Enum.valueOf(dfj.class, str);
    }

    public static dfj[] values() {
        return (dfj[]) N.clone();
    }
}
