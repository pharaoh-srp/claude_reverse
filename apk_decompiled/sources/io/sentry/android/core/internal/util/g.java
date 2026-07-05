package io.sentry.android.core.internal.util;

import io.sentry.v;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g c = new g();
    public final io.sentry.util.a a = new io.sentry.util.a();
    public final ArrayList b = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = this.b;
        v vVarA = this.a.a();
        try {
            if (!arrayList.isEmpty()) {
                vVarA.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                vVarA.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strU = io.sentry.p.u(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strU != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strU.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            vVarA.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
