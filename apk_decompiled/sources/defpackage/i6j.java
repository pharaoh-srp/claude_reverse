package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class i6j implements j6j {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final yd7 a;
    public final y3i b;
    public final tsc c;
    public final int d;
    public final byte[] e;
    public final ssc f;
    public final int g;
    public final jw7 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public i6j(yd7 yd7Var, y3i y3iVar, tsc tscVar) throws ParserException {
        this.a = yd7Var;
        this.b = y3iVar;
        this.c = tscVar;
        int i = tscVar.b;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        ssc sscVar = new ssc(tscVar.e);
        sscVar.s();
        int iS = sscVar.s();
        this.d = iS;
        int i2 = tscVar.a;
        int i3 = tscVar.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (tscVar.d * i2)) + 1;
        if (iS != i4) {
            throw ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + iS);
        }
        int iE = tpi.e(iMax, iS);
        this.e = new byte[iE * i3];
        this.f = new ssc(iS * 2 * i2 * iE);
        int i5 = ((i3 * i) * 8) / iS;
        iw7 iw7Var = new iw7();
        iw7Var.n = gkb.k("audio/raw");
        iw7Var.h = i5;
        iw7Var.i = i5;
        iw7Var.o = iMax * 2 * i2;
        iw7Var.F = i2;
        iw7Var.G = i;
        iw7Var.H = 2;
        this.h = new jw7(iw7Var);
    }

    @Override // defpackage.j6j
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.j6j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.xd7 r25, long r26) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6j.b(xd7, long):boolean");
    }

    @Override // defpackage.j6j
    public final void c(int i, long j) {
        m6j m6jVar = new m6j(this.c, this.d, i, j);
        this.a.q(m6jVar);
        jw7 jw7Var = this.h;
        y3i y3iVar = this.b;
        y3iVar.g(jw7Var);
        y3iVar.d(m6jVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        tsc tscVar = this.c;
        long j3 = tscVar.b;
        String str = tpi.a;
        long jI = j + tpi.I(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * tscVar.a;
        this.b.a(jI, 1, i2, this.k - i2, null);
        this.l += (long) i;
        this.k -= i2;
    }
}
