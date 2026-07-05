package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class xva {
    public z70 a;
    public final /* synthetic */ zva b;

    public xva(zva zvaVar) {
        this.b = zvaVar;
    }

    public final void a(Drawable drawable) {
        zva zvaVar = this.b;
        ColorStateList colorStateList = zvaVar.S;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(zvaVar.W, colorStateList.getDefaultColor()));
        }
    }
}
