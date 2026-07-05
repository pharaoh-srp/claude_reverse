package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xgh extends kmg {
    public CharSequence c;
    public List d;
    public kkh e;
    public tkh f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public fu9 k;
    public wt7 l;
    public long m;
    public yjh n;

    public xgh() {
        super(ycg.j().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = sl4.b(0, 0, 0, 0, 15);
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        kmgVar.getClass();
        xgh xghVar = (xgh) kmgVar;
        this.c = xghVar.c;
        this.d = xghVar.d;
        this.e = xghVar.e;
        this.f = xghVar.f;
        this.g = xghVar.g;
        this.h = xghVar.h;
        this.i = xghVar.i;
        this.j = xghVar.j;
        this.k = xghVar.k;
        this.l = xghVar.l;
        this.m = xghVar.m;
        this.n = xghVar.n;
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return new xgh();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.c) + ", annotations=" + this.d + ", composition=" + this.e + ", textStyle=" + this.f + ", singleLine=" + this.g + ", softWrap=" + this.h + ", densityValue=" + this.i + ", fontScale=" + this.j + ", layoutDirection=" + this.k + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) rl4.l(this.m)) + ", layoutResult=" + this.n + ')';
    }
}
