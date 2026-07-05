package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.e0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class prh extends md1 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void n(ByteBuffer byteBuffer, int i2) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.md1
    public final i51 a(i51 i51Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i2 = i51Var.c;
        if (tpi.x(i2) || i2 == 2) {
            return i2 != 4 ? new i51(i51Var.a, i51Var.b, 4) : i51.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i51Var);
    }

    @Override // defpackage.m51
    public final void g(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 2) {
            byteBufferM = m(i2 * 2);
            while (iPosition < iLimit) {
                n(byteBufferM, ((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferM = m((i2 / 3) * 4);
            while (iPosition < iLimit) {
                n(byteBufferM, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferM = m(i2);
            while (iPosition < iLimit) {
                n(byteBufferM, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            byteBufferM = m(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferM.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i3 == 21) {
            byteBufferM = m((i2 / 3) * 4);
            while (iPosition < iLimit) {
                n(byteBufferM, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else {
            if (i3 != 22) {
                e0.b();
                return;
            }
            byteBufferM = m(i2);
            while (iPosition < iLimit) {
                n(byteBufferM, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM.flip();
    }
}
