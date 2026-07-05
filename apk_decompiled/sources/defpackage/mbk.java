package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mbk implements Executor {
    public static final mbk E;
    public static final /* synthetic */ mbk[] F;

    static {
        mbk mbkVar = new mbk("INSTANCE", 0);
        E = mbkVar;
        F = new mbk[]{mbkVar};
    }

    public static mbk[] values() {
        return (mbk[]) F.clone();
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
