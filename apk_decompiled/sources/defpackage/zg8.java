package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zg8 extends f0 {
    public final /* synthetic */ int a;
    public final jr1 b;
    public final Object c;

    public zg8() {
        this.a = 1;
        this.b = new u09();
        this.c = new ArrayList();
    }

    public static zg8 j(xeg xegVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(xegVar);
        t6f t6fVar = new t6f(arrayList);
        int iH = t6fVar.h('#');
        if (iH == 0 || iH > 6) {
            return null;
        }
        if (!t6fVar.f()) {
            return new zg8(iH, new d80(5));
        }
        char cN = t6fVar.n();
        if (cN != ' ' && cN != '\t') {
            return null;
        }
        t6fVar.s();
        l42 l42VarQ = t6fVar.q();
        l42 l42VarQ2 = l42VarQ;
        loop0: while (true) {
            boolean z = true;
            while (t6fVar.f()) {
                char cN2 = t6fVar.n();
                if (cN2 == '\t' || cN2 == ' ') {
                    t6fVar.j();
                } else {
                    if (cN2 != '#') {
                        t6fVar.j();
                        l42VarQ2 = t6fVar.q();
                    } else if (z) {
                        t6fVar.h('#');
                        int iS = t6fVar.s();
                        if (t6fVar.f()) {
                            l42VarQ2 = t6fVar.q();
                        }
                        if (iS > 0) {
                            break;
                        }
                    } else {
                        t6fVar.j();
                        l42VarQ2 = t6fVar.q();
                    }
                    z = false;
                }
            }
            break loop0;
        }
        d80 d80VarE = t6fVar.e(l42VarQ, l42VarQ2);
        return d80VarE.g().isEmpty() ? new zg8(iH, new d80(5)) : new zg8(iH, d80VarE);
    }

    public static int k(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            int i2 = i + 1;
            int length = charSequence.length();
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (charSequence.charAt(i2) != '=') {
                    length = i2;
                    break;
                }
                i2++;
            }
            if (ybi.r(length, charSequence.length(), charSequence) >= charSequence.length()) {
                return 1;
            }
        }
        int i3 = i + 1;
        int length2 = charSequence.length();
        while (true) {
            if (i3 >= length2) {
                break;
            }
            if (charSequence.charAt(i3) != '-') {
                length2 = i3;
                break;
            }
            i3++;
        }
        return ybi.r(length2, charSequence.length(), charSequence) >= charSequence.length() ? 2 : 0;
    }

    @Override // defpackage.f0
    public void a(xeg xegVar) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(xegVar.a);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[LOOP:2: B:20:0x003b->B:22:0x003f, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // defpackage.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r9.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L10:
            r2 = 0
            if (r1 < 0) goto L36
            java.lang.Object r3 = r0.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r4 = r3.length()
            r5 = r2
        L1e:
            r6 = -1
            if (r5 >= r4) goto L30
            char r7 = r3.charAt(r5)
            r8 = 32
            if (r7 == r8) goto L2d
            switch(r7) {
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L2d;
                case 12: goto L2d;
                case 13: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L31
        L2d:
            int r5 = r5 + 1
            goto L1e
        L30:
            r5 = r6
        L31:
            if (r5 != r6) goto L36
            int r1 = r1 + (-1)
            goto L10
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L3b:
            int r4 = r1 + 1
            if (r2 >= r4) goto L50
            java.lang.Object r4 = r0.get(r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.append(r4)
            r4 = 10
            r3.append(r4)
            int r2 = r2 + 1
            goto L3b
        L50:
            java.lang.String r0 = r3.toString()
            jr1 r9 = r9.b
            u09 r9 = (defpackage.u09) r9
            r9.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg8.e():void");
    }

    @Override // defpackage.f0
    public final jr1 f() {
        int i = this.a;
        jr1 jr1Var = this.b;
        switch (i) {
            case 0:
                return (yg8) jr1Var;
            default:
                return (u09) jr1Var;
        }
    }

    @Override // defpackage.f0
    public void h(s39 s39Var) {
        switch (this.a) {
            case 0:
                s39Var.e((d80) this.c, (yg8) this.b);
                break;
        }
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (z96Var.h >= 4) {
                    return new kr1(-1, z96Var.d + 4, false);
                }
                if (z96Var.i) {
                    return kr1.a(z96Var.f);
                }
                return null;
        }
    }

    public zg8(int i, d80 d80Var) {
        this.a = 0;
        yg8 yg8Var = new yg8();
        this.b = yg8Var;
        yg8Var.g = i;
        this.c = d80Var;
    }
}
