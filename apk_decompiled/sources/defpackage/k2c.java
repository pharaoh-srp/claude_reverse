package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.b;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.v;
import com.datadog.android.rum.internal.domain.scope.c;
import io.sentry.android.replay.util.d;
import io.sentry.android.replay.x;
import io.sentry.android.replay.y;
import io.sentry.p0;
import io.sentry.t5;
import io.sentry.w6;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class k2c extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2c(int i, Object obj) {
        super(0);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        boolean z = false;
        cu9 cu9Var = null;
        Object obj = this.G;
        switch (i) {
            case 0:
                zy7 zy7Var = ((l2c) obj).b;
                if (zy7Var != null) {
                    return (List) zy7Var.a();
                }
                return null;
            case 1:
                return String.format(Locale.US, "Feature \"%s\" is being registered, but no SDK instance is available. Make sure the SDK is properly initialized.", Arrays.copyOf(new Object[]{((qog) obj).getName()}, 1));
            case 2:
                r9d r9dVar = (r9d) obj;
                cu9 parentLayoutCoordinates = r9dVar.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.n()) {
                    cu9Var = parentLayoutCoordinates;
                }
                if (cu9Var != null && r9dVar.m1203getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                a aVarA = ((lud) obj).a();
                aVarA.getClass();
                try {
                    int iB = ((n) aVarA).b(null);
                    byte[] bArr = new byte[iB];
                    b bVar = new b(bArr, iB);
                    aVarA.c(bVar);
                    if (iB - bVar.d == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + aVarA.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            case 4:
                aje ajeVar = (aje) obj;
                bke bkeVarX = v.x();
                String str = ajeVar.F;
                bkeVarX.b();
                v.p((v) bkeVarX.F, str);
                int i2 = ajeVar.G;
                bkeVarX.b();
                v.q((v) bkeVarX.F, i2);
                String str2 = ajeVar.H;
                if (str2 != null) {
                    bkeVarX.b();
                    v.r((v) bkeVarX.F, str2);
                }
                boolean z2 = ajeVar.I;
                bkeVarX.b();
                v.s((v) bkeVarX.F, z2);
                return (v) bkeVarX.a();
            case 5:
                return String.format(Locale.US, "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.", Arrays.copyOf(new Object[]{((c) obj).c}, 1));
            case 6:
                return String.format(Locale.US, "Feature \"%s\" has no event receiver registered, ignoring event.", Arrays.copyOf(new Object[]{((gbf) obj).c.getName()}, 1));
            case 7:
                return Float.valueOf(((SharedPreferences) ((tk5) obj).F).getFloat("dd_profiling_sample_rate", -1.0f));
            case 8:
                return xwj.f(((skg) obj).a);
            case 9:
                wwg wwgVar = (wwg) obj;
                return wwgVar.i(cok.p(wwgVar.b, null, 3));
            case 10:
                return new kotlin.reflect.jvm.internal.impl.types.a(((kotlin.reflect.jvm.internal.impl.types.a) obj).a);
            case 11:
                return String.format(Locale.US, "Already seen telemetry event with identity=%s, rejecting.", Arrays.copyOf(new Object[]{(cch) obj}, 1));
            case 12:
                return ((dri) obj).V0();
            case 13:
                ((x) obj).H.set(true);
                return iei.a;
            case 14:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new p0(2));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
                return new d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, ((io.sentry.android.replay.capture.c) obj).a);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                Matrix matrix = new Matrix();
                y yVar = ((io.sentry.android.replay.screenshot.c) obj).d;
                matrix.preScale(yVar.c, yVar.d);
                return matrix;
            case 16:
                return new Canvas((Bitmap) ((io.sentry.android.replay.util.c) obj).E.getValue());
            default:
                io.sentry.android.replay.video.d dVar = (io.sentry.android.replay.video.d) obj;
                io.sentry.android.replay.video.a aVar = dVar.b;
                w6 w6Var = dVar.a;
                String str3 = aVar.f;
                int iIntValue = aVar.e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = dVar.c.getCodecInfo().getCapabilitiesForType(str3).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        w6Var.getLogger().h(t5.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        objClamp.getClass();
                        iIntValue = ((Number) objClamp).intValue();
                    }
                    break;
                } catch (Throwable th) {
                    w6Var.getLogger().d(t5.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str3, aVar.b, aVar.c);
                mediaFormatCreateVideoFormat.getClass();
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar.d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
        }
    }
}
