package defpackage;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x05 {
    public static final ide a = new ide("\\s+");
    public static final Set b = mp0.Z0(new String[]{"http", "https", "mailto"});

    public static final void a(f6j f6jVar) {
        xb0 xb0Var = f6jVar.a;
        if (xb0Var.E.length() == 0) {
            return;
        }
        String str = xb0Var.n().F;
        if (str.length() <= 0 || bsg.J0(str) == '\n') {
            return;
        }
        xb0Var.c('\n');
    }

    public static final void b(f6j f6jVar, yj6 yj6Var) {
        for (Object obj : yj6Var.p()) {
            obj.getClass();
            e(f6jVar, (c5c) obj);
        }
    }

    public static final void c(f6j f6jVar, yj6 yj6Var, egg eggVar) {
        a(f6jVar);
        xb0 xb0Var = f6jVar.a;
        int iM = xb0Var.m(eggVar);
        try {
            b(f6jVar, yj6Var);
            xb0Var.j(iM);
            a(f6jVar);
        } catch (Throwable th) {
            xb0Var.j(iM);
            throw th;
        }
    }

    public static final d54 d(yj6 yj6Var) {
        String strG = yj6Var.g("style");
        strG.getClass();
        if (strG.length() == 0 || !bsg.u0(strG, "color", true)) {
            return null;
        }
        for (String str : bsg.X0(strG, new char[]{';'}, 6)) {
            int iF0 = bsg.F0(str, ':', 0, 6);
            if (iF0 >= 0) {
                String lowerCase = bsg.k1(str.substring(0, iF0)).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.equals("color")) {
                    fx4 fx4VarD = ow4.d(str.substring(iF0 + 1));
                    if (fx4VarD != null) {
                        return new d54(fx4VarD.a());
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static final void e(f6j f6jVar, c5c c5cVar) {
        xb0 xb0Var = f6jVar.a;
        if (c5cVar instanceof ikh) {
            String strO = ((ikh) c5cVar).O();
            strO.getClass();
            String strH = a.h(strO, " ");
            if (strH.length() > 0) {
                xb0Var.h(strH);
                return;
            }
            return;
        }
        if (c5cVar instanceof yj6) {
            yj6 yj6Var = (yj6) c5cVar;
            String str = yj6Var.H.F;
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            d54 d54VarD = d(yj6Var);
            if (d54VarD == null) {
                f(f6jVar, lowerCase, yj6Var);
                return;
            }
            int iM = xb0Var.m(new egg(d54VarD.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                f(f6jVar, lowerCase, yj6Var);
            } finally {
                xb0Var.j(iM);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x021c, code lost:
    
        if (r31.equals("em") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r31.equals("h6") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x026d, code lost:
    
        if (r31.equals("p") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0271, code lost:
    
        a(r30);
        b(r30, r32);
        a(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x027a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0281, code lost:
    
        if (r31.equals("i") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0285, code lost:
    
        r1 = r5.m(new defpackage.egg(0, 0, null, new defpackage.wu7(1), null, null, null, 0, null, null, null, 0, null, null, 65527));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b1, code lost:
    
        b(r30, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c3, code lost:
    
        if (r31.equals("strong") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cc, code lost:
    
        if (r31.equals("b") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02cf, code lost:
    
        r1 = r5.m(new defpackage.egg(0, 0, defpackage.dv7.L, null, null, null, null, 0, null, null, null, 0, null, null, 65531));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f3, code lost:
    
        b(r30, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02fe, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r31.equals("h5") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r31.equals("h4") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r31.equals("h3") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        c(r30, r32, r4.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r31.equals("section") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        if (r31.equals("aside") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0176, code lost:
    
        if (r31.equals("div") == false) goto L149;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.f6j r30, java.lang.String r31, defpackage.yj6 r32) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x05.f(f6j, java.lang.String, yj6):void");
    }
}
