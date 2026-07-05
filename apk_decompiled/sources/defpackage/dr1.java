package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class dr1 extends z6g {
    public final Context n;
    public final int o;

    public dr1(Context context) {
        super(new ro5[1], new cr1[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.z6g
    public final ro5 g() {
        return new ro5(1);
    }

    @Override // defpackage.z6g
    public final so5 h() {
        return new cr1(this);
    }

    @Override // defpackage.z6g
    public final DecoderException i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.z6g
    public final DecoderException j(ro5 ro5Var, so5 so5Var, boolean z) {
        cr1 cr1Var = (cr1) so5Var;
        ByteBuffer byteBuffer = ro5Var.I;
        byteBuffer.getClass();
        fd9.M(byteBuffer.hasArray());
        fd9.E(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointO = tpi.o(context);
                    int i = pointO.x;
                    int i2 = pointO.y;
                    jw7 jw7Var = ro5Var.G;
                    if (jw7Var != null) {
                        int i3 = jw7Var.N;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = jw7Var.O;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = FreeTypeConstants.FT_LOAD_MONOCHROME;
                }
            }
            cr1Var.I = fe5.d(byteBuffer.array(), byteBuffer.remaining(), iMax);
            cr1Var.G = ro5Var.K;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
