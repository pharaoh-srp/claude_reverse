package io.sentry.android.core.internal.modules;

import android.content.Context;
import defpackage.y0;
import io.sentry.a1;
import io.sentry.internal.modules.d;
import io.sentry.t5;
import io.sentry.w6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    public final Context e;

    public a(Context context, w6 w6Var) {
        super(w6Var.getLogger());
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext != null ? applicationContext : context;
        try {
            w6Var.getExecutorService().submit(new y0(16, this));
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "AssetsModulesLoader submit failed", th);
        }
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        a1 a1Var = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.e.getAssets().open("sentry-external-modules.txt");
            try {
                TreeMap treeMapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return treeMapC;
                }
                inputStreamOpen.close();
                return treeMapC;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            a1Var.h(t5.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e) {
            a1Var.d(t5.ERROR, "Error extracting modules.", e);
            return treeMap;
        }
    }
}
