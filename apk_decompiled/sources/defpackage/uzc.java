package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class uzc {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static uzc a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        uzc uzcVar = new uzc();
        uzcVar.a = charSequence;
        uzcVar.b = iconCompatA;
        uzcVar.c = string;
        uzcVar.d = string2;
        uzcVar.e = z;
        uzcVar.f = z2;
        return uzcVar;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        Bundle bundle2 = null;
        if (iconCompat != null) {
            iconCompat.getClass();
            Bundle bundle3 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle3.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    sz6.p("Invalid icon");
                    return null;
                case 1:
                case 5:
                    bundle3.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle3.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle3.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle3.putInt("type", iconCompat.a);
            bundle3.putInt("int1", iconCompat.e);
            bundle3.putInt("int2", iconCompat.f);
            bundle3.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle3.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle3.putString("tint_mode", mode.name());
            }
            bundle2 = bundle3;
        }
        bundle.putBundle("icon", bundle2);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof uzc)) {
            return false;
        }
        uzc uzcVar = (uzc) obj;
        String str = this.d;
        String str2 = uzcVar.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(uzcVar.a)) && Objects.equals(this.c, uzcVar.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(uzcVar.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(uzcVar.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
