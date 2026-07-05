package defpackage;

import android.net.TrafficStats;
import android.os.Build;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bg5 implements fi5 {
    public final kje E;
    public final h99 F;
    public final t82 G;
    public final String H;
    public final t20 I;
    public volatile int J;
    public volatile wki K;
    public volatile ih1 L;
    public final u0h M;

    public bg5(kje kjeVar, h99 h99Var, t82 t82Var, String str, t20 t20Var, k2e k2eVar) {
        kjeVar.getClass();
        h99Var.getClass();
        t82Var.getClass();
        str.getClass();
        t20Var.getClass();
        this.E = kjeVar;
        this.F = h99Var;
        this.G = t82Var;
        this.H = str;
        this.I = t20Var;
        this.J = 1;
        this.M = new u0h(new l4(8, this));
    }

    public static final wki a(bg5 bg5Var, lie lieVar) {
        Object next;
        p8b p8bVarD;
        g99 g99Var;
        Map map = lieVar.d;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (isg.j0((String) ((Map.Entry) next).getKey(), "DD-API-KEY")) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getValue() : null;
        if (str != null) {
            if (str.length() != 0) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) {
                    }
                }
            }
            return new oki(0);
        }
        String str2 = lieVar.f;
        ide ideVar = p8b.e;
        try {
            p8bVarD = nai.D(str2);
        } catch (IllegalArgumentException unused) {
            p8bVarD = null;
        }
        jie jieVar = new jie();
        jieVar.g(lieVar.c);
        jieVar.e("POST", sie.c(tie.Companion, lieVar.e, p8bVarD, 0, 6));
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            g99Var = g99.F;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str3.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("user-agent")) {
                dch.H(bg5Var.F, 4, g99Var, yf5.G, null, false, 56);
            } else {
                jieVar.a(str3, str4);
            }
        }
        jieVar.a("User-Agent", (String) bg5Var.M.getValue());
        kie kieVar = new kie(jieVar);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getClass();
        TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT >= 36 ? threadCurrentThread.threadId() : threadCurrentThread.getId()));
        pqe pqeVarF = ((f4e) bg5Var.G.a(kieVar)).f();
        pqeVarF.close();
        int i2 = pqeVarF.H;
        if (i2 == 202) {
            return new rki(false, i2, null, 4);
        }
        if (i2 != 403) {
            if (i2 != 408) {
                if (i2 != 413) {
                    if (i2 != 429) {
                        if (i2 != 500 && i2 != 507) {
                            if (i2 != 400) {
                                if (i2 != 401) {
                                    switch (i2) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            dch.I(bg5Var.F, 4, x44.X(g99Var, g99.G), new zf5(i2, lieVar, 0), null, 56);
                                            return new tki(false, i2, null, 4);
                                    }
                                }
                            }
                        }
                        return new nki(true, i2, null, 4);
                    }
                }
                return new lki(false, i2, null, 4);
            }
            return new mki(true, i2, null, 4);
        }
        return new oki(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    @Override // defpackage.fi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wki u(defpackage.lj5 r23, java.util.List r24, byte[] r25, defpackage.ih1 r26) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg5.u(lj5, java.util.List, byte[], ih1):wki");
    }
}
