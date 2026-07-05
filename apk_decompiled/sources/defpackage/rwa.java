package defpackage;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class rwa implements wd7 {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final br5 a;
    public int a0;
    public final kri b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final bxg f;
    public boolean f0;
    public final ssc g;
    public int g0;
    public final ssc h;
    public byte h0;
    public final ssc i;
    public boolean i0;
    public final ssc j;
    public yd7 j0;
    public final ssc k;
    public final ssc l;
    public final ssc m;
    public final ssc n;
    public final ssc o;
    public final ssc p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public qwa y;
    public boolean z;

    static {
        String str = tpi.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        qy1.l(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        qy1.l(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(map);
    }

    public rwa(bxg bxgVar, int i) {
        br5 br5Var = new br5();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = br5Var;
        br5Var.d = new ro6(11, this);
        this.f = bxgVar;
        this.C = new SparseArray();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new kri();
        this.c = new SparseArray();
        this.i = new ssc(4);
        this.j = new ssc(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new ssc(4);
        this.g = new ssc(stj.b);
        this.h = new ssc(4);
        this.l = new ssc();
        this.m = new ssc();
        this.n = new ssc(8);
        this.o = new ssc();
        this.p = new ssc();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] j(long j, long j2, String str) {
        fd9.E(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = tpi.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0d2d, code lost:
    
        r5 = true;
        r1 = r1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0f56, code lost:
    
        if (r5 == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0f58, code lost:
    
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0f60, code lost:
    
        if (r0.J == false) goto L874;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0f62, code lost:
    
        r0.L = r2;
        r45.a = r0.K;
        r0.J = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0f6e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0f6f, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0f75, code lost:
    
        if (r0.z == false) goto L930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0f77, code lost:
    
        r6 = r0.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0f7b, code lost:
    
        if (r6 == (-1)) goto L931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0f7d, code lost:
    
        r45.a = r6;
        r0.L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x0f83, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x0f84, code lost:
    
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x0f8a, code lost:
    
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x0f8a, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0c66  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /* JADX WARN: Type inference failed for: r0v4, types: [ro6] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v16, types: [xd7] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [xd7] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [int] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [br5] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kri] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r44, defpackage.xm7 r45) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 4882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwa.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        at atVar = new at(11);
        ssc sscVar = (ssc) atVar.G;
        fr5 fr5Var = (fr5) xd7Var;
        long j = fr5Var.G;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        fr5Var.d(sscVar.a, 0, 4, false);
        long jB = sscVar.B();
        atVar.F = 4;
        while (true) {
            if (jB != 440786851) {
                int i2 = atVar.F + 1;
                atVar.F = i2;
                if (i2 == i) {
                    break;
                }
                fr5Var.d(sscVar.a, 0, 1, false);
                jB = ((jB << 8) & (-256)) | ((long) (sscVar.a[0] & 255));
            } else {
                long jO = atVar.o(fr5Var);
                long j3 = atVar.F;
                if (jO != Long.MIN_VALUE && (j == -1 || j3 + jO < j)) {
                    while (true) {
                        long j4 = atVar.F;
                        long j5 = j3 + jO;
                        if (j4 < j5) {
                            if (atVar.o(fr5Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jO2 = atVar.o(fr5Var);
                            if (jO2 < 0 || jO2 > 2147483647L) {
                                break;
                            }
                            if (jO2 != 0) {
                                int i3 = (int) jO2;
                                fr5Var.j(i3, false);
                                atVar.F += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.M = -9223372036854775807L;
        this.O = 0;
        br5 br5Var = this.a;
        br5Var.e = 0;
        br5Var.b.clear();
        kri kriVar = br5Var.c;
        kriVar.b = 0;
        kriVar.c = 0;
        kri kriVar2 = this.b;
        kriVar2.b = 0;
        kriVar2.c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            t7i t7iVar = ((qwa) sparseArray.valueAt(i)).V;
            if (t7iVar != null) {
                t7iVar.b = false;
                t7iVar.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        if (this.e) {
            yd7Var = new s31(yd7Var, this.f);
        }
        this.j0 = yd7Var;
    }

    public final void g(int i) {
        if (this.D) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a Cues");
    }

    public final void h(int i) {
        if (this.y != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.qwa r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwa.i(qwa, long, int, int, int):void");
    }

    public final void k() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                yd7 yd7Var = this.j0;
                yd7Var.getClass();
                yd7Var.j();
                this.x = false;
                return;
            }
            if (((qwa) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void l(xd7 xd7Var, int i) {
        ssc sscVar = this.i;
        if (sscVar.c >= i) {
            return;
        }
        byte[] bArr = sscVar.a;
        if (bArr.length < i) {
            sscVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = sscVar.a;
        int i2 = sscVar.c;
        xd7Var.readFully(bArr2, i2, i - i2);
        sscVar.L(i);
    }

    public final void m() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.J(0);
    }

    public final long n(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = tpi.a;
        return tpi.I(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(defpackage.xd7 r18, defpackage.qwa r19, int r20, boolean r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwa.o(xd7, qwa, int, boolean):int");
    }

    public final void p(xd7 xd7Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        ssc sscVar = this.m;
        byte[] bArr2 = sscVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            sscVar.getClass();
            sscVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        xd7Var.readFully(sscVar.a, bArr.length, i);
        sscVar.M(0);
        sscVar.L(length);
    }
}
