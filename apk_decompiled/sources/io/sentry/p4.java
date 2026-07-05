package io.sentry;

import defpackage.lf5;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4 {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ b0 c;
    public final /* synthetic */ File d;

    public /* synthetic */ p4(a1 a1Var, String str, b0 b0Var, File file) {
        this.a = a1Var;
        this.b = str;
        this.c = b0Var;
        this.d = file;
    }

    public final void a() {
        File file = this.d;
        t5 t5Var = t5.DEBUG;
        String str = this.b;
        a1 a1Var = this.a;
        a1Var.h(t5Var, "Started processing cached files from %s", str);
        final b0 b0Var = this.c;
        o7 o7Var = b0Var.d;
        a1 a1Var2 = b0Var.b;
        try {
            a1Var2.h(t5Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.z
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return b0Var.a(str2);
                }
            });
            if (fileArrListFiles != null) {
                a1Var2.h(t5Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!o7Var.contains(absolutePath)) {
                            lf5 lf5VarG = b0Var.a.g();
                            if (lf5VarG != null && lf5VarG.d(o.All)) {
                                a1Var2.h(t5.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                break;
                            } else {
                                a1Var2.h(t5.DEBUG, "Processing file: %s", absolutePath);
                                b0Var.b(file2, io.sentry.util.c.a(new a0(b0Var.c, b0Var.b, absolutePath, o7Var)));
                                Thread.sleep(100L);
                            }
                        } else {
                            a1Var2.h(t5.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        a1Var2.h(t5.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                    i++;
                }
            } else {
                a1Var2.h(t5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            }
        } catch (Throwable th) {
            a1Var2.b(t5.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        a1Var.h(t5.DEBUG, "Finished processing cached files from %s", str);
    }
}
