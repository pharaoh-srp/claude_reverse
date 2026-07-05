package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzih;", "Lnqb;", "Lajh;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class zih extends nqb {
    public final akh E;
    public final i5i F;
    public final tkh G;
    public final boolean H;
    public final mp9 I;

    public zih(akh akhVar, i5i i5iVar, tkh tkhVar, boolean z, mp9 mp9Var) {
        this.E = akhVar;
        this.F = i5iVar;
        this.G = tkhVar;
        this.H = z;
        this.I = mp9Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new ajh(this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zih)) {
            return false;
        }
        zih zihVar = (zih) obj;
        return this.H == zihVar.H && x44.r(this.E, zihVar.E) && x44.r(this.F, zihVar.F) && x44.r(this.G, zihVar.G) && this.I.equals(zihVar.I);
    }

    public final int hashCode() {
        return this.I.hashCode() + gid.n(this.G, (this.F.hashCode() + ((this.E.hashCode() + (Boolean.hashCode(this.H) * 31)) * 31)) * 31, 961);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ajh ajhVar = (ajh) hqbVar;
        akh akhVar = ajhVar.U;
        akh akhVar2 = this.E;
        ajhVar.U = akhVar2;
        akhVar2.getClass();
        boolean z = this.H;
        ajhVar.V = z;
        boolean z2 = !z;
        ahh ahhVar = akhVar2.a;
        ahhVar.getClass();
        ahhVar.E.setValue(new zgh(this.F, this.G, z, z2, this.I.c == 4));
        if (x44.r(akhVar, akhVar2)) {
            return;
        }
        ajhVar.W.p1(akhVar2.g);
    }
}
