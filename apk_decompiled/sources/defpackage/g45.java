package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g45 {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new d20()).iterator();
            it.getClass();
            a = bnf.e0(new kl4(new pp0(2, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
