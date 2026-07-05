package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y46 implements Executor {
    public static final y46 E;
    public static final /* synthetic */ y46[] F;

    static {
        y46 y46Var = new y46("INSTANCE", 0);
        E = y46Var;
        F = new y46[]{y46Var};
    }

    public static y46 valueOf(String str) {
        return (y46) Enum.valueOf(y46.class, str);
    }

    public static y46[] values() {
        return (y46[]) F.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
