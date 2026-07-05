package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class pu0 {
    public static final m2d t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public final u1d i;
    public final String j;
    public final n2d k;
    public n2d l;
    public int m;
    public final StringBuilder n;
    public boolean o;
    public String p;
    public final StringBuilder q;
    public final ArrayList r;
    public final ro6 s;

    static {
        m2d m2dVar = new m2d();
        m2dVar.m0 = "<ignored>";
        m2dVar.o0 = "NA";
        t = m2dVar;
        u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        v = Pattern.compile("[- ]");
        w = Pattern.compile("\u2008");
    }

    public pu0(String str) {
        u1d u1dVar;
        synchronized (u1d.class) {
            try {
                if (u1d.y == null) {
                    u1d u1dVarB = u1d.b(ps5.d.b);
                    synchronized (u1d.class) {
                        u1d.y = u1dVarB;
                    }
                }
                u1dVar = u1d.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = u1dVar;
        this.m = 0;
        this.n = new StringBuilder();
        this.o = false;
        this.p = "";
        this.q = new StringBuilder();
        this.r = new ArrayList();
        this.s = new ro6(64);
        this.j = str;
        n2d n2dVarH = u1dVar.h(u1dVar.l(u1dVar.f(str)));
        n2dVarH = n2dVarH == null ? t : n2dVarH;
        this.l = n2dVarH;
        this.k = n2dVarH;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String string = sb.toString();
        for (l2d l2dVar : (this.g && this.p.length() == 0 && this.l.B0.size() > 0) ? this.l.B0 : this.l.A0) {
            if (this.p.length() > 0) {
                String str = l2dVar.I;
                if ((str.length() == 0 || u1d.x.matcher(str).matches()) && !l2dVar.J && !l2dVar.K) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String str2 = l2dVar.I;
                if (str2.length() == 0 || u1d.x.matcher(str2).matches() || l2dVar.J) {
                }
            }
            if (u.matcher(l2dVar.F).matches()) {
                this.r.add(l2dVar);
            }
        }
        j(string);
        String strE = e();
        return strE.length() > 0 ? strE : i() ? f() : this.c.toString();
    }

    public final boolean c() {
        StringBuilder sb;
        u1d u1dVar;
        int iD;
        StringBuilder sb2 = this.q;
        if (sb2.length() == 0 || (iD = (u1dVar = this.i).d(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String strL = u1dVar.l(iD);
        if ("001".equals(strL)) {
            this.l = u1dVar.g(iD);
        } else if (!strL.equals(this.j)) {
            n2d n2dVarH = u1dVar.h(u1dVar.l(u1dVar.f(strL)));
            if (n2dVarH == null) {
                n2dVarH = t;
            }
            this.l = n2dVarH;
        }
        String string = Integer.toString(iD);
        StringBuilder sb3 = this.n;
        sb3.append(string);
        sb3.append(' ');
        this.p = "";
        return true;
    }

    public final boolean d() {
        Pattern patternN = this.s.N("\\+|" + this.l.o0);
        StringBuilder sb = this.d;
        Matcher matcher = patternN.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int iEnd = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        for (l2d l2dVar : this.r) {
            Matcher matcher = this.s.N(l2dVar.E).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(l2dVar.I).find();
                String strA = a(matcher.replaceAll(l2dVar.F));
                if (u1d.u(strA, u1d.i).contentEquals(this.d)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final String f() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String strH = "";
        for (int i = 0; i < length; i++) {
            strH = h(sb.charAt(i));
        }
        return this.e ? a(strH) : this.c.toString();
    }

    public final String g(char c) {
        StringBuilder sb = this.c;
        sb.append(c);
        boolean zIsDigit = Character.isDigit(c);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (!zIsDigit && (sb.length() != 1 || !u1d.l.matcher(Character.toString(c)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.e;
        ArrayList arrayList = this.r;
        StringBuilder sb4 = this.n;
        if (z) {
            int length = sb2.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb.toString();
            }
            if (length == 3) {
                if (!d()) {
                    this.p = k();
                    return b();
                }
                this.h = true;
            }
            if (this.h) {
                if (c()) {
                    this.h = false;
                }
                return ((Object) sb4) + sb3.toString();
            }
            if (arrayList.size() <= 0) {
                return b();
            }
            String strH = h(c);
            String strE = e();
            if (strE.length() > 0) {
                return strE;
            }
            j(sb3.toString());
            return i() ? f() : this.e ? a(strH) : sb.toString();
        }
        if (this.f) {
            return sb.toString();
        }
        boolean zD = d();
        StringBuilder sb5 = this.a;
        if (!zD) {
            if (this.p.length() > 0) {
                sb3.insert(0, this.p);
                sb4.setLength(sb4.lastIndexOf(this.p));
            }
            if (!this.p.equals(k())) {
                sb4.append(' ');
                this.e = true;
                this.h = false;
                arrayList.clear();
                this.m = 0;
                sb5.setLength(0);
                this.b = "";
                return b();
            }
        } else if (c()) {
            this.e = true;
            this.h = false;
            arrayList.clear();
            this.m = 0;
            sb5.setLength(0);
            this.b = "";
            return b();
        }
        return sb.toString();
    }

    public final String h(char c) {
        Pattern pattern = w;
        StringBuilder sb = this.a;
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.m)) {
            if (this.r.size() == 1) {
                this.e = false;
            }
            this.b = "";
            return this.c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.m = iStart;
        return sb.substring(0, iStart + 1);
    }

    public final boolean i() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            l2d l2dVar = (l2d) it.next();
            String str = l2dVar.E;
            if (this.b.equals(str)) {
                return false;
            }
            String str2 = l2dVar.E;
            StringBuilder sb = this.a;
            sb.setLength(0);
            String str3 = l2dVar.F;
            Matcher matcher = this.s.N(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.q.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.b = str;
                this.o = v.matcher(l2dVar.I).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void j(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            l2d l2dVar = (l2d) it.next();
            if (l2dVar.G.size() != 0) {
                if (!this.s.N(l2dVar.a(Math.min(length, l2dVar.G.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            n2d r0 = r7.l
            int r0 = r0.n0
            java.lang.StringBuilder r1 = r7.n
            r2 = 0
            java.lang.StringBuilder r3 = r7.q
            r4 = 1
            if (r0 != r4) goto L2d
            char r0 = r3.charAt(r2)
            r5 = 49
            if (r0 != r5) goto L2d
            char r0 = r3.charAt(r4)
            r6 = 48
            if (r0 == r6) goto L2d
            char r0 = r3.charAt(r4)
            if (r0 == r5) goto L2d
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r7.g = r4
            goto L5a
        L2d:
            n2d r0 = r7.l
            boolean r5 = r0.v0
            if (r5 == 0) goto L59
            ro6 r5 = r7.s
            java.lang.String r0 = r0.w0
            java.util.regex.Pattern r0 = r5.N(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.lookingAt()
            if (r5 == 0) goto L59
            int r5 = r0.end()
            if (r5 <= 0) goto L59
            r7.g = r4
            int r4 = r0.end()
            java.lang.String r7 = r3.substring(r2, r4)
            r1.append(r7)
            goto L5a
        L59:
            r4 = r2
        L5a:
            java.lang.String r7 = r3.substring(r2, r4)
            r3.delete(r2, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu0.k():java.lang.String");
    }
}
