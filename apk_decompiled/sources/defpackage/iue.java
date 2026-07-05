package defpackage;

import androidx.compose.material3.c;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class iue extends rsk {
    public final e0g d;
    public final c e;
    public final c f;
    public final kl7 g;
    public final kl7 h;

    public iue(e0g e0gVar, c cVar, c cVar2, kl7 kl7Var, kl7 kl7Var2) {
        this.d = e0gVar;
        this.e = cVar;
        this.f = cVar2;
        this.g = kl7Var;
        this.h = kl7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iue) {
            iue iueVar = (iue) obj;
            if (x44.r(this.d, iueVar.d) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(2.0f, 2.0f) && this.e == iueVar.e && va6.b(1.0f, 1.0f) && va6.b(3.0f, 3.0f) && this.f == iueVar.f && x44.r(this.g, iueVar.g) && x44.r(this.h, iueVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + vb7.b(3.0f, vb7.b(1.0f, (this.e.hashCode() + vb7.b(2.0f, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, this.d.hashCode() * 31, 31), 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final k54 v() {
        return this.f;
    }

    public final k54 w() {
        return this.e;
    }

    public final e0g x() {
        return this.d;
    }
}
