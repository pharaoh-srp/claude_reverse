package io.sentry.android.core.anr;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int E;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return Float.compare((((a) obj).b + 1.0f) * r3.f * r3.a, (((a) obj2).b + 1.0f) * r4.f * r4.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
