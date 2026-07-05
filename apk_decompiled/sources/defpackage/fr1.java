package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import okio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
public final class fr1 implements ih7 {
    public final /* synthetic */ int a;
    public final rjc b;
    public final Object c;

    public /* synthetic */ fr1(Object obj, rjc rjcVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = rjcVar;
    }

    @Override // defpackage.ih7
    public final Object a(tp4 tp4Var) {
        int i = this.a;
        rg5 rg5Var = rg5.F;
        Object obj = this.c;
        rjc rjcVar = this.b;
        switch (i) {
            case 0:
                return new ie6(new BitmapDrawable(rjcVar.a.getResources(), (Bitmap) obj), false, rg5Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    Buffer buffer = new Buffer();
                    buffer.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = rjcVar.a;
                    return new bfg(new qeg(buffer, null), null, rg5Var);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = l.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof xri);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(rjcVar.a.getResources(), nuj.l(bitmapDrawable, rjcVar.b, rjcVar.c, rjcVar.d, rjcVar.e));
                }
                return new ie6(bitmapDrawable, z, rg5Var);
        }
    }
}
