package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n67 implements sa9 {
    public static final vr m = new vr(qr.G, "ActiveTime", nr.TOTAL, "time");
    public static final Map n;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final ijb e;
    public final int f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final ijk k;
    public final String l;

    static {
        Map mapH0 = sta.h0(new cpc("back_extension", 13), new cpc("badminton", 2), new cpc("barbell_shoulder_press", 70), new cpc("baseball", 4), new cpc("basketball", 5), new cpc("bench_press", 70), new cpc("bench_sit_up", 13), new cpc("biking", 8), new cpc("biking_stationary", 9), new cpc("boot_camp", 10), new cpc("boxing", 11), new cpc("burpee", 13), new cpc("cricket", 14), new cpc("crunch", 13), new cpc("dancing", 16), new cpc("deadlift", 70), new cpc("dumbbell_curl_left_arm", 70), new cpc("dumbbell_curl_right_arm", 70), new cpc("dumbbell_front_raise", 70), new cpc("dumbbell_lateral_raise", 70), new cpc("dumbbell_triceps_extension_left_arm", 70), new cpc("dumbbell_triceps_extension_right_arm", 70), new cpc("dumbbell_triceps_extension_two_arm", 70), new cpc("elliptical", 25), new cpc("exercise_class", 26), new cpc("fencing", 27), new cpc("football_american", 28), new cpc("football_australian", 29), new cpc("forward_twist", 13), new cpc("frisbee_disc", 31), new cpc("golf", 32), new cpc("guided_breathing", 33), new cpc("gymnastics", 34), new cpc("handball", 35), new cpc("hiking", 37), new cpc("ice_hockey", 38), new cpc("ice_skating", 39), new cpc("jumping_jack", 36), new cpc("jump_rope", 36), new cpc("lat_pull_down", 70), new cpc("lunge", 13), new cpc("martial_arts", 44), new cpc("paddling", 46), new cpc("para_gliding", 47), new cpc("pilates", 48), new cpc("plank", 13), new cpc("racquetball", 50), new cpc("rock_climbing", 51), new cpc("roller_hockey", 52), new cpc("rowing", 53), new cpc("rowing_machine", 54), new cpc("rugby", 55), new cpc("running", 56), new cpc("running_treadmill", 57), new cpc("sailing", 58), new cpc("scuba_diving", 59), new cpc("skating", 60), new cpc("skiing", 61), new cpc("snowboarding", 62), new cpc("snowshoeing", 63), new cpc("soccer", 64), new cpc("softball", 65), new cpc("squash", 66), new cpc("squat", 13), new cpc("stair_climbing", 68), new cpc("stair_climbing_machine", 69), new cpc("stretching", 71), new cpc("surfing", 72), new cpc("swimming_open_water", 73), new cpc("swimming_pool", 74), new cpc("table_tennis", 75), new cpc("tennis", 76), new cpc("upper_twist", 13), new cpc("volleyball", 78), new cpc("walking", 79), new cpc("water_polo", 80), new cpc("weightlifting", 81), new cpc("wheelchair", 82), new cpc("workout", 0), new cpc("yoga", 83), new cpc("calisthenics", 13), new cpc("high_intensity_interval_training", 36), new cpc("strength_training", 70));
        n = mapH0;
        Set<Map.Entry> setEntrySet = mapH0.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    public n67(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, ijb ijbVar, int i, String str, String str2, List list, List list2, ijk ijkVar, String str3) {
        boolean zContains;
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = ijbVar;
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = list;
        this.j = list2;
        this.k = ijkVar;
        this.l = str3;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        int i2 = 0;
        if (!list.isEmpty()) {
            List<l67> listI1 = w44.i1(list, new z31(12));
            int size = listI1.size() - 1;
            int i3 = 0;
            while (i3 < size) {
                Instant instant3 = ((l67) listI1.get(i3)).b;
                i3++;
                if (instant3.isAfter(((l67) listI1.get(i3)).a)) {
                    sz6.p("segments can not overlap.");
                    throw null;
                }
            }
            if (((l67) w44.L0(listI1)).a.isBefore(this.a)) {
                sz6.p("segments can not be out of parent time range.");
                throw null;
            }
            if (((l67) w44.U0(listI1)).b.isAfter(this.c)) {
                sz6.p("segments can not be out of parent time range.");
                throw null;
            }
            for (l67 l67Var : listI1) {
                int i4 = this.f;
                int i5 = l67Var.c;
                if (l67.e.contains(Integer.valueOf(i4)) || l67.f.contains(Integer.valueOf(i5))) {
                    zContains = true;
                } else {
                    Set set = (Set) l67.g.get(Integer.valueOf(i4));
                    zContains = set != null ? set.contains(Integer.valueOf(i5)) : false;
                }
                if (!zContains) {
                    sz6.p("segmentType and sessionType is not compatible.");
                    throw null;
                }
            }
        }
        if (!this.j.isEmpty()) {
            List listI12 = w44.i1(this.j, new z31(13));
            int size2 = listI12.size() - 1;
            while (i2 < size2) {
                Instant instant4 = ((v57) listI12.get(i2)).b;
                i2++;
                if (instant4.isAfter(((v57) listI12.get(i2)).a)) {
                    sz6.p("laps can not overlap.");
                    throw null;
                }
            }
            if (((v57) w44.L0(listI12)).a.isBefore(this.a)) {
                sz6.p("laps can not be out of parent time range.");
                throw null;
            }
            if (((v57) w44.U0(listI12)).b.isAfter(this.c)) {
                sz6.p("laps can not be out of parent time range.");
                throw null;
            }
        }
        ijk ijkVar2 = this.k;
        if (!(ijkVar2 instanceof j67) || ((j67) ijkVar2).e.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = ((j67) this.k).e.a;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            pmf.d();
            throw null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant5 = ((f67) next).a;
            do {
                Object next2 = it.next();
                Instant instant6 = ((f67) next2).a;
                if (instant5.compareTo(instant6) > 0) {
                    next = next2;
                    instant5 = instant6;
                }
            } while (it.hasNext());
        }
        Instant instant7 = ((f67) next).a;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            pmf.d();
            throw null;
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            Instant instant8 = ((f67) next3).a;
            do {
                Object next4 = it2.next();
                Instant instant9 = ((f67) next4).a;
                if (instant8.compareTo(instant9) < 0) {
                    next3 = next4;
                    instant8 = instant9;
                }
            } while (it2.hasNext());
        }
        Instant instant10 = ((f67) next3).a;
        if (instant7.isBefore(this.a) || !instant10.isBefore(this.c)) {
            sz6.p("route can not be out of parent time range.");
            throw null;
        }
    }

    @Override // defpackage.sa9
    public final Instant b() {
        return this.a;
    }

    @Override // defpackage.sa9
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n67)) {
            return false;
        }
        n67 n67Var = (n67) obj;
        return this.f == n67Var.f && x44.r(this.g, n67Var.g) && x44.r(this.h, n67Var.h) && x44.r(this.a, n67Var.a) && x44.r(this.b, n67Var.b) && x44.r(this.c, n67Var.c) && x44.r(this.d, n67Var.d) && x44.r(this.e, n67Var.e) && x44.r(this.i, n67Var.i) && x44.r(this.j, n67Var.j) && x44.r(this.k, n67Var.k);
    }

    @Override // defpackage.sa9
    public final ZoneOffset f() {
        return this.d;
    }

    @Override // defpackage.sa9
    public final ZoneOffset g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.b;
        int i = ebh.i(this.c, (iHashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.k.hashCode() + ((this.e.hashCode() + ((i + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        return "ExerciseSessionRecord(startTime=" + this.a + ", startZoneOffset=" + this.b + ", endTime=" + this.c + ", endZoneOffset=" + this.d + ", exerciseType=" + this.f + ", title=" + this.g + ", notes=" + this.h + ", metadata=" + this.e + ", segments=" + this.i + ", laps=" + this.j + ", exerciseRouteResult=" + this.k + ')';
    }
}
