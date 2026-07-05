package com.anthropic.claude.conway;

import android.content.Context;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.e18;
import defpackage.fd9;
import defpackage.gr9;
import defpackage.ide;
import defpackage.jce;
import defpackage.jd4;
import defpackage.kce;
import defpackage.ld4;
import defpackage.m7f;
import defpackage.ny4;
import defpackage.oq5;
import defpackage.sf5;
import defpackage.us4;
import defpackage.w00;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final Set a = sf5.f0("conway-quickstart");
    public static final ide b = new ide("%[0-9a-fA-F][^\\x00-\\x7F]|%[uU][0-9a-fA-F]{0,3}[^\\x00-\\x7F]|%[^\\x00-\\x7F]");
    public static final ide c = new ide("^(/api)?/sandbox/proxy/[A-Za-z0-9_-]+");
    public static final ide d = new ide("%2[fF]|%5[cC]");
    public static final ide e = new ide("%[uU][0-9a-fA-F]{4}");
    public static final ide f = new ide("^/sandbox/file-download/(uploads|scratch)/");

    public static final Integer a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return Integer.valueOf(c2 - '0');
        }
        if ('a' <= c2 && c2 < 'g') {
            return Integer.valueOf(c2 - 'W');
        }
        if ('A' > c2 || c2 >= 'G') {
            return null;
        }
        return Integer.valueOf(c2 - '7');
    }

    public static final boolean b(String str) {
        if (str.length() > 0 && (bsg.v0(str, '.') || bsg.v0(str, (char) 8230))) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '.' || cCharAt == 8230 || cCharAt == '+' || cCharAt <= ' ' || Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt) || cCharAt == 133 || cCharAt == 65279) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x015c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0161, code lost:
    
        if (r3 >= r1.length()) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0163, code lost:
    
        r4 = r1.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0169, code lost:
    
        if (r4 < 8192) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016d, code lost:
    
        if (r4 <= 8202) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0171, code lost:
    
        if (r4 == 8232) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0175, code lost:
    
        if (r4 == 8233) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0179, code lost:
    
        if (r4 == 12288) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x017d, code lost:
    
        if (r4 == 5760) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0181, code lost:
    
        if (r4 == 8287) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0183, code lost:
    
        if (r4 == 160) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0185, code lost:
    
        if (r4 != 8239) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0189, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0192, code lost:
    
        if (com.anthropic.claude.conway.g.e.a(r1) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x019a, code lost:
    
        if (com.anthropic.claude.conway.g.b.a(r1) != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01a2, code lost:
    
        if (com.anthropic.claude.conway.g.d.a(r1) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01a4, code lost:
    
        r4 = defpackage.bsg.X0(r1, new char[]{'/'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b4, code lost:
    
        if ((r4 instanceof java.util.Collection) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bd, code lost:
    
        if (r4.isEmpty() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c0, code lost:
    
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01c8, code lost:
    
        if (r4.hasNext() == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ca, code lost:
    
        r6 = defpackage.isg.n0(defpackage.isg.n0((java.lang.String) r4.next(), "%2E", ".", true), "%E2%80%A6", "…", true);
        r7 = defpackage.bsg.v0(r6, 0);
        r8 = b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ee, code lost:
    
        if (defpackage.bsg.v0(r6, ';') == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01f8, code lost:
    
        if (b(defpackage.bsg.g1(r6, ';')) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01fa, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01fc, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r7 != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ff, code lost:
    
        if (r8 != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0201, code lost:
    
        if (r6 == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0205, code lost:
    
        r4 = new java.util.ArrayList(r1.length());
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0214, code lost:
    
        if (r6 >= r1.length()) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x021c, code lost:
    
        if (r1.charAt(r6) != '%') goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x021e, code lost:
    
        r7 = r6 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0224, code lost:
    
        if (r7 >= r1.length()) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0226, code lost:
    
        r9 = a(r1.charAt(r6 + 1));
        r7 = a(r1.charAt(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0238, code lost:
    
        if (r9 == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x023a, code lost:
    
        if (r7 == null) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x023c, code lost:
    
        r4.add(java.lang.Byte.valueOf((byte) (r7.intValue() | (r9.intValue() << 4))));
        r6 = r6 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0252, code lost:
    
        r7 = r1.codePointAt(r6);
        r8 = new java.lang.String(new int[]{r7}, 0, 1).getBytes(defpackage.dj2.a);
        r8.getClass();
        r9 = r8.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x026a, code lost:
    
        if (r10 >= r9) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026c, code lost:
    
        r4.add(java.lang.Byte.valueOf(r8[r10]));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0278, code lost:
    
        r6 = r6 + java.lang.Character.charCount(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x027e, code lost:
    
        r4 = defpackage.w44.l1(r4);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0284, code lost:
    
        if (r6 >= r4.length) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0286, code lost:
    
        r7 = r4[r6] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x028c, code lost:
    
        if (r7 >= 128) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x028e, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0293, code lost:
    
        if (r7 >= 194) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0299, code lost:
    
        if (r7 >= 224) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02a1, code lost:
    
        if (d(r4, r6 + 1) == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02a3, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02a7, code lost:
    
        if (r7 >= 240) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02a9, code lost:
    
        r10 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02af, code lost:
    
        if (d(r4, r10) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02b7, code lost:
    
        if (d(r4, r6 + 2) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02ba, code lost:
    
        r10 = r4[r10] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02be, code lost:
    
        if (r7 != 224) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02c0, code lost:
    
        if (r10 >= 160) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02c5, code lost:
    
        if (r7 != 237) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02c7, code lost:
    
        if (r10 < 160) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02ca, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02ce, code lost:
    
        if (r7 >= 245) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02d0, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02d6, code lost:
    
        if (d(r4, r9) == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02de, code lost:
    
        if (d(r4, r6 + 2) == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02e6, code lost:
    
        if (d(r4, r6 + 3) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02e9, code lost:
    
        r9 = r4[r9] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02ef, code lost:
    
        if (r7 != 240) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02f1, code lost:
    
        if (r9 >= 144) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02f6, code lost:
    
        if (r7 != 244) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02f8, code lost:
    
        if (r9 < 144) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02fb, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02fc, code lost:
    
        r6 = r6 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02fe, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0300, code lost:
    
        r4 = new java.lang.String(r4, defpackage.dj2.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0308, code lost:
    
        if (r4 != 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x030f, code lost:
    
        if (r4.equals(r1) != false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0311, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0313, code lost:
    
        if (r2 <= 5) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0319, code lost:
    
        r1 = com.anthropic.claude.conway.g.c;
        r1.getClass();
        r12 = r1.E.matcher(r12).replaceFirst("");
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0333, code lost:
    
        if (r12.equals("/sandbox/download") != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x033b, code lost:
    
        if (com.anthropic.claude.conway.g.f.a(r12) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x033d, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r3v40, types: [ide] */
    /* JADX WARN: Type inference failed for: r3v42, types: [ide] */
    /* JADX WARN: Type inference failed for: r3v44, types: [ide] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.g.c(java.lang.String):boolean");
    }

    public static final boolean d(byte[] bArr, int i) {
        return i < bArr.length && (bArr[i] & 192) == 128;
    }

    public static final f e(us4 us4Var, ld4 ld4Var, int i) {
        m7f m7fVarB = gr9.b(ld4Var);
        e18 e18Var = (e18) ld4Var;
        Context applicationContext = ((Context) e18Var.j(w00.b)).getApplicationContext();
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.h(us4Var)) || (i & 6) == 4) | e18Var.h(applicationContext) | e18Var.h(m7fVarB);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new ny4(applicationContext, m7fVarB, us4Var, 0);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (f) fd9.r0(kceVar.b(f.class), oq5.B(kceVar.b(f.class)), (bz7) objN, e18Var);
    }
}
