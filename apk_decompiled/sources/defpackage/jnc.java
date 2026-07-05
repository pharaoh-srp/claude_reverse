package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class jnc implements p68 {
    public final hnc a;
    public final hnc b;
    public final hnc c;
    public final hnc d;
    public final hnc e;
    public final hnc f;

    public /* synthetic */ jnc(hnc hncVar, hnc hncVar2, hnc hncVar3, hnc hncVar4) {
        this(new hnc(3, MTTypesetterKt.kLineSkipLimitMultiplier), hncVar, hncVar2, new hnc(3, MTTypesetterKt.kLineSkipLimitMultiplier), hncVar3, hncVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnc)) {
            return false;
        }
        jnc jncVar = (jnc) obj;
        return x44.r(this.a, jncVar.a) && x44.r(this.b, jncVar.b) && x44.r(this.c, jncVar.c) && x44.r(this.d, jncVar.d) && x44.r(this.e, jncVar.e) && x44.r(this.f, jncVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.b + ", top=" + this.c + ", right=" + this.d + ", end=" + this.e + ", bottom=" + this.f + ')';
    }

    public jnc(hnc hncVar, hnc hncVar2, hnc hncVar3, hnc hncVar4, hnc hncVar5, hnc hncVar6) {
        this.a = hncVar;
        this.b = hncVar2;
        this.c = hncVar3;
        this.d = hncVar4;
        this.e = hncVar5;
        this.f = hncVar6;
    }
}
