package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a56 implements Executor {
    public static final a56 E;
    public static final /* synthetic */ a56[] F;

    static {
        a56 a56Var = new a56("INSTANCE", 0);
        E = a56Var;
        F = new a56[]{a56Var};
    }

    public static a56 valueOf(String str) {
        return (a56) Enum.valueOf(a56.class, str);
    }

    public static a56[] values() {
        return (a56[]) F.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
