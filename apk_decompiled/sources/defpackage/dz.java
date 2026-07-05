package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dz extends k20 {
    public final dv7 d;
    public final int e;
    public boolean f;
    public Typeface g;
    public final AssetManager h;
    public final String i;

    public dz(AssetManager assetManager, String str, dv7 dv7Var, int i, bv7 bv7Var) {
        super(0, a5.F, bv7Var);
        this.d = dv7Var;
        this.e = i;
        this.h = assetManager;
        this.i = str;
        this.g = c(null);
    }

    @Override // defpackage.k20
    public final int a() {
        return this.e;
    }

    @Override // defpackage.k20
    public final dv7 b() {
        return this.d;
    }

    public final Typeface c(Context context) {
        int size;
        FontVariationAxis[] fontVariationAxisArr;
        if (context == null) {
            return null;
        }
        Typeface.Builder builder = new Typeface.Builder(this.h, this.i);
        d4c.s(context);
        int i = 0;
        int i2 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        List list = this.c.a;
        if (i2 == 0) {
            int size2 = list.size();
            fontVariationAxisArr = new FontVariationAxis[size2];
            while (i < size2) {
                fontVariationAxisArr[i] = new FontVariationAxis(((yu7) list.get(i)).b(), ((yu7) list.get(i)).a());
                i++;
            }
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    size = list.size() + 1;
                    break;
                }
                if (x44.r(((yu7) list.get(i3)).b(), "wght")) {
                    size = list.size();
                    break;
                }
                i3++;
            }
            FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
            while (i < size) {
                fontVariationAxisArr2[i] = i == list.size() ? new FontVariationAxis("wght", wd6.d0(i2 + 400.0f, 1.0f, 1000.0f)) : x44.r(((yu7) list.get(i)).b(), "wght") ? new FontVariationAxis("wght", wd6.d0(((yu7) list.get(i)).a() + i2, 1.0f, 1000.0f)) : new FontVariationAxis(((yu7) list.get(i)).b(), ((yu7) list.get(i)).a());
                i++;
            }
            fontVariationAxisArr = fontVariationAxisArr2;
        }
        return builder.setFontVariationSettings(fontVariationAxisArr).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return x44.r(this.i, dzVar.i) && this.c.equals(dzVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + (this.i.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Font(assetManager, path=");
        sb.append(this.i);
        sb.append(", weight=");
        sb.append(this.d);
        sb.append(", style=");
        int i = this.e;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
