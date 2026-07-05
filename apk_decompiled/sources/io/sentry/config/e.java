package io.sentry.config;

import defpackage.ij0;
import io.sentry.p;
import io.sentry.util.o;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        p.v("properties are required", properties);
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final Map c() {
        String strM = ij0.m(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strM)) {
                    map.put(str.substring(strM.length()), o.c((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return o.c(this.b.getProperty(this.a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
