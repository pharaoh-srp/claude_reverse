package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class m67 extends sk8 {
    public static final m67 j;

    static {
        ls lsVar = ls.J;
        xb xbVar = oyk.b;
        j = new m67("ExerciseSessionRecord", R.string.health_data_type_exercise_session, jce.a.b(n67.class), z7e.F, "minutes", sta.h0(new cpc(lsVar, xbVar), new cpc(ls.E, xbVar)), false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        String str;
        n67 n67Var = (n67) y7eVar;
        n67Var.getClass();
        Instant instant = n67Var.a;
        Instant instant2 = n67Var.c;
        long minutes = Duration.between(instant, instant2).toMinutes();
        switch (n67Var.f) {
            case 2:
                str = "Badminton";
                break;
            case 3:
            case 6:
            case 7:
            case 12:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 30:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 49:
            case 67:
            case 77:
            default:
                str = "Other";
                break;
            case 4:
                str = "Baseball";
                break;
            case 5:
                str = "Basketball";
                break;
            case 8:
                str = "Biking";
                break;
            case 9:
                str = "Stationary Biking";
                break;
            case 10:
                str = "Boot Camp";
                break;
            case 11:
                str = "Boxing";
                break;
            case 13:
                str = "Calisthenics";
                break;
            case 14:
                str = "Cricket";
                break;
            case 16:
                str = "Dancing";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                str = "Elliptical";
                break;
            case 26:
                str = "Exercise Class";
                break;
            case 27:
                str = "Fencing";
                break;
            case 28:
                str = "American Football";
                break;
            case 29:
                str = "Australian Football";
                break;
            case 31:
                str = "Frisbee";
                break;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                str = "Golf";
                break;
            case 33:
                str = "Guided Breathing";
                break;
            case 34:
                str = "Gymnastics";
                break;
            case 35:
                str = "Handball";
                break;
            case 36:
                str = "HIIT";
                break;
            case 37:
                str = "Hiking";
                break;
            case 38:
                str = "Ice Hockey";
                break;
            case 39:
                str = "Ice Skating";
                break;
            case 44:
                str = "Martial Arts";
                break;
            case 46:
                str = "Paddling";
                break;
            case 47:
                str = "Paragliding";
                break;
            case mdj.f /* 48 */:
                str = "Pilates";
                break;
            case 50:
                str = "Racquetball";
                break;
            case 51:
                str = "Rock Climbing";
                break;
            case 52:
                str = "Roller Hockey";
                break;
            case 53:
                str = "Rowing";
                break;
            case 54:
                str = "Rowing Machine";
                break;
            case 55:
                str = "Rugby";
                break;
            case 56:
                str = "Running";
                break;
            case 57:
                str = "Treadmill Running";
                break;
            case 58:
                str = "Sailing";
                break;
            case 59:
                str = "Scuba Diving";
                break;
            case 60:
                str = "Skating";
                break;
            case 61:
                str = "Skiing";
                break;
            case 62:
                str = "Snowboarding";
                break;
            case 63:
                str = "Snowshoeing";
                break;
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                str = "Soccer";
                break;
            case 65:
                str = "Softball";
                break;
            case 66:
                str = "Squash";
                break;
            case 68:
                str = "Stair Climbing";
                break;
            case 69:
                str = "Stair Climbing Machine";
                break;
            case 70:
                str = "Strength Training";
                break;
            case 71:
                str = "Stretching";
                break;
            case 72:
                str = "Surfing";
                break;
            case 73:
                str = "Open Water Swimming";
                break;
            case 74:
                str = "Pool Swimming";
                break;
            case 75:
                str = "Table Tennis";
                break;
            case 76:
                str = "Tennis";
                break;
            case 78:
                str = "Volleyball";
                break;
            case 79:
                str = "Walking";
                break;
            case 80:
                str = "Water Polo";
                break;
            case 81:
                str = "Weightlifting";
                break;
            case 82:
                str = "Wheelchair";
                break;
            case 83:
                str = "Yoga";
                break;
        }
        ZoneId zoneIdSystemDefault = n67Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        ZoneId zoneIdSystemDefault2 = n67Var.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, str + " (" + minutes + ")", "minutes"));
    }
}
