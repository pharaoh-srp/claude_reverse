package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import defpackage.nz8;
import defpackage.vde;

/* JADX INFO: loaded from: classes2.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final nz8 G;

    public UnrecognizedInputFormatException(String str, vde vdeVar) {
        super(str, null, false, 1);
        this.G = nz8.q(vdeVar);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        nz8 nz8Var = this.G;
        if (nz8Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + nz8Var;
    }
}
