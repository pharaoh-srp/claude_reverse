package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oqk implements oek {
    public static final oqk b = new oqk(0);
    public static final oqk c = new oqk(1);
    public static final oqk d = new oqk(2);
    public final /* synthetic */ int a;

    public /* synthetic */ oqk(int i) {
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // defpackage.oek
    public final boolean d(int r3) {
        /*
            r2 = this;
            int r2 = r2.a
            r0 = 0
            r1 = 1
            switch(r2) {
                case 0: goto L2a;
                case 1: goto L22;
                default: goto L7;
            }
        L7:
            if (r3 == 0) goto L1c
            if (r3 == r1) goto L19
            r2 = 2
            if (r3 == r2) goto L16
            r2 = 3
            if (r3 == r2) goto L13
            r2 = 0
            goto L1e
        L13:
            isk r2 = defpackage.isk.ALTERNATIVE_BILLING_ACTION
            goto L1e
        L16:
            isk r2 = defpackage.isk.LOCAL_PURCHASES_UPDATED_ACTION
            goto L1e
        L19:
            isk r2 = defpackage.isk.PURCHASES_UPDATED_ACTION
            goto L1e
        L1c:
            isk r2 = defpackage.isk.BROADCAST_ACTION_UNSPECIFIED
        L1e:
            if (r2 == 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            int r2 = defpackage.gkk.a(r3)
            if (r2 == 0) goto L29
            r0 = r1
        L29:
            return r0
        L2a:
            switch(r3) {
                case 0: goto L31;
                case 1: goto L31;
                case 2: goto L31;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L31;
                case 7: goto L31;
                case 8: goto L31;
                case 9: goto L31;
                case 10: goto L31;
                case 11: goto L31;
                case 12: goto L31;
                case 13: goto L31;
                case 14: goto L31;
                case 15: goto L31;
                default: goto L2d;
            }
        L2d:
            switch(r3) {
                case 22: goto L31;
                case 23: goto L31;
                case 24: goto L31;
                case 25: goto L31;
                case 26: goto L31;
                case 27: goto L31;
                case 28: goto L31;
                case 29: goto L31;
                case 30: goto L31;
                case 31: goto L31;
                case 32: goto L31;
                case 33: goto L31;
                case 34: goto L31;
                case 35: goto L31;
                case 36: goto L31;
                default: goto L30;
            }
        L30:
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqk.d(int):boolean");
    }
}
