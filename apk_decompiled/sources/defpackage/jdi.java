package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jdi implements Executor {
    public static final jdi E;
    public static final Handler F;
    public static final /* synthetic */ jdi[] G;

    static {
        jdi jdiVar = new jdi("INSTANCE", 0);
        E = jdiVar;
        G = new jdi[]{jdiVar};
        F = new Handler(Looper.getMainLooper());
    }

    public static jdi valueOf(String str) {
        return (jdi) Enum.valueOf(jdi.class, str);
    }

    public static jdi[] values() {
        return (jdi[]) G.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        F.post(runnable);
    }
}
