package io.sentry.android.replay.capture;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((io.sentry.rrweb.b) obj).F).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).F));
    }
}
