package defpackage;

import androidx.health.platform.client.proto.g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import java.lang.reflect.Constructor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ep5 implements hba, lz7, up4 {
    public final /* synthetic */ int E;

    public /* synthetic */ ep5(int i) {
        this.E = i;
    }

    public static /* synthetic */ void b(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    public Constructor a() {
        switch (this.E) {
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(wd7.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(wd7.class).getConstructor(null);
        }
    }

    @Override // defpackage.lz7
    public Object apply(Object obj) {
        return new hp5((g1h) obj);
    }

    @Override // defpackage.up4
    public Object g(d5h d5hVar) {
        int i;
        switch (this.E) {
            case 28:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        switch (this.E) {
            case 0:
                ((q7b) obj).getClass();
                break;
            case 1:
                ((q7b) obj).getClass();
                break;
            case 2:
                ((q7b) obj).getClass();
                break;
            case 3:
                ((q7b) obj).getClass();
                break;
            case 4:
                ((q7b) obj).getClass();
                break;
            case 5:
                ((q7b) obj).getClass();
                break;
            case 6:
                ((q7b) obj).getClass();
                break;
            case 7:
                ((q7b) obj).getClass();
                break;
            case 8:
                ((q7b) obj).getClass();
                break;
            case 9:
                ((q7b) obj).getClass();
                break;
            case 10:
                ((q7b) obj).getClass();
                break;
            case 11:
                ((q7b) obj).getClass();
                break;
            case 12:
                ((q7b) obj).getClass();
                break;
            case 13:
                ((q7b) obj).getClass();
                break;
            case 14:
                ((q7b) obj).getClass();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((q7b) obj).getClass();
                break;
            case 16:
                ((q7b) obj).getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((q7b) obj).getClass();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((q7b) obj).getClass();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((q7b) obj).getClass();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            default:
                ((u6d) obj).getClass();
                break;
            case 26:
                ((u6d) obj).y(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
        }
    }
}
