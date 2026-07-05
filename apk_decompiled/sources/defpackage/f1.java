package defpackage;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 {
    public abstract z52 a();

    public abstract l25 b();

    public final Object c(String str) {
        String str2;
        try {
            auc aucVar = a().c;
            aucVar.getClass();
            try {
                return d(xsc.p(aucVar, str, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new DateTimeFormatException(str2, e);
            }
        } catch (ParseException e2) {
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) str) + '\'', e2);
        }
    }

    public abstract Object d(l25 l25Var);
}
