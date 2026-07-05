package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i9c extends ProxySelector {
    public static final i9c a = new i9c();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return x44.W(Proxy.NO_PROXY);
        }
        sz6.p("uri must not be null");
        return null;
    }
}
