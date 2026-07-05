package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zp8 implements n39 {
    public static final efe a;
    public static final efe b;
    public static final efe c;
    public static final efe d;
    public static final efe e;
    public static final efe f;

    static {
        n78 n78VarF = efe.f();
        n78VarF.Q('A', 'Z');
        n78VarF.Q('a', 'z');
        efe efeVar = new efe(n78VarF);
        a = efeVar;
        b = efeVar;
        n78 n78VarX = efeVar.x();
        n78VarX.Q('0', '9');
        n78VarX.C('-');
        c = new efe(n78VarX);
        n78 n78VarX2 = efeVar.x();
        n78VarX2.C('_');
        n78VarX2.C(':');
        efe efeVar2 = new efe(n78VarX2);
        d = efeVar2;
        n78 n78VarX3 = efeVar2.x();
        n78VarX3.Q('0', '9');
        n78VarX3.C('.');
        n78VarX3.C('-');
        e = new efe(n78VarX3);
        n78 n78VarF2 = efe.f();
        n78VarF2.C(' ');
        n78VarF2.C('\t');
        n78VarF2.C('\n');
        n78VarF2.C((char) 11);
        n78VarF2.C('\f');
        n78VarF2.C('\r');
        n78VarF2.C('\"');
        n78VarF2.C('\'');
        n78VarF2.C('=');
        n78VarF2.C('<');
        n78VarF2.C('>');
        n78VarF2.C('`');
        f = new efe(n78VarF2);
    }

    public static i49 b(l42 l42Var, t6f t6fVar) {
        String strG = t6fVar.e(l42Var, t6fVar.q()).g();
        yp8 yp8Var = new yp8();
        yp8Var.j(strG);
        return i49.V0(yp8Var, t6fVar.q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r8.g(defpackage.zp8.d) < 1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r8.g(defpackage.zp8.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r8.s() < 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r8.k('=') == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r8.s();
        r0 = r8.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 != '\'') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r8.b('\'') >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r0 != '\"') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r8.b('\"') >= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r8.c(defpackage.zp8.f) > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r8.s() < 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r8.k('/');
        r6 = r8.k('>');
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return b(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r8.s() >= 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r0 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0030, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:6:0x002d). Please report as a decompilation issue!!! */
    @Override // defpackage.n39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i49 a(defpackage.s39 r9) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp8.a(s39):i49");
    }
}
