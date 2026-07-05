package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x46 implements Executor {
    public static final x46 E;
    public static final /* synthetic */ x46[] F;

    static {
        x46 x46Var = new x46("INSTANCE", 0);
        E = x46Var;
        F = new x46[]{x46Var};
    }

    public static x46 valueOf(String str) {
        return (x46) Enum.valueOf(x46.class, str);
    }

    public static x46[] values() {
        return (x46[]) F.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
