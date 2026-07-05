package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class dy7 implements wd7 {
    public static final byte[] M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final jw7 N;
    public cy7 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public yd7 G;
    public y3i[] H;
    public y3i[] I;
    public boolean J;
    public boolean K;
    public long L;
    public final bxg a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final ssc e;
    public final ssc f;
    public final ssc g;
    public final byte[] h;
    public final ssc i;
    public final epk j;
    public final ssc k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final ig0 n;
    public final vf3 o;
    public vde p;
    public int q;
    public int r;
    public long s;
    public int t;
    public ssc u;
    public long v;
    public int w;
    public long x;
    public long y;
    public long z;

    static {
        iw7 iw7Var = new iw7();
        iw7Var.n = gkb.k("application/x-emsg");
        N = new jw7(iw7Var);
    }

    public dy7(bxg bxgVar, int i) {
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        this.a = bxgVar;
        this.b = i;
        this.c = Collections.unmodifiableList(vdeVar);
        this.j = new epk(17);
        this.k = new ssc(16);
        this.e = new ssc(stj.b);
        this.f = new ssc(6);
        this.g = new ssc();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new ssc(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.p = vdeVar;
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.G = yd7.j;
        this.H = new y3i[0];
        this.I = new y3i[0];
        this.n = new ig0(new do0(26, this));
        this.o = new vf3(0);
        this.L = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rg6 h(java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy7.h(java.util.List):rg6");
    }

    public static void i(ssc sscVar, int i, u3i u3iVar) throws ParserException {
        sscVar.M(i + 8);
        int iM = sscVar.m();
        byte[] bArr = lw1.a;
        if ((iM & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iD = sscVar.D();
        if (iD == 0) {
            Arrays.fill(u3iVar.l, 0, u3iVar.e, false);
            return;
        }
        int i2 = u3iVar.e;
        ssc sscVar2 = u3iVar.n;
        if (iD != i2) {
            StringBuilder sbU = vb7.u("Senc sample count ", iD, " is different from fragment sample count");
            sbU.append(u3iVar.e);
            throw ParserException.a(null, sbU.toString());
        }
        Arrays.fill(u3iVar.l, 0, iD, z);
        sscVar2.J(sscVar.a());
        u3iVar.k = true;
        u3iVar.o = true;
        sscVar.k(sscVar2.a, 0, sscVar2.c);
        sscVar2.M(0);
        u3iVar.o = false;
    }

    public static Pair j(long j, ssc sscVar) throws ParserException {
        long jF;
        long jF2;
        ssc sscVar2 = sscVar;
        sscVar2.M(8);
        int iE = lw1.e(sscVar2.m());
        sscVar2.N(4);
        long jB = sscVar2.B();
        if (iE == 0) {
            jF = sscVar2.B();
            jF2 = sscVar2.B();
        } else {
            jF = sscVar2.F();
            jF2 = sscVar2.F();
        }
        long j2 = jF2 + j;
        String str = tpi.a;
        long jI = tpi.I(jF, 1000000L, jB, RoundingMode.DOWN);
        sscVar2.N(2);
        int iG = sscVar2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j3 = j2;
        long j4 = jI;
        int i = 0;
        while (i < iG) {
            int iM = sscVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jB2 = sscVar2.B();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jI2 = tpi.I(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i] = jI2 - jArr5[i];
            sscVar2.N(4);
            j3 += (long) iArr[i];
            i++;
            iG = iG;
            sscVar2 = sscVar;
            j4 = jI2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jI), new uf3(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e0, code lost:
    
        if (r31.E != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e2, code lost:
    
        r2 = defpackage.stj.v(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:
    
        if ((r4 + r2) > (r31.B - r31.C)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f8, code lost:
    
        r1.readFully(r8, r12, r4 + r2);
        r6.M(0);
        r20 = r6.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0205, code lost:
    
        if (r20 < 0) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0207, code lost:
    
        r31.D = r20 - r2;
        r13 = r31.e;
        r20 = r4;
        r13.M(0);
        r9.e(4, r13);
        r31.C += 4;
        r31.B += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0224, code lost:
    
        if (r31.I.length <= 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0226, code lost:
    
        if (r2 <= 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0228, code lost:
    
        r4 = defpackage.stj.r(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022c, code lost:
    
        if (r4 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0233, code lost:
    
        switch(r4.hashCode()) {
            case -1662541442: goto L125;
            case 1331836730: goto L121;
            case 1331856911: goto L117;
            default: goto L116;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0236, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023e, code lost:
    
        if (r4.equals("video/vvc") != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0241, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0248, code lost:
    
        if (r4.equals("video/avc") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x024b, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0251, code lost:
    
        if (r4.equals("video/hevc") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0254, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0255, code lost:
    
        switch(r4) {
            case 0: goto L137;
            case 1: goto L134;
            case 2: goto L131;
            default: goto L140;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0264, code lost:
    
        if (((r8[5] & 248) >> 3) != 23) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026e, code lost:
    
        if ((r8[4] & 31) != 6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027e, code lost:
    
        if (((r8[4] & 126) >> 1) != 39) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0280, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0282, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0283, code lost:
    
        r31.F = r4;
        r9.e(r2, r6);
        r31.C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028d, code lost:
    
        if (r2 <= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0291, code lost:
    
        if (r31.E != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0297, code lost:
    
        if (defpackage.stj.t(r8, r2, r5) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0299, code lost:
    
        r31.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029c, code lost:
    
        r2 = r17;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a9, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02aa, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ae, code lost:
    
        if (r31.F == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b0, code lost:
    
        r4 = r31.g;
        r4.J(r2);
        r24 = r6;
        r1.readFully(r4.a, 0, r31.D);
        r9.e(r31.D, r4);
        r2 = r31.D;
        r2 = defpackage.stj.G(r4.a, r4.c);
        r4.M(0);
        r4.L(r2);
        r2 = r5.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d9, code lost:
    
        if (r2 != (-1)) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02dd, code lost:
    
        if (r7.E == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02df, code lost:
    
        r7.r(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e5, code lost:
    
        if (r7.E == r2) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e7, code lost:
    
        r7.r(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ea, code lost:
    
        r7.d(r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f6, code lost:
    
        if ((r17.a() & 4) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f8, code lost:
    
        r7.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02fb, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02fe, code lost:
    
        r24 = r6;
        r2 = r9.c(r1, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0307, code lost:
    
        r31.C += r2;
        r31.D -= r2;
        r2 = r17;
        r4 = r20;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0319, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x031b, code lost:
    
        r2 = r31.C;
        r4 = r31.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x031f, code lost:
    
        if (r2 >= r4) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0321, code lost:
    
        r31.C += r9.c(r1, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x032d, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0333, code lost:
    
        if (r31.E != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0335, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0338, code lost:
    
        r12 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x033d, code lost:
    
        if (r1 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x033f, code lost:
    
        r10 = r14;
        r15 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0344, code lost:
    
        r10 = r14;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0346, code lost:
    
        r9.a(r10, r12, r31.B, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0350, code lost:
    
        if (r3.isEmpty() != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0352, code lost:
    
        r1 = (defpackage.by7) r3.removeFirst();
        r31.w -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0363, code lost:
    
        if (r1.b == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0365, code lost:
    
        r4 = r4 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0366, code lost:
    
        r25 = r4;
        r2 = r31.H;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x036c, code lost:
    
        if (r5 >= r4) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x036e, code lost:
    
        r2[r5].a(r25, 1, r1.c, r31.w, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0386, code lost:
    
        if (r17.c() != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0388, code lost:
    
        r31.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x038b, code lost:
    
        r31.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x038e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0655, code lost:
    
        throw androidx.media3.common.ParserException.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        r9 = r2.a;
        r5 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (r31.q != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (r2.m != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        r6 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        r6 = r5.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        r31.B = r6;
        r6 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (java.util.Objects.equals(r6.o, "video/avc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if ((r4 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        if (java.util.Objects.equals(r6.o, "video/hevc") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if ((r4 & com.pvporbit.freetype.FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        r31.E = r4 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        if (r2.f >= r2.i) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        r1.l(r31.B);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        r3 = r5.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012b, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        r3.N(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0134, code lost:
    
        if (r5.k == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        if (r5.l[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        r3.N(r3.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
    
        if (r2.c() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        r31.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014d, code lost:
    
        r31.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        if (r2.d.a.h != r22) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015b, code lost:
    
        r31.B -= 8;
        r1.l(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        r4 = "audio/ac4".equals(r2.d.a.g.o);
        r6 = r31.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0176, code lost:
    
        if (r4 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        r31.C = r2.d(r6, 7);
        defpackage.wb5.j(r31.B, r8);
        r9.e(7, r8);
        r31.C += 7;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        r4 = r21;
        r31.C = r2.d(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        r31.B += r31.C;
        r31.q = 4;
        r31.D = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r4 = r2.d;
        r6 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a8, code lost:
    
        if (r2.m != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01aa, code lost:
    
        r14 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b1, code lost:
    
        r14 = r5.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b7, code lost:
    
        r4 = r6.k;
        r5 = r6.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:
    
        if (r4 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bd, code lost:
    
        r6 = r31.f;
        r8 = r6.a;
        r8[0] = 0;
        r8[1] = 0;
        r8[r19] = 0;
        r12 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cd, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r31.C >= r31.B) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r2 = r31.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d7, code lost:
    
        if (r2 != 0) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dc, code lost:
    
        if (r31.I.length > 0) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r32, defpackage.xm7 r33) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy7.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        vde vdeVarU;
        qdg qdgVarM = gwj.m(xd7Var, true, false);
        if (qdgVarM != null) {
            vdeVarU = nz8.u(qdgVarM);
        } else {
            iz8 iz8Var = nz8.F;
            vdeVarU = vde.I;
        }
        this.p = vdeVarU;
        return qdgVarM == null;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((cy7) sparseArray.valueAt(i)).e();
        }
        this.m.clear();
        this.w = 0;
        ((PriorityQueue) this.n.I).clear();
        this.x = j2;
        this.l.clear();
        g();
    }

    @Override // defpackage.wd7
    public final List e() {
        return this.p;
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            yd7Var = new s31(yd7Var, this.a);
        }
        this.G = yd7Var;
        g();
        y3i[] y3iVarArr = new y3i[2];
        this.H = y3iVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            y3iVarArr[0] = this.G.n(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        y3i[] y3iVarArr2 = (y3i[]) tpi.E(i, this.H);
        this.H = y3iVarArr2;
        for (y3i y3iVar : y3iVarArr2) {
            y3iVar.g(N);
        }
        List list = this.c;
        this.I = new y3i[list.size()];
        while (i4 < this.I.length) {
            y3i y3iVarN = this.G.n(i3, 3);
            y3iVarN.g((jw7) list.get(i4));
            this.I[i4] = y3iVarN;
            i4++;
            i3++;
        }
    }

    public final void g() {
        this.q = 0;
        this.t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x0804, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0807, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:272:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x071a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r56) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy7.k(long):void");
    }
}
