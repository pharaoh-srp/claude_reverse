package io.sentry.internal.modules;

import io.sentry.a1;
import io.sentry.t5;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {
    public final /* synthetic */ int e = 0;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a1 a1Var) {
        super(a1Var);
        ClassLoader classLoader = f.class.getClassLoader();
        this.f = io.sentry.config.a.e(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                a1 a1Var = this.a;
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            a1Var.h(t5.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap treeMapC = c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = treeMapC;
                        }
                    } finally {
                        if (resourceAsStream != null) {
                            try {
                                break;
                            } catch (Throwable th) {
                            }
                        }
                    }
                    break;
                } catch (IOException e) {
                    a1Var.d(t5.INFO, "Access to resources failed.", e);
                } catch (SecurityException e2) {
                    a1Var.d(t5.INFO, "Access to resources denied.", e2);
                }
                return treeMap;
            default:
                TreeMap treeMap2 = new TreeMap();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Map mapA = ((a) it.next()).a();
                    if (mapA != null) {
                        treeMap2.putAll(mapA);
                    }
                }
                return treeMap2;
        }
    }

    public f(List list, a1 a1Var) {
        super(a1Var);
        this.f = list;
    }
}
