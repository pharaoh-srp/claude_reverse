package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fih implements zeh {
    public final ytf a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public te8 e = te8.G;
    public boolean f = true;
    public phf g = unb.M;
    public final /* synthetic */ sih h;

    public fih(sih sihVar, ytf ytfVar) {
        this.h = sihVar;
        this.a = ytfVar;
    }

    @Override // defpackage.zeh
    public final void a(long j, phf phfVar) {
        sih sihVar = this.h;
        boolean z = sihVar.i;
        i5i i5iVar = sihVar.a;
        akh akhVar = sihVar.b;
        if (z) {
            sihVar.H(this.e, j);
            sihVar.D(false);
            sihVar.r.setValue(eih.F);
            this.c = j;
            this.d = 0L;
            sihVar.w = -1;
            this.f = true;
            this.g = phfVar;
            if (akhVar.c() == null) {
                return;
            }
            if (akhVar.f(j)) {
                if (i5iVar.d().G.length() == 0) {
                    return;
                }
                int iD = akhVar.d(j, true);
                long jI = sihVar.I(new efh(sihVar.a.d(), kkh.b, null, null, null, null, 60), iD, iD, false, this.g, false, false, new hf8(0));
                i5iVar.j(jI);
                sihVar.E(ykh.G);
                this.b = (int) (jI >> 32);
                return;
            }
            int iD2 = akhVar.d(j, true);
            gf8 gf8Var = sihVar.j;
            if (gf8Var != null) {
                gf8Var.a(0);
            }
            i5iVar.getClass();
            i5iVar.j(mwa.m(iD2, iD2));
            sihVar.D(true);
            this.f = false;
            sihVar.E(ykh.F);
        }
    }

    @Override // defpackage.zeh
    public final void b() {
        f();
    }

    @Override // defpackage.zeh
    public final void c() {
    }

    @Override // defpackage.zeh
    public final void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[PHI: r16
      0x00ff: PHI (r16v4 long) = (r16v3 long), (r16v5 long) binds: [B:60:0x0113, B:56:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.zeh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r19) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fih.e(long):void");
    }

    public final void f() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            sih sihVar = this.h;
            sihVar.i();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            sihVar.w = -1;
            this.g = unb.M;
            sihVar.r.setValue(eih.E);
            this.a.a();
            if (this.f) {
                sihVar.x();
            }
        }
    }

    @Override // defpackage.zeh
    public final void onCancel() {
        f();
    }
}
