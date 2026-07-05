package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qoh implements poh, nqc, mma, mqc {
    public final z4f E;
    public final /* synthetic */ nqc F;
    public final /* synthetic */ mma G;
    public final Map H;

    public qoh(nqc nqcVar, mma mmaVar, z4f z4fVar, Map map) {
        this.E = z4fVar;
        this.F = nqcVar;
        this.G = mmaVar;
        this.H = map;
    }

    @Override // defpackage.nqc
    public final a6i a() {
        return this.F.a();
    }

    @Override // defpackage.nqc
    public final float b() {
        return this.F.b();
    }

    @Override // defpackage.mqc
    public final z4f c() {
        return this.E;
    }

    @Override // defpackage.mma
    public final cu9 d(cu9 cu9Var) {
        return this.G.d(cu9Var);
    }

    @Override // defpackage.mqc
    public final iqb e(vpc vpcVar, zub zubVar) {
        p3f p3fVar = new p3f(18, this);
        spc spcVar = vpcVar.n;
        npc npcVar = new npc(vpcVar, null);
        fqb fqbVar = fqb.E;
        return x44.F(csg.O(nd6.a(fqbVar, spcVar, ukc.F, false, zubVar, false, null, npcVar, false, 180).B(fqbVar)).B(new q80(p3fVar, this, kxk.N(0, 0, null, 7))), true, new tz9(12, vpcVar)).B(new lkb());
    }

    @Override // defpackage.mma
    public final long f(cu9 cu9Var, cu9 cu9Var2) {
        return this.G.f(cu9Var, cu9Var2);
    }

    @Override // defpackage.nqc
    public final moh g() {
        return this.F.g();
    }

    @Override // defpackage.ac7
    public final Map h() {
        return this.H;
    }

    @Override // defpackage.mma
    public final cu9 j(b3d b3dVar) {
        return this.G.j(b3dVar);
    }
}
