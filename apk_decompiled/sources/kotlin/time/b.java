package kotlin.time;

import defpackage.c69;
import defpackage.d4c;
import defpackage.f69;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f69 {
    public final long a;
    public final int b;

    public b(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.f69
    public final c69 toInstant() {
        long j = c69.G.E;
        long j2 = this.a;
        if (j2 >= j && j2 <= c69.H.E) {
            return d4c.P(this.b, j2);
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
