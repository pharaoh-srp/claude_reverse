package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf9 {
    public static final sqb a = new sqb("COMPLETING_ALREADY", 1);
    public static final sqb b = new sqb("COMPLETING_WAITING_CHILDREN", 1);
    public static final sqb c = new sqb("COMPLETING_RETRY", 1);
    public static final sqb d = new sqb("TOO_LATE_TO_CANCEL", 1);
    public static final sqb e = new sqb("SEALED", 1);
    public static final cm6 f = new cm6(false);
    public static final cm6 g = new cm6(true);

    public static final Object a(Object obj) {
        j09 j09Var;
        n09 n09Var = obj instanceof n09 ? (n09) obj : null;
        return (n09Var == null || (j09Var = n09Var.a) == null) ? obj : j09Var;
    }
}
