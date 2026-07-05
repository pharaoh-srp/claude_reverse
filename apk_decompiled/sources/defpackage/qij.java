package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qij {
    public static final qij G;
    public static final qij H;
    public static final qij I;
    public static final qij J;
    public static final /* synthetic */ qij[] K;
    public static final /* synthetic */ gq6 L;
    public final char E;
    public final char F;

    static {
        qij qijVar = new qij("OBJ", 0, '{', '}');
        G = qijVar;
        qij qijVar2 = new qij("LIST", 1, '[', ']');
        H = qijVar2;
        qij qijVar3 = new qij("MAP", 2, '{', '}');
        I = qijVar3;
        qij qijVar4 = new qij("POLY_OBJ", 3, '[', ']');
        J = qijVar4;
        qij[] qijVarArr = {qijVar, qijVar2, qijVar3, qijVar4};
        K = qijVarArr;
        L = new gq6(qijVarArr);
    }

    public qij(String str, int i, char c, char c2) {
        this.E = c;
        this.F = c2;
    }

    public static qij valueOf(String str) {
        return (qij) Enum.valueOf(qij.class, str);
    }

    public static qij[] values() {
        return (qij[]) K.clone();
    }
}
