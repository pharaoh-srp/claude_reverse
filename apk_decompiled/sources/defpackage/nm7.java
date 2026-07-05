package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nm7 implements dsb {
    public int E;
    public long F;
    public boolean G;
    public Object H;
    public Object I;

    @Override // defpackage.dsb
    public boolean a(long j) {
        return true;
    }

    @Override // defpackage.dsb
    public void b() {
        sih sihVar = (sih) this.I;
        sihVar.r.setValue(eih.E);
        if (this.G) {
            sihVar.x();
        }
    }

    @Override // defpackage.dsb
    public boolean c(long j, phf phfVar, int i) {
        sih sihVar = (sih) this.I;
        yjh yjhVarC = sihVar.b.c();
        if (!sihVar.i || yjhVarC == null || sihVar.a.d().G.length() == 0) {
            return false;
        }
        this.G = i >= 2;
        sihVar.r.setValue(eih.G);
        ((ytf) this.H).a();
        sihVar.w = -1;
        this.E = -1;
        this.F = j;
        this.E = (int) (d(j, phfVar, yjhVarC, true) >> 32);
        return true;
    }

    public long d(long j, phf phfVar, yjh yjhVar, boolean z) {
        sih sihVar = (sih) this.I;
        int length = yjhVar.a.a.F.length();
        int iD = this.E;
        if (iD < 0 || iD > length) {
            iD = sihVar.b.d(this.F, false);
        }
        int i = iD;
        long jI = sihVar.I(sihVar.a.d(), i, sihVar.b.d(j, false), false, phfVar, false, z, null);
        if (this.E == -1 && !kkh.d(jI)) {
            this.E = (int) (jI >> 32);
        }
        if (kkh.h(jI)) {
            jI = mwa.m((int) (4294967295L & jI), (int) (jI >> 32));
        }
        sihVar.a.j(jI);
        sihVar.E(ykh.G);
        return jI;
    }

    @Override // defpackage.dsb
    public boolean e(long j, phf phfVar) {
        sih sihVar = (sih) this.I;
        akh akhVar = sihVar.b;
        i5i i5iVar = sihVar.a;
        yjh yjhVarC = akhVar.c();
        if (!sihVar.i || yjhVarC == null || i5iVar.d().G.length() == 0) {
            return false;
        }
        if (kkh.c(i5iVar.d().H, d(j, phfVar, yjhVarC, false))) {
            return true;
        }
        this.G = false;
        return true;
    }

    @Override // defpackage.dsb
    public boolean f(long j) {
        sih sihVar = (sih) this.I;
        yjh yjhVarC = sihVar.b.c();
        if (!sihVar.i || yjhVarC == null || sihVar.a.d().G.length() == 0) {
            return false;
        }
        this.G = false;
        ((ytf) this.H).a();
        d(j, unb.M, yjhVarC, false);
        return true;
    }
}
