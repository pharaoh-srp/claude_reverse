package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qjk implements Executor {
    public static final qjk E;
    public static final /* synthetic */ qjk[] F;

    static {
        qjk qjkVar = new qjk("INSTANCE", 0);
        E = qjkVar;
        F = new qjk[]{qjkVar};
    }

    public static qjk[] values() {
        return (qjk[]) F.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((uoj) poj.I().E).post(runnable);
    }
}
