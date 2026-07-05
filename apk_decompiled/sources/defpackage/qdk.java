package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qdk implements wxk {
    public static final qdk b = new qdk(0);
    public static final qdk c = new qdk(1);
    public static final qdk d = new qdk(2);
    public static final qdk e = new qdk(3);
    public static final qdk f = new qdk(4);
    public final /* synthetic */ int a;

    public /* synthetic */ qdk(int i) {
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
    @Override // defpackage.wxk
    public final boolean d(int r2) {
        /*
            r1 = this;
            int r1 = r1.a
            switch(r1) {
                case 0: goto L25;
                case 1: goto L1e;
                case 2: goto L17;
                case 3: goto Lf;
                default: goto L5;
            }
        L5:
            int r1 = defpackage.fsh.g(r2)
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
        Lf:
            r1 = 1
            if (r2 == r1) goto L16
            r0 = 2
            if (r2 == r0) goto L16
            r1 = 0
        L16:
            return r1
        L17:
            r1 = 1
            if (r2 == 0) goto L1d
            if (r2 == r1) goto L1d
            r1 = 0
        L1d:
            return r1
        L1e:
            switch(r2) {
                case 0: goto L23;
                case 1: goto L23;
                case 2: goto L23;
                case 3: goto L23;
                case 4: goto L23;
                case 5: goto L23;
                case 6: goto L23;
                default: goto L21;
            }
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            return r1
        L25:
            int r1 = defpackage.fsh.f(r2)
            if (r1 == 0) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdk.d(int):boolean");
    }
}
