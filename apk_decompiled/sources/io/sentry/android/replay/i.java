package io.sentry.android.replay;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Comparator {
    public final /* synthetic */ int E;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return Long.valueOf(((m) obj).b).compareTo(Long.valueOf(((m) obj2).b));
            default:
                return Long.valueOf(((io.sentry.rrweb.b) obj).F).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).F));
        }
    }
}
