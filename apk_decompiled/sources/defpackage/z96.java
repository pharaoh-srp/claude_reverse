package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z96 {
    public static final LinkedHashSet r = new LinkedHashSet(Arrays.asList(qr1.class, yg8.class, bh7.class, wp8.class, klh.class, y7a.class, u09.class));
    public static final Map s;
    public xeg a;
    public boolean e;
    public boolean i;
    public final List j;
    public final lz1 k;
    public final List l;
    public final int m;
    public final v96 n;
    public final ArrayList p;
    public final ArrayList q;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public final k02 o = new k02(1);

    static {
        HashMap map = new HashMap();
        map.put(qr1.class, new vr1(0));
        map.put(yg8.class, new vr1(2));
        map.put(bh7.class, new vr1(1));
        map.put(wp8.class, new vr1(3));
        map.put(klh.class, new vr1(8));
        map.put(y7a.class, new vr1(6));
        map.put(u09.class, new vr1(4));
        s = Collections.unmodifiableMap(map);
    }

    public z96(ArrayList arrayList, lz1 lz1Var, ArrayList arrayList2, int i) {
        ArrayList arrayList3 = new ArrayList();
        this.p = arrayList3;
        this.q = new ArrayList();
        this.j = arrayList;
        this.k = lz1Var;
        this.l = arrayList2;
        this.m = i;
        v96 v96Var = new v96(0);
        this.n = v96Var;
        arrayList3.add(new y96(v96Var, 0));
    }

    public final void a(y96 y96Var) {
        while (!h().c(y96Var.a.f())) {
            f(1);
        }
        h().f().c(y96Var.a.f());
        this.p.add(y96Var);
    }

    public final void b(irc ircVar) {
        for (x6a x6aVar : ircVar.j()) {
            jr1 jr1VarF = ircVar.f();
            x6aVar.i();
            b5c b5cVar = jr1VarF.d;
            x6aVar.d = b5cVar;
            if (b5cVar != null) {
                b5cVar.e = x6aVar;
            }
            x6aVar.e = jr1VarF;
            jr1VarF.d = x6aVar;
            b5c b5cVar2 = jr1VarF.a;
            x6aVar.a = b5cVar2;
            if (x6aVar.d == null) {
                b5cVar2.b = x6aVar;
            }
            k02 k02Var = this.o;
            k02Var.getClass();
            String strB = pu6.b(x6aVar.k());
            LinkedHashMap linkedHashMap = k02Var.E;
            if (!linkedHashMap.containsKey(strB)) {
                linkedHashMap.put(strB, x6aVar);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceA;
        boolean z = this.e;
        int i = this.c;
        xeg xegVar = this.a;
        if (z) {
            CharSequence charSequenceSubSequence = xegVar.a().subSequence(i + 1, this.a.a().length());
            int iD = ybi.d(this.d);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence.length() + iD);
            for (int i2 = 0; i2 < iD; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence);
            charSequenceA = sb.toString();
        } else {
            charSequenceA = i == 0 ? xegVar.a() : xegVar.a().subSequence(this.c, this.a.a().length());
        }
        h().a(xeg.b(charSequenceA, this.m == 3 ? cfg.a(this.b, this.c, charSequenceA.length()) : null));
        d();
    }

    public final void d() {
        int i = 1;
        if (this.m == 1) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.p;
            if (i >= arrayList.size()) {
                return;
            }
            y96 y96Var = (y96) arrayList.get(i);
            int i2 = y96Var.b;
            int length = this.a.a().length() - i2;
            if (length != 0) {
                y96Var.a.b(cfg.a(this.b, i2, length));
            }
            i++;
        }
    }

    public final void e() {
        char cCharAt = this.a.a().charAt(this.c);
        this.c++;
        int i = this.d;
        if (cCharAt == '\t') {
            this.d = ybi.d(i) + i;
        } else {
            this.d = i + 1;
        }
    }

    public final void f(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = ((y96) this.p.remove(r1.size() - 1)).a;
            if (f0Var instanceof irc) {
                b((irc) f0Var);
            }
            f0Var.e();
            this.q.add(f0Var);
        }
    }

    public final void g() {
        int i = this.c;
        int i2 = this.d;
        this.i = true;
        int length = this.a.a().length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.a.a().charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.i = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.g = i2;
        this.h = i2 - this.d;
    }

    public final f0 h() {
        return ((y96) this.p.get(r1.size() - 1)).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0289, code lost:
    
        r1 = r18.f;
        r5 = r18.a.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0294, code lost:
    
        if (r18.h >= 4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x029c, code lost:
    
        if (r5.charAt(r1) != '<') goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x029e, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a0, code lost:
    
        if (r8 > 7) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a2, code lost:
    
        if (r8 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ae, code lost:
    
        if ((r11.w().f() instanceof defpackage.arc) != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b8, code lost:
    
        if (h().d() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bb, code lost:
    
        r12 = defpackage.xp8.e[r8][0];
        r14 = defpackage.xp8.e[r8][1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02dd, code lost:
    
        if (r12.matcher(r5.subSequence(r1, r5.length())).find() == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02df, code lost:
    
        r1 = defpackage.fe8.g(new defpackage.xp8(r14));
        r1.b(r18.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f4, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02fa, code lost:
    
        if (r18.h < 4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02fe, code lost:
    
        r1 = r18.a;
        r5 = r18.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030c, code lost:
    
        if (r1.a().charAt(r5) != '#') goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x030e, code lost:
    
        r8 = defpackage.zg8.j(r1.c(r5, r1.a().length()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x031e, code lost:
    
        if (r8 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0320, code lost:
    
        r5 = defpackage.fe8.g(r8);
        r5.b(r1.a().length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0337, code lost:
    
        r5 = defpackage.zg8.k(r5, r1.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x033f, code lost:
    
        if (r5 <= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0341, code lost:
    
        r8 = r11.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0349, code lost:
    
        if (r8.k() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x034b, code lost:
    
        r5 = defpackage.fe8.g(new defpackage.zg8(r5, r8));
        r5.b(r1.a().length());
        r5.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x036a, code lost:
    
        r1 = r18.h;
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036d, code lost:
    
        if (r1 < 4) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0370, code lost:
    
        r5 = r18.f;
        r1 = defpackage.ch7.j(r5, r1, r18.a.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037c, code lost:
    
        if (r1 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x037e, code lost:
    
        r8 = defpackage.fe8.g(r1);
        r8.b(r5 + defpackage.ch7.k(r1).h);
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0395, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0398, code lost:
    
        r14 = r12;
        r1 = r18.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x039f, code lost:
    
        if (defpackage.wr1.j(r18, r1) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03a1, code lost:
    
        r5 = r18.d + r18.h;
        r8 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b4, code lost:
    
        if (defpackage.ybi.m(r1 + 1, r18.a.a()) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b6, code lost:
    
        r8 = r5 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b8, code lost:
    
        r16 = 0;
        r1 = defpackage.fe8.g(new defpackage.wr1());
        r1.a(r8);
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03cc, code lost:
    
        r16 = 0;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03cf, code lost:
    
        if (r5 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d2, code lost:
    
        r12 = r14;
        r1 = r16;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03d8, code lost:
    
        r16 = r1;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03db, code lost:
    
        if (r5 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03dd, code lost:
    
        k(r18.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03e4, code lost:
    
        r1 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03e6, code lost:
    
        if (r3 <= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e8, code lost:
    
        f(r3);
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03f2, code lost:
    
        if (r5.e() == (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f4, code lost:
    
        k(r5.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0400, code lost:
    
        if (r5.d() == (-1)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0402, code lost:
    
        j(r5.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x040d, code lost:
    
        if (r5.f() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x040f, code lost:
    
        r8 = ((defpackage.y96) r6.remove(r6.size() - 1)).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0420, code lost:
    
        if ((r8 instanceof defpackage.irc) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0422, code lost:
    
        b((defpackage.irc) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0428, code lost:
    
        r8.e();
        r8.f().i();
        r8 = r8.f().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x043b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x043c, code lost:
    
        r5 = r5.c();
        r10 = r5.length;
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0443, code lost:
    
        if (r12 >= r10) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0445, code lost:
    
        r4 = r5[r12];
        a(new defpackage.y96(r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x044f, code lost:
    
        if (r8 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0451, code lost:
    
        r4.f().g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0458, code lost:
    
        r9 = r4.g();
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x045f, code lost:
    
        r10 = true;
        r8 = -1;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0465, code lost:
    
        k(r18.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x046a, code lost:
    
        if (r10 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x046e, code lost:
    
        if (r18.i != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0478, code lost:
    
        if (h().d() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x047a, code lost:
    
        ((defpackage.y96) r6.get(r6.size() - 1)).b = r7;
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x048b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x048c, code lost:
    
        if (r3 <= 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x048e, code lost:
    
        f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0495, code lost:
    
        if (r4.g() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0497, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x049a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x049d, code lost:
    
        if (r18.i != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x049f, code lost:
    
        a(new defpackage.y96(new defpackage.irc(), r7));
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04b0, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r3 = r6.size() - r4;
        r4 = ((defpackage.y96) r6.get(r4 - 1)).a;
        r7 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if ((r4.f() instanceof defpackage.arc) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r4.g() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r9 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        r7 = r18.c;
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r18.i != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r18.h >= 4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (defpackage.ybi.k(r18.f, r18.a.a()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        r11 = new defpackage.ax5(r2, r4);
        r13 = r18.j.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        if (r13.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        switch(((defpackage.vr1) r13.next()).a) {
            case 0: goto L137;
            case 1: goto L130;
            case 2: goto L117;
            case 3: goto L100;
            case 4: goto L92;
            case 5: goto L76;
            case 6: goto L62;
            case 7: goto L51;
            default: goto L43;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        if (r18.h < r12) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        r14 = r18.f;
        r15 = r18.a.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (defpackage.v96.j(r14, r15) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r5 = new defpackage.f0[1];
        r5[r1] = new defpackage.v96(1);
        r5 = defpackage.fe8.g(r5);
        r5.b(r15.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        r16 = r1;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        r5 = r11.x().h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
    
        if (r5.size() != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        if (defpackage.ybi.g('|', ((defpackage.xeg) r5.get(r1)).a(), r1) == r8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
    
        r14 = r18.a;
        r8 = defpackage.b3h.j(r14.c(r18.c, r14.a().length()).a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014f, code lost:
    
        if (r8.isEmpty() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0151, code lost:
    
        r5 = (defpackage.xeg) r5.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0163, code lost:
    
        if (r8.size() < defpackage.b3h.m(r5).size()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0165, code lost:
    
        r14 = new defpackage.b3h(r8, r5);
        r5 = new defpackage.f0[1];
        r5[r1] = r14;
        r5 = defpackage.fe8.g(r5);
        r5.b(r18.c);
        r5.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017b, code lost:
    
        r5 = r11.w();
        r8 = r18.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0181, code lost:
    
        if (r8 < r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0183, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
    
        r16 = r1;
        r1 = defpackage.a8a.j(r18.a.a(), r18.f, r18.d + r8, !r11.x().k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a0, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a4, code lost:
    
        r8 = r1.a;
        r1 = r1.b;
        r12 = new defpackage.l9a(r1 - r18.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b3, code lost:
    
        if ((r5 instanceof defpackage.a8a) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
    
        if (defpackage.a8a.k((defpackage.y7a) r5.f(), r8) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c2, code lost:
    
        r5 = new defpackage.f0[1];
        r5[r16] = r12;
        r5 = defpackage.fe8.g(r5);
        r5.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ce, code lost:
    
        r5 = new defpackage.a8a(r8);
        r8.g = true;
        r8 = new defpackage.f0[2];
        r8[r16] = r5;
        r8[1] = r12;
        r5 = defpackage.fe8.g(r8);
        r5.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e2, code lost:
    
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e5, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ea, code lost:
    
        if (r18.h < 4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ed, code lost:
    
        r1 = r18.a.a();
        r5 = defpackage.bsg.m1(r1.subSequence(r18.f, r1.length()).toString()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020f, code lost:
    
        if (defpackage.x44.r(r5, "$$") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0211, code lost:
    
        r8 = new defpackage.f0[1];
        r8[r16 ? 1 : 0] = new defpackage.ch7();
        r5 = defpackage.fe8.g(r8);
        r5.b(r1.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x022c, code lost:
    
        if (defpackage.isg.q0(r5, "$$", r16) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0232, code lost:
    
        if (defpackage.isg.h0(r5, "$$", r16) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0239, code lost:
    
        if (r5.length() <= 4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        r8 = new defpackage.ch7(defpackage.vb7.j(2, 2, r5));
        r5 = new defpackage.f0[1];
        r5[r16 ? 1 : 0] = r8;
        r5 = defpackage.fe8.g(r5);
        r5.b(r1.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0254, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0255, code lost:
    
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0256, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025d, code lost:
    
        if (r18.h < 4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0261, code lost:
    
        if (r18.i != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026d, code lost:
    
        if ((h().f() instanceof defpackage.arc) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r1 = defpackage.fe8.g(new defpackage.zg8());
        r1.a(r18.d + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0287, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z96.i(java.lang.String):void");
    }

    public final void j(int i) {
        int i2;
        int i3 = this.g;
        if (i >= i3) {
            this.c = this.f;
            this.d = i3;
        }
        int length = this.a.a().length();
        while (true) {
            i2 = this.d;
            if (i2 >= i || this.c == length) {
                break;
            } else {
                e();
            }
        }
        if (i2 <= i) {
            this.e = false;
            return;
        }
        this.c--;
        this.d = i;
        this.e = true;
    }

    public final void k(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.c = i2;
            this.d = this.g;
        }
        int length = this.a.a().length();
        while (true) {
            int i3 = this.c;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                e();
            }
        }
        this.e = false;
    }
}
