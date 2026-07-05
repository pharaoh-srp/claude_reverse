package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ukj {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? bsg.u0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
