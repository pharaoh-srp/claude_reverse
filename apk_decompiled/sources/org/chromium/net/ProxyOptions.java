package org.chromium.net;

import defpackage.sz6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ProxyOptions {
    private final List<Proxy> mProxyList;

    public @interface Experimental {
    }

    public ProxyOptions(List<Proxy> list) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            sz6.p("ProxyList cannot be empty");
            throw null;
        }
        this.mProxyList = new ArrayList(list);
    }

    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
