package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dmg {
    public final String a;
    public final String b;

    static {
        new LinkedHashMap();
    }

    public dmg(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dmg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dmg dmgVar = (dmg) obj;
        return x44.r(this.a, dmgVar.a) && x44.r(this.b, dmgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + ": " + this.b;
    }
}
