package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public class lja implements f7g, b45, ia4, x0h, jo4, s6f, mm0, m4i {
    public static final lja F = new lja(0);
    public static final xo1 G = new xo1(-1.0f, -1.0f);
    public static final xo1 H = new xo1(MTTypesetterKt.kLineSkipLimitMultiplier, -1.0f);
    public static final xo1 I = new xo1(1.0f, -1.0f);
    public static final xo1 J = new xo1(-1.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final xo1 K = new xo1(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final xo1 L = new xo1(1.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final xo1 M = new xo1(-1.0f, 1.0f);
    public static final xo1 N = new xo1(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
    public static final xo1 O = new xo1(1.0f, 1.0f);
    public static final wo1 P = new wo1(-1.0f);
    public static final wo1 Q = new wo1(MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final wo1 R = new wo1(1.0f);
    public static final vo1 S = new vo1(-1.0f);
    public static final vo1 T = new vo1(MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final vo1 U = new vo1(1.0f);
    public static final lja V = new lja(2);
    public static final lja W = new lja(3);
    public static final l9e X = new l9e(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final lja Y = new lja(5);
    public static final /* synthetic */ lja Z = new lja(6);
    public static final ipc a0 = new ipc("Expanded");
    public static final ipc b0 = new ipc("Hidden");
    public static final lja c0 = new lja(9);
    public static final lja d0 = new lja(10);
    public static final /* synthetic */ lja e0 = new lja(11);
    public final /* synthetic */ int E;

    public /* synthetic */ lja(int i) {
        this.E = i;
    }

    public static final boolean e(Path path) {
        Path path2 = qpe.J;
        return !isg.h0(path.b(), ".class", true);
    }

    public static vai g(qai qaiVar, ze9 ze9Var, cbf cbfVar, yr9 yr9Var) {
        ze9Var.getClass();
        cbfVar.getClass();
        if (!ze9Var.g()) {
            ze9Var = ze9Var.i(1);
        }
        int iF = sq6.F(ze9Var.c());
        if (iF != 0 && iF != 1) {
            if (iF == 2) {
                return new wai(1, yr9Var);
            }
            mr9.b();
            return null;
        }
        if (!fsh.i(qaiVar.z())) {
            return new wai(1, o06.e(qaiVar).m());
        }
        List parameters = yr9Var.O().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new wai(3, yr9Var) : fbi.l(qaiVar, ze9Var);
    }

    public static String l(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(dj2.a);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            return mp0.L0(bArrDigest, "", lxe.I, 30);
        } catch (NoSuchAlgorithmException e) {
            dch.H(kze.a, 5, g99.E, uxe.e0, e, false, 48);
            return null;
        }
    }

    public static int m(wsd wsdVar) {
        int i = wsdVar == null ? -1 : hud.a[wsdVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 2;
            }
        }
        return 1;
    }

    public static Path o(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        String strT = path2.E.t();
        Path path3 = qpe.J;
        String strReplace = bsg.R0(path.E.t(), strT).replace('\\', '/');
        strReplace.getClass();
        return path3.e(strReplace);
    }

    public static boolean q(lj5 lj5Var, String str) {
        lj5Var.getClass();
        Map map = (Map) lj5Var.q.get("session-replay");
        if (map == null) {
            return false;
        }
        Object obj = map.get(str);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("has_replay") : null;
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.m4i
    public void a(Context context) {
    }

    @Override // defpackage.jo4
    public long b(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = m6f.a;
            return jFloatToRawIntBits;
        }
        float fS = wd6.S(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fS)) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
        int i2 = m6f.a;
        return jFloatToRawIntBits2;
    }

    @Override // defpackage.mm0
    public void c(String str) {
    }

    @Override // defpackage.mm0
    public int d() {
        return 0;
    }

    @Override // defpackage.mm0
    public String f() {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0097 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.s6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.a7a h(int r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            int r9 = r10 + (-1)
            r0 = 1
            r1 = -1
            r2 = r0
            r3 = r1
        L6:
            r4 = 0
            r5 = 46
            r6 = 45
            if (r9 < r11) goto L4d
            char r7 = r12.charAt(r9)
            boolean r8 = defpackage.auk.h(r7)
            if (r8 != 0) goto L48
            boolean r8 = defpackage.auk.k(r7)
            if (r8 == 0) goto L1e
            goto L48
        L1e:
            r8 = 33
            if (r7 == r8) goto L48
            if (r7 == r6) goto L48
            r8 = 47
            if (r7 == r8) goto L48
            r8 = 61
            if (r7 == r8) goto L48
            r8 = 63
            if (r7 == r8) goto L48
            r8 = 42
            if (r7 == r8) goto L48
            r8 = 43
            if (r7 == r8) goto L48
            switch(r7) {
                case 35: goto L48;
                case 36: goto L48;
                case 37: goto L48;
                case 38: goto L48;
                case 39: goto L48;
                default: goto L3b;
            }
        L3b:
            switch(r7) {
                case 94: goto L48;
                case 95: goto L48;
                case 96: goto L48;
                default: goto L3e;
            }
        L3e:
            switch(r7) {
                case 123: goto L48;
                case 124: goto L48;
                case 125: goto L48;
                case 126: goto L48;
                default: goto L41;
            }
        L41:
            if (r7 != r5) goto L4d
            if (r2 == 0) goto L46
            goto L4d
        L46:
            r2 = r0
            goto L4a
        L48:
            r3 = r9
            r2 = r4
        L4a:
            int r9 = r9 + (-1)
            goto L6
        L4d:
            if (r3 != r1) goto L50
            goto L97
        L50:
            int r10 = r10 + r0
            r9 = r0
            r2 = r1
            r7 = r2
            r11 = r4
        L55:
            int r8 = r12.length()
            if (r10 >= r8) goto L90
            char r8 = r12.charAt(r10)
            if (r9 == 0) goto L71
            boolean r9 = defpackage.auk.h(r8)
            if (r9 != 0) goto L6d
            boolean r9 = defpackage.auk.k(r8)
            if (r9 == 0) goto L90
        L6d:
            r7 = r10
            r11 = r0
            r9 = r4
            goto L8d
        L71:
            if (r8 != r5) goto L7b
            if (r11 != 0) goto L76
            goto L90
        L76:
            if (r2 != r1) goto L79
            r2 = r10
        L79:
            r9 = r0
            goto L8d
        L7b:
            if (r8 != r6) goto L7f
            r11 = r4
            goto L8d
        L7f:
            boolean r11 = defpackage.auk.h(r8)
            if (r11 != 0) goto L8b
            boolean r11 = defpackage.auk.k(r8)
            if (r11 == 0) goto L90
        L8b:
            r7 = r10
            r11 = r0
        L8d:
            int r10 = r10 + 1
            goto L55
        L90:
            if (r2 == r1) goto L94
            if (r2 <= r7) goto L95
        L94:
            r7 = r1
        L95:
            if (r7 != r1) goto L99
        L97:
            r9 = 0
            return r9
        L99:
            a7a r9 = new a7a
            c7a r10 = defpackage.c7a.F
            int r7 = r7 + r0
            r9.<init>(r10, r3, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lja.h(int, int, java.lang.String):a7a");
    }

    public List i(Executor executor) {
        return Collections.singletonList(new eq5(executor));
    }

    public List j() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.m4i
    public void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
    }

    @Override // defpackage.f7g
    public void lock() {
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        return new ys9((ffk) el5Var.a(ffk.class), (l57) el5Var.a(l57.class));
    }

    public String toString() {
        switch (this.E) {
            case 9:
                return "SingleLineCodepointTransformation";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.f7g
    public void unlock() {
    }
}
