package defpackage;

import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class cvd implements evd {
    public cvd(re8 re8Var, dvd dvdVar) {
        URI uri = dvdVar.d;
        if (uri.getPath() != null) {
            String path = uri.getPath();
            path.getClass();
            if (bsg.z0(path, '/')) {
                return;
            }
        }
        String path2 = uri.getPath();
        new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), (path2 == null ? "" : path2).concat("/"), uri.getQuery(), uri.getFragment());
    }
}
