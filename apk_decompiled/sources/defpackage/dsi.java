package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface dsi {
    boolean a();

    long e(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3);

    sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3);

    sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3);

    default sb0 q(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return f(e(sb0Var, sb0Var2, sb0Var3), sb0Var, sb0Var2, sb0Var3);
    }
}
