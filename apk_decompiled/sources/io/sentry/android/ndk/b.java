package io.sentry.android.ndk;

import io.sentry.ndk.NativeScope;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;
    public final /* synthetic */ String G;

    public /* synthetic */ b(c cVar, String str, int i) {
        this.E = i;
        this.F = cVar;
        this.G = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        String str = this.G;
        c cVar = this.F;
        switch (i) {
            case 0:
                cVar.b.getClass();
                NativeScope.nativeRemoveTag(str);
                break;
            default:
                cVar.b.getClass();
                NativeScope.nativeRemoveExtra(str);
                break;
        }
    }
}
