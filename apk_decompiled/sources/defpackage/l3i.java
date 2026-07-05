package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l3i {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (Build.VERSION.SDK_INT < 29 || !a.get()) {
            return;
        }
        le0.b();
    }
}
