package io.sentry.android.replay;

import defpackage.vb7;
import defpackage.x44;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public final File a;
    public final long b;
    public final String c;

    public m(File file, long j, String str) {
        this.a = file;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.b == mVar.b && x44.r(this.c, mVar.c);
    }

    public final int hashCode() {
        int iE = vb7.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", screen=");
        return vb7.s(sb, this.c, ')');
    }
}
