package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x7k implements oek {
    public static final x7k b = new x7k(0);
    public static final x7k c = new x7k(1);
    public static final x7k d = new x7k(2);
    public static final x7k e = new x7k(3);
    public static final x7k f = new x7k(4);
    public final /* synthetic */ int a;

    public /* synthetic */ x7k(int i) {
        this.a = i;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
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
    @Override // defpackage.oek
    public final boolean d(int r2) {
        /*
            r1 = this;
            int r1 = r1.a
            switch(r1) {
                case 0: goto L27;
                case 1: goto L1a;
                case 2: goto L13;
                case 3: goto Lc;
                default: goto L5;
            }
        L5:
            r1 = 1
            if (r2 == 0) goto Lb
            if (r2 == r1) goto Lb
            r1 = 0
        Lb:
            return r1
        Lc:
            switch(r2) {
                case 0: goto L11;
                case 1: goto L11;
                case 2: goto L11;
                case 3: goto L11;
                case 4: goto L11;
                case 5: goto L11;
                case 6: goto L11;
                case 7: goto L11;
                default: goto Lf;
            }
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
        L13:
            switch(r2) {
                case 0: goto L18;
                case 1: goto L18;
                case 2: goto L18;
                case 3: goto L18;
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                case 11: goto L18;
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L16;
                case 15: goto L16;
                case 16: goto L16;
                case 17: goto L18;
                case 18: goto L18;
                case 19: goto L18;
                case 20: goto L18;
                default: goto L16;
            }
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            return r1
        L1a:
            r1 = 1
            if (r2 == 0) goto L26
            if (r2 == r1) goto L26
            r0 = 2
            if (r2 == r0) goto L26
            r0 = 3
            if (r2 == r0) goto L26
            r1 = 0
        L26:
            return r1
        L27:
            switch(r2) {
                case 0: goto L2c;
                case 1: goto L2c;
                case 2: goto L2c;
                case 3: goto L2c;
                case 4: goto L2c;
                case 5: goto L2c;
                case 6: goto L2c;
                case 7: goto L2c;
                case 8: goto L2c;
                default: goto L2a;
            }
        L2a:
            r1 = 0
            goto L2d
        L2c:
            r1 = 1
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7k.d(int):boolean");
    }
}
