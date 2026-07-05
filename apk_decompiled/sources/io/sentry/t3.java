package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class t3 implements Runnable {
    public static final Charset F = Charset.forName("UTF-8");
    public final w6 E;

    public t3(w6 w6Var) {
        this.E = w6Var;
    }

    public final Date a(File file) {
        w6 w6Var = this.E;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), F));
            try {
                String line = bufferedReader.readLine();
                w6Var.getLogger().h(t5.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM = p.m(line);
                bufferedReader.close();
                return dateM;
            } finally {
            }
        } catch (IOException e) {
            w6Var.getLogger().d(t5.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            w6Var.getLogger().b(t5.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w6 w6Var = this.E;
        String cacheDirPath = w6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            w6Var.getLogger().h(t5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = w6Var.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).k()) {
            w6Var.getLogger().h(t5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        int i = io.sentry.cache.c.N;
        File file = new File(cacheDirPath, "previous_session.json");
        n1 serializer = w6Var.getSerializer();
        if (file.exists()) {
            w6Var.getLogger().h(t5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), F));
                try {
                    h7 h7Var = (h7) serializer.c(bufferedReader, h7.class);
                    if (h7Var == null) {
                        w6Var.getLogger().h(t5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(w6Var.getCacheDirPath(), ".sentry-native/last_crash");
                        g7 g7Var = h7Var.K;
                        g7 g7Var2 = g7.Crashed;
                        if (g7Var == g7Var2) {
                            z4 z4Var = z4.d;
                            v vVarA = z4Var.c.a();
                            try {
                                z4Var.a = false;
                                z4Var.b = null;
                                vVarA.close();
                                z4Var.a(true);
                            } finally {
                            }
                        } else if (file2.exists()) {
                            w6Var.getLogger().h(t5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file2);
                            h7Var.d(g7Var2, null, true, null);
                            h7Var.b(dateA);
                        } else if (h7Var.R == null) {
                            h7Var.b(p.k());
                        }
                        if (file2.exists() && !file2.delete()) {
                            w6Var.getLogger().h(t5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        t4.g().k(io.sentry.internal.debugmeta.c.a(serializer, h7Var, w6Var.getSdkVersion()), new n0());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                w6Var.getLogger().d(t5.ERROR, "Error processing previous session.", th);
            }
            if (file.delete()) {
                return;
            }
            w6Var.getLogger().h(t5.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
