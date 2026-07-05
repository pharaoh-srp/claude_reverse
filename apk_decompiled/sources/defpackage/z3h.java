package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z3h implements Cloneable {
    public final String E;
    public String F;
    public final String G;
    public int H = 0;

    public z3h(String str, String str2, String str3) {
        this.F = str;
        this.G = str2;
        this.E = str3;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z3h clone() {
        try {
            return (z3h) super.clone();
        } catch (CloneNotSupportedException e) {
            xh6.h(e);
            return null;
        }
    }

    public final boolean b(int i) {
        return (this.H & i) != 0;
    }

    public final boolean c() {
        return (this.H & 2) != 0;
    }

    public final boolean d() {
        int i = this.H;
        return ((i & 16) == 0 && (i & 2) == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3h)) {
            return false;
        }
        z3h z3hVar = (z3h) obj;
        return Objects.equals(this.F, z3hVar.F) && Objects.equals(this.E, z3hVar.E) && Objects.equals(this.G, z3hVar.G) && this.H == z3hVar.H;
    }

    public final void f(int i) {
        this.H = i | this.H | 1;
    }

    public final evh g() {
        if (b(FreeTypeConstants.FT_LOAD_PEDANTIC)) {
            return evh.G;
        }
        if (b(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING)) {
            return evh.I;
        }
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.F, this.E);
    }

    public final String toString() {
        return this.F;
    }
}
