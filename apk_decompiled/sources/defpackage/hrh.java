package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hrh {
    public static final Logger a = Logger.getLogger(hrh.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static boolean a() {
        return b.get();
    }
}
