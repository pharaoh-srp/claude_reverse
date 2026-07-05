package androidx.media3.common;

import defpackage.vb7;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ParserException extends IOException {
    public final boolean E;
    public final int F;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.E = z;
        this.F = i;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.E);
        sb.append(", dataType=");
        return vb7.l(this.F, "}", sb);
    }
}
