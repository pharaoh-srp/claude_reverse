package io.sentry.okhttp;

import defpackage.bz7;
import defpackage.ts9;
import java.net.InetAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ts9 implements bz7 {
    public static final c G;
    public static final c H;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new c(i, 0);
        H = new c(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.F) {
            case 0:
                InetAddress inetAddress = (InetAddress) obj;
                inetAddress.getClass();
                String string = inetAddress.toString();
                string.getClass();
                return string;
            default:
                Proxy proxy = (Proxy) obj;
                proxy.getClass();
                String string2 = proxy.toString();
                string2.getClass();
                return string2;
        }
    }
}
