package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dnk {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static synchronized Map a() {
        HashMap map;
        try {
            map = a;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) map.get("app_update");
    }
}
