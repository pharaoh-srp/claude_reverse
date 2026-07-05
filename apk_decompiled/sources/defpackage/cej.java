package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cej {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final int b;

    static {
        f7i f7iVar = new f7i(1);
        List listX = x44.X(0, 600, 840);
        ArrayList arrayListA1 = w44.a1(listX, x44.X(1200, 1600));
        List listX2 = x44.X(0, 480, 900);
        f7i.b(f7iVar, listX, listX2);
        f7i.b(f7iVar, arrayListA1, listX2);
    }

    public cej(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            mr9.q(vb7.p("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        mr9.q(vb7.p("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
        throw null;
    }

    public final rbj a() {
        float f = this.b;
        if (f >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return f < 480.0f ? rbj.b : f < 900.0f ? rbj.c : rbj.d;
        }
        throw new IllegalArgumentException(("Height must be positive, received " + f).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cej.class != obj.getClass()) {
            return false;
        }
        cej cejVar = (cej) obj;
        return this.a == cejVar.a && this.b == cejVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return vb7.r(sb, this.b, ')');
    }
}
