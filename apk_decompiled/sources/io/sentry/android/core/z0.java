package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static String a;
    public static final Charset b = Charset.forName("UTF-8");
    public static final io.sentry.util.a c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.v vVarA = c.a();
        try {
            if (a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strI = io.sentry.p.i();
                            fileOutputStream.write(strI.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            a = strI;
                            vVarA.close();
                            return strI;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        a = str;
                    } finally {
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            String str2 = a;
            vVarA.close();
            return str2;
        } catch (Throwable th2) {
            try {
                vVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
