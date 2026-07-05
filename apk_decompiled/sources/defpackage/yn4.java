package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class yn4 implements xn4, zn4 {
    public final /* synthetic */ int E = 0;
    public ClipData F;
    public int G;
    public int H;
    public Uri I;
    public Bundle J;

    public yn4(yn4 yn4Var) {
        ClipData clipData = yn4Var.F;
        clipData.getClass();
        this.F = clipData;
        int i = yn4Var.G;
        if (i < 0) {
            Locale locale = Locale.US;
            sz6.p("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            sz6.p("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.G = i;
        int i2 = yn4Var.H;
        if ((i2 & 1) != i2) {
            sz6.m("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.H = i2;
        this.I = yn4Var.I;
        this.J = yn4Var.J;
    }

    @Override // defpackage.zn4
    public ClipData b() {
        return this.F;
    }

    @Override // defpackage.xn4
    public ao4 build() {
        return new ao4(new yn4(this));
    }

    @Override // defpackage.xn4
    public void c(Uri uri) {
        this.I = uri;
    }

    @Override // defpackage.zn4
    public int d() {
        return this.G;
    }

    @Override // defpackage.xn4
    public void e(int i) {
        this.H = i;
    }

    @Override // defpackage.zn4
    public int getFlags() {
        return this.H;
    }

    @Override // defpackage.zn4
    public ContentInfo i() {
        return null;
    }

    @Override // defpackage.xn4
    public void setExtras(Bundle bundle) {
        this.J = bundle;
    }

    public String toString() {
        String str;
        switch (this.E) {
            case 1:
                Uri uri = this.I;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.F.getDescription());
                sb.append(", source=");
                int i = this.G;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.H;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return ij0.m(sb, this.J != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yn4() {
    }
}
