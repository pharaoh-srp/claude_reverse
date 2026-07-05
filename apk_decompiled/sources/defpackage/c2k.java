package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c2k implements Executor {
    public static final c2k E;
    public static final /* synthetic */ c2k[] F;

    static {
        c2k c2kVar = new c2k("INSTANCE", 0);
        E = c2kVar;
        F = new c2k[]{c2kVar};
    }

    public static c2k[] values() {
        return (c2k[]) F.clone();
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
