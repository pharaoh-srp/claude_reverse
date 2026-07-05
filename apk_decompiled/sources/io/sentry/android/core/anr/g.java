package io.sentry.android.core.anr;

import io.sentry.util.o;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparable {
    public final StackTraceElement[] E;
    public final long F;

    public g(long j, StackTraceElement[] stackTraceElementArr) {
        this.F = j;
        this.E = stackTraceElementArr;
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.F);
        StackTraceElement[] stackTraceElementArr = this.E;
        dataOutputStream.writeInt(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            Charset charset = o.a;
            String str = "";
            if (className == null) {
                className = "";
            }
            dataOutputStream.writeUTF(className);
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = "";
            }
            dataOutputStream.writeUTF(methodName);
            String fileName = stackTraceElement.getFileName();
            dataOutputStream.writeBoolean(fileName == null);
            if (fileName != null) {
                str = fileName;
            }
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.F, ((g) obj).F);
    }
}
