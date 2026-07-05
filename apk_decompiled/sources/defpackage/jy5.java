package defpackage;

import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jy5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ m7f G;

    public /* synthetic */ jy5(m7f m7fVar, String str) {
        this.E = 4;
        this.G = m7fVar;
        this.F = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        String str = this.F;
        m7f m7fVar = this.G;
        switch (i) {
            case 0:
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                return new iy5(str, (wqd) m7fVar.a(kceVar.b(wqd.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            case 1:
                ((swe) obj).getClass();
                kce kceVar2 = jce.a;
                return new ty5(str, (kah) m7fVar.a(kceVar2.b(kah.class), null, null), (h86) m7fVar.a(kceVar2.b(h86.class), null, null));
            case 2:
                ((swe) obj).getClass();
                kce kceVar3 = jce.a;
                return new rp6(this.F, (q7) m7fVar.a(kceVar3.b(q7.class), null, null), (q1d) m7fVar.a(kceVar3.b(q1d.class), null, null), (j2d) m7fVar.a(kceVar3.b(j2d.class), null, null), (o7) m7fVar.a(kceVar3.b(o7.class), null, null), (qi3) m7fVar.a(kceVar3.b(qi3.class), null, null), (pkc) m7fVar.a(kceVar3.b(pkc.class), null, null), (mn5) m7fVar.a(kceVar3.b(mn5.class), null, null), (u2a) m7fVar.a(kceVar3.b(u2a.class), null, null), (t96) m7fVar.a(kceVar3.b(t96.class), null, null), (q2a) m7fVar.a(kceVar3.b(q2a.class), null, null), (h86) m7fVar.a(kceVar3.b(h86.class), null, null));
            case 3:
                ((swe) obj).getClass();
                kce kceVar4 = jce.a;
                return new ha7(str, (qi3) m7fVar.a(kceVar4.b(qi3.class), null, null), (x97) m7fVar.a(kceVar4.b(x97.class), null, null), (h86) m7fVar.a(kceVar4.b(h86.class), null, null));
            case 4:
                ((swe) obj).getClass();
                kce kceVar5 = jce.a;
                rc8 rc8Var = (rc8) m7fVar.c(kceVar5.b(rc8.class));
                if (rc8Var != null || (rc8Var = (m78) m7fVar.c(kceVar5.b(m78.class))) != null) {
                    return new qc8(str, rc8Var, (h86) m7fVar.a(kceVar5.b(h86.class), null, null));
                }
                sz6.j("No GrowthBookFeatureManager available");
                return null;
            case 5:
                ((swe) obj).getClass();
                kce kceVar6 = jce.a;
                return new poa(this.F, (tga) m7fVar.a(kceVar6.b(tga.class), null, null), (fja) m7fVar.a(kceVar6.b(fja.class), null, null), (qi3) m7fVar.a(kceVar6.b(qi3.class), null, null), (id) m7fVar.a(kceVar6.b(id.class), null, null), (q79) m7fVar.a(kceVar6.b(q79.class), null, null), (hj) m7fVar.a(kceVar6.b(hj.class), null, null), (zpa) m7fVar.a(kceVar6.b(zpa.class), null, null), (hl8) m7fVar.a(kceVar6.b(hl8.class), null, null), (h86) m7fVar.a(kceVar6.b(h86.class), null, null));
            case 6:
                ((swe) obj).getClass();
                kce kceVar7 = jce.a;
                return new lbb(this.F, (t8b) m7fVar.a(kceVar7.b(t8b.class), null, null), (obb) m7fVar.a(kceVar7.b(obb.class), null, null), (koi) m7fVar.a(kceVar7.b(koi.class), null, null), (qi3) m7fVar.a(kceVar7.b(qi3.class), null, null), (z74) m7fVar.a(kceVar7.b(z74.class), null, null), (h86) m7fVar.a(kceVar7.b(h86.class), null, null));
            case 7:
                ((swe) obj).getClass();
                return new e1a(str, (h86) m7fVar.a(jce.a.b(h86.class), null, null));
            case 8:
                ((swe) obj).getClass();
                kce kceVar8 = jce.a;
                return new qfe(str, (wqd) m7fVar.a(kceVar8.b(wqd.class), null, null), (h86) m7fVar.a(kceVar8.b(h86.class), null, null));
            default:
                ((swe) obj).getClass();
                kce kceVar9 = jce.a;
                return new w1g(this.F, ((OrganizationId) m7fVar.a(kceVar9.b(OrganizationId.class), null, null)).m1071unboximpl(), (ya3) m7fVar.a(kceVar9.b(ya3.class), null, null), (uz2) m7fVar.a(kceVar9.b(uz2.class), null, null), (ole) m7fVar.a(kceVar9.b(ole.class), null, null), (qi3) m7fVar.a(kceVar9.b(qi3.class), null, null), (h86) m7fVar.a(kceVar9.b(h86.class), null, null));
        }
    }

    public /* synthetic */ jy5(String str, m7f m7fVar, int i) {
        this.E = i;
        this.F = str;
        this.G = m7fVar;
    }
}
