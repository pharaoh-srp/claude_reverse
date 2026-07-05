package io.sentry.hints;

import defpackage.ij0;
import io.sentry.a1;
import io.sentry.t5;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements io.sentry.cache.tape.f, i {
    public static final Field a(a1 a1Var, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("tag");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            a1Var.h(t5.WARNING, ij0.j("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    @Override // io.sentry.cache.tape.f
    public Object b(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.readShort() == 1) {
                long j = dataInputStream.readLong();
                int i = dataInputStream.readInt();
                if (i >= 0 && i <= 1000) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf = dataInputStream.readUTF();
                        String utf2 = dataInputStream.readUTF();
                        boolean z = dataInputStream.readBoolean();
                        String utf3 = dataInputStream.readUTF();
                        if (z) {
                            utf3 = null;
                        }
                        stackTraceElementArr[i2] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                    }
                    return new io.sentry.android.core.anr.g(j, stackTraceElementArr);
                }
            }
        } catch (EOFException unused) {
        }
        return null;
    }

    @Override // io.sentry.cache.tape.f
    public void d(OutputStream outputStream, Object obj) throws IOException {
        io.sentry.android.core.anr.g gVar = (io.sentry.android.core.anr.g) obj;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            gVar.a(dataOutputStream);
            dataOutputStream.flush();
            outputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
