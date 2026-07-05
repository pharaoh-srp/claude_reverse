package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.media.MediaDataSource;
import java.nio.ByteBuffer;
import okio.Buffer;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class k12 implements hh7 {
    public final /* synthetic */ int a;
    public final qjc b;
    public final Object c;

    public /* synthetic */ k12(Object obj, qjc qjcVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = qjcVar;
    }

    @Override // defpackage.hh7
    public final Object a(io6 io6Var) {
        int i = this.a;
        sg5 sg5Var = sg5.F;
        qjc qjcVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Buffer buffer = new Buffer();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                buffer.m1202write(bArr, 0, bArr.length);
                return new oeg(new peg(buffer, qjcVar.f, null), null, sg5Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new oeg(new peg(new RealBufferedSource(new r12(byteBuffer)), qjcVar.f, new s12(byteBuffer)), null, sg5Var);
            case 2:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = jqi.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof xri);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(qjcVar.a.getResources(), puj.d(bitmapDrawable, nx8.f(qjcVar), qjcVar.b, qjcVar.c, (j8g) dch.z(qjcVar, mx8.b), qjcVar.d == tad.F));
                }
                return new fw8(quk.e(bitmapDrawable), z, sg5Var);
            default:
                MediaDataSource mediaDataSource = (MediaDataSource) obj;
                return new oeg(new peg(new RealBufferedSource(new z6b(mediaDataSource)), qjcVar.f, new a7b(mediaDataSource)), null, sg5.G);
        }
    }
}
