package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi implements qg9 {
    public final /* synthetic */ int a;

    public /* synthetic */ pi(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.a) {
        }
        return qg9.class;
    }

    @Override // defpackage.qg9
    public final /* synthetic */ String discriminator() {
        switch (this.a) {
        }
        return "eventName";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 3:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 4:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 5:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 6:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 7:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 10:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 11:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 12:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 13:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 14:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 16:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 21:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 24:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 26:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 27:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 28:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        switch (this.a) {
        }
        return 736920353;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        switch (this.a) {
        }
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=eventName)";
    }
}
