package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ark {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
