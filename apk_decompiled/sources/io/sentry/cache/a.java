package io.sentry.cache;

import io.sentry.t5;
import io.sentry.w6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Charset a = Charset.forName("UTF-8");

    public static void a(w6 w6Var, String str, String str2) {
        File fileB = b(w6Var, str);
        if (fileB == null) {
            w6Var.getLogger().h(t5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        w6Var.getLogger().h(t5.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        w6Var.getLogger().h(t5.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(w6 w6Var, String str) {
        String cacheDirPath = w6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(w6 w6Var, String str, String str2, Class cls) {
        File fileB = b(w6Var, str);
        if (fileB == null) {
            w6Var.getLogger().h(t5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (!file.exists()) {
            w6Var.getLogger().h(t5.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), a));
            try {
                Object objC = w6Var.getSerializer().c(bufferedReader, cls);
                bufferedReader.close();
                return objC;
            } finally {
            }
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static void d(w6 w6Var, Object obj, String str, String str2) {
        File fileB = b(w6Var, str);
        if (fileB == null) {
            w6Var.getLogger().h(t5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, a));
                try {
                    w6Var.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Error persisting entity: %s", str2);
        }
    }
}
