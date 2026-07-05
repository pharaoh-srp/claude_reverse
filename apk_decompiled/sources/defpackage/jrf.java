package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.types.strings.SessionId;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jrf {
    public static final long A;
    public static final Set B;
    public static final Set C;
    public final jwf a;
    public final hdc b;
    public final String c;
    public final String d;
    public final bg9 e;
    public final h86 f;
    public final owf g;
    public final mn5 h;
    public final h1e i;
    public final boolean j;
    public final n2g k;
    public cqf l;
    public String m;
    public final ConcurrentHashMap n;
    public final ConcurrentHashMap.KeySetView o;
    public final ConcurrentHashMap p;
    public final ConcurrentHashMap q;
    public final ConcurrentHashMap r;
    public final zy1 s;
    public final zy1 t;
    public volatile boolean u;
    public volatile boolean v;
    public final amg w;
    public final a4e x;
    public final mp4 y;
    public final AtomicReference z;

    static {
        Iterator it = new b79(1, 5, 1).iterator();
        long jB = 0;
        while (true) {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                A = jB;
                B = mp0.Z0(new String[]{"ExitPlanMode", RequiresActionDetails.ASK_USER_QUESTION});
                C = mp0.Z0(new String[]{"message_start", "content_block_stop", "message_stop"});
                return;
            }
            jB += kyk.b(a79Var.nextInt());
        }
    }

    public jrf(jwf jwfVar, hdc hdcVar, String str, String str2, bg9 bg9Var, h86 h86Var, owf owfVar, mn5 mn5Var, loi loiVar) {
        g1e g1eVar = h1e.E;
        str2.getClass();
        this.a = jwfVar;
        this.b = hdcVar;
        this.c = str;
        this.d = str2;
        this.e = bg9Var;
        this.f = h86Var;
        this.g = owfVar;
        this.h = mn5Var;
        this.i = g1eVar;
        this.j = ((jf0) owfVar).h();
        this.k = o2g.a(0, 100, py1.F);
        this.l = new cqf();
        this.n = new ConcurrentHashMap();
        this.o = ConcurrentHashMap.newKeySet();
        this.p = new ConcurrentHashMap();
        this.q = new ConcurrentHashMap();
        this.r = new ConcurrentHashMap();
        this.s = wd6.P(-1, 6, null);
        this.t = wd6.P(Integer.MAX_VALUE, 6, null);
        amg amgVarA = bmg.a(null);
        this.w = amgVarA;
        this.x = j8.k(amgVarA);
        this.y = fd9.c(nai.Z(new myg(knk.z(loiVar.E.E)), h86Var.b()));
        this.z = new AtomicReference();
    }

    public static /* synthetic */ Object D(jrf jrfVar, String str, boolean z, PermissionMode permissionMode, Map map, String str2, xzg xzgVar, int i) {
        xzg xzgVar2;
        String str3;
        boolean z2 = (i & 4) == 0;
        if ((i & 8) != 0) {
            permissionMode = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            xzgVar2 = xzgVar;
            str3 = null;
        } else {
            xzgVar2 = xzgVar;
            str3 = str2;
        }
        return jrfVar.C(str, z, z2, permissionMode, map, str3, xzgVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0339 A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:13:0x0033, B:146:0x0333, B:148:0x0339, B:151:0x0346, B:152:0x0355, B:154:0x035b, B:155:0x036b, B:157:0x0371, B:158:0x0395, B:160:0x039b, B:161:0x03a7, B:164:0x03b4, B:165:0x03c3, B:167:0x03c9, B:168:0x03d9, B:170:0x03df, B:171:0x03fd, B:173:0x0403), top: B:196:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a7 A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:13:0x0033, B:146:0x0333, B:148:0x0339, B:151:0x0346, B:152:0x0355, B:154:0x035b, B:155:0x036b, B:157:0x0371, B:158:0x0395, B:160:0x039b, B:161:0x03a7, B:164:0x03b4, B:165:0x03c3, B:167:0x03c9, B:168:0x03d9, B:170:0x03df, B:171:0x03fd, B:173:0x0403), top: B:196:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.jrf r25, com.anthropic.claude.sessions.types.SdkControlRequestEvent r26, defpackage.vp4 r27) {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.a(jrf, com.anthropic.claude.sessions.types.SdkControlRequestEvent, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:21:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.jrf r11, java.lang.String r12, java.lang.String r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.p(jrf, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012c -> B:42:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.jrf r23, java.lang.String r24, defpackage.vp4 r25) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.q(jrf, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.jrf r4, java.lang.String r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.r(jrf, java.lang.String, vp4):java.lang.Object");
    }

    public static final void s(jrf jrfVar, List list) {
        ConcurrentHashMap concurrentHashMap = jrfVar.n;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fvf fvfVar = (fvf) it.next();
            if (fvfVar instanceof suf) {
                String strA = ((suf) fvfVar).a().a();
                if (concurrentHashMap.get(strA) == null) {
                    concurrentHashMap.putIfAbsent(strA, zni.c());
                }
            } else if (fvfVar instanceof duf) {
                String strA2 = ((duf) fvfVar).a().a();
                if (concurrentHashMap.get(strA2) == null) {
                    concurrentHashMap.putIfAbsent(strA2, zni.c());
                }
            } else if (fvfVar instanceof tuf) {
                concurrentHashMap.remove(((tuf) fvfVar).a());
            } else if (fvfVar instanceof euf) {
                concurrentHashMap.remove(((euf) fvfVar).a());
            } else if (fvfVar instanceof cvf) {
                String strD = ((cvf) fvfVar).d();
                if (concurrentHashMap.get(strD) == null) {
                    concurrentHashMap.putIfAbsent(strD, zni.c());
                }
            } else if (fvfVar instanceof dvf) {
                concurrentHashMap.remove(((dvf) fvfVar).a());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x028c, code lost:
    
        if (x(r15, r2) == r11) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:82:0x01f0, B:95:0x0258, B:85:0x01fc, B:86:0x020b, B:88:0x0211, B:89:0x0221, B:91:0x0227, B:92:0x0246, B:94:0x024c, B:60:0x0161, B:62:0x0168, B:75:0x01cd, B:65:0x0176, B:66:0x0185, B:68:0x018b, B:69:0x019b, B:71:0x01a1, B:72:0x01bb, B:74:0x01c1, B:77:0x01d3, B:79:0x01d7, B:97:0x026c, B:98:0x0271, B:46:0x00cd, B:48:0x00d3, B:54:0x00fc, B:56:0x0102, B:57:0x0128), top: B:123:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:82:0x01f0, B:95:0x0258, B:85:0x01fc, B:86:0x020b, B:88:0x0211, B:89:0x0221, B:91:0x0227, B:92:0x0246, B:94:0x024c, B:60:0x0161, B:62:0x0168, B:75:0x01cd, B:65:0x0176, B:66:0x0185, B:68:0x018b, B:69:0x019b, B:71:0x01a1, B:72:0x01bb, B:74:0x01c1, B:77:0x01d3, B:79:0x01d7, B:97:0x026c, B:98:0x0271, B:46:0x00cd, B:48:0x00d3, B:54:0x00fc, B:56:0x0102, B:57:0x0128), top: B:123:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168 A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:82:0x01f0, B:95:0x0258, B:85:0x01fc, B:86:0x020b, B:88:0x0211, B:89:0x0221, B:91:0x0227, B:92:0x0246, B:94:0x024c, B:60:0x0161, B:62:0x0168, B:75:0x01cd, B:65:0x0176, B:66:0x0185, B:68:0x018b, B:69:0x019b, B:71:0x01a1, B:72:0x01bb, B:74:0x01c1, B:77:0x01d3, B:79:0x01d7, B:97:0x026c, B:98:0x0271, B:46:0x00cd, B:48:0x00d3, B:54:0x00fc, B:56:0x0102, B:57:0x0128), top: B:123:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3 A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:82:0x01f0, B:95:0x0258, B:85:0x01fc, B:86:0x020b, B:88:0x0211, B:89:0x0221, B:91:0x0227, B:92:0x0246, B:94:0x024c, B:60:0x0161, B:62:0x0168, B:75:0x01cd, B:65:0x0176, B:66:0x0185, B:68:0x018b, B:69:0x019b, B:71:0x01a1, B:72:0x01bb, B:74:0x01c1, B:77:0x01d3, B:79:0x01d7, B:97:0x026c, B:98:0x0271, B:46:0x00cd, B:48:0x00d3, B:54:0x00fc, B:56:0x0102, B:57:0x0128), top: B:123:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:82:0x01f0, B:95:0x0258, B:85:0x01fc, B:86:0x020b, B:88:0x0211, B:89:0x0221, B:91:0x0227, B:92:0x0246, B:94:0x024c, B:60:0x0161, B:62:0x0168, B:75:0x01cd, B:65:0x0176, B:66:0x0185, B:68:0x018b, B:69:0x019b, B:71:0x01a1, B:72:0x01bb, B:74:0x01c1, B:77:0x01d3, B:79:0x01d7, B:97:0x026c, B:98:0x0271, B:46:0x00cd, B:48:0x00d3, B:54:0x00fc, B:56:0x0102, B:57:0x0128), top: B:123:0x00cd }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f3 -> B:51:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.vp4 r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.List r33) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.A(vp4, java.lang.String, java.lang.String, java.lang.String, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(com.anthropic.claude.sessions.types.PermissionMode r12, defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.B(com.anthropic.claude.sessions.types.PermissionMode, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0273 A[Catch: Exception -> 0x0048, TryCatch #6 {Exception -> 0x0048, blocks: (B:15:0x0043, B:106:0x0265, B:119:0x02e2, B:109:0x0273, B:110:0x0282, B:112:0x0288, B:113:0x0298, B:115:0x029e, B:116:0x02d0, B:118:0x02d6, B:22:0x005d, B:102:0x0243, B:25:0x006e, B:96:0x0216, B:98:0x021c, B:120:0x02e8, B:121:0x02fc, B:75:0x017e, B:78:0x0196, B:79:0x0198, B:92:0x01bd), top: B:152:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e8 A[Catch: Exception -> 0x0048, TryCatch #6 {Exception -> 0x0048, blocks: (B:15:0x0043, B:106:0x0265, B:119:0x02e2, B:109:0x0273, B:110:0x0282, B:112:0x0288, B:113:0x0298, B:115:0x029e, B:116:0x02d0, B:118:0x02d6, B:22:0x005d, B:102:0x0243, B:25:0x006e, B:96:0x0216, B:98:0x021c, B:120:0x02e8, B:121:0x02fc, B:75:0x017e, B:78:0x0196, B:79:0x0198, B:92:0x01bd), top: B:152:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196 A[Catch: Exception -> 0x0048, TryCatch #6 {Exception -> 0x0048, blocks: (B:15:0x0043, B:106:0x0265, B:119:0x02e2, B:109:0x0273, B:110:0x0282, B:112:0x0288, B:113:0x0298, B:115:0x029e, B:116:0x02d0, B:118:0x02d6, B:22:0x005d, B:102:0x0243, B:25:0x006e, B:96:0x0216, B:98:0x021c, B:120:0x02e8, B:121:0x02fc, B:75:0x017e, B:78:0x0196, B:79:0x0198, B:92:0x01bd), top: B:152:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c A[Catch: Exception -> 0x0048, TryCatch #6 {Exception -> 0x0048, blocks: (B:15:0x0043, B:106:0x0265, B:119:0x02e2, B:109:0x0273, B:110:0x0282, B:112:0x0288, B:113:0x0298, B:115:0x029e, B:116:0x02d0, B:118:0x02d6, B:22:0x005d, B:102:0x0243, B:25:0x006e, B:96:0x0216, B:98:0x021c, B:120:0x02e8, B:121:0x02fc, B:75:0x017e, B:78:0x0196, B:79:0x0198, B:92:0x01bd), top: B:152:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.String r29, boolean r30, boolean r31, com.anthropic.claude.sessions.types.PermissionMode r32, java.util.Map r33, java.lang.String r34, defpackage.vp4 r35) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.C(java.lang.String, boolean, boolean, com.anthropic.claude.sessions.types.PermissionMode, java.util.Map, java.lang.String, vp4):java.lang.Object");
    }

    public final kp7 t(String str, boolean z, boolean z2, Boolean bool) {
        this.m = str;
        this.l = new cqf();
        kp7[] kp7VarArr = {bool != null ? bool.booleanValue() : this.j ? j8.q(new vqf(this, z, str, z2, null)) : j8.q(new vqf(this, z, str, z2, null)), this.k};
        int i = sq7.a;
        return j8.K(j8.l(new uh2(new op0(0, kp7VarArr)), Integer.MAX_VALUE, py1.E), this.f.b());
    }

    /* JADX WARN: Path cross not found for [B:25:0x00a5, B:26:0x00a7], limit reached: 212 */
    /* JADX WARN: Path cross not found for [B:50:0x013f, B:119:0x031c], limit reached: 212 */
    /* JADX WARN: Path cross not found for [B:57:0x0156, B:63:0x0172], limit reached: 212 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[Catch: CancellationException -> 0x00d2, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00d2, blocks: (B:21:0x0094, B:34:0x00cf, B:31:0x00c2), top: B:204:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x03f7 -> B:152:0x03fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0203 -> B:82:0x020c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r27, defpackage.vp4 r28) {
        /*
            Method dump skipped, instruction units count: 1343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.u(java.lang.String, vp4):java.lang.Object");
    }

    public final void v(String str) {
        a45 a45Var;
        str.getClass();
        tp4 tp4Var = null;
        zqf zqfVar = new zqf(this, str, tp4Var, 0);
        mp4 mp4Var = this.y;
        zv5 zv5VarK = gb9.k(mp4Var, null, zqfVar, 3);
        cpc cpcVar = new cpc(SessionId.m1114boximpl(str), zv5VarK);
        cpc cpcVar2 = (cpc) this.z.getAndSet(cpcVar);
        if (cpcVar2 != null && (a45Var = (yv5) cpcVar2.F) != null) {
            ((vf9) a45Var).d(null);
        }
        zv5VarK.D0(new f2d(gb9.D(mp4Var, null, null, new ba9(this, cpcVar, zv5VarK, tp4Var, 21), 3), this, cpcVar, 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x013b, code lost:
    
        if (r0 == r10) goto L79;
     */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00ca: MOVE (r2 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:52:0x00ca */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[Catch: all -> 0x00c9, Exception -> 0x00cd, CancellationException -> 0x00d0, TRY_LEAVE, TryCatch #5 {all -> 0x00c9, blocks: (B:80:0x013e, B:85:0x014a, B:98:0x01bb, B:88:0x0158, B:89:0x0167, B:91:0x016d, B:92:0x017d, B:94:0x0183, B:95:0x01a9, B:97:0x01af, B:62:0x00ee, B:64:0x00f2, B:67:0x00fb, B:69:0x0107, B:72:0x0114, B:74:0x011a, B:77:0x0123, B:46:0x00b4, B:48:0x00ba, B:57:0x00d4, B:59:0x00d8, B:83:0x0144, B:84:0x0149, B:43:0x008d), top: B:108:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4 A[Catch: all -> 0x00c9, Exception -> 0x00cd, CancellationException -> 0x00d0, TRY_ENTER, TryCatch #5 {all -> 0x00c9, blocks: (B:80:0x013e, B:85:0x014a, B:98:0x01bb, B:88:0x0158, B:89:0x0167, B:91:0x016d, B:92:0x017d, B:94:0x0183, B:95:0x01a9, B:97:0x01af, B:62:0x00ee, B:64:0x00f2, B:67:0x00fb, B:69:0x0107, B:72:0x0114, B:74:0x011a, B:77:0x0123, B:46:0x00b4, B:48:0x00ba, B:57:0x00d4, B:59:0x00d8, B:83:0x0144, B:84:0x0149, B:43:0x008d), top: B:108:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2 A[Catch: all -> 0x00c9, Exception -> 0x00cd, CancellationException -> 0x00d0, TRY_LEAVE, TryCatch #5 {all -> 0x00c9, blocks: (B:80:0x013e, B:85:0x014a, B:98:0x01bb, B:88:0x0158, B:89:0x0167, B:91:0x016d, B:92:0x017d, B:94:0x0183, B:95:0x01a9, B:97:0x01af, B:62:0x00ee, B:64:0x00f2, B:67:0x00fb, B:69:0x0107, B:72:0x0114, B:74:0x011a, B:77:0x0123, B:46:0x00b4, B:48:0x00ba, B:57:0x00d4, B:59:0x00d8, B:83:0x0144, B:84:0x0149, B:43:0x008d), top: B:108:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb A[Catch: all -> 0x00c9, Exception -> 0x00cd, CancellationException -> 0x00d0, TRY_ENTER, TryCatch #5 {all -> 0x00c9, blocks: (B:80:0x013e, B:85:0x014a, B:98:0x01bb, B:88:0x0158, B:89:0x0167, B:91:0x016d, B:92:0x017d, B:94:0x0183, B:95:0x01a9, B:97:0x01af, B:62:0x00ee, B:64:0x00f2, B:67:0x00fb, B:69:0x0107, B:72:0x0114, B:74:0x011a, B:77:0x0123, B:46:0x00b4, B:48:0x00ba, B:57:0x00d4, B:59:0x00d8, B:83:0x0144, B:84:0x0149, B:43:0x008d), top: B:108:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r19, defpackage.tp4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.w(java.lang.String, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.drf
            if (r0 == 0) goto L13
            r0 = r6
            drf r0 = (defpackage.drf) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            drf r0 = new drf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L3d
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r6)
            cqf r6 = r4.l
            java.util.List r5 = r6.k(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()
            fvf r6 = (defpackage.fvf) r6
            r0.E = r5
            r0.H = r2
            n2g r1 = r4.k
            java.lang.Object r6 = r1.g(r6, r0)
            m45 r1 = defpackage.m45.E
            if (r6 != r1) goto L3d
            return r1
        L58:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.x(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155 A[Catch: Exception -> 0x0045, TRY_ENTER, TryCatch #4 {Exception -> 0x0045, blocks: (B:14:0x0040, B:81:0x01b4, B:94:0x0229, B:84:0x01c2, B:85:0x01d1, B:87:0x01d7, B:88:0x01e7, B:90:0x01ed, B:91:0x0217, B:93:0x021d, B:21:0x005a, B:72:0x017f, B:74:0x0185, B:76:0x0193, B:95:0x0230, B:96:0x023b, B:66:0x0155, B:68:0x015d), top: B:122:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185 A[Catch: Exception -> 0x0045, TryCatch #4 {Exception -> 0x0045, blocks: (B:14:0x0040, B:81:0x01b4, B:94:0x0229, B:84:0x01c2, B:85:0x01d1, B:87:0x01d7, B:88:0x01e7, B:90:0x01ed, B:91:0x0217, B:93:0x021d, B:21:0x005a, B:72:0x017f, B:74:0x0185, B:76:0x0193, B:95:0x0230, B:96:0x023b, B:66:0x0155, B:68:0x015d), top: B:122:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2 A[Catch: Exception -> 0x0045, TryCatch #4 {Exception -> 0x0045, blocks: (B:14:0x0040, B:81:0x01b4, B:94:0x0229, B:84:0x01c2, B:85:0x01d1, B:87:0x01d7, B:88:0x01e7, B:90:0x01ed, B:91:0x0217, B:93:0x021d, B:21:0x005a, B:72:0x017f, B:74:0x0185, B:76:0x0193, B:95:0x0230, B:96:0x023b, B:66:0x0155, B:68:0x015d), top: B:122:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230 A[Catch: Exception -> 0x0045, TryCatch #4 {Exception -> 0x0045, blocks: (B:14:0x0040, B:81:0x01b4, B:94:0x0229, B:84:0x01c2, B:85:0x01d1, B:87:0x01d7, B:88:0x01e7, B:90:0x01ed, B:91:0x0217, B:93:0x021d, B:21:0x005a, B:72:0x017f, B:74:0x0185, B:76:0x0193, B:95:0x0230, B:96:0x023b, B:66:0x0155, B:68:0x015d), top: B:122:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r19, boolean r20, java.util.Map r21, boolean r22, defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.y(java.lang.String, boolean, java.util.Map, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrf.z(vp4):java.lang.Object");
    }
}
