package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class d70 {
    public final XmlPullParser a;
    public int b = 0;
    public final q28 c = new q28(21);

    public d70(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (xn5.k0(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d70)) {
            return false;
        }
        d70 d70Var = (d70) obj;
        return x44.r(this.a, d70Var.a) && this.b == d70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return vb7.r(sb, this.b, ')');
    }
}
