package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes2.dex */
public final class ps9 extends Paint {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps9(PorterDuff.Mode mode) {
        super(1);
        this.a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(vkb.c(i));
                } else {
                    setColor((vkb.c(i) << 24) | (getColor() & 16777215));
                }
                break;
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps9(int i, int i2) {
        super(i);
        this.a = i2;
    }
}
