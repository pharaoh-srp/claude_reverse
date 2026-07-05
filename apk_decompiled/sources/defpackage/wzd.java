package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;
import org.jsoup.select.Selector$SelectorParseException;

/* JADX INFO: loaded from: classes3.dex */
public final class wzd implements AutoCloseable {
    public static final char[] H = {'>', '+', '~'};
    public static final String[] I = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final char[] J = {',', ')'};
    public static final Pattern K = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern L = Pattern.compile("([+-])?(\\d+)");
    public final lsh E;
    public final String F;
    public boolean G;

    public wzd(String str) {
        pqi.n(str);
        String strTrim = str.trim();
        this.F = strTrim;
        this.E = new lsh(strTrim);
    }

    public static av6 K(String str) {
        try {
            wzd wzdVar = new wzd(str);
            try {
                av6 av6VarR = wzdVar.R();
                lsh lshVar = wzdVar.E;
                lshVar.f();
                vi2 vi2Var = lshVar.E;
                if (!vi2Var.S()) {
                    throw new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", wzdVar.F, vi2Var.P());
                }
                wzdVar.close();
                return av6VarR;
            } finally {
            }
        } catch (IllegalArgumentException e) {
            throw new Selector$SelectorParseException(e.getMessage());
        }
        throw new Selector$SelectorParseException(e.getMessage());
    }

    public static av6 c(av6 av6Var, av6 av6Var2) {
        if (av6Var == null) {
            return av6Var2;
        }
        if (!(av6Var instanceof i74)) {
            return new i74(Arrays.asList(av6Var, av6Var2));
        }
        i74 i74Var = (i74) av6Var;
        i74Var.a.add(av6Var2);
        i74Var.g();
        return av6Var;
    }

    public final av6 H(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strE = e();
        pqi.o(strE, str.concat("(regex) query must not be empty"));
        hde hdeVarA = hde.a(strE);
        return z ? new zu6(hdeVarA, 2) : new zu6(hdeVarA, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [av6] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [av6] */
    /* JADX WARN: Type inference failed for: r3v4, types: [av6] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [rsg, usg] */
    /* JADX WARN: Type inference failed for: r3v8, types: [av6] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.av6 P() {
        /*
            r8 = this;
            lsh r0 = r8.E
            r0.f()
            vi2 r1 = r0.E
            char[] r2 = defpackage.wzd.H
            boolean r3 = r1.x0(r2)
            if (r3 == 0) goto L17
            ru6 r3 = new ru6
            r4 = 8
            r3.<init>(r4)
            goto L1b
        L17:
            av6 r3 = r8.S()
        L1b:
            boolean r4 = r0.f()
            r5 = 0
            r6 = 32
            if (r4 == 0) goto L26
            r4 = r6
            goto L27
        L26:
            r4 = r5
        L27:
            boolean r7 = r1.x0(r2)
            if (r7 == 0) goto L32
            char r4 = r1.f()
            goto L3b
        L32:
            char[] r7 = defpackage.wzd.J
            boolean r7 = r1.x0(r7)
            if (r7 == 0) goto L3b
            goto La3
        L3b:
            if (r4 == 0) goto La3
            av6 r7 = r8.S()
            if (r4 == r6) goto L98
            r5 = 43
            if (r4 == r5) goto L8e
            r5 = 62
            if (r4 == r5) goto L69
            r5 = 126(0x7e, float:1.77E-43)
            if (r4 != r5) goto L59
            tsg r4 = new tsg
            r4.<init>(r3)
            av6 r3 = c(r4, r7)
            goto L1b
        L59:
            org.jsoup.select.Selector$SelectorParseException r8 = new org.jsoup.select.Selector$SelectorParseException
            java.lang.Character r0 = java.lang.Character.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Unknown combinator '%s'"
            r8.<init>(r1, r0)
            throw r8
        L69:
            boolean r4 = r3 instanceof defpackage.rsg
            if (r4 == 0) goto L70
            rsg r3 = (defpackage.rsg) r3
            goto L76
        L70:
            rsg r4 = new rsg
            r4.<init>(r3)
            r3 = r4
        L76:
            java.util.ArrayList r4 = r3.d
            r4.add(r7)
            int r4 = r3.e
            int r5 = r7.a()
            int r5 = r5 + r4
            r3.e = r5
            boolean r4 = r3.b
            boolean r5 = r7.f()
            r4 = r4 | r5
            r3.b = r4
            goto L1b
        L8e:
            ssg r4 = new ssg
            r4.<init>(r3)
            av6 r3 = c(r4, r7)
            goto L1b
        L98:
            psg r4 = new psg
            r4.<init>(r3, r5)
            av6 r3 = c(r4, r7)
            goto L1b
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzd.P():av6");
    }

    public final av6 R() {
        av6 av6VarP = P();
        while (this.E.j(',')) {
            av6 av6VarP2 = P();
            if (av6VarP instanceof j74) {
                j74 j74Var = (j74) av6VarP;
                j74Var.a.add(av6VarP2);
                j74Var.g();
            } else {
                av6VarP = new j74(av6VarP, av6VarP2);
            }
        }
        return av6VarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final av6 S() {
        av6 su6Var;
        av6 av6VarC;
        lsh lshVar = this.E;
        lshVar.f();
        vi2 vi2Var = lshVar.E;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (Character.isLetterOrDigit(vi2Var.R()) || vi2Var.D0("*|")) {
            StringBuilder sbB = xrg.b();
            while (!vi2Var.S()) {
                char cR = vi2Var.R();
                if (cR != '\\') {
                    if (!Character.isLetterOrDigit(vi2Var.R()) && !vi2Var.x0(lsh.F)) {
                        break;
                    }
                    sbB.append(cR);
                    lshVar.c();
                } else {
                    lshVar.c();
                    if (vi2Var.S()) {
                        break;
                    }
                    sbB.append(vi2Var.f());
                }
            }
            String strH = ouk.h(xrg.k(sbB));
            pqi.n(strH);
            int i2 = 9;
            if (strH.startsWith("*|")) {
                String strSubstring = strH.substring(2);
                su6Var = new j74(new su6(strSubstring, i2, objArr4 == true ? 1 : 0), new su6(":".concat(strSubstring), 10, objArr3 == true ? 1 : 0));
            } else if (strH.endsWith("|*")) {
                su6Var = new su6(strH.substring(0, strH.length() - 2).concat(":"), 11, objArr2 == true ? 1 : 0);
            } else {
                if (strH.contains("|")) {
                    strH = strH.replace("|", ":");
                }
                su6Var = new su6(strH, i2, objArr == true ? 1 : 0);
            }
            av6VarC = su6Var;
        } else {
            av6VarC = lshVar.j('*') ? new ru6(i) : null;
        }
        while (true) {
            av6 av6VarT = T();
            if (av6VarT == null) {
                break;
            }
            av6VarC = c(av6VarC, av6VarT);
        }
        if (av6VarC != null) {
            return av6VarC;
        }
        throw new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.F, vi2Var.P());
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0119, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 int, still in use, count: 2, list:
      (r3v0 int) from 0x0294: PHI (r3v86 int) = 
      (r3v2 int)
      (r3v3 int)
      (r3v5 int)
      (r3v6 int)
      (r3v8 int)
      (r3v9 int)
      (r3v11 int)
      (r3v12 int)
      (r3v14 int)
      (r3v15 int)
      (r3v17 int)
      (r3v18 int)
      (r3v20 int)
      (r3v21 int)
      (r3v23 int)
      (r3v24 int)
      (r3v0 int)
      (r3v25 int)
      (r3v27 int)
      (r3v28 int)
      (r3v30 int)
      (r3v31 int)
      (r3v33 int)
      (r3v34 int)
      (r3v36 int)
      (r3v37 int)
      (r3v39 int)
      (r3v40 int)
      (r3v42 int)
      (r3v43 int)
      (r3v45 int)
      (r3v46 int)
      (r3v48 int)
      (r3v49 int)
      (r3v51 int)
      (r3v52 int)
      (r3v54 int)
      (r3v55 int)
      (r3v57 int)
      (r3v58 int)
      (r3v60 int)
      (r3v61 int)
      (r3v63 int)
      (r3v64 int)
      (r3v66 int)
      (r3v67 int)
      (r3v69 int)
      (r3v70 int)
      (r3v72 int)
      (r3v73 int)
      (r3v75 int)
      (r3v76 int)
      (r3v78 int)
      (r3v79 int)
      (r3v81 int)
      (r3v82 int)
      (r3v84 int)
      (r3v85 int)
      (r3v89 int)
     binds: [B:290:?, B:183:0x0293, B:289:?, B:179:0x0287, B:288:?, B:175:0x027b, B:287:?, B:171:0x026f, B:286:?, B:167:0x0263, B:285:?, B:163:0x0257, B:284:?, B:159:0x024b, B:283:?, B:155:0x023f, B:150:0x0231, B:282:?, B:281:?, B:148:0x0227, B:280:?, B:144:0x0219, B:279:?, B:140:0x020b, B:278:?, B:136:0x01fd, B:277:?, B:132:0x01ef, B:276:?, B:128:0x01e1, B:275:?, B:124:0x01d3, B:274:?, B:120:0x01c5, B:273:?, B:116:0x01b7, B:272:?, B:112:0x01a9, B:271:?, B:108:0x019b, B:270:?, B:104:0x018d, B:269:?, B:100:0x0180, B:268:?, B:96:0x0173, B:267:?, B:92:0x0166, B:266:?, B:88:0x0159, B:265:?, B:84:0x014c, B:264:?, B:80:0x013f, B:263:?, B:76:0x0132, B:262:?, B:72:0x0125, B:68:0x0119] A[DONT_GENERATE, DONT_INLINE, REMOVE]
      (r3v0 int) from 0x0018: CONSTRUCTOR (r15v39 java.lang.String), (r3v0 int), (r4v0 boolean) A[MD:(java.lang.String, int, boolean):void (m), REMOVE, WRAPPED] call: su6.<init>(java.lang.String, int, boolean):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:271)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.markCodeForRemoval(SwitchOverStringVisitor.java:160)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:124)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.av6 T() {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzd.T():av6");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    public final int d() {
        String strTrim = e().trim();
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!xrg.g(strTrim.charAt(i))) {
                    break;
                }
                i++;
            }
        }
        pqi.l("Index must be numeric", z);
        return Integer.parseInt(strTrim);
    }

    public final String e() {
        return this.E.d('(', ')');
    }

    public final av6 f(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strN = lsh.n(e());
        pqi.o(strN, str.concat("(text) query must not be empty"));
        return this.G ? new o5c(strN) : z ? new su6(strN, 4) : new su6(strN, 5);
    }

    public final av6 i(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strN = lsh.n(e());
        pqi.o(strN, str.concat("(text) query must not be empty"));
        boolean z2 = false;
        return z ? new su6(strN, 6, z2) : new su6(strN, 7, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yu6 j(boolean r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r9 = r9.e()
            java.lang.String r9 = defpackage.ouk.h(r9)
            java.lang.String r0 = "odd"
            boolean r0 = r0.equals(r9)
            r1 = 3
            r2 = 0
            r3 = 1
            r4 = 2
            if (r0 == 0) goto L18
            r0 = r3
        L15:
            r9 = r4
            goto L83
        L18:
            java.lang.String r0 = "even"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L22
            r0 = r2
            goto L15
        L22:
            java.util.regex.Pattern r0 = defpackage.wzd.K
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r5 = r0.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r5 == 0) goto L6a
            java.lang.String r9 = r0.group(r1)
            if (r9 == 0) goto L45
            java.lang.String r9 = r0.group(r3)
            java.lang.String r9 = r9.replaceFirst(r7, r6)
            int r9 = java.lang.Integer.parseInt(r9)
            goto L54
        L45:
            java.lang.String r9 = "-"
            java.lang.String r5 = r0.group(r4)
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L53
            r9 = -1
            goto L54
        L53:
            r9 = r3
        L54:
            r5 = 4
            java.lang.String r8 = r0.group(r5)
            if (r8 == 0) goto L68
            java.lang.String r0 = r0.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            goto L83
        L68:
            r0 = r2
            goto L83
        L6a:
            java.util.regex.Pattern r0 = defpackage.wzd.L
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r5 = r0.matches()
            if (r5 == 0) goto La1
            java.lang.String r9 = r0.group()
            java.lang.String r9 = r9.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r9)
            r9 = r2
        L83:
            if (r11 == 0) goto L93
            if (r10 == 0) goto L8d
            yu6 r10 = new yu6
            r10.<init>(r9, r0, r4)
            return r10
        L8d:
            yu6 r10 = new yu6
            r10.<init>(r9, r0, r1)
            return r10
        L93:
            if (r10 == 0) goto L9b
            yu6 r10 = new yu6
            r10.<init>(r9, r0, r3)
            return r10
        L9b:
            yu6 r10 = new yu6
            r10.<init>(r9, r0, r2)
            return r10
        La1:
            org.jsoup.select.Selector$SelectorParseException r10 = new org.jsoup.select.Selector$SelectorParseException
            java.lang.String r11 = "Could not parse nth-index '%s': unexpected format"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r10.<init>(r11, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzd.j(boolean, boolean):yu6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final av6 n(lsh lshVar) {
        int i;
        Object[] objArr;
        vi2 vi2Var = lshVar.E;
        StringBuilder sbB = xrg.b();
        loop0: while (true) {
            i = 0;
            objArr = 0;
            if (vi2Var.S()) {
                break;
            }
            for (int i2 = 0; i2 < 6; i2++) {
                if (vi2Var.D0(I[i2])) {
                    break loop0;
                }
            }
            sbB.append(vi2Var.f());
        }
        String strH = ouk.h(xrg.k(sbB));
        pqi.n(strH);
        if (strH.equals("abs:")) {
            throw new ValidationException("Absolute attribute key must have a name");
        }
        lshVar.f();
        if (vi2Var.S()) {
            return strH.startsWith("^") ? new su6(strH.substring(1), 1) : strH.equals("*") ? new su6("", 1) : new su6(strH, i, objArr == true ? 1 : 0);
        }
        if (lshVar.j('=')) {
            return new tu6(strH, vi2Var.P(), 0);
        }
        if (vi2Var.l0("!=")) {
            return new tu6(strH, vi2Var.P(), 3);
        }
        if (vi2Var.l0("^=")) {
            return new tu6(strH, vi2Var.P(), 4);
        }
        if (vi2Var.l0("$=")) {
            return new tu6(strH, vi2Var.P(), 2);
        }
        if (vi2Var.l0("*=")) {
            return new tu6(strH, vi2Var.P(), 1);
        }
        if (vi2Var.l0("~=")) {
            return new uu6(strH, hde.a(vi2Var.P()));
        }
        throw new Selector$SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.F, vi2Var.P());
    }

    public final String toString() {
        return this.F;
    }

    public final av6 x(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strE = e();
        pqi.o(strE, str.concat("(regex) query must not be empty"));
        hde hdeVarA = hde.a(strE);
        return this.G ? new o5c(hdeVarA) : z ? new zu6(hdeVarA, 1) : new zu6(hdeVarA, 0);
    }
}
