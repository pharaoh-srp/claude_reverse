package defpackage;

import com.anthropic.claude.R;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p9g extends sk8 {
    public static final p9g j;

    static {
        xb xbVar = awj.b;
        j = new p9g("SleepSessionRecord", R.string.health_data_type_sleep_session, jce.a.b(r9g.class), z7e.F, "minutes", sta.h0(new cpc(ls.E, xbVar), new cpc(ls.J, xbVar)), false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        String str;
        r9g r9gVar = (r9g) y7eVar;
        r9gVar.getClass();
        ZoneId zoneIdSystemDefault = r9gVar.d;
        ZoneId zoneIdSystemDefault2 = r9gVar.b;
        Instant instant = r9gVar.c;
        Instant instant2 = r9gVar.a;
        List list = r9gVar.h;
        if (list.isEmpty()) {
            long minutes = Duration.between(instant2, instant).toMinutes();
            if (zoneIdSystemDefault2 == null) {
                zoneIdSystemDefault2 = ZoneId.systemDefault();
            }
            OffsetDateTime offsetDateTimeR = ebh.r(instant2, zoneIdSystemDefault2);
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            return x44.W(new b9e(instant.atZone(zoneIdSystemDefault).toOffsetDateTime(), offsetDateTimeR, String.valueOf(minutes), "minutes"));
        }
        List<q9g> list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        for (q9g q9gVar : list2) {
            Instant instant3 = q9gVar.a;
            Instant instant4 = q9gVar.b;
            long minutes2 = Duration.between(instant3, instant4).toMinutes();
            OffsetDateTime offsetDateTimeR2 = ebh.r(q9gVar.a, zoneIdSystemDefault2 != null ? zoneIdSystemDefault2 : ZoneId.systemDefault());
            OffsetDateTime offsetDateTime = instant4.atZone(zoneIdSystemDefault != null ? zoneIdSystemDefault : ZoneId.systemDefault()).toOffsetDateTime();
            switch (q9gVar.c) {
                case 1:
                    str = "Awake";
                    break;
                case 2:
                    str = "Sleeping";
                    break;
                case 3:
                    str = "Out of bed";
                    break;
                case 4:
                    str = "Light";
                    break;
                case 5:
                    str = "Deep";
                    break;
                case 6:
                    str = "REM";
                    break;
                case 7:
                    str = "Awake in bed";
                    break;
                default:
                    str = "Unknown sleep stage";
                    break;
            }
            arrayList.add(new b9e(offsetDateTime, offsetDateTimeR2, minutes2 + " (" + str + ")", "minutes"));
        }
        return arrayList;
    }
}
