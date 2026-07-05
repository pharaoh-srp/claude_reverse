package defpackage;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class snk implements kok {
    public static final bp0 L = new bp0(0);
    public static final String[] M = {"key", ExperienceToggle.DEFAULT_PARAM_KEY};
    public final ContentResolver E;
    public final Uri F;
    public final Runnable G;
    public final tq5 H;
    public final Object I;
    public volatile Map J;
    public final ArrayList K;

    public snk(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        tq5 tq5Var = new tq5(this);
        this.H = tq5Var;
        this.I = new Object();
        this.K = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.E = contentResolver;
        this.F = uri;
        this.G = runnable;
        contentResolver.registerContentObserver(uri, false, tq5Var);
    }

    public static snk c(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        snk snkVar;
        synchronized (snk.class) {
            bp0 bp0Var = L;
            snkVar = (snk) bp0Var.get(uri);
            if (snkVar == null) {
                try {
                    snk snkVar2 = new snk(contentResolver, uri, runnable);
                    try {
                        bp0Var.put(uri, snkVar2);
                    } catch (SecurityException unused) {
                    }
                    snkVar = snkVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return snkVar;
    }

    public static synchronized void d() {
        try {
            for (snk snkVar : (zo0) L.values()) {
                snkVar.E.unregisterContentObserver(snkVar.H);
            }
            L.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map a() {
        Map map;
        Map map2 = this.J;
        ?? r0 = map2;
        if (map2 == null) {
            synchronized (this.I) {
                try {
                    Map map3 = this.J;
                    ?? r02 = map3;
                    if (map3 == null) {
                        ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                map = (Map) xrk.h(new fnf(26, this));
                            } finally {
                                StrictMode.setThreadPolicy(AllowThreadDiskReads);
                            }
                        } catch (SQLiteException | IllegalStateException | SecurityException e) {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        this.J = map;
                        AllowThreadDiskReads = map;
                        r02 = AllowThreadDiskReads;
                    }
                } finally {
                }
            }
        }
        return r0 != 0 ? r0 : Collections.EMPTY_MAP;
    }

    @Override // defpackage.kok
    public final /* synthetic */ Object b(String str) {
        return (String) a().get(str);
    }
}
