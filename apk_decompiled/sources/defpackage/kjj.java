package defpackage;

import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kjj {
    public static final q09 a = new q09(null, null);
    public static final u0h b = new u0h(new p3j(27));

    public static final void a(String str, Object obj) {
        if (obj == null) {
            throw new DateTimeFormatException(ij0.l("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}
