package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v80 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v80(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8 A[LOOP:3: B:145:0x03a2->B:147:0x03a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b4  */
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // defpackage.bz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v80.invoke(java.lang.Object):java.lang.Object");
    }
}
