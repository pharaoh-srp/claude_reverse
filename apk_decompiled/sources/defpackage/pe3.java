package defpackage;

import com.arkivanov.essenty.statekeeper.SerializableContainer;

/* JADX INFO: loaded from: classes.dex */
public final class pe3 implements qe3 {
    public final Object a;
    public final String b;
    public final SerializableContainer c;

    public pe3(Object obj, String str, SerializableContainer serializableContainer) {
        obj.getClass();
        str.getClass();
        this.a = obj;
        this.b = str;
        this.c = serializableContainer;
    }

    @Override // defpackage.qe3
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.qe3
    public final kd4 b() {
        return null;
    }

    @Override // defpackage.qe3
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe3)) {
            return false;
        }
        pe3 pe3Var = (pe3) obj;
        return x44.r(this.a, pe3Var.a) && x44.r(this.b, pe3Var.b) && x44.r(this.c, pe3Var.c);
    }

    @Override // defpackage.qe3
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        SerializableContainer serializableContainer = this.c;
        return iL + (serializableContainer == null ? 0 : serializableContainer.hashCode());
    }

    public final String toString() {
        return "Destroyed(configuration=" + this.a + ", key=" + this.b + ", savedState=" + this.c + ')';
    }
}
