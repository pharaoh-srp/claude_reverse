package io.sentry.android.replay;

import defpackage.ebh;
import defpackage.vb7;
import defpackage.x44;
import io.sentry.x6;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public final y a;
    public final l b;
    public final Date c;
    public final int d;
    public final long e;
    public final x6 f;
    public final String g;
    public final List h;

    public f(y yVar, l lVar, Date date, int i, long j, x6 x6Var, String str, List list) {
        this.a = yVar;
        this.b = lVar;
        this.c = date;
        this.d = i;
        this.e = j;
        this.f = x6Var;
        this.g = str;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.a) && this.b == fVar.b && this.c.equals(fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && x44.r(this.g, fVar.g) && this.h.equals(fVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + vb7.e(vb7.c(this.d, ebh.j(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.a + ", cache=" + this.b + ", timestamp=" + this.c + ", id=" + this.d + ", duration=" + this.e + ", replayType=" + this.f + ", screenAtStart=" + this.g + ", events=" + this.h + ')';
    }
}
