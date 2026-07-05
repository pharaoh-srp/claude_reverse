package io.sentry.android.replay;

import defpackage.mr9;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public volatile s a;

    public final boolean a(s sVar) {
        sVar.getClass();
        switch (q.a[this.a.ordinal()]) {
            case 1:
                return sVar == s.STARTED || sVar == s.CLOSED;
            case 2:
                return sVar == s.PAUSED || sVar == s.STOPPED || sVar == s.CLOSED;
            case 3:
                return sVar == s.PAUSED || sVar == s.STOPPED || sVar == s.CLOSED;
            case 4:
                return sVar == s.RESUMED || sVar == s.STOPPED || sVar == s.CLOSED;
            case 5:
                return sVar == s.STARTED || sVar == s.CLOSED;
            default:
                mr9.b();
            case 6:
                return false;
        }
    }
}
