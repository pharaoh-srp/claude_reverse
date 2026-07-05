package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a8a extends f0 {
    public final y7a a;
    public boolean b;
    public int c;

    public a8a(y7a y7aVar) {
        this.a = y7aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.z7a j(java.lang.CharSequence r10, int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8a.j(java.lang.CharSequence, int, int, boolean):z7a");
    }

    public static boolean k(y7a y7aVar, y7a y7aVar2) {
        if ((y7aVar instanceof c02) && (y7aVar2 instanceof c02)) {
            return Character.valueOf(((c02) y7aVar).h).equals(Character.valueOf(((c02) y7aVar2).h));
        }
        if ((y7aVar instanceof tjc) && (y7aVar2 instanceof tjc)) {
            return Character.valueOf(((tjc) y7aVar).i).equals(Character.valueOf(((tjc) y7aVar2).i));
        }
        return false;
    }

    @Override // defpackage.f0
    public final boolean c(jr1 jr1Var) {
        if (!(jr1Var instanceof i9a)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.g = false;
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.f0
    public final jr1 f() {
        return this.a;
    }

    @Override // defpackage.f0
    public final boolean g() {
        return true;
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        if (z96Var.i) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return kr1.a(z96Var.c);
    }
}
