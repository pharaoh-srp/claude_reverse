package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class m7c extends f8c {
    public IconCompat e;
    public IconCompat f;
    public boolean g;
    public boolean h;

    public static IconCompat e(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.k;
            return ltk.j((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // defpackage.f8c
    public final void b(c61 c61Var) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) c61Var.G;
        Context context = (Context) c61Var.F;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                l7c.a(bigContentTitle, iconCompat.f(context));
            } else {
                int iO = iconCompat.a;
                if (iO == -1) {
                    iO = ltk.o(iconCompat.b);
                }
                if (iO == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i = iconCompat2.a;
                    if (i == -1) {
                        Object obj = iconCompat2.b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else {
                        if (i != 5) {
                            xh6.m("called getBitmap() on ", iconCompat2);
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f = iMin;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, MTTypesetterKt.kLineSkipLimitMultiplier, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l7c.c(bigContentTitle, this.h);
            l7c.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.f8c
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.f8c
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f = e(bundle.getParcelable("android.largeIcon.big"));
            this.g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.e = parcelable != null ? e(parcelable) : e(bundle.getParcelable("android.pictureIcon"));
        this.h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
