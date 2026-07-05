package defpackage;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: loaded from: classes3.dex */
public final class h5e implements mw1 {
    public final mw1 a;
    public final AsyncImagePainter b;
    public final String c;
    public final tt d;
    public final jo4 e;

    public h5e(mw1 mw1Var, AsyncImagePainter asyncImagePainter, String str, tt ttVar, jo4 jo4Var) {
        this.a = mw1Var;
        this.b = asyncImagePainter;
        this.c = str;
        this.d = ttVar;
        this.e = jo4Var;
    }

    @Override // defpackage.mw1
    public final iqb a(iqb iqbVar, tt ttVar) {
        return this.a.a(fqb.E, ttVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h5e) {
            h5e h5eVar = (h5e) obj;
            if (x44.r(this.a, h5eVar.a) && this.b == h5eVar.b && x44.r(this.c, h5eVar.c) && x44.r(this.d, h5eVar.d) && x44.r(this.e, h5eVar.e) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(true) + vb7.b(1.0f, (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
